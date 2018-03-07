
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/santi/IdeaProjects/test1/conf/routes
// @DATE:Wed Mar 07 01:47:36 COT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:8
  class ReverseEntries(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entries.list",
      """
        function(filter0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "entries" + _qS([(filter0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("filter", filter0))])})
        }
      """
    )
  
    // @LINE:12
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entries.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "entries/" + (""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:10
    def add: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entries.add",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "entries/new"})
        }
      """
    )
  
    // @LINE:16
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entries.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "entries"})
        }
      """
    )
  
    // @LINE:14
    def remove: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Entries.remove",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "entries/" + (""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/remove"})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}
