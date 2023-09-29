package ru.yatskevich.pet.service

import org.springframework.stereotype.Service
import ru.yatskevich.pet.entity.Pet
import ru.yatskevich.pet.repository.PetRepository
import java.util.*

@Service
class PetService(private val petRepository: PetRepository) {

    fun getPet(petId: UUID): Pet = petRepository.findById(petId).orElseThrow { Exception() }
}