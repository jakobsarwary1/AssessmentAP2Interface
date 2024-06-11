

fun main(){
    val p1 = Product("iPhone 15", 533.0, 3)
    val p2 = Product("iPhone 14", 280.0, 400)
    val p3 = RefurbishedProduct("iPad Pro", 422.0, RefurbishedCondition.AS_NEW)
    val p4 = RefurbishedProduct("Apple Pencil", 98.2, RefurbishedCondition.BAD)

    println("${p1.name} Selling price: ${p1.calculateSellingPrice()}")
    println("${p2.name} Selling price: ${p2.calculateSellingPrice()}")
    println("${p3.name} Selling price: ${p3.calculateSellingPrice()}")
    println("${p4.name} Selling price: ${p4.calculateSellingPrice()}")
}