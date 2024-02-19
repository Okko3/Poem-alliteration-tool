import scala.collection.mutable.Buffer
import scala.collection.mutable.Map
import scala.math.*
import scala.io.StdIn
import scala.sys.process.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale
import java.text.NumberFormat

object Main extends App:
  val finnishLocale = new Locale("fi", "FI") // Finnish locale
  val FINN = NumberFormat.getNumberInstance(finnishLocale)
  val lines = Buffer[String]()
  val cat = Buffer[String]()
  val scount = Buffer[String]()
  val wcount = Buffer[String]()
  val fourcommon = Buffer[Buffer[String]]()
  val fourcommon2 = Buffer[Buffer[String]]()
  val fourcommon3 = Buffer[Buffer[String]]()
  println("syötä teksti:")
  var userInputArray: Array[String] = Array.empty
  var inputLine = StdIn.readLine()
  var latest = "jotain"
  while inputLine != "run" do
    if inputLine.trim.nonEmpty || latest.trim.nonEmpty then
      userInputArray :+= inputLine
    latest = inputLine
    inputLine = StdIn.readLine()

  userInputArray.foreach(line =>
    if line == "" then
      lines += ""
      cat += ""
      scount += ""
      wcount += ""
      fourcommon += Buffer.fill(12)("")
      fourcommon2 += Buffer.fill(12)("")
      fourcommon3 += Buffer.fill(12)("")
    else
      val cleanedline = line.replaceAll("-", "").replaceAll("^\\s+", "").replace("”", "").replace("–", "").replace("!", "").replaceAll("[^a-zA-Z0-9\\säöå]", "").replaceAll("\\s{2,}", " ").toLowerCase
      lines += line.replaceAll("^\\s+", "").replaceAll("\"", "”").replaceAll("-", "—")
      fourcommon += helper.commonVowels(cleanedline)
      fourcommon2 += helper.common2(cleanedline)
      fourcommon3 += helper.commonVowelPairs(cleanedline)
      val starters = Buffer[String]()
      cleanedline.split("[\\s|\\-]").foreach(word =>
        if helper.isVowel(word(0)) then starters += word(0).toString
        else if helper.isVowel(word(1)) then starters += word.take(2)
        else starters += (word(0).toString() + word(2).toString())

        )
      val weak = helper.shorten(starters)
      val nice = helper.countDuplicates(starters).values.filter(_ > 1).toBuffer

      if nice.nonEmpty then
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
    var catsliding = helper.customSliding(cat.toVector).toBuffer
    catsliding += (cat(catsliding.length) + cat(catsliding.length+1) + ".")
    catsliding += (cat(catsliding.length) + "..")

    val now = LocalDateTime.now()
    println("Allitgator 2.0 by Okko Katajamäki")
    val formatter = DateTimeFormatter.ofPattern("HH:mm")
    val formattedTime = now.format(formatter)

    println(now.getDayOfMonth + "." + now.getMonthValue + "." +  now.getYear + " " + formattedTime)


    println("Säkeet kategorioittain. Säkeitä yhteensä " + cat.length + " kappaletta" )

    println("S: " + cat.count(_ == "S") + " (" + FINN.format((BigDecimal(cat.count(_ == "S").toDouble / cat.length) * 100).setScale(3, BigDecimal.RoundingMode.HALF_UP)) + ")")
    println("W: " + cat.count(_ == "W") + " (" + FINN.format((BigDecimal(cat.count(_ == "W").toDouble / cat.length) * 100).setScale(3, BigDecimal.RoundingMode.HALF_UP)) + ")")
    println("N: " + cat.count(_ == "N") + " (" + FINN.format((BigDecimal(cat.count(_ == "N").toDouble / cat.length) * 100).setScale(3, BigDecimal.RoundingMode.HALF_UP)) + ")")


    printf("%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\t%-1s\n", "Line", "Cat", "3CAT", "S-count", "W-count", "V1", "V1C", "V1%", "V2", "V2C", "V2%", "V3", "V3C", "V3%", "V4", "V4C", "V4%", "K1", "K1C", "K1%", "K2", "K2C", "K2%", "K3", "K3C", "K3%", "K4", "K4C", "K4%", "D1", "D1C", "D1%", "D2", "D2C", "D2%", "D3", "D3C", "D3%", "D4", "D4C", "D4%")

    for (i <- lines.indices) do
      val cleanedLine = lines(i).replaceAll("[\n\r]", "")
      val vokaalit = fourcommon(i).padTo(12, "")
      val vokaalit2 = fourcommon2(i).padTo(12, "")
      val vokaalit3 = fourcommon3(i).padTo(12, "")
      printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
           cleanedLine, cat(i), catsliding(i), scount(i), wcount(i), vokaalit(0), vokaalit(1), vokaalit(2), vokaalit(3), vokaalit(4),
           vokaalit(5), vokaalit(6), vokaalit(7), vokaalit(8), vokaalit(9), vokaalit(10), vokaalit(11), vokaalit2(0), vokaalit2(1), vokaalit2(2), vokaalit2(3), vokaalit2(4),
           vokaalit2(5), vokaalit2(6), vokaalit2(7), vokaalit2(8), vokaalit2(9), vokaalit2(10), vokaalit2(11),vokaalit3(0), vokaalit3(1), vokaalit3(2), vokaalit3(3), vokaalit3(4),
           vokaalit3(5), vokaalit3(6), vokaalit3(7), vokaalit3(8), vokaalit3(9), vokaalit3(10), vokaalit3(11))



object helper:


  def customSliding(cat: Seq[String]) =
    var result = Vector.empty[String]
    var window = Vector.empty[String]
    var counter = 0
    var don = false
    for (elem <- cat) do

      if elem.isEmpty && window.size == 2 && counter % 3 == 0 then counter += 1
      else
        if counter % 3 == 1 then counter += 1
        else if counter % 3 == 2 then
          counter += 1
          don = true

        window :+= elem
        if (window.size == 3) then
          result :+= window.mkString
          window = window.tail
        if don then
          result :+= ""
          don = false

    result


  def replaceCharsFromString(input: String, replacements: String): String =
    var output = input
    val charCounts = replacements.groupMapReduce(identity)(_ => 1)(_ + _)

    for (charToReplace, count) <- charCounts do
      var remainingCount = count
      var index = output.indexOf(charToReplace)

      while index != -1 && remainingCount > 0 do
        output = output.substring(0, index) + output.substring(index + 1)
        remainingCount -= 1
        index = output.indexOf(charToReplace, index)

    output


  def isVowel(ch: Char): Boolean =
    ch.toLower match
      case 'a' | 'e' | 'i' | 'o' | 'u' | 'y' | 'ä' | 'ö' | 'å' => true
      case _                           => false

  def isConsonant(ch: Char): Boolean =
    ch.toLower match
      case 'b' | 'c' | 'd' | 'f' | 'g' | 'h' | 'j' | 'k' | 'l' | 'm' |
           'n' | 'p' | 'q' | 'r' | 's' | 't' | 'v' | 'w' | 'x' | 'z' => true
      case _ => false

  def commonVowels(line:  String) =
    val finnishLocale = new Locale("fi", "FI") // Finnish locale
    val FINN = NumberFormat.getNumberInstance(finnishLocale)
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
       result += FINN.format((BigDecimal(count.toDouble / letterCounts.values.sum) * 100).setScale(3, BigDecimal.RoundingMode.HALF_UP)).toString()

     }
     result


  def common2(line:  String) =
    val finnishLocale = new Locale("fi", "FI") // Finnish locale
    val FINN = NumberFormat.getNumberInstance(finnishLocale)
    val letterCounts = Map[Char, Int]().withDefaultValue(0)
    line.foreach(c =>
      if isConsonant(c) then
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
       result += FINN.format((BigDecimal(count.toDouble / letterCounts.values.sum) * 100).setScale(3, BigDecimal.RoundingMode.HALF_UP)).toString()

     }
     result


  def commonVowelPairs(line: String) =
    val finnishLocale = new Locale("fi", "FI") // Finnish locale
    val FINN = NumberFormat.getNumberInstance(finnishLocale)
    val pairCounts = collection.mutable.Map.empty[String, Int].withDefaultValue(0)

    // Define a function to check if a pair is a vowel pair
    def isVowelPair(pair: String): Boolean =
      val vowels = "aeiouyäö"
      pair.length == 2 && pair.forall(vowels.contains) && pair(0) != pair(1)

    // Iterate through the line by pairs
    line.sliding(2).foreach(pair =>
      if isVowelPair(pair) then
        pairCounts.updateWith(pair)(optCount =>
          optCount.map(_ + 1).orElse(Some(1))
        )
    )

    // Sort the pairs by count
    val sortedPairs = pairCounts.toList.sortBy((_, count) => -count)
    val topFourPairs = sortedPairs.take(4)

    val result = collection.mutable.Buffer.empty[String]

    topFourPairs.foreach { case (pair, count) =>
      val percentage = BigDecimal(count.toDouble / pairCounts.values.sum) * 100
      result += pair
      result += count.toString
      result += FINN.format(percentage.setScale(3, BigDecimal.RoundingMode.HALF_UP)).toString
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

