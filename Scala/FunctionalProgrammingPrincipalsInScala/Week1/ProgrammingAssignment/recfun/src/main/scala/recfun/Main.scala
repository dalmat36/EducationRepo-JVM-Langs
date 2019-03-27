package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */

    def pascal(c: Int, r: Int): Int = factorial(r) / (factorial(c) * factorial(r-c))
    def factorial(x:Int):Int = if(x==0) 1 else x * factorial(x-1)

  
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    if (iter(chars, 0) >= 0) true else false
  }

  def iter(chars: List[Char], count: Int): Int = {
    if (chars.isEmpty | count < 0) count
    else iter(chars.tail, countValue(chars.head, count))
  }

  def countValue(c: Char, count: Int): Int = if (c == '(') count + 1 else if (c == ')') count - 1 else count + 0
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
     coinItr(money, coins,0)
    }
  def checkMod(money:Int, coin:Int) =
    if (money % coin == 0) 1 else 0

  def checkSum(money:Int, coin1:Int, coin2:Int)=
    if(money-(coin1 + coin2)==0) 1 else 0

  def checkModCoin(coin1:Int, coin2:Int)=
    if(coin2 % coin1 ==0) 1 else 0

  def getCount(money:Int, coins:List[Int], count:Int) =
    count + checkMod(money,coins.head) + coinItr2(money, coins,0)

  def getCount2(money:Int, coins:List[Int], count:Int) =
    if (coins.tail.isEmpty) count else checkSum(money,coins.head, coins.tail.head) + checkModCoin(coins.head, coins.tail.head)


  def coinItr(money: Int, coins: List[Int], count:Int): Int = {
    if(coins.isEmpty) count else coinItr(money, coins.tail, getCount(money, coins, count))
  }

  def coinItr2(money: Int, coins: List[Int], count:Int): Int = {
    if(coins.isEmpty) count else coinItr2(money, coins.tail, getCount2(money, coins,count))
  }


  }
