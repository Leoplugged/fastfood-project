package br.com.zup.fastfood.model.softdrink

import br.com.zup.fastfood.SODA
import br.com.zup.fastfood.model.Product

open class SoftDrink(
    productName: String,
    productValue: Double
): Product(
    SODA,
    productName,
    productValue
)