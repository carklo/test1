
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[Entry],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(entries: Seq[Entry]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""
"""),_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
        """),format.raw/*3.9*/("""<form action=""""),_display_(/*3.24*/routes/*3.30*/.Entries.list()),format.raw/*3.45*/("""" method="GET">
            <div class="input-append">
                <input type="text" name="filter" class="input-xxlarge" autofocus="">
                <button type="submit" class="btn">Search</button>
            </div>
        </form>
        <a href=""""),_display_(/*9.19*/routes/*9.25*/.Entries.add()),format.raw/*9.39*/("""" class="btn btn-small btn-primary">New entry</a>

    """),_display_(/*11.6*/list(entries)),format.raw/*11.19*/("""
    """)))}))
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
                  SOURCE: C:/Users/santi/IdeaProjects/test1/app/views/index.scala.html
                  HASH: 5bd85a8818e052a3df4ddb931b3bd860ed4d176c
                  MATRIX: 952->1|1068->22|1095->24|1106->28|1143->29|1178->38|1219->53|1233->59|1268->74|1553->333|1567->339|1601->353|1683->409|1717->422
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|35->3|35->3|35->3|41->9|41->9|41->9|43->11|43->11
                  -- GENERATED --
              */
          