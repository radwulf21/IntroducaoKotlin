fun main() {
    println("O número é par? ${numeroPar(2)}")
}

fun numeroPar(numero: Int): Boolean {
    return numero % 2 == 0
}