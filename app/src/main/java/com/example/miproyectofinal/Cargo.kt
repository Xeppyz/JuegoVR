package com.example.miproyectofinal

import androidx.room.*
import java.io.FileDescriptor


@Entity
data class Cargo(

    @PrimaryKey var id: Int,
    @ColumnInfo(name ="Descripcion") var descripcion:String

)