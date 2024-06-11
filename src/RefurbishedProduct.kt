//Der Verkaufspreis der Klasse RefurbishedProduct ergibt sich aus dem Zustand des Produkts
//condition:
//• AS_NEW: Verkaufspreis ist gleich dem Produktionspreis
//• GOOD: Verkaufspreis ist gleich dem halben Produktionspreis
//• BAD: Verkaufspreis ist gleich einem Viertel des Produktionspreises

class RefurbishedProduct(val name: String, val productionCost: Double, var condition: RefurbishedCondition) : sellable {
    override fun calculateSellingPrice(): Double {
        return when (condition){
            RefurbishedCondition.AS_NEW -> productionCost
            RefurbishedCondition.GOOD -> productionCost / 2
            RefurbishedCondition.BAD -> productionCost / 4
        }
    }
}