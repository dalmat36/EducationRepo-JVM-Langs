object listExamples {

  var l = List(3.0, 5, 'a')
  var l2 = 1::2::3::4::5::Nil
  var l3 = List.range(10,20)
  var l4 = l:::l2

  var sum = 0
  l3.foreach(sum += _)
  println(sum)

  val list = List((1,2), (3,4), (5,6))
  for((a,b) <- list) yield a+b


}