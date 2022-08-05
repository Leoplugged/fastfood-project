package br.com.zup.fastfood.br.com.zup.fastfood.menu

import br.com.zup.fastfood.br.com.zup.fastfood.model.payment.Card
import br.com.zup.fastfood.br.com.zup.fastfood.model.payment.Money
import br.com.zup.fastfood.model.snack.Cheeseburger
import br.com.zup.fastfood.model.snack.SaladSandwich
import br.com.zup.fastfood.model.softdrink.Juice
import br.com.zup.fastfood.model.softdrink.Soda
import br.com.zup.fastfood.utils.INVALID_FORMAT
import br.com.zup.fastfood.utils.INVALID_OPTION
import br.com.zup.fastfood.utils.Utilities
import br.com.zup.fastfood.utils.Utilities.Companion.getProduct
import br.com.zup.fastfood.utils.Utilities.Companion.editProductQty
import br.com.zup.fastfood.utils.Utilities.Companion.exitSystem
import br.com.zup.fastfood.utils.Utilities.Companion.removeProduct
import br.com.zup.fastfood.utils.Utilities.Companion.showContent

import br.com.zup.fastfood.utils.WELCOME

class Menu {
    init {
        println(WELCOME)
        menuMain()
    }

    fun menuMain() {
        try {
            println(MENU_MAIN)
            when (readln().toInt()) {
                1 -> menuSnack()
                2 -> menuSoftDrink()
                3 -> exitSystem()
                else -> throw NumberFormatException()
            }
        } catch (e: NumberFormatException) {
            println(INVALID_OPTION)
            menuMain()
            //TODO Tratar todos erros com if
        } catch (e: IllegalArgumentException) {
            println(INVALID_FORMAT)
            menuMain()
        }
    }

    private fun menuSnack() {
        val newCheeseburger= Cheeseburger()
        val newSaladSandwich = SaladSandwich()
        try {
            println(MENU_SNACK)
            when (readln().toInt()) {
                1 -> {
                    getProduct(newCheeseburger)
                    menuNext()
                }
                2 -> {
                    getProduct(newSaladSandwich)
                    menuNext()
                }
                3 -> exitSystem()
                else -> throw NumberFormatException()
            }
        } catch (e: NumberFormatException) {
            println(INVALID_OPTION)
            menuSnack()
        } catch (e: IllegalArgumentException) {
            println(INVALID_FORMAT)
            menuSnack()
        }
    }

    private fun menuSoftDrink() {
        val newJuice = Juice()
        val newSoda = Soda()
        try {
            println(MENU_SODA)
            when (readln().toInt()) {
                1 -> {
                    getProduct(newJuice)
                    menuNext()
                }
                2 -> {
                    getProduct(newSoda)
                    menuNext()
                }
                3 -> exitSystem()
                else -> throw NumberFormatException()
            }
        } catch (e: NumberFormatException) {
            println(INVALID_OPTION)
            menuSoftDrink()
        } catch (e: IllegalArgumentException) {
            println(INVALID_FORMAT)
            menuSoftDrink()
        }
    }

    private fun menuNext() {
        try {
            println(MENU_NEXT)
            when (readln().toInt()) {
                1 -> menuMain()
                2 -> {
                    editProductQty()
                    menuNext()
                }
                3 -> {
                    removeProduct()
                    showContent()
                }
                4 -> {
                    if (Utilities.cart.isEmpty()){
                        println(showContent())
                    } else {
                        menuPayment()
                    }
                }
                5 -> exitSystem()
                else -> throw NumberFormatException()
            }
        } catch (e: NumberFormatException) {
            println(INVALID_OPTION)
            menuNext()
        } catch (e: IllegalArgumentException) {
            println(INVALID_FORMAT)
            menuNext()
        }
    }

    fun menuPayment() {
        try {
            println(MENU_PAYMENT)
            when (readln().toInt()) {
                1 -> Card()
                2 -> Card()
                3 -> Card()
                4 -> Money()
                5 -> exitSystem()
                else -> throw NumberFormatException()
            }
        } catch (e: IllegalArgumentException) {
            println(INVALID_FORMAT)
            menuPayment()
        } catch (e: NumberFormatException) {
            println(INVALID_OPTION)
            menuPayment()
        }
    }
}