package com.example.miproyectofinal

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.FileDescriptor


@Entity
data class Cargo(
    @PrimaryKey(true)
    val id: Int,
    val nombre: String,
    val descripcion: String


)