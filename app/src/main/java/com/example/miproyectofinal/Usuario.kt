package com.example.miproyectofinal

import android.app.appsearch.StorageInfo
import android.content.ClipData.Item
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "usuario")
data class Usuario (
        @PrimaryKey var id: Int,
        @ColumnInfo(name ="nombre") var correo:String

        )