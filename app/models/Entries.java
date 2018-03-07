package models;

import static play.libs.Scala.toSeq;
import java.util.*;

import scala.collection.Seq;

public class Entries {

    public static void delete(long id) {
        Entry.find.ref(id).delete();
    }

    public static Entry findById(long id) {
        return Entry.find.byId(id);
    }

    public static Seq<Entry> findByName(String filter){
        return toSeq(Entry.find.query().where().ilike("name", "%"+filter+"%").findList());
    }

    public static void save(Entry entry)
    {
        if (entry.id == null)
        {
            entry.save();
        }
        else
            {
                entry.update();
            }
    }
}