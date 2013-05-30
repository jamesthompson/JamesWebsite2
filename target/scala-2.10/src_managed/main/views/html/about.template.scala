
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
object about extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

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
	              <li class="active"><a href="#about"><i class="icon-info-sign"></i> About</a></li>
	              <li><a href=""""),_display_(Seq[Any](/*26.30*/routes/*26.36*/.Application.cv)),format.raw/*26.51*/(""""><i class="icon-briefcase"></i> CV</a></li>
	              <li><a href=""""),_display_(Seq[Any](/*27.30*/routes/*27.36*/.Application.contact)),format.raw/*27.56*/(""""><i class="icon-envelope"></i> Contact</a></li>
	              <li class="dropdown">
	                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-plus"></i> Interests<b class="caret"></b></a>
	                <ul class="dropdown-menu">
					 <li><a href=""""),_display_(Seq[Any](/*31.21*/routes/*31.27*/.Application.science)),format.raw/*31.47*/(""""><i class="icon-beaker"></i> Science</a></li>
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
<header class="jumbotron subheadone" id="overview">
  <div class="container">
    <h1><i class="icon-info-sign"></i> About</h1>
  </div>
</header>

		<!-- CONTAINER -->
		<div class="container">
			<br>
			<br>
			<br>
			<div class="row">
				<div class="span4">
					<img src=""""),_display_(Seq[Any](/*58.17*/routes/*58.23*/.Assets.at("images/James.jpg"))),format.raw/*58.53*/("""" class="img-rounded offset1">
				</div>
  				<div class="span5 offset2">
  					<h3>James R. Thompson</h3>
  					<p>I'm a postdoc at USC in LA. I've been working in the <a href="http://chems.usc.edu/malmstadt/">Malmstadt group</a> since March 2012 on various lipid bilayer membrane imaging projects. </p>

  					<p>Before USC I worked at Harvard University in the medical school's <a href="https://sysbio.med.harvard.edu">Systems Biology</a> department on a nonlinear imaging project for zebrafish genetics research. Before Harvard I worked at Oxford with <a href="http://www.markwallace.org">Dr. Mark Wallace</a> in the Physical and Theoretical Chemistry Laboratory. I also worked in close collaboration with <a href="http://bayley.chem.ox.ac.uk">Prof. Hagan Bayley's group</a> on my thesis work in the lab surrounding the assembly of the model pore-forming toxin alpha-hemolysin. </p>

  					<p>Prior to my research career, I obtained my degree in Biochemistry at the <a href="http://www.york.ac.uk">University of York</a>, also in England.</p>

  					<p>I'm English but I live and work here in the US. In my spare time I enjoy playing music, programming, reading, travelling and spending time with my friends, family and pets</p>

  				</div>
			</div>

	      <hr>

	      <footer>
	        <p><small>&copy; James R. Thompson - 2012</small></p>
	      </footer>

    </div> <!-- /container -->




  	</body>  
    
""")))})),format.raw/*86.2*/("""
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 30 11:23:47 PDT 2013
                    SOURCE: /Users/James/Desktop/JamesWebsite2/app/views/about.scala.html
                    HASH: b330f02c403cf397a623180a2ca0bff10991e243
                    MATRIX: 578->1|589->5|627->7|713->66|741->67|834->134|861->135|1335->573|1350->579|1390->597|1556->727|1571->733|1611->751|1815->919|1830->925|1867->940|1977->1014|1992->1020|2034->1040|2357->1327|2372->1333|2414->1353|2530->1433|2545->1439|2589->1461|2705->1541|2720->1547|2762->1567|3344->2113|3359->2119|3411->2149|4871->3578
                    LINES: 22->1|22->1|22->1|27->6|27->6|30->9|30->9|42->21|42->21|42->21|45->24|45->24|45->24|47->26|47->26|47->26|48->27|48->27|48->27|52->31|52->31|52->31|53->32|53->32|53->32|54->33|54->33|54->33|79->58|79->58|79->58|107->86
                    -- GENERATED --
                */
            