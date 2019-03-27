

type Set = Int => Boolean
def contains(s: Set, elem: Int): Boolean = s(elem)
def singletonSet(elem: Int): Set = (x:Int) => x == elem

val s1 = singletonSet(1)
contains(s1, 1)
//contains((x:Int) => x == 1, 1)
//1 == 1

val s2 = singletonSet(2)
def union(s: Set, t: Set): Set = (x:Int) => contains(s,x) || contains(t,x)

union(s1,s2)(1)
union(s1,s2)(2)
union(s1,s2)(3)

def intersect(s: Set, t: Set): Set = (x:Int) => contains(s,x) && contains(t,x)

intersect(s1,s2)(1)
intersect(s1,s1)(1)

def filter(s: Set, p: Int => Boolean): Set = (x:Int) => contains(s,x) && p(x)

def p = (x:Int) => x ==1
contains(x => x <= 1000, 10)
contains(x => x >= -1000, 10)

def exists(s: Set, p: Int => Boolean): Boolean = ???

//Int => Boolean
val s3 = singletonSet(3)
contains(s3,3)
val double = (x:Int) => x * 2
def map(s: Set, f: Int => Int): Set = (x:Int) => s(f(x))

val s4 = map(s3, double)
contains(s4, 6)

List(1,2,3).forall(x => x < 3)










