package com.ifpr.androidapptemplate.baseclasses

data class Item(
    var endereco: String? = null,
    var numero: String = null.toString(),
    var bairro: String? = null,
    var cep: String? = null,
    val base64Image: String? = null,
    val imageUrl: String? = null
)
