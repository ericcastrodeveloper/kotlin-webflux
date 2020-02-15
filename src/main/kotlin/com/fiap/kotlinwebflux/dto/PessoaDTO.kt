package com.fiap.kotlinwebflux.dto

data class PessoaDTO(
        //val - constante
        // ? -> valor não pode ser nulo
        val id: Int ? = null,
        val nome: String ? = null,
        val cpf: String ? = null
)
