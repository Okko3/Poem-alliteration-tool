import scala.collection.mutable.Buffer
import scala.collection.mutable.Map
import scala.math.*


val työstettävä = """Kanerwakankaalla sauwupi miilu
Honkien juurilla,
Wartija on sillä wakawa ukko,
Partanen harmaapää;
Hän ahkerast nuijaansa käyttelee,
Ja kumahtaa kanerwakangas.
Taas kiwen ääressä istuuwi wanha
Kauhaansa weistellen,
Hohteessa terwasen, leimuwan kannon,
Syksysen taiwaan all,
Kosk korkea Pohjola tulta lyö
Ja loistawat tuhannet tähdet.
Tähtien joukkoa katselee ukko,
Tyyneesti miettien:
Onko ne kynttilöi taiwahan häistä
Salista loistawast
Tai hurskaitten kirkkaita henkii täält,
Nyt kunnian istuimil siellä?
Mietteilee ukko ja ummistaa wiimein
Silmänsä unehen,
Kohtapa kuitenkin joutsenten liuta
Siiwillä winkuwil
Pois tienoihin etelän kiitäen,
Taas unesta herättää wanhan.
Wauhdilla wasaman jänönen juoksee
Ohitse nuotion,
Wainoo hänt walkeakuononen kettu
Wikkeläst oikaisten,
Ja huhkain kuin keijunen Tuonelast
Heit hienoilla siiwillä seuraa.
Ääni nyt kaikuwi: "Kankahan-Ranki
Kiirehdi katsomaan
Kuolemaa kuusiston sankarin wanhan!"
Nuotiolt wastataan:
"En jouda, kosk suojella täytyy mun
Täss' walkeal ystäwää wanhaa."
Hetken pääst ryske ja pauhina ankar
Tienoissa ympär käy,
Jyskyywi tanner ja oksiltans linnut
Lentäwät säikähtäin,
Ja kaatuipa kuusista korkein nyt,
Ja kuollut oil "sankari wanha."
Wartija nukkuu mutta kosk taasen
Unest hän heräyy,
Korkea, hartewa Metsolan herra
Seisowi nuotiol;
Hän selkäänsä lämmittää myhäillen
Ja pyhkeilee karheaa partaans.
Katsannol tyyneel, kaukana pelwost,
Huulilla hymywil,
Kanerwawuoteeltans katselee ukko
Kuningast ankaraa,
Mi wiimein taas wakaasti astelee
Pois linnaansa himmeään, jylhään.
Näköjä kummia ilmestyy wielä,
Kauniita neitoja,
Tapion neitoja hyppelee ympär
Leimuwan walkean,
Ja kiwensä juurelta hymyten
Heit katselee wartija wanha.
Kirkas kuin auringon paisteessa lähde
On heidän silmänsä,
Seppele päässä on warsista puolan,
Helmensä mustikoist,
Ja rentojen pyöreillä kunnahil
Kaks kaunista mansikkaa hohtaa.
Niinpä, kosk kankaalla pohjonen soittaa,
Tähtien loistaes
Hyppelee Tapion impien joukko
Nuotion ympäril,
Ja katoo kuin sumut ja auereet,
Kuin myrskyssä sääksien parwi.
Sammuwat tähdet ja aurinko nousee
Idästä kiirien,
Metsäsilt wuorilta kaikuwi kauwas
Kuherrus terrien,
Ja oksilla pisarat kastehen
Nyt kirkkaina helminä kiiltää.
Paimenet ukkoa katsomaan käywät
Pilliä soitellen,
Käy hänen luoksensa ampuja metsäst
Torwea soitellen,
Ja sillonpa piippunsa pilweilee,
Niin ukon kuin ampujan uljaan.
Sillonpa hymyten kertoilee ukko
Ihmei ja tarinoi
Metsolan tummista, kaikuwist linnoist,
Luolista Wuorelan;
Sä kuultelet kanerwawuoteella,
Ja hongiston kantele kaikuu.
Niinpä hän, kylästä kaukana, wiettää
Aikansa, harmaapää:
Millon hän istuu ja kauhaansa weistää
Leimuwal nuotiol,
Ja millon taas nuijiilee miiluans,
Ja kumahtaa kanerwakangas.
Nyt kanssani keinuhun käy,
Mun impeni, walkeal liinal;
Kun morsian kauniina seisoowi luonto
Iltana helluntain.
Heilahda korkeelle, keinu,
Ja liehukoon impeni liina
Illalla lempeäl.
On allamme wiherjä maa
Ja päällämme sininen taiwas,
Ja läntinen lehtistä laaksoa soittaa
Lintujen laulaes.
Heilahda korkeelle, keinu,
Ja liehukoon impeni liina
Illalla lempeäl.
Kun wäikyn mä ylhäällä tääl,
Tääl tuulien wiileäs helmas,
Niin kaukana näen mä kaunoisen kunnaan
Paisteessa iltasen.
Heilahda korkeelle, keinu,
Ja liehukoon impeni liina
Illalla lempeäl.
Kuin Onnelan kaukainen maa
Niin kimmeltää ihana kunnas;
Ja sinnepä lentäisin impeni kanssa
Siiwillä läntisen.
Heilahda korkeelle, keinu,
Ja liehukoon impeni liina
Illalla lempeäl.
Siel lehtinen kauhtana ain
On hartioil unisen koiwun,
Ja ainiaan lempeillä kunnailla läikkyy
Helluntain wainiot.
Heilahda korkeelle, keinu,
Ja liehukoon impeni liina
Illalla lempeäl.
Siel laaksossa wainion all
On kewäinen, wiherjä niittu,
Mi ainiaan herttaises hämäräs siintää
Kukkasil keltaisill.
Heilahda korkeelle, keinu,
Ja liehukoon impeni liina
Illalla lempeäl.
Siel suutelee ehto ja koi
Ja siel ijankaikkinen aika
Pois kiitäwi wauhdilla kiitäwän wirran
Himmeään Unholaan.
Seisahda, heiluwa keinu,
Jo kelmenee impeni poski
Illalla lempeäl.
Sumunen ilma wuorilla wäikkyy
Raskaasti pilwet käy,
Hengittää kostee, suojanen tuuli
Himmeäs männistös,
Toki riemu lemmekäs
Himmeydes hymyilee
Kuin hääjuhla synkeäs yössä:
Tullut on joulu-ilta.
Huoneesta loistaa walkeus hauska
Wastahan kulkijan,
Hedelmii wuoden ahkerast työstä
Tornina seisoowi
Pöytäwaatteel walkeal
Wierahille tarjona
Ja laattial kiiltäwät oljet
Leimues iltapystyn.
Pöydässä istuu asujat kaikki
Huoneessa loistawas,
Kellenkään määrää eteen ei panna
Lahjoista taiwahan;
Kaikki yhtä ansainneet,
Kaikki tässä wierahat;
Ja koska he pöydästä käywät
Pauhaawat jouluwirret.
Weisaawi nuori, weisaawi wanha,
Kuultelee hartaast laps;
Sionin juhlasta weisunsa kaikuu,
Ihmeestä suurimmast,
Sankarista seimessä
Bethlehemin kaupungis,
Ja silmissä kyynele loistaa
Kuultelewalla lapsel.
Heikenee wihdoin walkean loiste,
Wirsi myös waikenee,
Äänettä kauwan istuwat kaikki
Wakaasti miettien
Tulisian hohtaes,
Punahiilen himmetes;
Ja lepohon käywät he wiimein
Wuoteelle olkiselle.
Korkea juhla, ihana ilta
Oljilla kultasilla,
Walossa walkeen, ilosen liekin
Sumusen yösen kohdus!
Ken sua taitaa unohtaa?
Ken sun wirttes kaikunaa?
Ken lapsukaist äitinsä helmas
Wajassa Bethlehemin?
Metsään keltakiharainen impi
Asteleewi kanerwaisel maall;
Kohden taiwast otsa puhdas wälkkyy,
Katsannossa onpi tyyneys.
Haastelee hän yksin käydessänsä:
Wallitsija kirkkaan korkuuden.
Suo mun aina silmäl, puhtaal, wakaal
Puolees taitawani katsahtaa.
Opeta mua eloo rakkauden,
Walkeutes pyhä wirtakoon
Poweheni, ja mä, pelkäämättä
Pimeyden waltaa, tieni käyn.
Ja kun wiimein päätetty om matka,
Astun kunniasi kaupunkiin,
Jonka muurit kullast, krysoliiteist
Hohtaa kesäsillä kunnahil.
Mutta päiwän heljä silmä sammnu,
Luonto pimeydes hengittää;
Polultansa kaunis neito eksyy,
Öises salossa hän harhailee.
Pilwet taiwaal kiitää, leimahtelee,
Jyrisee, ja itkee raskahaast;
Mitä eläwätä maassa, ilmas,
Rientää kätköin luolain, pesien.
Mutta mihen pakeneewi neito,
Missä myrskyssä hän suojan saa?
Eteenpäin hän yhä käyskeleewi
Kuusistossa ruohottomal maall.
Toki wakaana hän asteleewi
Jalolla ja tyyneel katsannol;
Hameliepeens tuulen siiwil liehuu,
Keltakiharansa sinkoilee.
Hänen ympärilläns synkees laaksos
Tuli sinertäwä wälähtää,
Sillon kimmeltäwän impihaamun
Näet kirkkaudes seisowan.
Harhaileewi neito sinnen tännen,
Salost jylhästä ei loppuu tul,
Öinen laakso murheellisest huokaa,
Kuni uhkais päiwä tuomion
Kohtaa häntä wiimein wuori jyrkkä,
Mustat luolat wastaan tuijottaa
Niinkuin tahtoisiwat hänen niellä
Ahneest ammottawiin kitoihins.
Kun nyt seisoo impi mietiskellen,
Mihen kääntäisi hän retkensä,
Mikä ääni wuoren luolist kaikuu
Hirmuinen kuin murhan riehues?
Mitä kauheutta silmäns näkee
Tulen leimahtaes ukkosen?
Hirwei peikkoja ja kyöpeliä
Uumennoista rynkää kiljunal.
Ympär impeä he pyörötanssis
Häijyst irwistellen hyppelee,
Kiukun katsantoja wiskeleewät
Öisen waeltajan puolehen.
Mielel kamowalla, kaswoil kelmeil
Impi seisoo heidän keskelläns,
Toki korkeuteen teroitetut
Lakkaamatta sinisilmät on.
Mutta korkuus jyrisee ja pauhaa,
Wäsymättä myrsky riehuu ain,
Öinen laakso murheellisest huokaa,
Kuni uhkais päiwä tuomion.
Kirkuna nyt peloittawa kaikuu
Karkelewain peikkoin joukosta,
Neito horjuu heidän keskellänsä,
Toki ylhääl wiipyy katsantons.
Mutta myrsky äkist waikeneewi,
Waikeneewi ukon jyrinä,
Metsä kuultelee ja pilwet seisoo.
Mitä luonnossa nyt warrotaan?
Katso mikä kirkkaus ja loiste,
Koska pimee taiwas aukenee,
Katso kuinka peikot kiljunalla
Kiirehtiwät taasen luolihins.
Alla wuoren waeltaja seisoo,
Walkeudes muotons kimmeltää,
Ihastuksella hän katsahtelee
Ylös säteilewään aukioon
Siellä kaswot kauniit, ihmeelliset,
Juhlalliset neito nähdä saa;
Kaksi silmää ihaninta loistaa
Kohden nuorta naista wuoren all.
Kiharat kuin loimottawat liekit
Hänen ohauksil liekkuwat,
Ja hän hymyy niinkuin ylkä hymyy,
Lempi hohtaa hänen huuliltans.
Mutta paistehessa kaukaisimmas
Impi näkee wielä kauniin maan,
Niitut wihannot ja tummat wuoret,
Wuoril purpuraiset hattarat.
Toki wilaukses peittyy taasen
Pilwiin korkeuden aukio,
Mutta peittyessä lempeet silmät
Katsahtelit wielä impeä.
Silloin autuaana impi rientää
Kotihins kuin tuulen liehaus,
Kuni jalkansa ei maata polkis,
Siiwil halki metsäin lentää hän.
Nyt hän kotons pimeydes löytää,
Niinkuin henki häntä johdattais,
Päiwän koittees wuoteellensa waipuu,
Äitin murhe iloks käynyt on.
Mutta pian impi heräyypi,
Kuume hänen poskil liekehtii,
Helläst äitiäns hän syleileewi,
Taiwaan tulta iskee katsantons.
"Oi, mun armas äitin!" niin hän lausuu;
Mutta houraileeko neitonen?
"Armas äiti, hame ompel mulle,
Walkase se lumiwalkeaks."
"Mailmaan, joka korkeudest loisti
Läpi kultakirkkaan akkunan
Tuolla pilwitunturien keskel,
Waeltaa nyt tyttäresi pois."
"Ruhtinaan, sen waltakunnan herran,
Näin mä walkeudes wäikkywän;
Kiharansa kuni liekit leimuit,
Armaasti hän mua katsahti."
"Katsahti kuin onnenpäiwän aamu,
Koska kuuluu tuulen hyminäs:
Autuutes sua wartoo, riennä, riennä,
Pue päälles puhdas kauhtana."
"Pääsi woitele, se kohta kantaa
Ihanaisen kunjan seppelin;
Riennä kotokartanosi juhlaan,
Sali lehditetty wartoo sua."
"Niinkuin aamu tämä katsahti hän,
Kaunis sulhaiseni, puoleeni
Hän mun sulhaiseni, ylkämiehein?
Mikä onnen autuus ääretön!
"Aatokseni ihanasti pyörtyy
Harhaellen hänen powessans,
Manttelinsa pyhäs hämärässä
Sieluin eksyileewi hymysuin."
"Että synnyin tänne! Miksi synnyin
Tätä herrautta perimään?
Enpä tiedä, hekumassa hourin,
Huohottelen, neito wienoinen.
"Mutta ylistetty ollos, päiwä,
Koska elon kalleuden sain.
Soma päiwä, kaunis kultapaiste,
Terweiseni sulle lähetän."
"Niinpä ylistelen armast päiwää,
Joka aukas tieni Kaunolaan;
Sinnen morsiamena mä riennän,
Riennän, riennän poskil hehkuwil."
"Äiti, ompel mulle hame uusi
Sulamithin puwun kaltainen,
Walkase se lumiwalkeaksi
Pellon kukkaskedol ihanal."
Niinpä neito lausui, mutta äiti
Päänsä murheellisna kallisti;
Ei hän Tuonelle sois tytärtänsä,
Eipä kaunist kulta-omenaans.
Mutta ahkerasti askaroitsi
Neito kuolon tuskallises työs:
Elon lippu, Kalman kelmee wiiri
Liehuit wuoroin hänen kaswoillans.
Meni päiwä kuumas taistelossa,
Meni kesän päiwää kaksi, kolme
Muttta wuoteeltansa impi nousi
Laskiessa päiwän kolmannen.
Wuoteeltansa jalo neito nousi,
Otsa wälkähteli kirkkahast;
Kiharans hän kiireest palmikoitsi,
Päällens pukei hameen walkean.
Illan ruskopilwii kuwaileewat
Hänen liekehtiwät poskensa,
Hänen puheens on kuin tulen liekki
Koska äitillens hän haastelee:
"Äiti, kukkaisia saata mulle,
Sinearist toiwon kukkaisii;
Hohtakoon mun powellani ruusu,
Koska astun saliin kunnian."
Sinearin niitult wiherjältä
Hellä äiti kukkaisia tuo,
Joilla koristaawi powens kummun
Komeest katsahtawa neitonen.
Puettuna, juhlallisna seisoo
Impi kaunis, sinisilmänen,
Waipuu unisena äitins helmaan,
Nukkuu kantajansa powelle.
Mutta ulkona käy raitis myrsky,
Pauhaa mänty satawuotinen,
Työstä kotihinsa miehet käywät,
Kotihinsa karjat laitumelt.
Ahol tuulisella hyppeleewi
Karitsainen emons ympäril.
Mutta nukkunut on äitin helmaan
Kaunis tyttärensä ainiaaks.
Läksin markkinoille Anjanpellon
Syyskuun päiwäl armahal;
Ihanasti waalea ja tyyni
Taiwas päälläin kaarteli,
Kellastunut, äänetön kuin hauta
Oli Tapiolan kaupunki.
Milloin seisoin mäel korkealla
Kaukarantaan katsahtain,
Milloin laaksois hymywissä kuljin,
Huuheliwat paimenet;
Niinpä waelsin mä Anjanpeltoon
Hämeenmaitten kultasilla teil.
Seisoin wiimein markkinoitten pauhus:
Harput soi ja kanteleet.
Poika ruskea Germaniasta
Leiskui harpun helinäl,
Waimo wakaa Pohjanlahden ranteilt
Soitti kanteletta lempeää.
Soitto hymisi ja rattaat ryskyi,
Orhit hirnuit komeast;
Silloin näin mä ihanaisen immen
Nuoren Hämeen-tyttären;
Mailman hyörinää hän katsahteli
Otsal wakaal, suulla hymywäl.
Näinkö koskaan impeä niin kaunist?
Oi! en elon saarel tääl
Kuni aamun walo koillisessa
Hänen poskillans oil kelmeys;
Hänen purpuraisil huulillansa,
Mikä autuaitten hekuma!
Häntä katsahdellen matkanpäästä
Uneksuen seison mä,
Autuaksi tuntuu tämä hetki,
Tuskalliseks tuntuu se;
Powi polttaa, aatos harhaileewi,
Hämäryys ja walo waihtelee.
Mutta katos neito näöstäni,
Kansan joukkoon peittyi hän,
Enkä löydä enään haamuansa
Anjanpellol ihanal,
En tän mailman turul lakealla
Silmiensä tähtiparii nää.
Soitto pauhasi ja orhit hirnuit
Anjanpellon markkinoil;
Sinne tänne käyskelin mä kauwan
Ihmeellisis aatoksis,
Katsahtelin löytääkseni neitoo,
Mutta turhaan kiehtoi silmäni.
Kotiin matkustin mä wiimein taasen:
Millon seisoin kunnahil,
Millon laaksois hymywissä kuljin,
Huuheliwat paimenet.
Niinpä waelsin mä Anianpellolt
Hämeenmaitten kultasilla teil.
Ihanasti korwissani aina
Nimi Anjanpelto soi;
Sydämmeni riutumaan sä saatat,
Anianpelto kaukana;
Siellä näin mä taiwaan kauniin immen,
Mutta katosi hän ainiaaks.
Miesjoukko urhea metsähän hiihtää
Pyssyil ja kirkkail keihäil,
Kahleissa seuraawat reijuwat koirat
Silmillä leimuwilla,
Kosk aamun koi
Otsalt taiwahan
Pois wiskasee synkeän yön,
Ja aurinko kiireensä nostaa.
Pohjoseen kulkewi ampujain retki
Humisten hankikanteel
Härmäset hiukset hartioil liehuu
Wauhdissa winkuwassa,
Ja harjanteilt
Tuuli tuima käy
Ja laaksoja siiwilläns lyö,
Ja Metsola luminen pauhaa.
Kontion kaupungis seisowat wiimein
Tunturil korkealla,
Sieltä, jos katsahdat puolehen päiwän,
Allasi wäikkyy mailma,
Ja säteetön
Pyörä auringon
Käy reunalla taiwaan ja maan;
Ja sinertää kaukaset metsät.
Kahleista päästetään reijuwat koirat
Halunsa waltakuntaan,
Mykkinä ampujat hiihtäen kulkee
Mielikin jylhäs linnas,
Ja kontion
Korwat pystyyn käy,
Ja hyyrteinen kuusisto soi
Jo haukkunast Killin ja Leijun.
Saloen kuningas, sammalet otsal,
Karkaawi konnostansa,
Tulta ja luotia laukee hänt wastaan,
Ei toki juoksuns seiso,
Mut hankehen
Tahrot purpuran
Hän jättääwi ryskywäl tiel,
Pois kiitäen kuusien suojaan.
Koirat hänt wainoowi, kauwas hän kiitää
Ankaran kaaren tehden,
Wastahan rientäwät hiihtäwät miehet
Lakeal tanterella;
Ja, huohottain
Lennos kiiwahas,
Ja korkeal kantaen pääns,
Hän lähestyy, werinen sankar.
Mutta nyt ampujan tulinen luoti
Sankarin maahan kaataa,
Nousee hän wieläkin, karkaen päisin
Kiljunal kauhealla;
Nyt isketään,
Lumi tuiskahtaa
Kun kontio, koirat ja mies
Lyö painia tunturin harjal.
Wiimein tok' hämmentää taistelon tuiman
Kumppanien kirkaskeihäs,
Kontio rinnassaan liehtowas kuumas
Tuntewi raudan kylmän
Ja kallistuu
Kinoswuoteellens,
Ja tummaksi katsanto käy,
Mi tulta ja liekkiä iski.
Kaatuneen ympäril seisowat miehet
Riemuten tunturilla;
Sieltä kun katsahdat puolehen päiwän,
Allasi wäikkyy mailma
Ja säteetön
Pyörä auringon
Käy reunalla taiwaan ja maan;
Ja haamottaa kaukaset metsät.
Saalinens kotia rientäwät wiimein
Talwisen yösen loistees,
Kosk rewontulien seppeli säihky
Taiwahan otsal pohjas
Ja kelmee kuu
Hymyellen ain
Tuol korkeal aholla käy
Ja paimentaa tähtien laumaa.
Wuorella kaikuuwi riemu ja soitto
Helluntain kelmees yössä,
Ilosest karkelee nuorison liuta
Laattial kallioisel
Helluntai-yön helawalkean leimues
Ja hohtaes korkuuden kiireen.
Mailmojen äärihin kantaawi silmä
Öiseltä kunnahalta,
Kaukaiset kylät ja kylien pellot
Wuorelta korkeelt nähdään,
Helluntai-yön helawalkean leimues
Ja hohtaes korkuuden kiireen.
Kuwataan "seitsemän kirkkojen" tornit
Waalean taiwaan rannalt
Ilosen nuorison kirkkaisin silmiin
Tulisel kalliolla
Helluntai-yön helawalkean leimues
Ja hohtaes korkuuden kiireen.
Äänetön, hopeakiiltäwä wirta
Laaksossa kärmeileewi.
Pinnalla lentelee kirkuwat sorsat
Öisessä lemmen-leikis
Helluntai-yön helawalkean leimues
Ja hohtaes korkuuden kiireen.
Öillisten liekkien lumowas loistees
Nähdessään neidon kaswot
Nyt moni poikainen polttawast tuntee
Lempensä ensimmäisen
Helluntai-yön helawalkean leimues
Ja hohtaes korkuuden kiireen.
Nyt moni neitonen, kylmänä ennen,
Riutuen katsahtaawi
Puolehen poikaisen waisuna yönä
Tunteilla, armahilla,
Helluntai-yön helawalkean leimues
Ja hohtaes korkuuden kiireen.
Wiidassa kuiskaawat kultasten kieltä
Impi ja nuorukainen,
Wannotaan ijäistä uskollisuutta
Koiwiston tummas kohdus,
Helluntai-yön helawalkean leimues
Ja hohtaes korkuuden kiireen.
Toiset he karkelos kalliol wäikkyy
Kimmeän wiulun soides;
Helisee wiulu ja tienohin ympär
Ihana kaiku wirtaa.
Helluntai-yön helawalkean leimues
Ja hohtaes korkuuden kiireen.
Mistä on ruskeatukkanen neito
Rinnoilla pyöreillä,
Hän joka karkelee sylissä poijan,
Hartewan nuorukaisen,
Helluntai-yön helawalkean leimues
Ja hohtaes korkuuden kiireen?
Neito on kylästä wieraasta tullut
Tuulisen järwen saarest.
Kas kuinka poskilla purpura hehkuu
Karkelos kalliolla,
Helluntai-yön helawalkean leimues
Ja hohtaes korkuuden kiireen.
Mistä on neitonen hoikka ja kaino
Silmillä sinisillä,
Hän, joka karkelee sylissä poijan,
Ilosen nuorukaisen,
Helluntai-yön helawalkean leimues
Ja hohtaes korkuuden kiireen?
Kotonsa pohjosel rinteel on tuolla
Himmeän koiwun warjos.
Kas kuinka kiharans karkelos liehuu,
Karkelos kalliolla,
Helluntai-yön helawalkean leimues
Ja hohtaes korkuuden kiireen.
Mutta nyt heikenee riemu ja soitto,
Waalenee immen kaswot.
Niinkuin jo päiwä tuol itäisel reunal
Kuusien tutkaimilla,
Helluntai-yön helawalkean leimues
Ja hohtaes korkuuden kiireen.
Leikistä lähtewi nuorison liuta
Kultasta tietä käymään.
Seisoo jo sillalla tuomien tuoksus
Kiiltäwän wirran partaal,
Helluntai-yön helawalkean sammues
Tuol wuorella äänettömällä.
Mökki matala on kankahalla
Kenen kurjan asuinmaja tää?
Waimo köyhä, raukenewa sairas
Asuu siellä poikans pienen kans.
Kinostornit mökin ympär seisoo,
Rakentamat winkan pohjosen,
Taiwas kirkkahana kaarteleikse,
Seinis paukkuu tammi-pakkanen.
Äyriä ei äitin arkus löydy,
Huoneen kaarnaleipä kaikki on,
Nälkäsenä tulisial istuu
Äänetönnä pieni poikainen.
Äitin silmä, häntä katsellessa
Wiruileewi säälin kyyneleis,
Mutta wiimein olkiwuoteeltansa
Äänel waisulla hän haastelee:
"Oma poikaiseni, armahani,
Sydämmeni kultakäpynen,
Täytyypä mun lähettää sua käymään,
Mieron kurjaa tietä astumaan."
"Tule tänne, puenpa sun päälles,
Ettes talwen kylmäs palele;
Ota olkahasi paimenlaukku,
Siihen panuos antipalaset."
Äiti huohottaen wuoteen reunal
Poikaans warustelee matkahan,
Ottaa kerran wielä sylihinsä
Sydämmensä kultakäpysen.
"Ole oma, uljas poikaiseni,
Koska mieron kenkii polkeilet,
Toiwo päiwii parempia wielä,
Onnen päiwii majassamme tääl."
"Meil on kohta kesä lämmin, kaunis:
Wiita soi ja linnut laulelee,
Koska mansikkoja poimeilemme
Ahol paistehessa auringon."
"Ole oma kiltti poikaiseni,
Madollenkaan pahaa elä tee,
Astu siiwost kylissä ja teillä,
Muista aina taiwaan Jumalaa."
Niinpä waimo huohottaen lausuu
Poikaans kyyneleillä walellen;
Lähtee poika tielle talwiselle
Emäntien armoo anomaan.
Kauwan äiti häntä katseleewi
Äärelt mökin pienen akkunan;
Kyynelwirta hänen helmaans wuotaa,
Powi painuu, sydän musertuu.
Katoo wiimein hänen silmistänsä
Metsän korpeen pieni matkamies,
Äiti wuoteellensa kallistuuwi
Taiwaan korkeuteen rukoillen.
Eteläisen kelmeällä reunal
Päiwän lamppu seisoo hymyten,
Himmentyy, ja sammuu lounaisessa,
Kuumottawat kruunut honkien.
Yö on tullut, myrsky wuorilt kiljuu,
Kaikkial on pauhu, pimeys,
Pinta maan ja otsa kylmän taiwaan
Peittyy lumituiskun kierroksiin.
Mikä ääni hirweä nyt kaikuu
Kankahalla majan ympäril?
Petoin ulwominen herättääwi
Kurjan waimon waisust unestans.
Niinkuin kirouksen kaupungista
Wimmattujen sieluin kirkuna,
Niinpä kaikuu susilauman ääni,
Parku, meteli ja ähellys.
Tämän kuulee kauhistuksel waimo
Toki liikkumatta wuoteeltans;
Hikihelmet kylmät otsalt kiirii
Kun hän hiljaisuudes rukoilee:
"Pelasta mua täältä, korkee taiwas,
Pelasta myös pieni poikaisein!
Täällä aina ahdistus ja tuska
Siellä rauha ijankaikkinen."
Niin hän hiljaisuudes rukoileewi
Myrskyn riehuessa kankahal,
Willin petojoukon ulwoessa;
Rukouksens kuultiin korkuudes.
Tähtikirkas puol-yön taiwas kiiltää
Myrsky raueten jo hengittää,
Äänetön, kuin lähde lehtilaaksos,
Sinisyydes loistaa kelmee kuu.
Waaleana olkiwuoteellansa
Waimo kuolon unta uneksuu
Kädet ristis rinnoillansa kylmil;
Rukoukseen on hän nukkunut.
Waaleana lumiwuoteellansa
Talwimetsäs poika uneksuu
Kädet ristis wasten kylmää rintaa;
Rukoukseen on hän nukkunut.
Kinoksella pieni poika istuu,
Lumi kiireellänsä kimmeltää,
Kainalossa onpi paimenlaukku,
Laukus kaarnaleiwän palanen.
Tammipakkanenpa seisautti
Wienon sydämmensä sykkinän,
Mut nyt ollos huoletonna aina
Kylmän, nälän tuskist, poikainen.
Tähtikirkas puol-yön taiwas kiiltää,
Hurja myrsky lepoon käynyt on.
Äänetön, kuin lähde lehtilaaksos,
Sinisyydes loistaa kelmee kuu.
Kaksi tähtee, armahammat muita,
Säteilee tuol taiwaan kannen all.
Miks niin ihmeellisen ihanasti
Murheen laaksoon katsahtawat he?
Runotarpa kertoa nyt tietää:
"Siellä kirkkaudes kunnian,
Onpi äiti poikans pienen kanssa;
Alas katsowat he hymyten."
Mikä autuus tyynees katsannossa,
Sointo, rauha ijankaikkinen!
Heidän menneet päiwäns kankahalla
Unelmana johtuu mielehens.
Temppeliin astuwi nuorukaisjoukko,
Astuwi impiä walkeissa waatteis
Kellojen kaikunas
Ja urkujen huokaawas soitos;
Ja läntinen myrsky käy.
Kuwa on korkea alttarin seinäs:
Pilwissä wäikkyy siel Ihmisen Poika
Sankarin katsannol,
Mut ihanast hymywät huulens
Ja otsansa kimmeltää.
Näät siellä Saaronin wiherjät niitut
Siintäwän kaukana; korkeat palmut
Kidronin rannalla
Ja Hermonin himmeät wuoret
Näät hohtawan taiwaan all.
Mutta nyt waikenee juhlainen soitto,
Alttarin ääressä seisowat wieraat;
Saarnaaja lausuwi
Getsemanen synkeäst yöstä
Ja Sionin kaupungist.
"Kilwellä uskon ja miekalla hengen
Taistele aina ja lohdutust etsi
Taiwahan atriast,
Ja kunnian kultasen kruunun
Saat Sionin kaupungis."
Alkawi taasen laulu ja soitto,
Ales hän kumartuu neitonen kaino
Alttarin juurehen,
Ja rintansa nousee ja waipuu
Ja poskensa liekehtii.
Humisee, kaikuuwi temppelin kumos
Kaikuu kuin kultasten koskien pauhu
Seinissä wuorien
Ja kirkkaana Ihmisen Poijan
Näät pilwien korkuudes.
Atria päättyy ja temppelist astuu
Nuorison joukko, ja läntisen myrskys
Huohottain impi käy;
Sireenien aaltowa metsä
Sen poskille liehtoilee.
Raikas tuuli Pohjolasta
Käy ja metsä humisee,
Korwen rannas raiskiossa
Niittuu raiwaa uljas mies.
Risut tieltä sinkahtelee,
Wesat maasta temmataan,
Juuret räikyy, kannot nousee,
Kaikki siirtyy röykkiöön.
Katseleewi lakeutta
Jäljissänsä nuori mies,
Toiwo hänen kaswoilt loistaa,
Toiwo niitost tulewast.
Niin hän seisoo ilon katseel:
Metso korwes kotkottaa,
Tuliluikkuns kuusen juurelt
Ottaa mies ja korpeen käy.
Hetken päästä metsän kohdust
Kaikuu tuima paukaus,
Korwest astuu ampuniekka
Koirasmetso saaliina.
Taasen työhönsä hän käypi,
Kirwes wilkuu raiwoes,
Kirwes wilkuu, metsä mäikyy,
Uusi niittu laajenee.
Pohjolasta tuuli pauhaa,
Kesän taiwas kirkas on,
Heljä aurinkoinen ehtii
Puolipäiwän korkuuteen.
Sillon kuuluu soma laulu
Kanerwaiselt kankahalt
Kenen onpi lempee ääni?
Kuka nummel helottaa?
Miehen oma nuori waimo,
Awionsa armahin,
Nainen keltakiharainen
Kultanummel laulelee.
Miksi käypi nainen tännen,
Korwen rantaan raiskioon?
Ewästä hän miehellensä
Huiwis walkeassa tuo.
Rakentaa hän päiwällisen
Ystäwällens nurmelle;
Mätäs onpi miehen pöytä;
Mieluisa on atrians.
Istuu nainen miehens wieres
Imehtien saalista,
Metsän poikaa, jonka luoti
Kaatoi kuusest korkeast.
Mutta mies hän kertoileewi,
Kuinka ennen lapsena
Tässä karjas käydessänsä
Taloa hän rakensi.
Missä seisoi asuinhuone,
Missä talli, ometto,
Kuinka naapurien kanssa
Raja-aidoist riideltiin.
Kuinka kurja emäntäinen
Isännältä löylyy sai,
Kosk ei miesten työstä tulles
Walmis ollut atria.
Tätä kuulteleewi nainen
Ilonaurun helinäl;
Ruusut hänen poskil hohtaa,
Katsantonsa liekehtii.
Mutta koska atriansa
Päättänyt on uljas mies,
Emäntänsä pöydän korjaa,
Tähteet huiwiin walkeaan.
Lähtee taasen nuori nainen
Kotihinsa kulkemaan;
Huuheleewi kankahalla,
Kultanummel laulelee.
Mutta mies hän työhöns käypi:
Wesat maasta temmataan,
Juuret räikyy, kannot nousee,
Kaikki siirtyy röykkiöön
Niin hän toiwon katsannolla
Työksentelee ahkerast
Korwen rannas raiskiossa;
Hiki otsalt helmeilee.
Tuuli pohjan tuntureilta
Taistelosta lepoon käy,
Heljä aurinkoinen seisoo
Lännen kultakynnyksel.
Miesi työnsä wihdoin päättää,
Kirweens iskee kantohon,
Katseleewi lakeutta,
Wiheltelee weisuans.
Wiheltelee weisuansa,
Uutta niittuu katsellen
Korwen rannas himmeässä,
Kesäpäiwän nukkues.
Kuuluu sillon juhlallinen
Kirkonkellon helähdys,
Lakkiansa nostaa miesi,
Kotihinsa astelee.
Tuliluikku kainalossans,
Metsän saalis laukussans,
Olallansa tuima kirwes
Niin hän kotihinsa käy.
Häntä wartoo kotonansa
Waimo nuori toimeljas,
Rakennellen ehtoollista
Päähän pöydän honkasen.
Wartoo häntä aatto-illan
Lehditetty laattia,
Lepopäiwä rauhallinen
Naisen armaan huomassa
Onnen myyri on se miesi,
Kellä oma tanner on,
Ystäwäinen wieressänsä,
Powel kalliin synnyinmaan.
"Kaunis impi kysymyksein kuule,
Sydämmeni pyhä salaisuus.
Sano, taitaisiko lemmen liekki
Leimua mua kohtaan powestas?
Niinpä kysyn sulta, impi kaunis,
Jonka kuwa aatoksissain käy
Täyttäen mun uneksuwan sieluin
Tunteil ihmeellisil, polttawil.
Huomenna, kun kesä-aamu koittaa,
Yrttitarhassa sun taasen nään;
Solme kaulaliinas ruususolmuun
Jos mua lemmit, neito armahin.
Huomenna, kun silmäni sua kiehtoo,
Leikitse sen soman ruusun kans,
Sormillasi powes kunnahilla,
Ja se mulle taiwaan leikki on.
Mutta ellen näe leikkii tätä,
Ellen ruusun leukas lumen all,
Sillon toiwon päiwä multa peittyy
Ijankaikkisesti pilwihin."
Kirjoitti näin kirjeen neitoselle
Nuorukainen päiwän sammues;
Tuli yö, mut Unonen hän wiipyi,
Wiipyi kauwan hänen wuoteeltans.
Mikä tuska ihana ja wimma,
Mikä ihmeellinen kesä-yö!
Mitä aattelee nyt kaino neito?
Ruusun, näkeekö sen nuorukain?
Leimaukset hänen sielus käywät,
Mustat pilwet kiiriskelee siel,
Taasen pilwist paistaa walo toiwon
Niinkuin jumalien kaupungist.
Mutta näkyy wiimein aamun hohde
Etääl lännes wuorten harjanteil,
Nuorukainen kohta kammiostans
Yrttitarhaan ihanaiseen käy.
Puhaltelee hieno aamutuuli,
Haju tuoksuu kedol wiherjäl,
Koska ruusut, kainot sinikellot
Kumartelee alla siipein Koin.
Yksin käyskelee hän puiston werhos
Niinkuin, tuomioonsa wartoes,
Kuolleen warjo ijäisyyden rannal,
Tietämättä missä kodon saa.
Määrätäänkö hälle synkee Hades
Tahi ihana Elysium?
Siitä lewotonna wäikkyilee hän,
Niinpä yrttitarhas nuorukain.
Wihdoin toki ääniä hän kuulee,
Joukon naisia hän nähdä saa,
Heidän seurassansa impi kaunis
Lewottomil askeleilla käy.
Wallattomast nuorukaisen sydän
Sykkii, silmänsä hän teroittaa
Kohden powee lähestywän immen,
Näkyisiko onnen merkki siel.
Näky armahin! Siel ruusu kaunis
Huohottawil rinnoil punertaa:
Niinkuin haamu nuorukainen seisoo,
Kuulee kaukaa meren pauhun waan.
Hälle Saaronis ei kukkaist löydy
Ihanata niin kuin ruusu tuol,
Joka neidon kaulas myhäileewi,
Kuni wiitta maahan autuuden.
Salasilmäyksen impi heittää
Kohden nuorukaista, matkan pääs,
Sormens suutelewat liinan solmuu,
Tuli hänen poskillensa käy.
Yrttitarhas naisten joukko kulkee,
Äänetönnä impi astelee,
Ja kun haastelee hän, toisialla
Toki kuleksiwat aatoksens.
Senpä näyttää hänen huultens hymy
Suloinen, täys lemmen hekumaa;
Niinpä hymyileewi sielu taiwaas,
Pyhää kirkkautta hengittäin.
Kummul wiherjällä joukko seisoo
Alat riemusasti haastellen,
Mutta äänetönnä impi seisoo
Poskilt kiharians wiskellen.
Katsahtaa hän säteilewil silmil
Awaruuteen sinikorkuuden,
Otsa loistaa niinkuin pilwen kiire
Tämän kauniin aamun paistehes,
Mutta nyt, kuin koska tuulen kierros
Koiwun kruunust sateen rawistaa,
Impi ihanassa itkus hyrskyy,
Tannert kyyneleillä kastellen.
Kyselewät armaat kumppaninsa
Miksi neito nuori itkuun käy,
Mutta hymyten taas seisoo neito,
Poskilt kiharians wiskellen.
Mikä kuwa, tämä, yrttitarhas,
Jota katsahteli nuorukain!
Siirtyisikö hänen muistost hetki
Koska impi itki kunnahal?
Mutta poistui wiimein naisten joukko,
Niinmyös impi heidän seurassans,
Toki leikittelit kerran wielä
Wienot sormet ruususolmulla.
Silmäns heitti hän wiel nuorukaiseen,
Poskil leimui kaino punerrus.
Kaksi aamutähtee sillon peittyi
Metsän reunaan pilwis ruusujen.
Mutta harhaellen puiston yössä
Nuorukainen kauwan käyskeli;
Kalliolla korkeel wiimein seisoi,
Meri aawa alla aaltoili.
Wihaisina laineet myrskys riehuit,
Temmeltelit tuulen kierrokset.
Kierrokset te armahimman tuulen!
Kaunis myrsky onnen päiwänä!
"Korkee kuusi kunnahalla tuolla
Uros wakaa wuosisatojen,
Ollos kuwa elämäni aina!
Kuni sä ma seistä tahdon tääll,
Koska myrskyt käywät elon saarel
Keskel ijäisyyden aawaa merta.
Niinkuin nyt tuo tähti kiireelläsi
Kiiltää, sankar tyyni, partanen,
Niinpä alat katseestani käyköön
Puhdas, säteilewä kirkkaus,
Koska tuhon, kiusauksen henget
Sydäntäni piirittämään käywät."
Niiu on aatos miehen, jonka huone
Komee seisoo harmaal kalliol
Ja hän itse portaal, katsahdellen
Kunnahille, kuusten kranssaamat,
Hengittäes lempeen kesä-illan,
Taiwaan tähtijoukon loistaessa.
Lepoon käy hän, makeasti nukkuu,
Wuoteens wapaa synkeist muistoist on.
Unes waeltaa hän onnellisna
Katsahdellen korkeilt tuntureilt
Laaksoon, jossa lempeesilmä neitons
Käyskelee ja ilosesti laulaa.
Hänen laulunsa on toiwontähdest,
Joka juhlallisest säteilee
Halki ijäisyyden awaruuden.
Laulu kaikuu, sota pilwis on,
Miekan kalske, temmellys ja jyske;
Mutta pilwet siirtyy, taiwas selkii.
Niin hän uneksuu ja wiimein herää
Idän rannal seistes aamun Koin;
Kirkasteluil kaswoilla hän nousee
Unohduksen wirrast wiileäst.
Elo hymyy niinknin aurinkoinen
Nousussansa purpuraiselt wuoteelt.
Ulos astuuwi hän huoneestansa
Koska karjankellot kilisee,
Käyskeleewi wiljawainiolla,
Joka hienos tuules lainehtii.
Walmis onpi säihkywäinen wilja,
Sadon lupaawi se moninkerroin.
Mutta mikä mailma taiwaan reunal,
Synkeä kuin päiwä tuomion?
Mitä wuorii toinentoisens seljäs
Tulenkarwasilla päärmeil siel?
Ylösrynkää sieltä ukkospilwi
Pimee, raskas; jyry waisu kuuluu,
Nyt se korkeuden kiireel seisoo,
Jylisee, ja wapisewa maa
Tules, raesatees uiskentelee,
Pilwikorkeet kuuset pirstotaan;
Pelto, äsken wihanto ja kaunis,
Kuwailee nyt häwityksen leirii.
Mies tän näkee, katsahtaawi jalost
Luonnon kamppausta, lausueu:
"Ihanata! Neitoni on jäljel,
Kartanossa korkeel nummel tuol,
Waikka mailman kalleuksist köyhä
Mutta sydänt rikasta hän kantaa.
Käteni on wahwa, silmäin kirkas,
Uudestaan mä kylwän peltoni,
Ja kun wuosi kierroksens on tehnyt,
Wilja kultainen täs kimmeltää."
Niin hän lausuu kotiin käydessänsä;
Katsannosta loistaa lemmen liekki.
Mutta näytös ankarampi wielä
Wartoo häntä kotokalliol:
Katso, ukon kadehtiwa nuoli
Miehen huoneeseen on iskenyt,
Liekkein helmas asuntonsa seisoo,
Taiwaan otsaa tulikielet nuolee.
Mies tän näkee, katsahtaawi jalost
Luonnon kamppausta, lausuen:
"Ihanata! Neitoni on jäljel,
Kartanossa korkeel nummel tuol,
Waikka mailman kalleuksist köyhä
Mutta sydänt rikasta hän kantaa.
Käteni on wahwa, silmäin kirkas
Toisen huoneen rakennan mä taas
Ennenkuin kaks kertaa aurinkoinen
Käynyt onpi eteläisil mail.
Impi, ihanalle leimpeiu tuntuu
Humisewan tulimeren ääres.
Komee impi, joka wäikyt nummel,
Jossa pauhinalla tuulet käy,
Tuimat tuulet männistössä tuuhees
Ympär armahimman kartanon,
Woimallisesti kuin liekit tässä
Lempein leimun; luoksesi mä riennän.
Koska wiimein sammunut on liekki,
Kohden immen kotoo kulkee mies,
Uljaal mielel, säteilewäl silmäl
Halki salojen hän astelee.
Näkyy huone mäntymetsän suojas,
Akkunat sen lempeest katsahtawat.
Käyskelee hän keltasantast tietä,
Impi kaunis häntä wastaan käy.
Mutta miks niin röykkeä on käyntins?
Miks ei kuulu äänens helinää?
Mikä penseys on niillä huulil,
Katsannossa mikä talwen kylmyys!
Niinkuin tuuli öisest, jäisest merest
Miehen sieluun sanat puhaltaa:
"Toisen lemmen-ystäwän mä löysin,
Hae itselles myös toinen sä,"
Sanoi neito, hywäst jätti, poistui,
Ylewästi astuwa Diana.
Kotons raunioille mies taas käypi
Witkon astelee hän öisel tiel
Kelmentyneil poskil, katseel synkeel,
Huomaamatta matkan joutumist,
Huomaamatta onko yö wai päiwä
Käy hän synkeen salon hyminässä.
Kaikki sumus, sekamelskas kiirii
Silmis yksinäisen kulkijan,
Niinkuin koska talwen tuisku peittää
Pyörteihinsä laaksot, korkuudet,
Tahi niinkuin aarnios hän wäikkyis,
Kohdus humajaawan rautawuoren.
Ei hän kuule askeleitans tiellä
Eikä metsäs ääntä huhkaimen;
Aatoksensa epäilyksen korwes
Kulkee niinkuin lapsi eksynyt;
Kadottanut on hän sieluns päiwän,
Kadottanut syämmen-ystäwänsä.
Mut kosk tumma puol-yön walo pohjas
Kuusten tutkaimille hengittää,
Huoneens sauwuwilla raunioilla
Äänetönnä seisoo kalwee mies;
Siinä seisoo hän ja mietiskelee
Ihmisluontoo, elon arwotusta.
Kuinka toiwon kauniit rakennukset
Lepää meren santarannal tääll.
Niin hän kalweana mieliskelee,
Sydän tempoellen powes lyö,
Hurjat wirrat sielussansa kiitää
Pimeä kuin sywyys waltameren.
Niin hän kauwan kalliolla seisoo,
Wiimein aamutuuli puhaltaa,
Korkee kuusi kunnahalla pauhaa
Sinnen katsoo kalliolta mies,
Ja hän kohottaawi tukehtuwan rintans,
Aatoksissansa hän haastelee:
"Ilo elämäin on hautaan pantu,
Itse murheellisna ristinä
Seison haudan äänettömäl kummul.
Mihen katsantoni teroitan?
Mitä wartoon, koska rakentelen?
Maata Tuonen, Kolman santapeltoo.
Mutta tämän pellon loisel partaal
Alkaa taasen toiwon aamumaa,
Siellä onpi isieni linna,
Siellä onpi istuin mulle myös.
Ihanata! Itä walkeneewi!
Toiwo wirtaa halki ijäisyyden!
Peltoni mä kynnän taas ja kylwän,
Saral loiskiessa lintusten;
Wilja sieltä elantoni olkoon,
Juomain kirkas wesi lähteestä
Tähän majan pienen rakennan,
Täs on asuntoni, työni pellol.
Ole lystitarhain, pelto, niittu,
Metsola, mua ota helmahas,
Mutta kaunis, ihanainen neito
Kartanossa mäntyin warjomas,
Miksi oli syämmes petollinen!
Miksi huikenteli kurja mieles."
Niin hän mietiskelee kalliolla,
Siitä uukkuu sywään unehen
Päätäns nojaellen rauniolle,
Mutta nukkuessaan kiilostaa
Kirkas kyynel hänen poskellansa;
Aamupaiste kyynelhelmen kultaa.
Mutta wielä kertoella tahdon
Kuinka elämäusä päiwät mies
Yksinänsä iltoihin tääl wietti.
Kalliol hän asui majassans,
Peltoons wiljeli hän ahkerasti,
Hedelmänpä runsaan työnsä kantoi,
Köyhän turwa, arwon suoja aina
Onpi majassans mies äänetön,
Harwoin sanat hänen huulil kaikuu,
Harwoin hänen huulens myhäilee.
Wakaana hän aina käyskeleewi,
Kaukaisuutta katsantonsa kiehtoo.
Käsiwarrellans kiwääri kantain
Usein käy hän yössä metsien,
Siellä uskollisen koirans kaussa
Wiipyilee hän iltahämäriin.
Niin hän wuosikymmeniä wiettää
Poudas, satees. Uros harmeneewi.
Moni syntyy, moni hautaan waipuu
Kiertoessa täällä aikojen.
Saapi kerran sanoman mies kuulla:
Nainen, joka petti sydämmes,
Kuolon portilla nyt wapiseewi;
Anteeks-antamust hän pyytää sulta.
Anteiks-antamuksen uros antaa
Lempeän ja kultahymywän
Niinkuin kauniin päiwän lasku lännes.
Tämän kuulee neito katala,
Kaswons kirkastuu, ja siunauksel
Koht hän ijäisyyden uneen nukkuu.
Wuosii monta sankar wielä nähtiin
Käyskelewän pelloil, metsän yös
Niinkuin korkee, juhlallinen haamu
Entisyyden tummast hämäräst.
Harmaat kiharansa tuules wäikkyy,
Ihmeellisest loistaa katsantonsa.
Mutta kerran koska iltahetkel
Kuusen kruunus tähti uneksui,
Mies oil lepoon käynyt, sydämmensä,
Lemmenlämmin ennen, kylmä oil,
Mutta hänen otsalt aamu paistoi,
Hänen huulilt hymy taiwaallinen.
Niittu on metsässä kaltewa pohjaan,
Kuusilta ympäröitty,
Korkeilta kuusilta syukeäs kaapus,
Kiireillä kotkat sinkoo;
Kumpu on sen keskellä
Wiherjäinen, sileä,
Ja kallistuuwi rauhallinen niittu
Matalakoiwuseen suohon.
Seistessäs niitulla ihanal kummul
Katsahda tienoon pohjan:
Aho siel paistaawi, mansikkatöyräs
Toispuolel harmaat suota.
Onko kotokunnas siel,
Ilomäki lapsuuden,
Kun sydämmeni tunteist kummallisist,
Muistoista ihanist riutuu.
Olipa pilwinen sunnuntaipäiwä
Helteises heinäkuussa,
Juhlallist muotoa kantoiwat kuuset
Kotkien kirkkuessa;
Tuuli oli waijennut,
Witkon pilwet kiiriilit,
Kuin wuoret mustanharmaat, kuusten kärjil;
Wallitsi himmeys kaunis.
Waikkapa lapsuuden liepeä wiiri
Otsallain wäikkyi wielä,
Nuorison seurassa karkelin niitul,
Kunnaalla ruohosella;
Nuorukaiset karkelit,
Wilkkaat immet karkelit,
Ja ilon pauhinasta metsä kaikui,
Kuusisto synkeä kaikui.
Yks oli impien iloses joukos
Kaarewil silmäripseil,
Hartioil aaltoilit kiharat mustat,
Kiiltäwät, hiilumustat
Hopeekellon helinä
Oli hänen äänensä
Ja liikuntonsa niinkuin taiwaan-haamun,
Koska hän kunnaalla wäikkyi.
Miksi niin ihanast hekumast sykkyy
Hohtawat ohauksein?
Miksi tuo pyhästi kuohuwa kuume
Syämmeni kammioissa?
Miksi kuuset synkeät
Katsahdit niin armahast?
Maa, taiwas, miks niin autuaasti hymyit?
Enpä mä tietänyt sillon.
Alat waan wirtasi impeä kohden
Katsantoin säteet kaikki,
Harhaillen wiiwyit he kaunosen kaswoil,
Purpurahuulillansa.
Hänen silmäins lähteistä
Kaukamailma riutuwa,
Kuin waisut kodon sinikunnaat tuolla,
Kangasti sieluuni armaast.
Iloitsit kunnalla immet ja poijat
Ehtoosen myöhään asti;
Aamua, sillon kosk niitulle tultiin,
Muistin kuin entisyyttä.
Kotihin nyt käyskeltiin
Tuleniskus Kalewan,
Kuin hourailewa seurasin mä heitä
Ihanal heinäkuun illal.
Wiimeisen kerranpa katselin sillon
Kaunista neitoo täällä;
Walkean säihkynäs äänettömässä
Kiharans uiskentelit;
Otsal, tulen walkeus,
Silmäkuopis, hämäryys,
Ja lempee äänens kerran kaikui wielä;
Ainiaaks meistä hän siirtyi.
Ainiaaks siirtyi hän kaukaisiin maihin
Lainetten aawaa tietä,
Ei toki kuwansa muistostain siirry,
Ei tämän taiwaan alla,
Eikä päiwä pilwinen;
Eikä niittu himmeä,
Siel näin mä mustakiharaisen immen,
Näin hänen unessa armaas.
Mi ikäwyys,
Mi hämäryys sieluni ympär
Kuin syksy-iltanen autiol maall?
Turha waiwa täällä,
Turha onpi taistelo
Ja kaikkisuus mailman, turha!
En taiwasta
Mä tahdo, en yötä Gehennan,
Enp' enään neitosta syliini suo
Osani waan olkoon:
Tietämisen tuskast pois,
Kaik' äänetön tyhjyys olkoon.
No, ystäwät!
Teit' kerranpa wiimeisen pyydän,
Oi! kuulkaat mitä nyt anelen teilt:
Tuonen-tupa tehkäät
Poijan tämän asunnoks;
Hän kätköhön mullan astuu.
Mun hautani
Nyt kaiwakaat halawain suojaan
Ja peitol mustal se peittäkäät taas,
Sitten ainiaksi
Kartanostain poistukaat;
Mä rauhassa maata tahdon.
Ja kumpua
Ei haudallein kohokoon koskaan,
Waan multa kedoksi kamartukoon,
Ettei kenkään tiedä,
Että lepokammioin
On halawan himmeän alla.
Terwe, metsä, terwe, wuori,
Terwe, metsän ruhtinas!
Täs on poikas uljas nuori;
Esiin käy hän, woimaa täys,
Kuin tuima tunturin tuuli.
Metsän poika tahdon olla,
Sankar jylhän kuusiston,
Tapiolan wainiolla
Karhun kanssa painii lyön,
Ja mailma Unholaan jääköön.
Wiherjäisel laattialla,
Mis ei seinät hämmennä,
Tähtiteltin korkeen alla
Käyskelen ja laulelen,
Ja kaiku ympäri kiirii.
Kenen ääni kiirii siellä?
Metsän immen lempeän;
Liehtarina miehen tiellä
Hienohelma hyppelee,
Ja kultakiharat liehuu.
Ihana on täällä rauha,
Urhea on taistelo:
Myrsky käy ja metsä pauhaa,
Tulta iskee pitkäinen
Ja kuusi ryskyen kaatuu.
Metsän poika tahdon olla,
Sankar jylhän kuusiston,
Tapiolan wainiolla
Karhun kanssa painii lyön,
Ja mailma Unholaan jääköön.
"""

@main def app() =

  val lines = Buffer[String]()
  val cat = Buffer[String]()
  val scount = Buffer[String]()
  val wcount = Buffer[String]()
  val fourcommon = Buffer[Buffer[String]]()

  työstettävä.split("\n").foreach(line =>
    lines += line.replaceAll("^\\s+", "")
    val cleanedline = line.replaceAll("^\\s+", "").replace("”", "").replace("–", "").toLowerCase
    fourcommon += helper.commonletters(cleanedline)
    val starters = Buffer[String]()
    cleanedline.split("[\\s|\\-]").foreach(word =>
      if helper.isVowel(word(0)) then starters += word(0).toString
      else if helper.isVowel(word(1)) then starters += word.take(2)
      else starters += (word(0).toString() + word(2).toString())

      )
    val weak = helper.shorten(starters)
    if helper.countDuplicates(starters).values.filter(_ > 1).toBuffer.nonEmpty then
       cat += "S"
       scount += helper.countDuplicates(starters).values.filter(_ > 1).toBuffer.mkString("+")


       val dupmap = helper.countDuplicates(starters).filter {
            case (_, value) => value > 1
            }.groupMap {
          case (key, _) => key.head.toString
          } {
          case (_, value) => value
          }.view.mapValues(_.sum).toMap

       var weakstring = Buffer[String]()
       weak.toSet.foreach(l =>
         if dupmap.contains(l) && helper.countDuplicates(weak).contains(l)  then
           if (helper.countDuplicates(weak)(l) - dupmap(l)) > 0 then
           weakstring += "S" + (helper.countDuplicates(weak)(l) - dupmap(l)).toString
         else if helper.countDuplicates(weak)(l) > 1 then
           weakstring += helper.countDuplicates(weak)(l).toString
       )
       if weakstring.isEmpty then weakstring += "0"
       wcount += weakstring.mkString("+")
    else

      if helper.countDuplicates(weak).values.filter(_ > 1).toVector.isEmpty then
        cat += "N"
        scount += "0"
        wcount += "0"
      else
        cat += "W"
        scount += "0"
        wcount += helper.countDuplicates(weak).values.filter(_ > 1).toVector.mkString("+")

  )

  var catsliding = cat.sliding(3).map(_.mkString).toBuffer
  catsliding += (cat(catsliding.length) + cat(catsliding.length+1) + "..")
  catsliding += (cat(catsliding.length) + "..")

  println("Säkeet kategorioittain. Säkeitä yhteensä " + cat.length + " kappaletta" )
  println("S: " + cat.count(_ == "S") + " (" + (BigDecimal(cat.count(_ == "S").toDouble / cat.length) * 100).setScale(3, BigDecimal.RoundingMode.HALF_UP).toString() + ")")
  println("W: " + cat.count(_ == "W") + " (" + (BigDecimal(cat.count(_ == "W").toDouble / cat.length) * 100).setScale(3, BigDecimal.RoundingMode.HALF_UP).toString() + ")")
  println("N: " + cat.count(_ == "N") + " (" + (BigDecimal(cat.count(_ == "N").toDouble / cat.length) * 100).setScale(3, BigDecimal.RoundingMode.HALF_UP).toString() + ")")

  printf("%-60s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Line", "Cat", "3CAT", "S-count", "W-count", "V1", "V1C", "V1%", "V2", "V2C", "V2%", "V3", "V3C", "V3%", "V4", "V4C", "V4%")

  for (i <- lines.indices) {
    val cleanedLine = lines(i).replaceAll("[\n\r]", "")
    val vokaalit = fourcommon(i).padTo(12, "") // Pidetään aina 12 vokaalia, täytetään tyhjillä tarvittaessa
    printf("%-60s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n",
      cleanedLine, cat(i), catsliding(i), scount(i), wcount(i),
      vokaalit(0), vokaalit(1), vokaalit(2), vokaalit(3),
      vokaalit(4), vokaalit(5), vokaalit(6), vokaalit(7),
      vokaalit(8), vokaalit(9), vokaalit(10), vokaalit(11))
  }




object helper:

  def isVowel(ch: Char): Boolean =
    ch.toLower match
      case 'a' | 'e' | 'i' | 'o' | 'u' | 'y' | 'ä' | 'ö' | 'å' => true
      case _                           => false

  def commonletters(line:  String) =
    val letterCounts = Map[Char, Int]().withDefaultValue(0)
    line.foreach(c =>
      if isVowel(c) then
        letterCounts.get(c) match
          case Some(value) =>  letterCounts(c) = value + 1
          case None => letterCounts(c) = 1
     )
     val sortedLetters = letterCounts.toList.sortBy { case (_, count) => -count }
     val topFourLetters = sortedLetters.take(4)
     val result = Buffer[String]()
     topFourLetters.foreach { case (letter, count) =>
       val countsAfterLetter = line.sliding(2).count(_.head == letter)
       result += letter.toString
       result += count.toString
       result += (BigDecimal(count.toDouble / letterCounts.values.sum) * 100).setScale(3, BigDecimal.RoundingMode.HALF_UP).toString()

     }
     result

  def shorten(buffer: Buffer[String]) =
    buffer.map(str =>
      if str.length == 2 then str.dropRight(1)
      else if str.length == 3 then str.dropRight(2)
      else str)


  def countDuplicates(buffer: Buffer[String])=
     val elementCountMap = Map[String, Int]().withDefaultValue(0)
     buffer.foreach(element =>
      elementCountMap.get(element) match
        case Some(value) =>  elementCountMap(element) = value + 1
        case None => elementCountMap(element) = 1

     )

       elementCountMap



