
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
object science extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

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
					<li class="active"><a href="#"><i class="icon-beaker"></i> Science</a></li>
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
<header class="jumbotron subhead" id="overview">
  <div class="container">
    <h1><i class="icon-beaker"></i> Science</h1>
  </div>
</header>

		<div class="container">

		<div class="row">

		

		<div class="span9">
			<section id="intro">
          		<div class="page-header">
            		<h1>Introduction</h1>
            		<p class="lead">I have a broad scientific background, ranging from work in fundamental biochemical sciences and structural biology to biophysical work on membranes and protein chemistry. I now work in a multi-disciplinary chemical engineering department on various core membrane physics problems.</p>
          		</div>
          		
          		<p>I started my academic research at the Chemistry Department at the University of York in the UK where I worked with Prof. Jane Thomas-Oates on a mass spectrometry study of soy-bean rhizobia sugar interactions. I completed my undergraduate research project in the York Structural Biology Laboratory working on crystallizing iron-chelating siderophore binding proteins from <em>C. jejuni</em> and <em>B. anthracis</em>.</p>

          		<p>I was then offered a PhD studentship at Oxford University with Dr. Mark I. Wallace at the Physical and Theoretical Chemistry Laboratory. My thesis work then began in 2005, lasting until early 2009 when I submitted my thesis. We worked in close collaboration with Prof. Hagan Bayley and his lab. I was examined by Dr. Richard Berry (Oxford - Physics) and Dr. Justin Molloy (MRC - NIMR London). While at Oxford we worked on developing a new method to create artificial mimics of the cell membrane called 'Droplet interface bilayers'. We adapted the approach for simultaneous single-molecule fluorescence imaging and single-channel resolution electrical recording (patch-clamping). Using the new technology, we began studying the assembly mechanism of the model pore-forming toxin alpha-hemolysin. I very much enjoyed my time at Oxford and felt very privileged to work with some incredibly talented and dedicated people.</p>

          		<div class="alert alert-success"> 
          			Droplet interface bilayers are created by submerging two aqueous phases in bulk lipid in oil (typically an alkane), and then contacting them. Lipids will spontaneously assemble at the interface between the water and oil phases. When brought together they can zip up to form a lipid bilayer. These bilayers are fluid, high resistance and long-lived making single-molecule experiments on membrane proteins much easier.
          		</div>

          		<ul class="thumbnails">
  					<li class="span4">
    					<a href="#" class="thumbnail">
      						<img src=""""),_display_(Seq[Any](/*75.24*/routes/*75.30*/.Assets.at("images/DHB.png"))),format.raw/*75.58*/("""" alt="">
   						 </a>
  					</li>
  				<div class="span5">

  					<p>I left Oxford after staying for a brief stint to work as a John Fell Fund postdoc. During that time we attempted to take the droplet methods we had developed further and apply them to the study of much more complicated eukaryotic membrane proteins. Fruitful work resulted in the inception of a commercial enterprise, and intellectual property protection in the form of patents.</p>

          			<p>From 2010 until 2011 I worked at Harvard University at the Medical School. I worked with Dr. Sean Megason on his project to image zebrafish embryogenesis and map cell-lineages with various genetic backgrounds. My work focussed on the design and development of a multi-photon imaging system for this goal.</p>
          			<p>Since early 2012 I have been at the University of Southern California. I work with Dr. Noah Malmstadt on various lipid bilayer problems. We use fluorescence imaging to study mechanical properties of artificial lipid bilayers. Work so far has resulted in the publication of a new technique to apply optical forces to stretch Giant Unilamellar Vesicles.</p>
          		</div>

  				</ul>

			</section>

			<section id="membranes">
          		<div class="page-header">
            		<h1>Membranes</h1>
            		<p class="lead">I work principally with artificial mimics of the cell membrane. Cell membranes are swelled with a large quantity of protein, supported by and anchored to the cytoskeleton and are extremely heterogeneous. In vitro we're able to take away all these complicating factors and study pure systems in rigorous controlled environments.</p>
          		</div>
				
				<ul class="thumbnails">
	  				<div class="span5">
	  					<p>Lipid bilayer membranes are conserved in all domains of nature. They are non-covalent supramolecular assemblies of amphiphilic lipid molecules which serve to compartmentalise the cell or intracellular organelles. Through envelopment of an entire cell (plasma membrane) or organelle, they serve as a mediator of the control of selective transfer of molecules across the membrane. They are comprised of two asymmetric leaflets, with phospholipids being the most abundant lipids. Phospholipids are not used for the direct storage of energy as in the case of triglycerides. Instead, their assembly as a bilayer allows a barrier to form between the inside and outside of a cell or compartment. This facilitates the establishment of gradients of ions and protons, and hence electrical charge. This electrical charge can be used for important processes in energy generation, intercellular signal transduction and hence nervous communication. Plasma membranes also serve as a host for multiple recognition molecules (peripheral membrane proteins) and anchors for extracellular matrices. Along with hosting important enzymes for cellular metabolism (integral membrane proteins), they serve as a conduit for the import and export of molecular species with the cell.</p>
	          		</div>
          		  	<li class="span4">
    					<a href="#" class="thumbnail">
      						<img src=""""),_display_(Seq[Any](/*102.24*/routes/*102.30*/.Assets.at("images/membrane.png"))),format.raw/*102.63*/("""" alt="">
   						 </a>
  					</li>

  				</ul>
					




			</section>

			<section id="proteins">
          		<div class="page-header">
            		<h1>Proteins</h1>
            		<p class="lead">Membrane proteins are responsible for some of the most fundamental biological processes. For example: chemotaxis, ATP generation, nervous signal transduction and intercellular signalling. They are ubiquitous in all kingdoms of life, and are found in viruses. This ubiquity combined with involvement in varied biological processes has made them the source of much research worldwide. They are also industrial targets of research, where membrane proteins represent a large proportion of pharmaceutical targets.</p>
          		</div>
          		
          		<ul class="thumbnails">
  					<li class="span5">
    					<a href="#" class="thumbnail">
      						<img src=""""),_display_(Seq[Any](/*123.24*/routes/*123.30*/.Assets.at("images/aHLBilayer.png"))),format.raw/*123.65*/("""" alt="">
   						 </a>
  					</li>
  				<div class="span4">
				
				<p>Many membrane proteins exist as obligate oligomers. Therefore, they may only function as a complex or remain in a natured state as a complex. These oligomers are either homomeric or heteromeric, and in the majority of cases must be directly inserted into the lipid bilayer by cellular machinery, evolutionarily conserved in nature. Often signal sequences cotranslated with the functional protein direct the nascent polypeptide chain to the Sec translocon. The translocon exists in the innermost membrane of bacteria or the endoplasmic reticulum in eukaryotes. It forms a conduit channel through which the protein is inserted laterally into the lipid bilayer. This process has been shown to require energy input in bacteria and plants. When a protein is inserted into the lipid bilayer, its subsequent folding to form the correct conformation is presumably driven by minimisation of the free energy in the polypeptide chain, as is the case for other water-soluble proteins.</p>

				<p>The study of membrane proteins in vitro requires that the protein is reconstituted from its native folded state in a lipid bilayer and manipulated in aqueous solution. Thereafter, the protein must be reconstituted into an artificial lipid bilayer. The overexpression, recovery and reconstitution of natured intrinsic membrane proteins from an expressing organism is usually very difficult. This is one reason for the comparatively small amount of high-resolution X-ray crystallographic information for membrane proteins versus water-soluble proteins.</p>
          		</div>

  				</ul>

  				<p>Experiments with membrane proteins able to catalyse their own insertion into the lipid bilayer provide a more straightforward means to not only overexpress and reconstitute the protein into a lipid bilayer in vitro, but also to perform downstream functional experiments. My work with alpha-hemolysin aimed to understand in greater detail the means by which a membrane protein can oligomerize and insert a transmembrane domain into the lipid bilayer.</p>

			</section>

			<section id="smf">
          		<div class="page-header">
            		<h1>Single-Molecule Fluorescence</h1>
            		<p class="lead">For the majority of the 20th century biochemical experiments were limited to those on ensembles of molecules. Kinetic measurements of this kind usually entail the synchronisation of a population of molecules followed by subsequent perturbation of an equilibrium, yielding an observable and measurable change. It is usually the case that the behaviour of the molecule of interest is not directly observable whilst at equilibrium. Single-molecule approaches have gone someway to alleviate this hindrance, and allow the direct observation of biomolecular behaviours and structures at equilibria, with far greater resolution than ensemble measurements.
          		</div>

          		<ul class="thumbnails">
	  				<div class="span5">
						<p>Single-molecule measurements are capable of measuring individual molecular dynamics, versus an averaged value in an ensemble measurement. Sub-populations of behaviours, structures and interactions are discretized and analysed statistically in single-molecule measurements, allowing insights into previously hidden "averaged" situations. In addition, extremely rare events can be observed which are often invisible in ensemble measurements, or were potentially classified as noise, and which could have been of great importance in a biochemical context.</p>

						<p>In fluorescence microscopy, the key factor in resolution of single-molecules is a sufficiently high signal-to-noise ratio (SNR) for a fluorophore under observation. The primary sources of noise in a typical experiment are Raman scattered photons from water molecules in the specimen, and background fluorescent species in the sample. The amount of scattered light is typically minimised in single-molecule fluorescence experiments by reducing the volume of detection. By minimising the illumination volume, a dramatic reduction in the background noise is facilitated, yielding a sufficient signal-to-noise ratio for the detection of light emitted light from a single fluorophore.</p>
	          		</div>
          		  	<li class="span4">
    					<a href="#" class="thumbnail">
      						<img src=""""),_display_(Seq[Any](/*153.24*/routes/*153.30*/.Assets.at("images/SPT.png"))),format.raw/*153.58*/("""" alt="">
   						 </a>
  					</li>

  				</ul>
          		
				 
			</section>

			<section id="scer">
          		<div class="page-header">
            		<h1>Single-Channel Electrical Recording</h1>
          		</div>


          		<ul class="thumbnails">
  					<li class="span6">
    					<a href="#" class="thumbnail">
      						<img src=""""),_display_(Seq[Any](/*171.24*/routes/*171.30*/.Assets.at("images/Simul.png"))),format.raw/*171.60*/("""" alt="">
   						 </a>
  					</li>
  				<div class="span3">
				
				<p>The lipid bilayer acts as a barrier to ion flow. The movement of ions across a membrane is often passively mediated by ion-channels. These proteins do not require any energy but selectively filter ions allowing for the creation or maintenance of electrochemical gradients across the bilayer. If the lipid bilayer is coherent and highly-resistive to ion crossing we're able to record the current through individual channels embedded in the membrane under different conditions. We make use of patch-clamp amplifiers to measure these tiny currents, typically on the picoampere scale.</p>
				<p>Using droplet bilayers it's possible to simultaneously measure fluorescence and electrical properties of the lipid bilayer.</p>
          		</div>

  				</ul>
          		
			</section>

			<section id="mechanics">
          		<div class="page-header">
            		<h1>Lipid Bilayer Mechanics</h1>
            		<p class="lead">The function of a membrane is not purely driven by embedded proteins. Mechanical behaviours are responsible for varied cellular processes directly, as well as indirectly altering protein function.</p>
          		</div>

          		<ul class="thumbnails">
	  				<div class="span5">
						Intrinsic mechanical behaviors of the lipid bilayer such as bending and varying tension are fundamental to normal cellular function and have been shown to directly modulate ion channel behavior. The widely accepted physical model of lipid bilayer continuum mechanics was first given by Helfrich in his paper of 1973. It is a simplified model based upon a few assumptions. Namely, that the lipid bilayer is a continuum, it is metastable and that it is unperturbed by interactions with extrinsic species other than those from the solvent in which it is suspended. 

						We use the giant unilamellar vesicle (GUV) to study such mechanics. At thermal equilibrium fluctuations in its three-dimensional geometry are driven by the minimization of elastic energy due to membrane curvature. We can measure these fluctuations by imaging the shape changes, or alternatively stretch the lipid bilayer using extrinsic forces such as optical pressure. We recently developed a microfluidic integrated dual beam optical stretcher using infra-red lasers. We are now able to study mechanics in well-controlled artificial cell membrane mimics. 
	          		</div>
          		  	<li class="span4">
    					<a href="#" class="thumbnail">
      						<img src=""""),_display_(Seq[Any](/*198.24*/routes/*198.30*/.Assets.at("images/Stretch.png"))),format.raw/*198.62*/("""" alt="">
   						 </a>
  					</li>

  				</ul>
          		
				 
			</section>


		</div>

			<div class="span3 bs-docs-sidebar">
        		<ul class="nav nav-list bs-docs-sidenav" data-spy="affix" data-offset-top="150">
          			<li><a href="#intro">Introduction</a></li>
		          	<li><a href="#membranes">Membranes</a></li>
		          	<li><a href="#proteins">Proteins</a></li>
		          	<li><a href="#smf">Single-Molecule Fluorescence</a></li>
		          	<li><a href="#scer">Single-Channel Electrical Recording</a></li>
		          	<li><a href="#mechanics">Lipid Bilayer Mechanics</a></li>
        		</ul>
      		</div>

		</div>

            <footer>
          <p><small>&copy; James R. Thompson - 2013</small></p>
        </footer>
	</div>	




  	</body>  
    
""")))})),format.raw/*233.2*/("""
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Sep 23 16:49:37 PDT 2013
                    SOURCE: /Users/James/Desktop/JamesWebsite2/app/views/science.scala.html
                    HASH: 6d9b3a61aa929d6890f658f1d3153ed53b313f8d
                    MATRIX: 580->1|591->5|629->7|764->115|792->116|885->183|912->184|1386->622|1401->628|1441->646|1607->776|1622->782|1662->800|1769->871|1784->877|1824->895|1937->972|1952->978|1989->993|2099->1067|2114->1073|2156->1093|2573->1474|2588->1480|2632->1502|2748->1582|2763->1588|2805->1608|5767->4534|5782->4540|5832->4568|9000->7699|9016->7705|9072->7738|9982->8611|9998->8617|10056->8652|14472->13031|14488->13037|14539->13065|14927->13416|14943->13422|14996->13452|17567->15986|17583->15992|17638->16024|18460->16814
                    LINES: 22->1|22->1|22->1|27->6|27->6|30->9|30->9|42->21|42->21|42->21|45->24|45->24|45->24|46->25|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27|53->32|53->32|53->32|54->33|54->33|54->33|96->75|96->75|96->75|123->102|123->102|123->102|144->123|144->123|144->123|174->153|174->153|174->153|192->171|192->171|192->171|219->198|219->198|219->198|254->233
                    -- GENERATED --
                */
            