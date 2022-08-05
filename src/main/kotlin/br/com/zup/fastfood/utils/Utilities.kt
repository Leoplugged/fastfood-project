package br.com.zup.fastfood.utils

import br.com.zup.fastfood.CURRENCY
import br.com.zup.fastfood.model.Product
import kotlin.system.exitProcess

class Utilities {
    companion object {
        private var productId = 100
        private const val productName = ""
        private const val productValue = 0.0
        private var productTotalValue = 0.0
        val cart = mutableMapOf<Int,Product>()
        var cartTotalValue = 0.0
        var totalValue = 0.0

        fun getProduct(newProduct: Product) {
            newProduct.productCalculator(insertQty(), newProduct.productValue)
            addProductCart(newProduct)
            showContent()
        }

        fun editProductQty(){
            print(EDIT_ITEM_MSG)
            showContent()
            val identifiedProductId = searchProductId()
            if (identifiedProductId in cart) {
                cart[identifiedProductId]?.newQty()
                println(EDITED_MSG)
                showContent()
            } else {
                println(INVALID_CODE)
                editProductQty()
            }
        }

        fun removeProduct() {
            print(REMOVE_ITEM_MSG)
            showContent()
            val identifiedProductId = searchProductId()
            if (identifiedProductId in cart) {
                    cart.remove(identifiedProductId)
                    println(REMOVED_MSG)
                    showContent()
            } else {
                println(INVALID_CODE)
                removeProduct()
            }
        }

        //TODO Finalizar
        fun finishPurchase(){
            //TODO Go to menuPayment()
        }

        fun exitSystem() {
            println(LEAVING)
            exitProcess(0)
        }

        //TODO Mudar para Cart daqui para baixo
        fun addProductCart(newProduct: Product): Int {
            productId += 1
            cart[productId] = newProduct
            return productId
        }

        fun showProductInfo(){
            println(
                " | $qty | ${productName} | $CURRENCY ${insertFormattedValue(productValue)} | $CURRENCY" +
                        insertFormattedValue(productCalculator(qty, productValue)))
        }

        fun showContent() {
            println(CART_CONTENTS)
            if (cart.isEmpty()) {
                println(EMPTY_CART)
            } else {
                cart.forEach { _ ->
                    println("$productId"+"${showProductInfo()}")
                }
            }
            println(CART_VALUE+insertFormattedValue(cartCalculator()))
        }

        fun productCalculator(qty: Int, productValue: Double): Double {
            totalValue = productValue * qty.toDouble()
            return totalValue
        }

        //TODO Mudar para Cart
        fun cartCalculator(): Double {
            var totalValue = 0.0
            cart.forEach { (_) ->
                totalValue += productTotalValue
            }
            cartTotalValue = totalValue
            return cartTotalValue
        }

        fun insertQty(): Int {
            return try {
                print(QTY_MSG)
                qty = readln().toInt()
                return qty
            } catch (ex: IllegalArgumentException) {
                println(INVALID_FORMAT)
                insertQty()
            }
        }

        var qty = 0
            set(value) {
                if (value > 0){
                    field = value
                }
                else{
                    println(NEGATIVE_VALUE_MSG)
                    insertQty()
                }
            }

        fun searchProductId(): Int {
            val identifyProductId = readln().toInt()
            return try { identifyProductId }
            catch (e: IllegalArgumentException) {
                searchProductId()
            }
        }

        fun insertFormattedValue(value: Double): String {
            return println("%.2f".format(value)).toString()
        }
    }
}