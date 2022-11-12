package funamental

fun main() {
    print("Enter the dividend : " )
    var div = readLine()!!.toInt()
    print("Enter the divisor : " )
    var divs = readLine()!!.toInt()

    var quotient = div/divs
    var remainder = div%divs

    println("Quotient : $quotient")
    println("Remainder : $remainder")

}