
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
        body """),format.raw("""{"""),format.raw/*6.15*/("""
          padding-top: 0px;
          padding-bottom: 40px;
        """),format.raw("""}"""),format.raw/*9.10*/("""
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
            <p><a href="http://www.markwallace.org">Dr. Mark Ian Wallace</a>. Collaborated with <a href="http://bayley.chem.ox.ac.uk">Prof. Hagan Bayley F.R.S.</a></p>
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
            <h4>US H1-B Visa Holder</h4>
          </div>
        </section>

        <section id="employment">
          <div class="page-header">
            <h1><i class="icon-briefcase"></i> Employment History</h1>
          </div>
          <div class="well">
            <h4>Postdoctoral Research Associate - University of Southern California <a class="badge badge-success">March 2012 - Present</a></h4>
              <p>Fundamental biophysical research on lipid bilayer membranes.</p>
              <p>Measuring mechanical properties of <abbr title="Giant Unilamellar Vesicles">GUVs</abbr> fluctuating unperturbed at thermal equilibrium and in external fields.</p>
              <p>Measuring lipid phase behaviours using single-molecule imaging and single particle analysis.</p>
              <p>Simulating GUV mechanical behaviours.</p> 
            <br>
            <h4>Postdoctoral Research Fellow - Harvard University <small>August 2010 - July 2011</small></h4>
              <p>Researched and developed a nonlinear-imaging system for the study of zebrafish development.</p>
              <p>Conceptualized the design and developed simulations and software.</p>
            <br>
            <h4>Postdoctoral Research Assistant - University of Oxford <small>February 2009 - July 2010</small></h4>
              <p>Sponsored by John Fell Fund for postdoctoral work in biophysics</p>
              <p>Designed methods to handle eukaryotic membrane proteins in vitro for single molecule analysis</p>
              <p>Researched protein and peptide pore formation</p>
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
            <p><strong>Imaging</strong> - <a class="badge">Single-molecule</a> <a class="badge">TIRF</a> <a class="badge">Confocal</a> <a class="badge">Multi-photon imaging</a></p>
            <p><strong>Electrophysiology</strong> - <a class="badge">Advanced in vitro methods</a></p>
          </div>
          <div class="well">
          <h3>Computational</h3>
            <p><strong>Object oriented languages</strong> - <a class="badge">Java</a> <a class="badge">Scala</a> <a class="badge">Objective-C</a> <a class="badge">C++</a></p>
            <p><strong>Low level languages</strong> - <a class="badge">C</a> <a class="badge">nVidia CUDA</a></p>
            <p><strong>Functional languages</strong> - <a class="badge">Scala</a> <a class="badge">Haskell</a> <a class="badge">(Lisps - Clojure)</a> <a class="badge">ScalaZ</a> </p>
            <p><strong>Build Tools</strong> - <a class="badge">Simple Build Tool<a/> <a class="badge">Maven<a/> <a class="badge">gradle<a/></p>
            <p><strong>Databases</strong> - <a class="badge">MYSQL</a> <a class="badge">JDBC</a> <a class="badge">H2</a> <a class="badge">Slick</a></p>
            <p><strong>Web technologies</strong> - <a class="badge">Play Framework</a> <a class="badge">Javascript</a> <a class="badge">HTML5</a> <a class="badge">CSS3</a> </p>
            <p><strong>Productivity</strong> - <a class="badge">Microsoft</a> <a class="badge">Adobe</a> <a class="badge">Apple software</a> <a class="badge">IntelliJ</a> <a class="badge">Ensime</a> <a class="badge">Sublime Text 2</a> <a class="badge">Netbeans 7.2</a> <a class="badge">Matlab</a> <a class="badge">Igor Pro</a> <a class="badge">Excel</a></p>
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
                <img src=""""),_display_(Seq[Any](/*192.28*/routes/*192.34*/.Assets.at("images/SPT.png"))),format.raw/*192.62*/("""" alt="">
                <h3>Enhanced Stability and Fluidity in Droplet on Hydrogel Bilayers for Measuring Membrane Protein Diffusion</h3>
                <h5>Nano Lett. 2007 (12):3875-8. Thompson, J.R. et al.</h5>
                <p>We form artificial lipid bilayers suitable for single-molecule fluorescence microscopy by contacting an aqueous droplet with a hydrogel support immersed in a solution of lipid in oil. Our results show that droplet on hydrogel bilayers (DHBs) have high lipid mobilities, similar to those observed in unsupported lipid bilayers. DHBs are also stable over a period of several weeks. We examine membrane protein diffusion in these bilayers and report a decreased lateral mobility of the heptameric beta-barrel pore-forming toxin alpha-hemolysin versus that of its monomeric precursor. These results corroborate previous models of the alpha-hemolysin insertion mechanism where the monomer binds to the lipid bilayer without insertion.</p>
              </div>
            </li>

            <li class="span5">
              <div class="thumbnail">
                <img src=""""),_display_(Seq[Any](/*201.28*/routes/*201.34*/.Assets.at("images/DHB.png"))),format.raw/*201.62*/("""" alt="">
                <h3>Direct Detection of Membrane Channels from Gels Using Water-in-Oil Droplet Bilayers</h3>
                <h5>J. Am. Chem. Soc. 2007 129(51):16042-7. Heron, A.J. et al.</h5>
                <p>We form planar lipid bilayers between an aqueous droplet and a hydrogel support immersed in a lipid-oil solution. By scanning the bilayer over the surface of an SDS-PAGE gel, we are able to directly detect membrane proteins from gels using single-channel recording. Using this technique, we are able to examine low levels of endogenous protein from cell extracts without the need for over-expression. We also use droplet bilayers to detect small molecules from hydrogels. The bilayers show enhanced stability compared to conventional planar lipid bilayers, and both bilayer size and position can be controlled during an experiment. Hydrogel scanning with droplet bilayers provides a new method for the discovery and characterization of ion channels with the potential for high-throughput screening.</p>
              </div>
            </li>

            <li class="span4">
              <div class="thumbnail">
                <img src=""""),_display_(Seq[Any](/*210.28*/routes/*210.34*/.Assets.at("images/Simul.png"))),format.raw/*210.64*/("""" alt="">
                <h3>Simultaneous measurement of ionic current and fluorescence from single protein pores.</h3>
                <h5>J. Am. Chem. Soc. 2009 131(5):1652-3. Heron, A.J. et al.</h5>
                <p>The ability to simultaneously monitor both the ionic current and fluorescence from membrane channels and pores has the potential to link structural changes with function in such proteins. We present a new method for simultaneously measuring single-channel electrical currents and fluorescence from membrane proteins by using water-in-oil droplet bilayers. We demonstrate the simultaneous fluorescence and electrical detection of stochastic blocking by cyclodextrin in multiple staphylococcal alpha-hemolysin pores. The combined fluorescence signal from individual pores exhibits the same sequence of blocking events as the total current recording, showing that the two signals from each pore are correlated.</p>
              </div>
            </li>

            <li class="span5">
              <div class="thumbnail">
                <img src=""""),_display_(Seq[Any](/*219.28*/routes/*219.34*/.Assets.at("images/Euk.png"))),format.raw/*219.62*/("""" alt="">
                <h3>In Vitro Reconstitution of Eukaryotic Ion Channels Using Droplet Interface Bilayers.</h3>
                <h5>J. Am. Chem. Soc. 2011 133(24):9370–5. Leptihn, S. et al.</h5>
                <p>The ability to routinely study eukaryotic ion channels in a synthetic lipid environment would have a major impact on our understanding of how different lipids influence ion channel function. Here, we describe a straightforward, detergent-free method for the in vitro reconstitution of eukaryotic ion channels and ionotropic receptors into droplet interface bilayers and measure their electrical activity at both the macroscopic and single-channel level. We explore the general applicability of this method by reconstitution of channels from a wide range of sources including recombinant cell lines and native tissues, as well as preparations that are difficult to study by conventional methods including erythrocytes and mitochondria.</p>
              </div>
            </li>

            <li class="span9">
              <div class="thumbnail">
                <img src=""""),_display_(Seq[Any](/*228.28*/routes/*228.34*/.Assets.at("images/Hemo.png"))),format.raw/*228.63*/("""" alt="">
                <h3>Rapid Assembly of a Multimeric Membrane Protein Pore.</h3>
                <h5>Biophys. J. 2011 101(11):2679-83. Thompson, J.R. et al.</h5>
                <p>We have observed the assembly of the staphylococcal pore-forming toxin α-hemolysin using single-molecule fluorescence imaging. Surprisingly, assembly from the monomer to the complete heptamer is extremely rapid, occurring in &lt;5 ms. No lower order oligomeric intermediates are detected. Monte Carlo simulation of our experiment shows that assembly is diffusion limited, and pore formation is dependent on the stability of intermediate species. There are close similarities between bacterial pore-forming toxins, such as staphylococcal α-hemolysin, the anthrax protective antigen, and the cholesterol-dependent cytolysins, and their eukaryotic analogs, such as the complement pore membrane attack complex and perforin domain. The assembly mechanism we have observed for α-hemolysin provides a simple model that aids our understanding of these important pore formers.</p>
              </div>
            </li> 

            <li class="span5">
              <div class="thumbnail">
                <img src=""""),_display_(Seq[Any](/*237.28*/routes/*237.34*/.Assets.at("images/Ala.png"))),format.raw/*237.62*/("""" alt="">
                <h3>Imaging Multiple Conductance States in an Alamethicin Pore.</h3>
                <h5>J. Am. Chem. Soc. 2011 133(37):14507–9. Harriss, L. et al.</h5>
                <p>Alamethicin is the archetypal antimicrobial pore-forming peptide. Although the peptide has long been known to form pores of characteristic conductances in lipid membranes, the precise nature of these pores is not known. Simultaneous calcium-flux imaging and single-channel recording in a droplet interface bilayer allowed us to directly attribute multiple conductance states to a single point diffusing in the bilayer.</p>
              </div>
            </li>

            <li class="span4">
              <div class="thumbnail">
                <img src=""""),_display_(Seq[Any](/*246.28*/routes/*246.34*/.Assets.at("images/Stretch.png"))),format.raw/*246.66*/("""" alt="">
                <h3>Optical Stretching of Giant Unilamellar Vesicles with an Integrated Dual-beam Optical Trap.</h3>
                <h5>Biomed. Opt. Exp. 2012 3(10): 2419. Solmaz, M. et al.</h5>
                <p>Giant Unilamellar Vesicles (GUV) are simple analogs of cellular membranes which are routinely used in studies of the basic mechanical properties of lipid bilayers. We have integrated a dual-beam optical stretcher into a microfluidic platform in order to study GUV mechanics. GUVs are trapped and stretched through the externally applied stress created by the two opposing NIR laser beams. Quasi-spherical GUVs are slightly reshaped as ellipsoids as soon as they are trapped with minimal power. Results indicate a linear elastic stretching behavior for pure phospholipid membranes upon trapping. GUV stretching upon laser power adjustment occurs on the millisecond timescale. We also demonstrate that through this approach we are able to straightforwardly evaluate physical parameters describing the lipid bilayer’s mechanical behavior in the low-tension regime.</p>
              </div>
            </li>

            <li class="span4">
              <div class="thumbnail">
                <img src=""""),_display_(Seq[Any](/*255.28*/routes/*255.34*/.Assets.at("images/ElectrodeDevice.jpg"))),format.raw/*255.74*/("""" alt="">
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
                <img src=""""),_display_(Seq[Any](/*270.28*/routes/*270.34*/.Assets.at("images/Hot.png"))),format.raw/*270.62*/("""" alt="">
                <h3>Incorporation of in vitro synthesized GPCR into a tethered artificial lipid membrane system</h3>
                <h5>Mol. Biosystems 2007 3:814–5 Thompson, J.R.</h5>
                <p><strong>Review of:</strong> Incorporation of In Vitro Synthesized GPCR into a Tethered Artificial Lipid Membrane System, Rudolf Robelek, Eva S. Lemker, Birgit Wiltschi, Vinzenz Kirste, Renate Naumann, Dieter Oesterhelt and Eva-Kathrin Sinner, Angew. Chem., Int. Ed., 2007, 46(4), 605–608</p>
              </div>
            </li>

            <li class="span5">
              <div class="thumbnail">
                <img src=""""),_display_(Seq[Any](/*279.28*/routes/*279.34*/.Assets.at("images/MBS.png"))),format.raw/*279.62*/("""" alt="">
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
          <p><small>&copy; James R. Thompson - 2012</small></p>
        </footer>

    </div>



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
                    DATE: Mon May 06 12:04:06 PDT 2013
                    SOURCE: /Users/James/Desktop/JamesWebsite2/app/views/cv.scala.html
                    HASH: 1496bbf149c52d4afcbf7e616260ebc25e3dc4c0
                    MATRIX: 575->1|586->5|624->7|775->112|891->182|1380->635|1395->641|1435->659|1604->792|1619->798|1659->816|1767->888|1782->894|1822->912|2026->1080|2041->1086|2083->1106|2423->1410|2438->1416|2480->1436|2597->1517|2612->1523|2656->1545|2773->1626|2788->1632|2830->1652|3304->2090|3319->2096|3368->2123|12186->10904|12202->10910|12253->10938|13395->12043|13411->12049|13462->12077|14660->13238|14676->13244|14729->13274|15836->14344|15852->14350|15903->14378|17037->15475|17053->15481|17105->15510|18340->16708|18356->16714|18407->16742|19201->17499|19217->17505|19272->17537|20536->18764|20552->18770|20615->18810|22441->20599|22457->20605|22508->20633|23188->21276|23204->21282|23255->21310
                    LINES: 22->1|22->1|22->1|27->6|30->9|42->21|42->21|42->21|45->24|45->24|45->24|46->25|46->25|46->25|48->27|48->27|48->27|52->31|52->31|52->31|53->32|53->32|53->32|54->33|54->33|54->33|68->47|68->47|68->47|213->192|213->192|213->192|222->201|222->201|222->201|231->210|231->210|231->210|240->219|240->219|240->219|249->228|249->228|249->228|258->237|258->237|258->237|267->246|267->246|267->246|276->255|276->255|276->255|291->270|291->270|291->270|300->279|300->279|300->279
                    -- GENERATED --
                */
            