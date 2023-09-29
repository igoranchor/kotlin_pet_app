package ru.yatskevich.pet

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.yatskevich.pet.entity.Pet

@Repository
interface PetRepository : JpaRepository<Pet, Long>