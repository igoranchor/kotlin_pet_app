package ru.yatskevich.pet.entity

import jakarta.persistence.*
import java.util.*

@Table
@Entity
data class Pet(

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    val id: UUID = UUID.randomUUID(),

    @Column(name = "name", nullable = false, length = 1000)
    val name: String

)
