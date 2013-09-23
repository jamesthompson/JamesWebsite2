
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
object hobbies extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

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
	              <li><a href=""""),_display_(Seq[Any](/*27.30*/routes/*27.36*/.Application.contact)),format.raw/*27.56*/(""""><i class="icon-envelope"></i> Contact</a></li>
	              <li class="dropdown">
	                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-plus"></i> Interests<b class="caret"></b></a>
	                <ul class="dropdown-menu">
	                  <li><a href=""""),_display_(Seq[Any](/*31.34*/routes/*31.40*/.Application.science)),format.raw/*31.60*/(""""><i class="icon-beaker"></i> Science</a></li>
	                  <li><a href=""""),_display_(Seq[Any](/*32.34*/routes/*32.40*/.Application.computing)),format.raw/*32.62*/(""""><i class="icon-cogs"></i> Computing</a></li>
	                  <li class="active"><a href="#"><i class="icon-music"></i> Hobbies</a></li>
	                </ul>
	              </li>
	            </ul>
	          </div><!--/.nav-collapse -->
	        </div>
	      </div>
	    </div>


	    <!-- Subhead
================================================== -->
<header class="jumbotron subheadfive" id="overview">
  <div class="container">
    <h1><i class="icon-music"></i> Hobbies</h1>
  </div>
</header>

		<!-- CONTAINER -->
		<div class="container">
			<br>
			<br>
			<br>
			<h1>Music</h1>
			<p class="lead">I enjoy playing guitar, and listening to music a lot.</p>
			<p>I like to listen to all sorts, but mainly American music from the likes of people like Gary Clark Jr., Derek Trucks, Doyle Bramhall II and various others.</p>
			<br>
			<br>
			<h1>Other stuff</h1>
			
			<ul class="thumbnails">
  					<li class="span4">
    					<a href="#" class="thumbnail">
      						<img src=""""),_display_(Seq[Any](/*66.24*/routes/*66.30*/.Assets.at("images/charlie.jpg"))),format.raw/*66.62*/("""" alt="">
   						 </a>
  					</li>
  					<li class="span4">
    					<a href="#" class="thumbnail">
      						<img src=""""),_display_(Seq[Any](/*71.24*/routes/*71.30*/.Assets.at("images/jasper.jpg"))),format.raw/*71.61*/("""" alt="">
   						 </a>
  					</li>
  					<div class="span5">
  					<p>I also enjoy hanging out with my friends, wife Liz and pets. Charlie the dog, and Jasper the cat.</p>
  					<p>I like swimming, skiing, scuba diving (any sport beginning with 's' really...) and watching F1 and Rugby.</p>
          		</div>

  			</ul>

	      <hr>

	      <footer>
	        <p><small>&copy; James R. Thompson - 2013</small></p>
	      </footer>

    </div> <!-- /container -->




  	</body>  
    
""")))})),format.raw/*94.2*/("""
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Sep 23 16:54:19 PDT 2013
                    SOURCE: /Users/James/Desktop/JamesWebsite2/app/views/hobbies.scala.html
                    HASH: 6afcf73c55ef75ac48103bb300d0bc9c54c2db94
                    MATRIX: 580->1|591->5|629->7|715->66|743->67|836->134|863->135|1337->573|1352->579|1392->597|1558->727|1573->733|1613->751|1720->822|1735->828|1775->846|1888->923|1903->929|1940->944|2050->1018|2065->1024|2107->1044|2443->1344|2458->1350|2500->1370|2616->1450|2631->1456|2675->1478|3710->2477|3725->2483|3779->2515|3942->2642|3957->2648|4010->2679|4534->3172
                    LINES: 22->1|22->1|22->1|27->6|27->6|30->9|30->9|42->21|42->21|42->21|45->24|45->24|45->24|46->25|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27|52->31|52->31|52->31|53->32|53->32|53->32|87->66|87->66|87->66|92->71|92->71|92->71|115->94
                    -- GENERATED --
                */
            