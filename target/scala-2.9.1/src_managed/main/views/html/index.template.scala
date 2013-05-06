
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main/*1.6*/ {_display_(Seq[Any](format.raw/*1.8*/("""
    
    <body>

	    <style type="text/css">
	      body """),format.raw("""{"""),format.raw/*6.14*/("""
	        padding-top: 80px;
	        padding-bottom: 55px;
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
	          <div class="nav-collapse collapse">
	            <ul class="nav">
	              <li class="active"><a href="#"><i class="icon-home"></i> Home</a></li>
	              <li><a href=""""),_display_(Seq[Any](/*24.30*/routes/*24.36*/.Application.about)),format.raw/*24.54*/(""""><i class="icon-info-sign"></i> About</a></li>
	              <li><a href=""""),_display_(Seq[Any](/*25.30*/routes/*25.36*/.Application.cv)),format.raw/*25.51*/(""""><i class="icon-briefcase"></i> CV</a></li>
	              <li><a href=""""),_display_(Seq[Any](/*26.30*/routes/*26.36*/.Application.contact)),format.raw/*26.56*/(""""><i class="icon-envelope"></i> Contact</a></li>
	              <li class="dropdown">
	                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-plus"></i> Interests<b class="caret"></b></a>
	                <ul class="dropdown-menu">
					  <li><a href=""""),_display_(Seq[Any](/*30.22*/routes/*30.28*/.Application.science)),format.raw/*30.48*/(""""><i class="icon-beaker"></i> Science</a></li>
	                  <li><a href=""""),_display_(Seq[Any](/*31.34*/routes/*31.40*/.Application.computing)),format.raw/*31.62*/(""""><i class="icon-cogs"></i> Computing</a></li>
	                  <li><a href=""""),_display_(Seq[Any](/*32.34*/routes/*32.40*/.Application.hobbies)),format.raw/*32.60*/(""""><i class="icon-music"></i> Hobbies</a></li>
	                </ul>
	              </li>
	            </ul>
	          </div><!--/.nav-collapse -->
	        </div>
	      </div>
	    </div>


		<div class="jumbotron masthead">
			<div class="container">
			    <h1>James R. Thompson</h1>
			    <p>Postdoctoral Research Associate at the University of Southern California</p>
			    <p><a href=""""),_display_(Seq[Any](/*46.21*/routes/*46.27*/.Application.contact)),format.raw/*46.47*/("""" class="btn btn-success btn-large">Contact &raquo;</a></p>
			</div>
		</div>

		<div class="container">
	      <!-- Example row of columns -->
	      	<div class="row-fluid">
	      		<br>
		        <div class="span6">
		          <h2><i class="icon-beaker"></i> Science</h2>
		          <p>I work principally on experimental and theoretical problems in membrane biology and physics. My main experimental techniques are based upon single molecule approaches. These methods have big advantages over ensemble approaches for the study of membrane processes, the proteins which reside within membranes and the interactions between them. I work at present at the <a href="http://chems.usc.edu/malmstadt/">Mork Family Dept. Chem. Eng. &amp; Mat. Sci.</a> at USC in Los Angeles, CA USA.</p>
		          <p><a class="btn" href=""""),_display_(Seq[Any](/*57.38*/routes/*57.44*/.Application.science)),format.raw/*57.64*/("""">Read more &raquo;</a></p>
		        </div>
		        <div class="span5">
		          <h2><i class="icon-cogs"></i> Computing</h2>
		          <p>Computation is at the core of the experiments and theory work I routinely do in my research. I maintain interests and skills in modern networking technologies, GPGPU computing, functional programming and core computer science topics. I particularly like to work with <a href="http://www.scala-lang.org">Scala</a>, the <a href="http://www.oracle.com"><abbr title="Java Virtual Machine">JVM</abbr></a> and <a href="http://www.nvidia.com/object/cuda_home_new.html">nVidia <abbr title="Compute Unified Device Architecture">CUDA</abbr></a> GPGPU programming to assist me with my science projects.</p>
		          <p><a class="btn" href=""""),_display_(Seq[Any](/*62.38*/routes/*62.44*/.Application.computing)),format.raw/*62.66*/("""">Read more &raquo;</a></p>
		       </div>
	      	</div>

	      <hr>

	      <footer>
	        <p><small>&copy; James R. Thompson - 2012</small></p>
	      </footer>

    </div> <!-- /container -->
    
    </body>
    
    
""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 21 12:30:16 PDT 2012
                    SOURCE: /Users/James/Desktop/JamesWebsite/app/views/index.scala.html
                    HASH: 3080839d75b5d6f0b1a159fee67c2eb6cf8d6d84
                    MATRIX: 578->1|589->5|627->7|733->67|846->135|1477->730|1492->736|1532->754|1645->831|1660->837|1697->852|1807->926|1822->932|1864->952|2188->1240|2203->1246|2245->1266|2361->1346|2376->1352|2420->1374|2536->1454|2551->1460|2593->1480|3025->1876|3040->1882|3082->1902|3941->2725|3956->2731|3998->2751|4814->3531|4829->3537|4873->3559
                    LINES: 22->1|22->1|22->1|27->6|30->9|45->24|45->24|45->24|46->25|46->25|46->25|47->26|47->26|47->26|51->30|51->30|51->30|52->31|52->31|52->31|53->32|53->32|53->32|67->46|67->46|67->46|78->57|78->57|78->57|83->62|83->62|83->62
                    -- GENERATED --
                */
            