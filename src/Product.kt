
// 2.2 Interface implementieren
// Die Funktion calculateSellingPrice soll den Verkaufspreis der Produkte bestimmen.

// Der Verkaufspreis eines normalen Produkts ergibt sich aus dem Dreifachen des Produktions-
//preises, solange das Produkt erst seit 14 Tagen oder weniger auf dem Markt ist (Eigenschaft
//daysSinceRelease. Andernfalls ergibt sich der Verkaufspreis aus dem Zweifachen des Produk-
//tionspreises.

class Product(val name: String, val productionCost: Double, private var daysSinceRelease: Int) : sellable {
    override fun calculateSellingPrice(): Double {
        return if (daysSinceRelease <=14) {
            productionCost * 3
        } else {
            productionCost * 2
        }
    }
}