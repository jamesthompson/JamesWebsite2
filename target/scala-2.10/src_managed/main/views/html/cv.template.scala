
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
object cv extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main/*1.6*/ {_display_(Seq[Any](format.raw/*1.8*/("""

  <body data-spy="scroll" data-target=".bs-docs-sidebar">

      <style type="text/css">
        body """),format.raw/*6.14*/("""{"""),format.raw/*6.15*/("""
          padding-top: 0px;
          padding-bottom: 40px;
        """),format.raw/*9.9*/("""}"""),format.raw/*9.10*/("""
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
            <a class="brand" href=""""),_display_(Seq[Any](/*21.37*/routes/*21.43*/.Application.index)),format.raw/*21.61*/("""">James R. Thompson</a>
            <div class="nav-collapse collapse">
              <ul class="nav">
                <li><a href=""""),_display_(Seq[Any](/*24.31*/routes/*24.37*/.Application.index)),format.raw/*24.55*/(""""><i class="icon-home"></i> Home</a></li>
                <li><a href=""""),_display_(Seq[Any](/*25.31*/routes/*25.37*/.Application.about)),format.raw/*25.55*/(""""><i class="icon-info-sign"></i> About</a></li>
                <li class="active"><a href="#"><i class="icon-briefcase"></i> CV</a></li>
                <li><a href=""""),_display_(Seq[Any](/*27.31*/routes/*27.37*/.Application.contact)),format.raw/*27.57*/(""""><i class="icon-envelope"></i> Contact</a></li>
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-plus"></i> Interests<b class="caret"></b></a>
                  <ul class="dropdown-menu">
                    <li><a href=""""),_display_(Seq[Any](/*31.35*/routes/*31.41*/.Application.science)),format.raw/*31.61*/(""""><i class="icon-beaker"></i> Science</a></li>
                    <li><a href=""""),_display_(Seq[Any](/*32.35*/routes/*32.41*/.Application.computing)),format.raw/*32.63*/(""""><i class="icon-cogs"></i> Computing</a></li>
                    <li><a href=""""),_display_(Seq[Any](/*33.35*/routes/*33.41*/.Application.hobbies)),format.raw/*33.61*/(""""><i class="icon-music"></i> Hobbies</a></li>
                  </ul>
                </li>
              </ul>
            </div><!--/.nav-collapse -->
          </div>
        </div>
      </div>

<!-- Subhead
================================================== -->
<header class="jumbotron subheadtwo" id="overview">
  <div class="container">
    <h1><i class="icon-briefcase"></i> Curriculum Vitae</h1>
      <p class="lead"><a href=""""),_display_(Seq[Any](/*47.33*/routes/*47.39*/.Assets.at("images/cv.pdf"))),format.raw/*47.66*/("""" class="btn btn-success"><i class="icon-print"></i> CV PDF</a></p>
  </div>
</header>


  <div class="container">

    <!-- Docs nav
    ================================================== -->
    <div class="row">
      

      <div class="span9">

        <section id="education">
          <div class="page-header">
            <h1><i class="icon-book"></i> Education</h1>
          </div>

          <div class="well">
            <h2>University</h2>
            <h3>Doctor of Philosophy  <small>October 2005 - February 2009</small></h3>
            <h4><a href="http://www.ox.ac.uk">University of Oxford</a>, UK</h4>
            <h5>Subject</h5>
            <p> <a href="http://www.chem.ox.ac.uk">Physical and Theoretical Chemistry</a></p>
            <h5>Thesis Title</h5>
            <p>Imaging the Assembly of the Staphylococcal Pore-Forming Toxin Alpha-Hemolysin</p>
            <h5>Supervisor</h5>
            <p><a href="http://wallace.chem.ox.ac.uk">Dr. Mark I. Wallace</a>. Collaborated with <a href="http://bayley.chem.ox.ac.uk">Prof. Hagan Bayley F.R.S.</a></p>
            <br>
            <h3> Bachelor of Science with Honours <small>October 2002 - July 2005</small></h3>
            <h4> <a href="http://www.york.ac.uk">University of York</a>, UK</h4>
            <h5>Subject</h5>
            <p>Biochemistry</p>
            <h5>Grade</h5>
            <p>Upper Second Class Honours with a First Class Dissertation</p>
            <h5>Supervisors</h5>
            <p>Prof. Colin Kleanthous &amp; Prof. Jane Thomas-Oates</p>
          </div>
          <div class="well">
            <h2>Secondary Education</h2>
            <h3> <a href="http://www.oundleschool.org.uk">Oundle School</a> <small>October 1997 - July 2002</small></h3>
            <h5>A-Levels</h5>
            <p>Biology, Chemistry, German &amp; <strong>AS</strong> Mathematics, Physics</p>
          </div>
        </section>
        
        <section id="personal">
          <div class="page-header">
            <h1><i class="icon-user"></i> Personal Information</h1>
          </div>
          <div class="well">
            <h4>British Citizen</h4>
            <h4>US H-1B Visa Holder</h4>
          </div>
        </section>

        <section id="employment">
          <div class="page-header">
            <h1><i class="icon-briefcase"></i> Employment History</h1>
          </div>
          <div class="well">
            <h4>Postdoctoral Research Associate - University of Southern California <a class="badge badge-success">March 2012 - Present</a></h4>
              <p>Fundamental biophysical research on lipid bilayer membranes.</p>
              <p>Software development in Scala. Contributor to Spire type classes framework for numerics.</p>
            <br>
            <h4>Postdoctoral Research Fellow - Harvard University <small>August 2010 - July 2011</small></h4>
              <p>Researched and developed a nonlinear-imaging system for the study of animal development.</p>
              <p>Conceptualized the design and developed simulations and software.</p>
            <br>
            <h4>Postdoctoral Research Assistant - University of Oxford <small>February 2009 - July 2010</small></h4>
              <p>Sponsored by John Fell Fund for postdoctoral work in biophysics</p>
              <p>Designed methods to handle eukaryotic membrane proteins in vitro for single molecule study</p>
              <p>Researched protein and peptide pore formation, particularly with regards to neurodegenerative peptides</p>
          </div>
        </section>

        <section id="experience">
          <div class="page-header">
            <h1><i class="icon-eye-open"></i> Work Experience</h1>
          </div>
          <div class="well">
            <h4>Co-founder and IP Holder - Oxford Cytologic <small>February 2009 - July 2010</small></h3>
              <p>Helped to raise £500k from the John Fell Fund, Oxford University Challenge Seed Fund and BBSRC to develop a business for the commercialisation of our eukaryotic membrane protein handling technology.</p>
              <p>Developed and marketed business plan to angels, venture capitalists and acquired experienced management</p>
              <p>Established collaborative trials of technology with top pharmaceutical companies.</p>
              <p>Filed two patent applications</p>
            <br>
            <h4>Project Student - York Structural Biology Laboratory. <small>September 2004 - July 2005</small></h4>
            <p>X-ray crystallography project studying iron chelating siderophore chemistry - contributed to a paper.</p>
            <br>
            <h4>Summer Intern - AstraZeneca Ltd. <small>July 2004 - September 2004</small></h4>
            <p>Supported analytical chemists with HPLC, GC and Mass Spectrometry work.</p>
            <br>
            <h4>Summer Intern - University of York <small>July 2003 - September 2003</small></h4>
            <p>Mass spectrometry project studying soybean rhizobium biochemistry.</p>
            <br>
            <h4>Intern - Rechtsanwalt Reinhard Berkau  <small>March 2002</small></h4>
            <p>Supported a German State Lawyer in his trial advocacy as a language learning exercise.</p>
            <br>
            <h4>Intern - Sun Microsystems Inc. <small>July 1999</small></h4>
            <p>Computer systems benchmarking.</p>
          </div>
        </section>

        <section id="skills">
          <div class="page-header">
            <h1><i class="icon-cog"></i> Skills</h1>
          </div>
          <div class="well">
          <h3>Biochemical</h3>
            <p><strong>Molecular biology</strong> - <a class="badge">PCR</a> <a class="badge">Cloning</a> <a class="badge">Sequencing</a> (solid knowledge of next gen technology)</p>
            <p><strong>Protein Chemistry</strong> - <a class="badge">Bacterial expression</a> <a class="badge">coupled in vitro transcription / translation</a></p>
            <p><strong>Chromatography</strong> - <a class="badge">Electrophoresis</a> <a class="badge">HPLC (FPLC)</a> <a class="badge">Gas chromatography</a></p>
            <p><strong>Mass Spectrometry</strong> - <a class="badge">MALDI</a> <a class="badge">ESI</a> TOF MS</p>
            <p><strong>Chemistry</strong> - <a class="badge">Thiol chemistry</a> <a class="badge">site-specific labelling</a></p>
          </div>
          <div class="well">
          <h3>Biophysical</h3>
            <p><strong>Imaging</strong> - <a class="badge">Single-molecule</a> <a class="badge">TIRF</a> <a class="badge">Confocal</a> <a class="badge">Multi-photon imaging</a> <a class="badge">3D SIM</a></p>
            <p><strong>Electrophysiology</strong> - <a class="badge">Advanced in vitro methods</a></p>
          </div>
          <div class="well">
          <h3>Computational</h3>
            <p><strong>Object oriented languages</strong> - <a class="badge">Java</a> <a class="badge">Scala</a> <a class="badge">Objective-C</a> <a class="badge">C++</a></p>
            <p><strong>Low level languages</strong> - <a class="badge">C</a> <a class="badge">nVidia CUDA</a></p>
            <p><strong>Functional languages</strong> - <a class="badge">Scala</a> <a class="badge">Haskell</a> <a class="badge">(Lisps - Clojure)</a> <a class="badge"> Type-level programming</a> </p>
            <p><strong>Build Tools</strong> - <a class="badge">Simple Build Tool<a/> <a class="badge">Maven<a/> <a class="badge">gradle<a/></p>

            <p><strong>DB</strong> - <a class="badge">MYSQL</a> <a class="badge">JDBC</a> <a class="badge">H2</a> <a class="badge">Slick</a></p>
            
            <p><strong>Cloud technologies</strong> - <a class="badge">Heroku</a></p>
            <p><strong>Web technologies</strong> - <a class="badge">Play Framework</a> <a class="badge">Javascript</a> <a class="badge">HTML5</a> <a class="badge">CSS3</a> </p>
            <p><strong>Productivity</strong> - <a class="badge">Microsoft</a> <a class="badge">Adobe</a> <a class="badge">Apple software</a> <a class="badge">IntelliJ</a><a class="badge">Eclipse</a> <a class="badge">Ensime</a> <a class="badge">Sublime Text</a> <a class="badge">Matlab</a> <a class="badge">Igor Pro</a> <a class="badge">Excel</a></p>
            <p><strong>Operating Systems</strong> - <a class="badge">Mac OS X</a> <a class="badge">Linux</a> <a class="badge">MS Windows</a></p>
          </div>
        </section>

        <section id="publications">
          <div class="page-header">
            <h1><i class="icon-edit"></i> Publications</h1>
          </div>
          <h3>Peer-Reviewed Articles</h3>
          <ul class="thumbnails">
            <li class="span4">
              <div class="thumbnail">
                <img src=""""),_display_(Seq[Any](/*193.28*/routes/*193.34*/.Assets.at("images/SPT.png"))),format.raw/*193.62*/("""" alt="">
                <h3>Enhanced Stability and Fluidity in Droplet on Hydrogel Bilayers for Measuring Membrane Protein Diffusion</h3>
                <h5>Nano Lett. 2007 (12):3875-8. Thompson, J.R. et al.</h5>
                <p>We form artificial lipid bilayers suitable for single-molecule fluorescence microscopy by contacting an aqueous droplet with a hydrogel support immersed in a solution of lipid in oil. Our results show that droplet on hydrogel bilayers (DHBs) have high lipid mobilities, similar to those observed in unsupported lipid bilayers. DHBs are also stable over a period of several weeks. We examine membrane protein diffusion in these bilayers and report a decreased lateral mobility of the heptameric beta-barrel pore-forming toxin alpha-hemolysin versus that of its monomeric precursor. These results corroborate previous models of the alpha-hemolysin insertion mechanism where the monomer binds to the lipid bilayer without insertion.</p>
              </div>
            </li>

            <li class="span5">
              <div class="thumbnail">
                <img src=""""),_display_(Seq[Any](/*202.28*/routes/*202.34*/.Assets.at("images/DHB.png"))),format.raw/*202.62*/("""" alt="">
                <h3>Direct Detection of Membrane Channels from Gels Using Water-in-Oil Droplet Bilayers</h3>
                <h5>J. Am. Chem. Soc. 2007 129(51):16042-7. Heron, A.J. et al.</h5>
                <p>We form planar lipid bilayers between an aqueous droplet and a hydrogel support immersed in a lipid-oil solution. By scanning the bilayer over the surface of an SDS-PAGE gel, we are able to directly detect membrane proteins from gels using single-channel recording. Using this technique, we are able to examine low levels of endogenous protein from cell extracts without the need for over-expression. We also use droplet bilayers to detect small molecules from hydrogels. The bilayers show enhanced stability compared to conventional planar lipid bilayers, and both bilayer size and position can be controlled during an experiment. Hydrogel scanning with droplet bilayers provides a new method for the discovery and characterization of ion channels with the potential for high-throughput screening.</p>
              </div>
            </li>

            <li class="span4">
              <div class="thumbnail">
                <img src=""""),_display_(Seq[Any](/*211.28*/routes/*211.34*/.Assets.at("images/Simul.png"))),format.raw/*211.64*/("""" alt="">
                <h3>Simultaneous measurement of ionic current and fluorescence from single protein pores.</h3>
                <h5>J. Am. Chem. Soc. 2009 131(5):1652-3. Heron, A.J. et al.</h5>
                <p>The ability to simultaneously monitor both the ionic current and fluorescence from membrane channels and pores has the potential to link structural changes with function in such proteins. We present a new method for simultaneously measuring single-channel electrical currents and fluorescence from membrane proteins by using water-in-oil droplet bilayers. We demonstrate the simultaneous fluorescence and electrical detection of stochastic blocking by cyclodextrin in multiple staphylococcal alpha-hemolysin pores. The combined fluorescence signal from individual pores exhibits the same sequence of blocking events as the total current recording, showing that the two signals from each pore are correlated.</p>
              </div>
            </li>

            <li class="span5">
              <div class="thumbnail">
                <img src=""""),_display_(Seq[Any](/*220.28*/routes/*220.34*/.Assets.at("images/Euk.png"))),format.raw/*220.62*/("""" alt="">
                <h3>In Vitro Reconstitution of Eukaryotic Ion Channels Using Droplet Interface Bilayers.</h3>
                <h5>J. Am. Chem. Soc. 2011 133(24):9370–5. Leptihn, S. et al.</h5>
                <p>The ability to routinely study eukaryotic ion channels in a synthetic lipid environment would have a major impact on our understanding of how different lipids influence ion channel function. Here, we describe a straightforward, detergent-free method for the in vitro reconstitution of eukaryotic ion channels and ionotropic receptors into droplet interface bilayers and measure their electrical activity at both the macroscopic and single-channel level. We explore the general applicability of this method by reconstitution of channels from a wide range of sources including recombinant cell lines and native tissues, as well as preparations that are difficult to study by conventional methods including erythrocytes and mitochondria.</p>
              </div>
            </li>

            <li class="span9">
              <div class="thumbnail">
                <img src=""""),_display_(Seq[Any](/*229.28*/routes/*229.34*/.Assets.at("images/Hemo.png"))),format.raw/*229.63*/("""" alt="">
                <h3>Rapid Assembly of a Multimeric Membrane Protein Pore.</h3>
                <h5>Biophys. J. 2011 101(11):2679-83. Thompson, J.R. et al.</h5>
                <p>We have observed the assembly of the staphylococcal pore-forming toxin α-hemolysin using single-molecule fluorescence imaging. Surprisingly, assembly from the monomer to the complete heptamer is extremely rapid, occurring in &lt;5 ms. No lower order oligomeric intermediates are detected. Monte Carlo simulation of our experiment shows that assembly is diffusion limited, and pore formation is dependent on the stability of intermediate species. There are close similarities between bacterial pore-forming toxins, such as staphylococcal α-hemolysin, the anthrax protective antigen, and the cholesterol-dependent cytolysins, and their eukaryotic analogs, such as the complement pore membrane attack complex and perforin domain. The assembly mechanism we have observed for α-hemolysin provides a simple model that aids our understanding of these important pore formers.</p>
              </div>
            </li> 

            <li class="span5">
              <div class="thumbnail">
                <img src=""""),_display_(Seq[Any](/*238.28*/routes/*238.34*/.Assets.at("images/Ala.png"))),format.raw/*238.62*/("""" alt="">
                <h3>Imaging Multiple Conductance States in an Alamethicin Pore.</h3>
                <h5>J. Am. Chem. Soc. 2011 133(37):14507–9. Harriss, L. et al.</h5>
                <p>Alamethicin is the archetypal antimicrobial pore-forming peptide. Although the peptide has long been known to form pores of characteristic conductances in lipid membranes, the precise nature of these pores is not known. Simultaneous calcium-flux imaging and single-channel recording in a droplet interface bilayer allowed us to directly attribute multiple conductance states to a single point diffusing in the bilayer.</p>
              </div>
            </li>

            <li class="span4">
              <div class="thumbnail">
                <img src=""""),_display_(Seq[Any](/*247.28*/routes/*247.34*/.Assets.at("images/Stretch.png"))),format.raw/*247.66*/("""" alt="">
                <h3>Optical Stretching of Giant Unilamellar Vesicles with an Integrated Dual-beam Optical Trap.</h3>
                <h5>Biomed. Opt. Exp. 2012 3(10): 2419. Solmaz, M. et al.</h5>
                <p>Giant Unilamellar Vesicles (GUV) are simple analogs of cellular membranes which are routinely used in studies of the basic mechanical properties of lipid bilayers. We have integrated a dual-beam optical stretcher into a microfluidic platform in order to study GUV mechanics. GUVs are trapped and stretched through the externally applied stress created by the two opposing NIR laser beams. Quasi-spherical GUVs are slightly reshaped as ellipsoids as soon as they are trapped with minimal power. Results indicate a linear elastic stretching behavior for pure phospholipid membranes upon trapping. GUV stretching upon laser power adjustment occurs on the millisecond timescale. We also demonstrate that through this approach we are able to straightforwardly evaluate physical parameters describing the lipid bilayer’s mechanical behavior in the low-tension regime.</p>
              </div>
            </li>

            <li class="span4">
              <div class="thumbnail">
                <img src=""""),_display_(Seq[Any](/*256.28*/routes/*256.34*/.Assets.at("images/ElectrodeDevice.jpg"))),format.raw/*256.74*/("""" alt="">
                <h3>Constructing Droplet Interface Bilayers from the Contact of Aqueous Droplets in Oil.</h3>
                <h5>Nat. Protocols. 2013 8(6), 1048. Leptihn, S. et al.</h5>
                <p>We describe a protocol for forming an artificial lipid bilayer by contacting nanoliter aqueous droplets in an oil solution in the presence of phospholipids. A lipid monolayer forms at each oil-water interface, and when two such monolayers touch, a bilayer is created. Droplet interface bilayers (DIBs) are a simple way to generate stable bilayers suitable for single-channel electrophysiology and optical imaging from a wide variety of preparations, ranging from purified proteins to reconstituted eukaryotic cell membrane fragments. Examples include purified proteins from the alpha-hemolysin pore from Staphylococcus aureus, the anthrax toxin pore and the 1.2-MDa mouse mechanosensitive channel MmPiezo1. Ion channels and ionotropic receptors can also be reconstituted from membrane fragments without further purification. We describe two approaches for forming DIBs. In one approach, a lipid bilayer is created between two aqueous droplets submerged in oil. In the other approach, a membrane is formed between an aqueous droplet and an agarose hydrogel, which allows imaging in addition to electrical recordings. the protocol takes less than 30 min, including droplet generation, monolayer assembly and bilayer formation. In addition to the main protocol, we also describe the preparation of Ag/AgCl electrodes and sample preparation.</p>
              </div>
            </li> 

          </ul>
          <hr>

          <h3>Reviews</h3>
          <ul class="thumbnails">

            <li class="span4">
              <div class="thumbnail">
                <img src=""""),_display_(Seq[Any](/*271.28*/routes/*271.34*/.Assets.at("images/Hot.png"))),format.raw/*271.62*/("""" alt="">
                <h3>Incorporation of in vitro synthesized GPCR into a tethered artificial lipid membrane system</h3>
                <h5>Mol. Biosystems 2007 3:814–5 Thompson, J.R.</h5>
                <p><strong>Review of:</strong> Incorporation of In Vitro Synthesized GPCR into a Tethered Artificial Lipid Membrane System, Rudolf Robelek, Eva S. Lemker, Birgit Wiltschi, Vinzenz Kirste, Renate Naumann, Dieter Oesterhelt and Eva-Kathrin Sinner, Angew. Chem., Int. Ed., 2007, 46(4), 605–608</p>
              </div>
            </li>

            <li class="span5">
              <div class="thumbnail">
                <img src=""""),_display_(Seq[Any](/*280.28*/routes/*280.34*/.Assets.at("images/MBS.png"))),format.raw/*280.62*/("""" alt="">
                <h3>Droplet Interface Bilayers</h3>
                <h5>Mol. Biosystems 2008 3:814–5 Bayley, H. et al.</h5>
                <p>Droplet interface bilayers (DIBs) provide a superior platform for the biophysical analysis of membrane proteins. The versatile DIBs can also form networks, with features that include built-in batteries and sensors.</p>
              </div>
            </li>
          </ul>
        </section>
      </div>
     
      <div class="span3 bs-docs-sidebar">
        <ul class="nav nav-list bs-docs-sidenav" data-spy="affix" data-offset-top="245">
          <li><a href="#education"><i class="icon-book"></i> Education</a></li>
          <li><a href="#personal"><i class="icon-user"></i> Personal</a></li>
          <li><a href="#employment"><i class="icon-briefcase"></i> Employment History</a></li>
          <li><a href="#experience"><i class="icon-eye-open"></i> Experience</a></li>
          <li><a href="#skills"><i class="icon-cog"></i> Skills</a></li>
          <li><a href="#publications"><i class="icon-edit"></i> Publications</a></li>
        </ul>
      </div>

    </div>

      <footer>
          <p><small>&copy; James R. Thompson - 2013</small></p>
        </footer>

    </div>



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
                    DATE: Mon Sep 23 16:49:37 PDT 2013
                    SOURCE: /Users/James/Desktop/JamesWebsite2/app/views/cv.scala.html
                    HASH: f678c0ab530d4618aac0c4387847e9b66fd9ef11
                    MATRIX: 575->1|586->5|624->7|755->111|783->112|878->181|906->182|1395->635|1410->641|1450->659|1619->792|1634->798|1674->816|1782->888|1797->894|1837->912|2041->1080|2056->1086|2098->1106|2438->1410|2453->1416|2495->1436|2612->1517|2627->1523|2671->1545|2788->1626|2803->1632|2845->1652|3319->2090|3334->2096|3383->2123|12138->10841|12154->10847|12205->10875|13347->11980|13363->11986|13414->12014|14612->13175|14628->13181|14681->13211|15788->14281|15804->14287|15855->14315|16989->15412|17005->15418|17057->15447|18292->16645|18308->16651|18359->16679|19153->17436|19169->17442|19224->17474|20488->18701|20504->18707|20567->18747|22393->20536|22409->20542|22460->20570|23140->21213|23156->21219|23207->21247
                    LINES: 22->1|22->1|22->1|27->6|27->6|30->9|30->9|42->21|42->21|42->21|45->24|45->24|45->24|46->25|46->25|46->25|48->27|48->27|48->27|52->31|52->31|52->31|53->32|53->32|53->32|54->33|54->33|54->33|68->47|68->47|68->47|214->193|214->193|214->193|223->202|223->202|223->202|232->211|232->211|232->211|241->220|241->220|241->220|250->229|250->229|250->229|259->238|259->238|259->238|268->247|268->247|268->247|277->256|277->256|277->256|292->271|292->271|292->271|301->280|301->280|301->280
                    -- GENERATED --
                */
            