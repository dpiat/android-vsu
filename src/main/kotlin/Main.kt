import java.net.URL

fun main() {
    var names: List<String> = FileWorker.readFile("names.txt")
    names = names.sorted()
    FileWorker.writeFile("names_out.txt", names)
}

