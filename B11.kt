package funamental

fun main() {
    print("Enter any sentance with space : ")
    var sen = readLine()!!.toString()
    sen= sen.replace("\\s".toRegex(),"")
    println("After replacement : $sen")
}