// @SOURCE:/Users/James/Desktop/JamesWebsite/conf/routes
// @HASH:cff60e756d441a1974bb34f401be34f0dd840040
// @DATE:Fri Sep 21 12:09:14 PDT 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:7
val controllers_Application_about1 = Route("GET", PathPattern(List(StaticPart("/about"))))
                    

// @LINE:8
val controllers_Application_cv2 = Route("GET", PathPattern(List(StaticPart("/cv"))))
                    

// @LINE:9
val controllers_Application_contact3 = Route("GET", PathPattern(List(StaticPart("/contact"))))
                    

// @LINE:10
val controllers_Application_science4 = Route("GET", PathPattern(List(StaticPart("/science"))))
                    

// @LINE:11
val controllers_Application_computing5 = Route("GET", PathPattern(List(StaticPart("/computing"))))
                    

// @LINE:12
val controllers_Application_hobbies6 = Route("GET", PathPattern(List(StaticPart("/hobbies"))))
                    

// @LINE:15
val controllers_Assets_at7 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index"""),("""GET""","""/about""","""controllers.Application.about"""),("""GET""","""/cv""","""controllers.Application.cv"""),("""GET""","""/contact""","""controllers.Application.contact"""),("""GET""","""/science""","""controllers.Application.science"""),("""GET""","""/computing""","""controllers.Application.computing"""),("""GET""","""/hobbies""","""controllers.Application.hobbies"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:7
case controllers_Application_about1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.about, HandlerDef(this, "controllers.Application", "about", Nil))
   }
}
                    

// @LINE:8
case controllers_Application_cv2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.cv, HandlerDef(this, "controllers.Application", "cv", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_contact3(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.contact, HandlerDef(this, "controllers.Application", "contact", Nil))
   }
}
                    

// @LINE:10
case controllers_Application_science4(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.science, HandlerDef(this, "controllers.Application", "science", Nil))
   }
}
                    

// @LINE:11
case controllers_Application_computing5(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.computing, HandlerDef(this, "controllers.Application", "computing", Nil))
   }
}
                    

// @LINE:12
case controllers_Application_hobbies6(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.hobbies, HandlerDef(this, "controllers.Application", "hobbies", Nil))
   }
}
                    

// @LINE:15
case controllers_Assets_at7(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                