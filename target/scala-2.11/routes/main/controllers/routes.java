
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/santi/IdeaProjects/test1/conf/routes
// @DATE:Wed Mar 07 01:47:36 COT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseEntries Entries = new controllers.ReverseEntries(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseEntries Entries = new controllers.javascript.ReverseEntries(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
