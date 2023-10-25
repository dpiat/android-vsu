fun main() {
    // read file from resources
    var names: List<String> = FileWorker.readFile("names.txt")
    names = names.sorted()
    // write file to build/resources/main
    FileWorker.writeFile("names_out.txt", names)
}

