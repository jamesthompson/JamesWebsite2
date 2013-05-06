
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
object contact extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main/*1.6*/ {_display_(Seq[Any](format.raw/*1.8*/("""
    
    <body>

    	<style type="text/css">
	      body """),format.raw("""{"""),format.raw/*6.14*/("""
	        padding-top: 30px;
	        padding-bottom: 40px;
	      """),format.raw("""}"""),format.raw/*9.9*/("""
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
	              <li class="active"><a href="#contact"><i class="icon-envelope"></i> Contact</a></li>
	              <li class="dropdown">
	                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-plus"></i> Interests<b class="caret"></b></a>
	                <ul class="dropdown-menu">
					  <li><a href=""""),_display_(Seq[Any](/*31.22*/routes/*31.28*/.Application.science)),format.raw/*31.48*/(""""><i class="icon-beaker"></i> Science</a></li>
	                  <li><a href=""""),_display_(Seq[Any](/*32.34*/routes/*32.40*/.Application.computing)),format.raw/*32.62*/(""""><i class="icon-cogs"></i> Computing</a></li>
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
		<header class="jumbotron subheadthree" id="overview">
		  <div class="container">
		    <h1><i class="icon-envelope"></i> Contact</h1>
		  </div>
		</header>

		<div class="container">
		  <div class="row">
		  	<br>
			<br>
			<br>
		    <div class="span2 offset2">
		      <address>
					<strong>Office Address<br></strong>
					University of Southern California<br>
					HEDCO Room 105<br>
					925 Bloom Walk<br>
					Los Angeles, CA 90089 USA<br>
				</address>
				<br>
				<address>
					<strong>Lab Address<br></strong>
					University of Southern California<br>
					RTH Room 522<br>
					3710 McClintock Avenue<br>
					Los Angeles, CA 90089 USA<br>
				</address>
				<br>
				<br>
				<a href="mailto:jamesrth&#64;usc.edu" class="btn btn-success btn-small"><i class="icon-envelope"></i> Email</a>
				<a href="http://twitter.com/drjamesthompson/" class="btn btn-primary btn-small"><i class="icon-twitter"></i> Twitter</a>
		    </div>
		    <div class="span4">
					<iframe width="600" height="500" frameborder="0" scrolling="yes" marginheight="0" marginwidth="0" src="http://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Hedco+Chemical+Engineering,+HED,+Los+Angeles,+CA&amp;aq=1&amp;oq=HEDCO+&amp;sll=37.269174,-119.306607&amp;sspn=9.000704,19.335937&amp;ie=UTF8&amp;hq=&amp;hnear=Hedco+Chemical+Engineering,+HED,+Los+Angeles,+California+90089&amp;t=m&amp;ll=34.020315,-118.288293&amp;spn=0.006225,0.00912&amp;z=16&amp;output=embed"></iframe>
				</div>
		    </div>
		  <footer>
	        <p><small>&copy; James R. Thompson - 2012</small></p>
	      </footer>
		  </div>






    </body>
    
    
""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 21 12:09:14 PDT 2012
                    SOURCE: /Users/James/Desktop/JamesWebsite/app/views/contact.scala.html
                    HASH: e4524e37de0bdeb8a5e6a5957bee1ac5f3a28edb
                    MATRIX: 580->1|591->5|629->7|735->67|848->135|1322->573|1337->579|1377->597|1543->727|1558->733|1598->751|1705->822|1720->828|1760->846|1873->923|1888->929|1925->944|2345->1328|2360->1334|2402->1354|2518->1434|2533->1440|2577->1462|2693->1542|2708->1548|2750->1568
                    LINES: 22->1|22->1|22->1|27->6|30->9|42->21|42->21|42->21|45->24|45->24|45->24|46->25|46->25|46->25|47->26|47->26|47->26|52->31|52->31|52->31|53->32|53->32|53->32|54->33|54->33|54->33
                    -- GENERATED --
                */
            