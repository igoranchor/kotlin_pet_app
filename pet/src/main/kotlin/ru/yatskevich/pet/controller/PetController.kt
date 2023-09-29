package ru.yatskevich.pet.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.yatskevich.pet.service.PetService
import java.util.UUID

@RestController
@RequestMapping("/pets")
class PetController(private val petService: PetService) {

    @GetMapping("/{id}")
    fun getPet(@PathVariable id: UUID) = petService.getPet(id)

}