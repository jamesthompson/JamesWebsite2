// @SOURCE:/Users/James/Desktop/JamesWebsite/conf/routes
// @HASH:cff60e756d441a1974bb34f401be34f0dd840040
// @DATE:Fri Sep 21 12:09:14 PDT 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:11
def computing() = {
   Call("GET", "/computing")
}
                                                        
 
// @LINE:10
def science() = {
   Call("GET", "/science")
}
                                                        
 
// @LINE:7
def about() = {
   Call("GET", "/about")
}
                                                        
 
// @LINE:8
def cv() = {
   Call("GET", "/cv")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:12
def hobbies() = {
   Call("GET", "/hobbies")
}
                                                        
 
// @LINE:9
def contact() = {
   Call("GET", "/contact")
}
                                                        

                      
    
}
                            

// @LINE:15
class ReverseAssets {
    


 
// @LINE:15
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:11
def computing = JavascriptReverseRoute(
   "controllers.Application.computing",
   """
      function() {
      return _wA({method:"GET", url:"/computing"})
      }
   """
)
                                                        
 
// @LINE:10
def science = JavascriptReverseRoute(
   "controllers.Application.science",
   """
      function() {
      return _wA({method:"GET", url:"/science"})
      }
   """
)
                                                        
 
// @LINE:7
def about = JavascriptReverseRoute(
   "controllers.Application.about",
   """
      function() {
      return _wA({method:"GET", url:"/about"})
      }
   """
)
                                                        
 
// @LINE:8
def cv = JavascriptReverseRoute(
   "controllers.Application.cv",
   """
      function() {
      return _wA({method:"GET", url:"/cv"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:12
def hobbies = JavascriptReverseRoute(
   "controllers.Application.hobbies",
   """
      function() {
      return _wA({method:"GET", url:"/hobbies"})
      }
   """
)
                                                        
 
// @LINE:9
def contact = JavascriptReverseRoute(
   "controllers.Application.contact",
   """
      function() {
      return _wA({method:"GET", url:"/contact"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:15
class ReverseAssets {
    


 
// @LINE:15
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:11
def computing() = new play.api.mvc.HandlerRef(
   controllers.Application.computing(), HandlerDef(this, "controllers.Application", "computing", Seq())
)
                              
 
// @LINE:10
def science() = new play.api.mvc.HandlerRef(
   controllers.Application.science(), HandlerDef(this, "controllers.Application", "science", Seq())
)
                              
 
// @LINE:7
def about() = new play.api.mvc.HandlerRef(
   controllers.Application.about(), HandlerDef(this, "controllers.Application", "about", Seq())
)
                              
 
// @LINE:8
def cv() = new play.api.mvc.HandlerRef(
   controllers.Application.cv(), HandlerDef(this, "controllers.Application", "cv", Seq())
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:12
def hobbies() = new play.api.mvc.HandlerRef(
   controllers.Application.hobbies(), HandlerDef(this, "controllers.Application", "hobbies", Seq())
)
                              
 
// @LINE:9
def contact() = new play.api.mvc.HandlerRef(
   controllers.Application.contact(), HandlerDef(this, "controllers.Application", "contact", Seq())
)
                              

                      
    
}
                            

// @LINE:15
class ReverseAssets {
    


 
// @LINE:15
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                