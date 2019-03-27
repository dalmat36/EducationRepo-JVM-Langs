
object setExamples {
  val fruit = Set("apple", "orange", "banana")
  var moreFruit = Set("kiwi", "pineapple")
  var nums = Set(1,2,3,4,5)
  var moreNums = Set(6, 7, 8, 9)

nums.contains(5)
nums(3)

  var mixed = fruit ++ nums

  nums -= 5
  println(nums)

  nums & moreNums
  moreFruit.head
  moreFruit.tail
  moreNums.isEmpty


}