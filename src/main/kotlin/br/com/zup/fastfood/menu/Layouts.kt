package br.com.zup.fastfood.br.com.zup.fastfood.menu

import br.com.zup.fastfood.*
import br.com.zup.fastfood.utils.*

// ---- Layout ----
const val MENU_MAIN = PAGE_BREAK+"\n" +
        SELECT_OPTION+"\n" +
        "[1] "+ SNACK +"\n" +
        "[2] "+ SOFT_DRINK +"\n" +
        "[3] "+ EXIT
const val MENU_SNACK = PAGE_BREAK+"\n" +
        SELECT_OPTION+"\n" +
        "[1] "+ CHEESEBURGER +"\n" +
        "[2] "+ SALAD_SANDWICH +"\n" +
        "[3] "+ EXIT
const val MENU_SODA = PAGE_BREAK+"\n" +
        SELECT_OPTION+"\n" +
        "[1] "+ JUICE +"\n" +
        "[2] "+ SODA +"\n" +
        "[3] "+ EXIT
const val MENU_NEXT = PAGE_BREAK+"\n" +
        SELECT_OPTION+"\n" +
        "[1] "+ ADD_ITEM +"\n" +
        "[2] "+ EDIT_ITEM +"\n" +
        "[3] "+ RM_ITEM +"\n" +
        "[4] "+ FINISH_PURCHASE +"\n" +
        "[5] "+ EXIT
const val MENU_PAYMENT = PAGE_BREAK+"\n" +
        SELECT_OPTION+"\n" +
        "[1] "+ CREDIT_CARD +"\n" +
        "[2] "+ DEBIT_CARD +"\n" +
        "[3] "+ TICKET +"\n" +
        "[4] "+ MONEY +"\n" +
        "[5] "+ EXIT