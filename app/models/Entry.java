package models;

import javax.persistence.*;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.*;

@Entity
public class Entry extends Model{

    @Id
    public Long id;
    @Constraints.Required
    @Constraints.MinLength(value = 2)
    public String name;
    @Constraints.Required
    @Constraints.Pattern(value = "\\+?[0-9\\s]+", message = "Optional +, followed by digits & spaces")
    public String phone;

    public Entry() {}

    public static Finder<Long,Entry> find = new Finder<Long,Entry>(Entry.class);

}
