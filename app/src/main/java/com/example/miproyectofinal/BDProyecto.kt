package com.example.miproyectofinal

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities =[Usuario::class, Cargo::class],
    version = 1
)
abstract class BDProyecto: RoomDatabase(){

    abstract fun daoUsuario(): DaoUsuario
    abstract fun daoCargo(): DaoCargo
}