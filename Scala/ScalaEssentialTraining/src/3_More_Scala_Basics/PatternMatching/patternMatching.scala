
//Similiar to the switch statement in Java
object patternMatching extends App {
  def greekAlphabet(letter:Char) = {
    letter match {
      case 'a' | 'A' => "Alpha"
      case 'b' | 'B' => "Beta"
      case _ => println("You entered an invalid character")
    }
  }
  println("The greek letter for C is: " + greekAlphabet('C'))

  def max(x:Int, y:Int) = x > y match {
    case true => x
    case false => y
  }

  println(max(50,20))
}