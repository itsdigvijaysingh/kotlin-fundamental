package funamental

fun main() {
    print("Enter the first value : ")
    var num1 = readln()!!.toFloat()
    print("Enter the second value : ")
    var num2 = readln()!!.toFloat()
    var mul = num1*num2
    println("Multiplication of $num1 and $num2 is : $mul")
}