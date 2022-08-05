package br.com.zup.fastfood.model

import br.com.zup.fastfood.utils.NEW_QTY_MSG
import br.com.zup.fastfood.utils.Utilities

abstract class Product(
    var productType: String = "",
    val productId: String,
    productQty: Double,
    var productName: String = "",
    var productValue: Double = 0.0
) {
    private var productQty: Int
    var productTotalValue = 0.0

    init {
        this.productQty = productQty.toInt()
    }

    fun productCalculator(qty: Int, productValue: Double): Double {
        Utilities.totalValue = productValue * qty.toDouble()
        return Utilities.totalValue
    }

    fun newQty() {
        print(NEW_QTY_MSG)
        val newQty = readln().toInt()
        productCalculator(newQty, productValue)
    }
}
