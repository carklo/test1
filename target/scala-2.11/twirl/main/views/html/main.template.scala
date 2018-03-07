
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*2.2*/style/*2.7*/(asset: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.26*/("""   """),format.raw/*2.29*/("""<link rel="stylesheet" href=""""),_display_(/*2.59*/routes/*2.65*/.Assets.at(asset)),format.raw/*2.82*/(""""> """)))};
Seq[Any](format.raw/*1.17*/("""
"""),format.raw/*2.86*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>Play Framework Starter Guide</title>
        """),_display_(/*8.10*/style("bootstrap/css/bootstrap.css")),format.raw/*8.46*/("""
        """),_display_(/*9.10*/style("bootstrap/css/bootstrap-responsive.css")),format.raw/*9.57*/("""
        """),_display_(/*10.10*/style("stylesheets/main.css")),format.raw/*10.39*/("""
    """),format.raw/*11.5*/("""</head>
    <body>
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <a class="brand" href="/">Phonebook</a>
                </div>
            </div>
        </div>
        <div class="container">
        """),_display_(/*21.10*/content),format.raw/*21.17*/("""
        """),format.raw/*22.9*/("""</div>
    </body>
</html>
"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 07 01:32:31 COT 2018
                  SOURCE: C:/Users/santi/IdeaProjects/test1/app/views/main.scala.html
                  HASH: 83cba0d1c853d8308bb12e905e136450d919edda
                  MATRIX: 945->1|1038->18|1050->23|1145->42|1175->45|1231->75|1245->81|1282->98|1325->16|1353->102|1381->104|1502->199|1558->235|1594->245|1661->292|1698->302|1748->331|1780->336|2124->653|2152->660|2188->669
                  LINES: 28->1|32->2|32->2|34->2|34->2|34->2|34->2|34->2|35->1|36->2|38->4|42->8|42->8|43->9|43->9|44->10|44->10|45->11|55->21|55->21|56->22
                  -- GENERATED --
              */
          