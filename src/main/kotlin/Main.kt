package br.com.zup.fastfood

import br.com.zup.fastfood.br.com.zup.fastfood.menu.Menu
import br.com.zup.fastfood.utils.WELCOME

fun main() {
    val menu = Menu()
    println(WELCOME)
    menu.menuMain()
}