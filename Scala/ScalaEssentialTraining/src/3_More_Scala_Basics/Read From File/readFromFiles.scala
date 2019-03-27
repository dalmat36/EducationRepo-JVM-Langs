import io.Source._

object readFromFiles extends App {
  val fileName = "src/3_More_Scala_Basics/rainbow.txt"
  for (line <- fromFile(fileName).getLines()) {
    print(line.toUpperCase)
  }


  val poemLines = fromFile("src/3_More_Scala_Basics/poem.txt").getLines().toList
  poemLines.foreach(println)

}