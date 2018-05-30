package p02

fun main(args: Array<String>) {
    val input: String? = null
    trim(input)
}

fun trim(src: String?): String {
    if (src == null) {
        throw NullPointerException()
    }
    return src.trim()
}