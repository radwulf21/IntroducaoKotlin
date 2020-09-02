fun main() {
    println("Os nomes são iguais? ${compararString("Raul", "Leandro")}")
}

fun compararString (string1: String, string2: String): Boolean {
    return string1 == string2
}