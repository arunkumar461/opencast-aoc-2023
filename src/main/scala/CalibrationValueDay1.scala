package com.opencast


import scala.io.Source

object CalibrationValueDay1 {

  private val digitValue: Map[String, Int] =
    List(
      "zero", "one", "two", "three", "four", "five",
      "six", "seven", "eight", "nine"
    ).zipWithIndex
      .flatMap { case (s, i) =>
        List(s -> i, i.toString -> i)
      }.toMap

  private val digits: List[String] = digitValue.keys.toList

  def main(args: Array[String]): Unit = {
    var sum = 0;
    for (line <- Source.fromFile("src/main/scala/input.txt").getLines) {
      val str: String = secondPuzzle(line)
      println(str)
      sum = sum + str.toInt
    }
    println(sum)
  }

  private def secondPuzzle(line: String) = {
    val seq = line.tails.flatMap { t =>
      digits.find(t.startsWith).toSeq
    }.toSeq
    digitValue(seq.head).toString + digitValue(seq.last).toString
  }

  private def firstPuzzle(line: String): String = {
    val seq = line.toCharArray.filter(_.isDigit).toSeq
    seq.head.toString + seq.last.toString
  }
}

