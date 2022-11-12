package funamental

fun main() {
        var str = "topstechnology"
        var ch = 't'
        var frequency = 0

        for (i in 0..str.length - 1) {
                if (ch == str[i]) {
                        ++frequency
                }
        }
        println("frequency of $ch =$frequency")
}