
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
        <title>James R. Thompson</title>
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <meta name="description" content="Personal Website">
	    <meta name="author" content="James R. Thompson">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.54*/routes/*12.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*12.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*13.54*/routes/*13.60*/.Assets.at("stylesheets/font-awesome.css"))),format.raw/*13.102*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.54*/routes/*14.60*/.Assets.at("stylesheets/james.css"))),format.raw/*14.95*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*15.59*/routes/*15.65*/.Assets.at("images/favicon.png"))),format.raw/*15.97*/("""">
        <script src=""""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*16.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*17.23*/routes/*17.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*17.71*/("""" type="text/javascript"></script>       
    </head>
    """),_display_(Seq[Any](/*19.6*/content)),format.raw/*19.13*/("""
</html>
"""))}
    }
    
    def render(content:Html) = apply(content)
    
    def f:((Html) => play.api.templates.Html) = (content) => apply(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 21 12:29:35 PDT 2012
                    SOURCE: /Users/James/Desktop/JamesWebsite/app/views/main.scala.html
                    HASH: b163ca3403c23869a916f9a054aff92b121da7de
                    MATRIX: 502->1|594->16|980->366|995->372|1056->411|1148->467|1163->473|1228->515|1320->571|1335->577|1392->612|1489->673|1504->679|1558->711|1619->736|1634->742|1701->787|1794->844|1809->850|1873->892|1967->951|1996->958
                    LINES: 19->1|22->1|33->12|33->12|33->12|34->13|34->13|34->13|35->14|35->14|35->14|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|40->19|40->19
                    -- GENERATED --
                */
            