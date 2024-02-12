import scala.collection.mutable.Buffer
import scala.collection.mutable.Map
import scala.math.*
import scala.io.StdIn
import scala.sys.process._




@main def app() =

  val lines = Buffer[String]()
  val cat = Buffer[String]()
  val scount = Buffer[String]()
  val wcount = Buffer[String]()
  val fourcommon = Buffer[Buffer[String]]()
  println("syötä teksti:")
  var userInputArray: Array[String] = Array.empty
  var inputLine = StdIn.readLine()
  while inputLine != "exit" do
     userInputArray :+= inputLine
     inputLine = StdIn.readLine()
  "cmd /C cls".!



  userInputArray.foreach(line =>
    lines += line.replaceAll("^\\s+", "")
    val cleanedline = line.replaceAll("^\\s+", "").replace("”", "").replace("–", "").replace("-", "").replaceAll("\\s+", "").toLowerCase
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


  printf("%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\n", "Line", "Cat", "3CAT", "S-count", "W-count", "V1", "V1C", "V1%", "V2", "V2C", "V2%", "V3", "V3C", "V3%", "V4", "V4C", "V4%")

  for (i <- lines.indices) do
    val cleanedLine = lines(i).replaceAll("[\n\r]", "")
    val vokaalit = fourcommon(i).padTo(12, "") // Pidetään aina 12 vokaalia, täytetään tyhjillä tarvittaessa
    printf("%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\n",
         cleanedLine, cat(i), catsliding(i), scount(i), wcount(i), vokaalit(0), vokaalit(1), vokaalit(2), vokaalit(3), vokaalit(4),
         vokaalit(5), vokaalit(6), vokaalit(7), vokaalit(8), vokaalit(9), vokaalit(10), vokaalit(11))



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



