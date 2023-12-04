import java.io.File

fun main() {
    val file: File = File("src/main/Day_1/input.txt")
    val numbersPerLine: ArrayList<Int> = ArrayList()
    val resultNumbers: ArrayList<Int> = ArrayList()
    val numbersAsText: MutableMap<String, Int> = LinkedHashMap()

    var number: Int = 0
    var result: Int = 0
    var text: String = ""

    var partOf: Boolean = false

    numbersAsText["one"] = 1
    numbersAsText["two"] = 2
    numbersAsText["three"] = 3
    numbersAsText["four"] = 4
    numbersAsText["five"] = 5
    numbersAsText["six"] = 6
    numbersAsText["seven"] = 7
    numbersAsText["eight"] = 8
    numbersAsText["nine"] = 9

    file.forEachLine { line ->
        partOf = false
        numbersPerLine.clear()
        line.forEach charLoop@{ char ->
            partOf = false
            if (char.isDigit()) {
                numbersPerLine.add(char.digitToInt())
                partOf = false
                text = ""

            }/* else {
                text += char
                numbersAsText.forEach mapLoop@ { numberString ->
                    if (text.length > numberString.key.length) return@mapLoop
                    if (text in numberString.key.substring(0, text.length)) {
                        partOf = true
                        if (text == numberString.key) {
                            numbersPerLine.add(numberString.value)
                            partOf = false
                            text = ""
                        } else return@charLoop
                    } //every char of the key has to be checked: text length == 1 -> numberString first character
                }
                if (!partOf) {
                    text = ""
                }
            }
            */
        }
        number = "${numbersPerLine.first()}".plus("${numbersPerLine.last()}").toInt()
        resultNumbers.add(number)
    }
    resultNumbers.forEach { result += it }
    print(result)
}