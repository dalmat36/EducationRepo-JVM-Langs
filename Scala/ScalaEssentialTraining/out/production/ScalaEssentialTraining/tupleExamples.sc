object tupleExamples {

  val v = (1, 1.4, "Hello")
  var x = v._3
  val (first, second, third) = v
  val symbols = Array("<", "-", ">")
  val counts = Array(2,10,2)
  val pairs = symbols.zip(counts)
  for((s,n) <- pairs) print(s*n)
  println

  def divide10(n: Int): Tuple2[Int,Int] = (n/10, n%10)
  val(tens, ones) = divide10(99)
}