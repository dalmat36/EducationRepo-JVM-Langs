object mapExamples {
  var groceries = Map(1 -> "milk", 2 -> "bread", 3 -> "juice", 4 ->"eggs")
groceries = groceries+(5 -> "hashbrowns")
  groceries.get(5)
  groceries(3)

  groceries.getOrElse(6,"No match")
  for(v <- groceries.values) println(v)
  var z = for ((k,v) <- groceries) yield (v,k)
  groceries.foreach(println)



}