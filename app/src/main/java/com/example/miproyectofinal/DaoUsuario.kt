package com.example.miproyectofinal

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface DaoUsuario {

@Query("SELECT * FROM usuario")
suspend fun ObtenerUsuario(): MutableList<Usuario>

@Insert
suspend fun agregarUsuario(usuario: Usuario)

@Query("UPDATE usuario set cargo=:correo WHERE usuario=:usuario")
suspend fun actualizarUsuario(usuario: String, correo: String)

@Query("DELETE FROM usuario WHERE usuario=:usuario")
suspend fun borrarUsuario(Usuario: String)

}