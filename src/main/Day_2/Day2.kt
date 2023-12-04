import java.io.File

fun main() {
    val file: File = File("src/main/Day_2/input.txt")
    val gameList: ArrayList<Game> = ArrayList()
    file.forEachLine eachLine@ { line -> gameList.add(Game(line)) }
}



class Game(line: String) {

    class Subset(set: String) {
        var red: Int = 0
        var blue: Int = 0
        var green: Int = 0

        init {
            val tokens = set.split(",")
            tokens.forEach {
                val list = it.split(" ")
                when (list[2]) {
                    "red" -> red = list[1].toInt()
                    "blue" -> blue = list[1].toInt()
                    "green" -> green = list[1].toInt()
                }
            }
        }

        override fun toString(): String {
            return "Subset(red=$red, blue=$blue, green=$green)"
        }


    }
    var id: Int = -1
    val sets: ArrayList<Subset> = ArrayList()

    init {
        val list = line.split(";", ":")
        for (i in 1..<list.size) {
            sets.add(Subset(list[i]))
        }
        id = list[0].split(" ")[1].toInt()
        println(this)
    }

    override fun toString(): String {
        return "Game(id=$id, sets=$sets)"
    }

}