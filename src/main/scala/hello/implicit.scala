package hello

import scala.language.implicitConversions

final case class IntroText(text: String):
  val tokens: Array[String] = text.split(" ")

  def name: String = tokens(3)

  def level: String = tokens(12).toInt match
    case 0 | 1 | 2 | 3 => "Junior"
    case 4 | 5 | 6 => "MidLevel"
    case _ => "Senior"

  def language: String = tokens(9)

implicit def stringToIntroText(str: String): IntroText = IntroText(str)
//implicit def mammaMia(str: String): IntroText = IntroText(str) // if you uncomment this line, scala does not compile

def iWantAIntroText(intro: IntroText): Unit =
  println("name: " + intro.name + "\nlevel: " + intro.level + "\nlanguage: " + intro.language)

@main def roba(): Unit =
  iWantAIntroText("useless useless useless banana useless useless useless useless useless Scala useless useless 7")
