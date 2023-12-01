import java.io.File

fun main() {
    val file : File = File("src/main/Day_1/input.txt")
    val numbersPerLine : ArrayList<Char> = ArrayList()
    val resultNumbers : ArrayList<Int> = ArrayList()
    var number : Int = 0
    var result : Int = 0

    file.forEachLine { line ->
        numbersPerLine.clear()
        line.forEach { char ->
            if (char.isDigit()) {
                numbersPerLine.add(char)
            }
        }
        number = "${numbersPerLine.first()}".plus("${numbersPerLine.last()}").toInt()
        resultNumbers.add(number)
    }
    resultNumbers.forEach{result += it}
    print(result)
}