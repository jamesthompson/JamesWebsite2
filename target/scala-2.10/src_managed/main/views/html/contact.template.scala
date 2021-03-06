
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
				<a href="mailto:jamesrthompson&#64;icloud.com" class="btn btn-success btn-small"><i class="icon-envelope"></i> Email</a>
				<a href="http://twitter.com/james_rth/" class="btn btn-primary btn-small"><i class="icon-twitter"></i> Twitter</a>
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
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Sep 23 16:24:28 PDT 2013
                    SOURCE: /Users/James/Desktop/JamesWebsite2/app/views/contact.scala.html
                    HASH: c766c2979f78e0d42c5f9c78af7b5e198ad7241d
                    MATRIX: 580->1|591->5|629->7|715->66|743->67|836->134|863->135|1337->573|1352->579|1392->597|1558->727|1573->733|1613->751|1720->822|1735->828|1775->846|1888->923|1903->929|1940->944|2360->1328|2375->1334|2417->1354|2533->1434|2548->1440|2592->1462|2708->1542|2723->1548|2765->1568
                    LINES: 22->1|22->1|22->1|27->6|27->6|30->9|30->9|42->21|42->21|42->21|45->24|45->24|45->24|46->25|46->25|46->25|47->26|47->26|47->26|52->31|52->31|52->31|53->32|53->32|53->32|54->33|54->33|54->33
                    -- GENERATED --
                */
            