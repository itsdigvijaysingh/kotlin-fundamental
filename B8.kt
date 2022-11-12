package funamental

fun main() {
    print("Enter the first number : ")
    var num1 = readLine()!!.toInt()
    print("enter the second number : ")
    var num2 = readLine()!!.toInt()
   var num3=num1
    num1=num2
    num2=num3
    println("The swap for given value is \n1. $num1  \n2. $num2")
}