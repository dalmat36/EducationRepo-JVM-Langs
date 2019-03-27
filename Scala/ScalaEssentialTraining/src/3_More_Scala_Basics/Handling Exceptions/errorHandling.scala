import io.Source._
import java.io._

object errorHandling extends App {
  try {
    for (line <- fromFile("noFile.txt").getLines())
      println(line.toLowerCase)
  } catch {
    case e:FileNotFoundException => println("The file was not found!")
    case _:Exception => println("Your program had an error")
  }

  try{
    var quotient = 10 / 0
  }
  catch {
    case e: ArithmeticException => println("Don't divide by zero!")
  }
}