package controllers;

import models.Entry;
import play.data.Form;
import play.mvc.*;
import scala.collection.Seq;

import play.data.*;

import javax.inject.Inject;

public class Entries extends Controller
{
    @Inject
    FormFactory formFactory;

    public  Result list(String filter)
    {
        Seq<Entry> entries = models.Entries.findByName(filter);
        return ok(views.html.index.render(entries));
    }
    public  Result remove(long id)
    {
        models.Entries.delete(id);
        return redirect(routes.Entries.list(""));
    }
    public  Result add()
    {
        Form<Entry> form  = formFactory.form(Entry.class).fill(new Entry());
        return ok(views.html.edit.render(form, "Add Entry"));
    }
    public  Result edit(long id)
    {
        Entry entry = models.Entries.findById(id);
        if(entry != null)
        {
            Form<Entry> form = formFactory.form(Entry.class).fill(entry);
            return ok(views.html.edit.render(form, "Edit entry"));
        }
        else
        {
            return redirect(routes.Entries.list(""));
        }
    }
    public  Result save()
    {
        Form<Entry> form = formFactory.form(Entry.class).bindFromRequest(request(), "id", "name", "phone");
        if(form.hasErrors())
        {
            return badRequest(views.html.edit.render(form, "Correct entry" ));
        }
        else
        {
            models.Entries.save(form.get());
            return redirect(routes.Entries.list(""));
        }
    }
}
