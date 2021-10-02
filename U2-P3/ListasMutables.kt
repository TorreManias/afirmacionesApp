fun main() {
	val platosFuertes = mutableListOf<String>()
    // Agrega elementos
    println("Agrega fideos: ${platosFuertes.add("fideos")}")
    println("Agrega spaghetti: ${platosFuertes.add("spaghetti")}")
    println("Platillos: $platosFuertes")

    // Agregar varios a la vez
    val masElementos = listOf("ravioli", "lasagna", "alfredo")
    println("Agrega la lista: ${platosFuertes.addAll(masElementos)}")
    println("Platillos: $platosFuertes")

    // Eliminar elementos
    println("Quitar spaghetti: ${platosFuertes.remove("spaghetti")}")
    println("Platillos: $platosFuertes")

    println("Quitar arroz: ${platosFuertes.remove("arroz")}")
    println("Platillos: $platosFuertes")

    println("Quitar primer plato: ${platosFuertes.removeAt(0)}")
    println("Platillos: $platosFuertes")

    // Eliminar la lista completa
    platosFuertes.clear()
    println("Platillos: $platosFuertes")
    println("Vacio?: ${platosFuertes.isEmpty()}")
}
