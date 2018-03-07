
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/santi/IdeaProjects/test1/conf/routes
// @DATE:Wed Mar 07 01:47:36 COT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:8
  class ReverseEntries(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def list(filter:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "entries" + play.core.routing.queryString(List(if(filter == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:12
    def edit(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "entries/" + implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:10
    def add(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "entries/new")
    }
  
    // @LINE:16
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "entries")
    }
  
    // @LINE:14
    def remove(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "entries/" + implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id) + "/remove")
    }
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def at(file:String): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
