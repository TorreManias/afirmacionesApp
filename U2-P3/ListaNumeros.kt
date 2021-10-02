fun main(){
    val numeros: List<Int> = listOf(1, 2, 3, 4, 5 , 6)
    println("Lista: $numeros")
    println("TAM: ${numeros.size}")

    // Acceder a elementos
    println("Primer elemento: ${numeros.get(0)}")
    println("Segundo elemento: ${numeros.get(1)}")
    println("Ultimo elemento: ${numeros.get(numeros.size - 1)}")
    println("Primero: ${numeros.first()}")
    println("Ultimo: ${numeros.last()}")

    // Verificar existencias
    println("Hay 4?: ${numeros.contains(4)}")
    println("Hay 7?: ${numeros.contains(7)}")
}
