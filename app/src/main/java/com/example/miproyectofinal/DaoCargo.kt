package com.example.miproyectofinal

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface DaoCargo {

        @Query("SELECT * FROM Cargo")
        suspend fun ObtenerCargo(): MutableList<Cargo>

        @Insert
        suspend fun agregarCargo(cargo: Cargo)

        @Query("UPDATE cargo set descripcion=:descripcion WHERE cargo=:cargo")
        suspend fun actualizarCargo(cargo: String, descripcion: String)

        @Query("DELETE FROM cargo WHERE cargo=:cargo")
        suspend fun borrarCargo(Cargo:String)


}