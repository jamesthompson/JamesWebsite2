
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
object computing extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main/*1.6*/ {_display_(Seq[Any](format.raw/*1.8*/("""
    
    <body data-spy="scroll" data-target=".bs-docs-sidebar">

    	<style type="text/css">
	      body """),format.raw/*6.13*/("""{"""),format.raw/*6.14*/("""
	        padding-top: 30px;
	        padding-bottom: 40px;
	      """),format.raw/*9.8*/("""}"""),format.raw/*9.9*/("""
	    </style>

    	<!-- TOP NAVBAR -->
	    <div class="navbar navbar-inverse navbar-fixed-top">
	      <div class="navbar-inner">
	        <div class="container">
	          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </a>
	          <a class="brand" href=""""),_display_(Seq[Any](/*21.36*/routes/*21.42*/.Application.index)),format.raw/*21.60*/("""">James R. Thompson</a>
	          <div class="nav-collapse collapse">
	            <ul class="nav">
	              <li><a href=""""),_display_(Seq[Any](/*24.30*/routes/*24.36*/.Application.index)),format.raw/*24.54*/(""""><i class="icon-home"></i> Home</a></li>
	              <li><a href=""""),_display_(Seq[Any](/*25.30*/routes/*25.36*/.Application.about)),format.raw/*25.54*/(""""><i class="icon-info-sign"></i> About</a></li>
	              <li><a href=""""),_display_(Seq[Any](/*26.30*/routes/*26.36*/.Application.cv)),format.raw/*26.51*/(""""><i class="icon-briefcase"></i> CV</a></li>
	              <li><a href=""""),_display_(Seq[Any](/*27.30*/routes/*27.36*/.Application.contact)),format.raw/*27.56*/(""""><i class="icon-envelope"></i> Contact</a></li>
	              <li class="dropdown">
	                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-plus"></i> Interests<b class="caret"></b></a>
	                <ul class="dropdown-menu">
					  <li><a href=""""),_display_(Seq[Any](/*31.22*/routes/*31.28*/.Application.science)),format.raw/*31.48*/(""""><i class="icon-beaker"></i> Science</a></li>
	                  <li class="active"><a href="#"><i class="icon-cogs"></i> Computing</a></li>
	                  <li><a href=""""),_display_(Seq[Any](/*33.34*/routes/*33.40*/.Application.hobbies)),format.raw/*33.60*/(""""><i class="icon-music"></i> Hobbies</a></li>
	                </ul>
	              </li>
	            </ul>
	          </div><!--/.nav-collapse -->
	        </div>
	      </div>
	    </div>


	    <!-- Subhead
================================================== -->
<header class="jumbotron subheadfour" id="overview">
  <div class="container">
    <h1><i class="icon-cogs"></i> Computing</h1>
  </div>
</header>

	<div class="container">

		<div class="row">
		
			<div class="span9">
				<section id="intro">

	            		<h1>Introduction</h1>
	            		<p class="lead">I mainly work on the JVM in Scala, but I enjoy using Java too (especially JavaFX). I contribute to the <a href="https://github.com/non/spire">Spire</a> project for numeric type-classes in Scala. I also like making Cocoa / iOS apps and hacking GPUs with nVidia CUDA.</p>
	          		<p>Here you'll find snippets of useful code that I'd like to share, along with movies demonstrating some of the apps I'm working on as part of my work here at USC. Please also check out my GitHub page.</p>
				</section>

				<section id="programming">
	          		<div class="page-header">
	            		<h1>Programming</h1>
	            		<p class="lead">Some useful snippets of code I'd like to share</p>
	          		</div>
	          		<a href="https://github.com/jamesthompson"><img style="position: absolute; top: 25px; left: 0; border: 0;" src="https://s3.amazonaws.com/github/ribbons/forkme_left_green_007200.png" alt="Fork me on GitHub"></a>
	          		<h3>Linear Regression in Scala</h3>
	          		<script src="https://gist.github.com/jamesthompson/5527138.js"></script>
	          		<h3>Legendre Polynomials in Scala</h3>
	          		<script src="https://gist.github.com/jamesthompson/3815164.js"></script>
	          		<h3>Fast Fourier Transform in Scala</h3>
	          		<script src="https://gist.github.com/3406640.js"> </script>
	          		
				</section>

				<section id="software">
	          		<div class="page-header">
	            		<h1>Software</h1>
	            		<p class="lead">Some examples of apps I'm developing for my work</p>
	          		</div>
	          		<iframe width="640" height="360" src="http://www.youtube.com/embed/5NDQZpNejM4" frameborder="0" allowfullscreen></iframe>
	          		<iframe width="640" height="360" src="http://www.youtube.com/embed/2dwgb_UeEu8" frameborder="0" allowfullscreen></iframe>
	          		<iframe width="640" height="360" src="http://www.youtube.com/embed/zxhjkJlhqfI" frameborder="0" allowfullscreen></iframe>
				</section>

			</div>

		     <div class="span3 bs-docs-sidebar">
        		<ul class="nav nav-list bs-docs-sidenav" data-spy="affix" data-offset-top="150">
          			<li><a href="#intro">Introduction</a></li>
		          	<li><a href="#programming">Programming</a></li>
		          	<li><a href="#software">Software</a></li>
        		</ul>
      		</div>

		</div>

			      <footer>
	        <p><small>&copy; James R. Thompson - 2013</small></p>
	      </footer>
	</div>	




  	</body>  
    
""")))})),format.raw/*110.2*/("""
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Sep 23 16:53:31 PDT 2013
                    SOURCE: /Users/James/Desktop/JamesWebsite2/app/views/computing.scala.html
                    HASH: 78753a090c633d65865f008d498c9492b61bae34
                    MATRIX: 582->1|593->5|631->7|766->115|794->116|887->183|914->184|1388->622|1403->628|1443->646|1609->776|1624->782|1664->800|1771->871|1786->877|1826->895|1939->972|1954->978|1991->993|2101->1067|2116->1073|2158->1093|2482->1381|2497->1387|2539->1407|2750->1582|2765->1588|2807->1608|5900->4669
                    LINES: 22->1|22->1|22->1|27->6|27->6|30->9|30->9|42->21|42->21|42->21|45->24|45->24|45->24|46->25|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27|52->31|52->31|52->31|54->33|54->33|54->33|131->110
                    -- GENERATED --
                */
            