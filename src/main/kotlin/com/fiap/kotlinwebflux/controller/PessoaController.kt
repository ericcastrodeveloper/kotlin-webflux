package com.fiap.kotlinwebflux.controller

import com.fiap.kotlinwebflux.dto.PessoaDTO
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import java.time.Duration

@RestController
class PessoaController {

//    @GetMapping
//    fun getPessoas() : List<PessoaDTO>{
//        return arrayListOf(
//                PessoaDTO(id = 1, cpf = "123", nome = "Fabio"),
//                PessoaDTO(id = 1, cpf = "321", nome = "Eric"),
//                PessoaDTO(id = 1, cpf = "456", nome = "Maria"));
//    }

//    @GetMapping
//    fun getPessoas() = arrayListOf(
//            PessoaDTO(id = 1, cpf = "123", nome = "Fabio"),
//            PessoaDTO(id = 1, cpf = "321", nome = "Eric"),
//            PessoaDTO(id = 1, cpf = "456", nome = "Maria"))

    //mono uma, flux varios

//    @GetMapping
//    fun getPessoas() : Flux<PessoaDTO> = Flux.create{
//
//        it.next(PessoaDTO(id = 1, cpf = "123", nome = "Fabio"))
//        it.next(PessoaDTO(id = 1, cpf = "321", nome = "Eric"))
//        it.next(PessoaDTO(id = 1, cpf = "456", nome = "Maria"))
//        it.complete()
//    }



    @GetMapping
    fun getPessoas(): Flux<PessoaDTO> = Flux.just(arrayListOf
            (PessoaDTO(id = 1, cpf = "123", nome = "Fabio"),
            (PessoaDTO(id = 1, cpf = "123", nome = "Fabio")
    ))).flatMapIterable { it }
            .delayElements(Duration.ofSeconds(2))



}