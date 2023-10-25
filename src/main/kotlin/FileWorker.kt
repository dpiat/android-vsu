import java.io.File

object FileWorker {
    fun readFile(fileName: String)
        = File(getResourcePath(fileName)).useLines { it.toList() }

    fun writeFile(fileName: String, names: List<String>) {
        File("build/resources/main/" + fileName).printWriter().use { out ->
            names.forEach {
                out.println(it)
            }
        }

    }

    private fun getResourcePath(path: String): String =
        object {}.javaClass.getResource(path)?.path.toString()
}