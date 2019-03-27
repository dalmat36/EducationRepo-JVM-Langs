var today = "Tuesday"
if(today == "Monday") println("It might rain")
else println("It is not Monday, so it will not rain")

var b = 4
var a = if(b < 0) -1 else 1
println(a)

println(if(b<0) "-" else if (b==0) "0" else "+")

var rate = 10.50
def earnings(s:String, h:Double):String = {
  if(s != "y"){
    if(h <= 40) "Salary is: $" + h * rate
    else {"Salary is: $" + (40 * rate + (h-40) * rate * 1.5)}
  }
  else "This is a salaried employee"
}

println(earnings("n",30))
println(earnings("n",45))

