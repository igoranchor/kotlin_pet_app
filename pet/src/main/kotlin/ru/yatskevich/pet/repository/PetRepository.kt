package ru.yatskevich.pet.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.yatskevich.pet.entity.Pet
import java.util.*

@Repository
interface PetRepository : JpaRepository<Pet, UUID>