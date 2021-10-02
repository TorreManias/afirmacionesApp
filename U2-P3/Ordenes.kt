open class Item(val name: String, val price: Int)

class Noodles : Item("Noodles", 10) {
    override fun toString() : String {
        return name
    }
}

class Vegetables(vararg val toppings: String) : Item("Vegetables", 5) {
    override fun toString() : String {
        if (toppings.isEmpty()) {
            return "$name La eleccion del chef"
        }
        return name + " " + toppings.joinToString("/")
    }
}

class Orden(val idOrden: Int) {
    private val listaElementos = mutableListOf<Item>()

    fun agregarItem(nuevoItem: Item) : Orden {
        listaElementos.add(nuevoItem)
        return this
    }

    fun agregarTodos(newItems: List<Item>) : Orden {
        listaElementos.addAll(newItems)
        return this
    }

    fun print() {
        println("Orden #${idOrden}")
        var totalOrden = 0
        for (elem in listaElementos){
            println("- ${elem}: C$${elem.price}")
            totalOrden += elem.price
        }
        println("Total $totalOrden")
    }
}

fun main() {

    val listaDeOrdenes = mutableListOf<Orden>()

    val orden1 = Orden(1)
    orden1.agregarItem(Noodles())
    listaDeOrdenes.add(orden1)

    val orden2 = Orden(2)
    orden2.agregarItem(Noodles())
    orden2.agregarItem(Vegetables())
    listaDeOrdenes.add(orden2)

    val orden3 = Orden(3)
    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))
    orden3.agregarTodos(items)
    listaDeOrdenes.add(orden3)

    val orden4 = Orden(4).agregarItem(Noodles()).agregarItem(Vegetables("Apio", "Lechuga"))
    listaDeOrdenes.add(orden4)

    listaDeOrdenes.add(Orden(5)
                      .agregarItem(Noodles())
                      .agregarItem(Noodles())
                      .agregarItem(Vegetables("Espinaca")))

    for(orden in listaDeOrdenes){
        orden.print()
        println()
    }
}
