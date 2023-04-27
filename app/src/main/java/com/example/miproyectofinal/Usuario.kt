package com.example.miproyectofinal

import android.app.appsearch.StorageInfo
import android.content.ClipData.Item
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "usuario")
data class Usuario (
@PrimaryKey(true)
val id: Int,
val nombre: String,
val apellido: String,
val edad: String,
val correo: String
        )