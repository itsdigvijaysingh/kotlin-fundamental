package funamental

fun main() {
    print("Enter the first value : ")
    var num1 = readln()!!.toInt()
    print("Enter the second value : ")
    var num2 = readln()!!.toInt()
    var add = num1+num2
    println("Addition of $num1 and $num2 is : $add")
}