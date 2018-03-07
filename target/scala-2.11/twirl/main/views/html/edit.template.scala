
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Entry],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(entryForm: Form[Entry], heading: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.43*/("""
"""),_display_(/*2.2*/main/*2.6*/ {_display_(Seq[Any](format.raw/*2.8*/("""
    """),format.raw/*3.5*/("""<h1>"""),_display_(/*3.10*/heading),format.raw/*3.17*/("""</h1>
    <form action=""""),_display_(/*4.20*/routes/*4.26*/.Entries.save()),format.raw/*4.41*/("""" method="POST">
        <input type="hidden" name="id" value=""""),_display_(/*5.48*/entryForm("id")/*5.63*/.value),format.raw/*5.69*/("""">
        <div class="control-group       """),_display_(/*6.42*/if(entryForm("name").hasErrors)/*6.73*/ {_display_(Seq[Any](format.raw/*6.75*/("""error""")))}),format.raw/*6.81*/("""">
            <label for="name">Name</label>
            <div class="input">
            <input type="text" id="name" name="name"  value=""""),_display_(/*9.63*/entryForm("name")/*9.80*/.value),format.raw/*9.86*/("""" autofocus="">
                <span class="help-inline">"""),_display_(/*10.44*/(entryForm("name").errors.map{ e =>
                    play.api.i18n.Messages(e.message , e.arguments: _*) }.mkString(", "))),format.raw/*11.90*/("""</span>
            </div>
        </div>
        <div class="control-group """),_display_(/*14.36*/if(entryForm("phone").hasErrors)/*14.68*/ {_display_(Seq[Any](format.raw/*14.70*/("""error""")))}),format.raw/*14.76*/("""">
            <label for="phone">Phone</label>
            <div class="input">
                <input type="text" id="phone" name="phone" value=""""),_display_(/*17.68*/entryForm("phone")/*17.86*/.value),format.raw/*17.92*/("""">
                <span class="help-inline">"""),_display_(/*18.44*/(entryForm("phone").errors.map{ e =>
                    play.api.i18n.Messages(e.message , e.arguments: _*)}.mkString(", "))),format.raw/*19.89*/("""</span>
            </div>
        </div>   <div>     <button type="submit" class="btn btn-primary">Save</button>     <a class="btn" href=""""),_display_(/*21.114*/routes/*21.120*/.Entries.list()),format.raw/*21.135*/("""">Cancel</a>   </div> </form>
""")))}))
      }
    }
  }

  def render(entryForm:Form[Entry],heading:String): play.twirl.api.HtmlFormat.Appendable = apply(entryForm,heading)

  def f:((Form[Entry],String) => play.twirl.api.HtmlFormat.Appendable) = (entryForm,heading) => apply(entryForm,heading)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 07 01:32:31 COT 2018
                  SOURCE: C:/Users/santi/IdeaProjects/test1/app/views/edit.scala.html
                  HASH: 415b6f32947f42eecd8979a011e9ed8a9443fb30
                  MATRIX: 959->1|1095->42|1123->45|1134->49|1172->51|1204->57|1235->62|1262->69|1314->95|1328->101|1363->116|1454->181|1477->196|1503->202|1574->247|1613->278|1652->280|1688->286|1857->429|1882->446|1908->452|1995->512|2142->638|2249->718|2290->750|2330->752|2367->758|2544->908|2571->926|2598->932|2672->979|2819->1105|2989->1247|3005->1253|3042->1268
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|38->6|41->9|41->9|41->9|42->10|43->11|46->14|46->14|46->14|46->14|49->17|49->17|49->17|50->18|51->19|53->21|53->21|53->21
                  -- GENERATED --
              */
          