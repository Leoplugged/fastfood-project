package br.com.zup.fastfood.model.snack

import br.com.zup.fastfood.SNACK
import br.com.zup.fastfood.model.Product

open class Snack(
    productName: String,
    productValue:Double
): Product(
    SNACK,
    productName,
    productValue
)