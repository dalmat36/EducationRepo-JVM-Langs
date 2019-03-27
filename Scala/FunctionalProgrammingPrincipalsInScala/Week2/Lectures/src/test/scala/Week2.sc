object week2{
  /*Higher Order Function- a function that can take another
  function as a parameter or return a function as a result*/



}

//Sum of integers between a and b
def sum(f:Int => Int, a:Int, b:Int): Int =
if(a > b)0
else f(a) + sum(f, a+1, b)

def sumInts(a:Int, b:Int) = sum(id,a,b)
def sumCubes(a:Int, b:Int) = sum(cube, a,b)
def sumFactorials(a:Int, b:Int) = sum(fact,a,b)

/*Using higher-order functions can lead to the creation of
many small functions. One way to avoid this is to use
function literals or anonymous functions
 */
def id(x:Int):Int = x
def cube(x:Int):Int = x * x * x
def fact(x:Int):Int = if(x==0)1 else fact(x-1)

def sumInts2(a:Int, b:Int) = sum(x=> x, a,b)
def sumCubes2(a:Int, b:Int) = sum( x=> x * x * x, a, b)

//tail-recursive version of sum
def sum2(f:Int => Int)(a:Int, b:Int):Int = {
  def loop(a:Int, acc:Int):Int = {
    if(a > b) acc
    else loop(a + 1 , f(a) + acc)
  }
  loop(a,0)
}
//Review Tail recursion: https://www.youtube.com/watch?v=L1jjXGfxozc



