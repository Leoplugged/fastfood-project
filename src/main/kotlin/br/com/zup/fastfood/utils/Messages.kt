package br.com.zup.fastfood.utils

import br.com.zup.fastfood.CURRENCY

// ---- Layout ----
const val WELCOME = ":: Bem vinde ao FastFood da SimCity ::"
const val ID_PRODUCT = "Cód."
const val QTY_PRODUCT = "Qtdd."
const val PRODUCT_NAME = "Nome do Produto"
const val TOTAL_VALUE = "Valor total"
const val SELECT_OPTION = "Selecione uma das opções abaixo: "
const val ADD_ITEM = "Adicionar outro item"
const val EDIT_ITEM = "Editar item do carrinho"
const val RM_ITEM = "Remover item do carrinho"
const val CREDIT_CARD = "Cartão de crédito"
const val DEBIT_CARD = "Cartão de débito"
const val TICKET = "Vale refeição"
const val MONEY = "Dinheiro"
const val FINISH_PURCHASE = "Finalizar compra"
const val EXIT = "Sair da Aplicação"
const val QTY_MSG = "Insira a quantidade do produto: \n"
const val EDIT_ITEM_MSG = "Qual item abaixo cuja quantidade deseja modificar?\n"
const val EDITED_MSG = "Quantidade do item editado com sucesso\n"
const val NEW_QTY_MSG = "Digite nova quantidade do produto: \n"
const val REMOVE_ITEM_MSG = "Qual item abaixo deseja remover do Carrinho?\n"
const val REMOVED_MSG = "Item removido com sucesso\n"
const val INVALID_CODE = "Código Inválido\n"
const val CART_CONTENTS = ":: Lista de produtos adicionados no Carrinho ::\n$ID_PRODUCT | $QTY_PRODUCT | $PRODUCT_NAME"+
        " | $TOTAL_VALUE\n"
const val CART_VALUE = "Valor total do Carrinho: $CURRENCY "
const val EMPTY_CART = "Nenhum produto adicionado no Carrinho por ora."
const val SUCCESS_PAYMENT = "Compra finalizada com sucesso! Boa refeição."
const val VALUE_MSG = "Insira o valor do pagamento: \n"
const val MISSING_VALUE_MSG = "Faltou $CURRENCY "
const val CHANGE_VALUE_MSG = "Insira o valor do pagamento: \n"


// ---- System Message ----

const val PAGE_BREAK = " - - - - - - - - - - - - - - - - - - "
const val INVALID_OPTION = "Opção inválida, tente novamente"
const val INVALID_FORMAT = "Formato inválido. Informe o número do item"
const val INVALID_VALUE = "Valor inválido. Informe o valor do pagamento"
const val NEGATIVE_VALUE_MSG = "O valor não deve ser negativo"
const val LEAVING = "Saindo da Aplicação. À Bientôt!"