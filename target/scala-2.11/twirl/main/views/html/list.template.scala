
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[Entry],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(entries: Seq[Entry]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""

"""),format.raw/*3.1*/("""<table class="table table-hover">
"""),_display_(/*4.2*/for(entry <- entries) yield /*4.23*/{_display_(Seq[Any](format.raw/*4.24*/("""
        """),format.raw/*5.9*/("""<tr>
            <td>
                <strong>"""),_display_(/*7.26*/entry/*7.31*/.name),format.raw/*7.36*/("""</strong>
                <br>
                <a href="tel:"""),_display_(/*9.31*/entry/*9.36*/.phone),format.raw/*9.42*/("""">"""),_display_(/*9.45*/entry/*9.50*/.phone),format.raw/*9.56*/("""</a>
                <form action=""""),_display_(/*10.32*/routes/*10.38*/.Entries.remove(entry.id)),format.raw/*10.63*/("""" method="POST">
                    <a href=""""),_display_(/*11.31*/routes/*11.37*/.Entries.edit(entry.id)),format.raw/*11.60*/("""" class="btn btn-small">Edit</a>
    <input type="submit" value="Remove" class="btn btn-small">
</form>
</td>
</tr>
    """)))}),format.raw/*16.6*/("""
"""),format.raw/*17.1*/("""</table>"""))
      }
    }
  }

  def render(entries:Seq[Entry]): play.twirl.api.HtmlFormat.Appendable = apply(entries)

  def f:((Seq[Entry]) => play.twirl.api.HtmlFormat.Appendable) = (entries) => apply(entries)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 07 01:32:31 COT 2018
                  SOURCE: C:/Users/santi/IdeaProjects/test1/app/views/list.scala.html
                  HASH: c9061f80571ae883ff44a92f961f206fcdebdda0
                  MATRIX: 951->1|1067->22|1097->26|1158->62|1194->83|1232->84|1268->94|1343->143|1356->148|1381->153|1470->216|1483->221|1509->227|1538->230|1551->235|1577->241|1641->278|1656->284|1702->309|1777->357|1792->363|1836->386|1992->512|2021->514
                  LINES: 28->1|33->1|35->3|36->4|36->4|36->4|37->5|39->7|39->7|39->7|41->9|41->9|41->9|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|48->16|49->17
                  -- GENERATED --
              */
          