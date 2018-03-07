
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/santi/IdeaProjects/test1/conf/routes
// @DATE:Wed Mar 07 01:47:36 COT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:8
  Entries_2: controllers.Entries,
  // @LINE:19
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:8
    Entries_2: controllers.Entries,
    // @LINE:19
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Entries_2, Assets_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Entries_2, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """entries""", """controllers.Entries.list(filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """entries/new""", """controllers.Entries.add"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """entries/""" + "$" + """id<[^/]+>""", """controllers.Entries.edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """entries/""" + "$" + """id<[^/]+>/remove""", """controllers.Entries.remove(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """entries""", """controllers.Entries.save"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Entries_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("entries")))
  )
  private[this] lazy val controllers_Entries_list1_invoker = createInvoker(
    Entries_2.list(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entries",
      "list",
      Seq(classOf[String]),
      "GET",
      this.prefix + """entries""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Entries_add2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("entries/new")))
  )
  private[this] lazy val controllers_Entries_add2_invoker = createInvoker(
    Entries_2.add,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entries",
      "add",
      Nil,
      "GET",
      this.prefix + """entries/new""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Entries_edit3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("entries/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Entries_edit3_invoker = createInvoker(
    Entries_2.edit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entries",
      "edit",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """entries/""" + "$" + """id<[^/]+>""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Entries_remove4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("entries/"), DynamicPart("id", """[^/]+""",true), StaticPart("/remove")))
  )
  private[this] lazy val controllers_Entries_remove4_invoker = createInvoker(
    Entries_2.remove(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entries",
      "remove",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """entries/""" + "$" + """id<[^/]+>/remove""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Entries_save5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("entries")))
  )
  private[this] lazy val controllers_Entries_save5_invoker = createInvoker(
    Entries_2.save,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Entries",
      "save",
      Nil,
      "POST",
      this.prefix + """entries""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_at6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at6_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index)
      }
  
    // @LINE:8
    case controllers_Entries_list1_route(params) =>
      call(params.fromQuery[String]("filter", Some(""))) { (filter) =>
        controllers_Entries_list1_invoker.call(Entries_2.list(filter))
      }
  
    // @LINE:10
    case controllers_Entries_add2_route(params) =>
      call { 
        controllers_Entries_add2_invoker.call(Entries_2.add)
      }
  
    // @LINE:12
    case controllers_Entries_edit3_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Entries_edit3_invoker.call(Entries_2.edit(id))
      }
  
    // @LINE:14
    case controllers_Entries_remove4_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Entries_remove4_invoker.call(Entries_2.remove(id))
      }
  
    // @LINE:16
    case controllers_Entries_save5_route(params) =>
      call { 
        controllers_Entries_save5_invoker.call(Entries_2.save)
      }
  
    // @LINE:19
    case controllers_Assets_at6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at6_invoker.call(Assets_0.at(path, file))
      }
  }
}
