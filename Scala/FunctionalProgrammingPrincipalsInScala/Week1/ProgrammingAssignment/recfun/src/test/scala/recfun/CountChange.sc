

val money = 301
val coins = List(5,10,20,50,100,200,500)
var count = 0
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

coinItr(money,coins,0)







