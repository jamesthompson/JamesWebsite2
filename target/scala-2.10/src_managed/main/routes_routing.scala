// @SOURCE:/Users/James/Desktop/JamesWebsite2/conf/routes
// @HASH:8448a05080a9d877e453c05f2665fb008923e03c
// @DATE:Thu May 30 11:23:46 PDT 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_about1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("about"))))
        

// @LINE:8
private[this] lazy val controllers_Application_cv2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cv"))))
        

// @LINE:9
private[this] lazy val controllers_Application_contact3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contact"))))
        

// @LINE:10
private[this] lazy val controllers_Application_science4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("science"))))
        

// @LINE:11
private[this] lazy val controllers_Application_computing5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computing"))))
        

// @LINE:12
private[this] lazy val controllers_Application_hobbies6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("hobbies"))))
        

// @LINE:15
private[this] lazy val controllers_Assets_at7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.Application.about"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cv""","""controllers.Application.cv"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contact""","""controllers.Application.contact"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """science""","""controllers.Application.science"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computing""","""controllers.Application.computing"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """hobbies""","""controllers.Application.hobbies"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_about1(params) => {
   call { 
        invokeHandler(controllers.Application.about, HandlerDef(this, "controllers.Application", "about", Nil,"GET", """""", Routes.prefix + """about"""))
   }
}
        

// @LINE:8
case controllers_Application_cv2(params) => {
   call { 
        invokeHandler(controllers.Application.cv, HandlerDef(this, "controllers.Application", "cv", Nil,"GET", """""", Routes.prefix + """cv"""))
   }
}
        

// @LINE:9
case controllers_Application_contact3(params) => {
   call { 
        invokeHandler(controllers.Application.contact, HandlerDef(this, "controllers.Application", "contact", Nil,"GET", """""", Routes.prefix + """contact"""))
   }
}
        

// @LINE:10
case controllers_Application_science4(params) => {
   call { 
        invokeHandler(controllers.Application.science, HandlerDef(this, "controllers.Application", "science", Nil,"GET", """""", Routes.prefix + """science"""))
   }
}
        

// @LINE:11
case controllers_Application_computing5(params) => {
   call { 
        invokeHandler(controllers.Application.computing, HandlerDef(this, "controllers.Application", "computing", Nil,"GET", """""", Routes.prefix + """computing"""))
   }
}
        

// @LINE:12
case controllers_Application_hobbies6(params) => {
   call { 
        invokeHandler(controllers.Application.hobbies, HandlerDef(this, "controllers.Application", "hobbies", Nil,"GET", """""", Routes.prefix + """hobbies"""))
   }
}
        

// @LINE:15
case controllers_Assets_at7(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        