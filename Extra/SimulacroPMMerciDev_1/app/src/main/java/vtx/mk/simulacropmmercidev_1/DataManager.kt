package com.example.proyectosqlite4simple

import android.content.ContentValues
import android.content.Context

class DataManager(context: Context) {

    private val dbHelper = DatabaseHelper(context) //da acdeso a recursos, a la base de datos, etc

    fun addName(nombre: String) {
        val db = dbHelper.writableDatabase
        val values = ContentValues().apply { //contenvalues
            //permite almacenar claves, valor
            put(DatabaseHelper.COLUMN_NAME, nombre) //agrega una pareja clave, valor, la clave
            //en este caso es el nombre de la columna, el valor, el que introduzcamos
        }
        db.insert(DatabaseHelper.TABLE_NAME, null, values) //insertar el valor
        db.close()
    }

    fun addPerson(nombre: String, apellidos: String, direccion: String, cp: String, ciudad: String, provincia: String, telefono: String) {
        val db = dbHelper.writableDatabase
        val values = ContentValues().apply { //contenvalues
            //permite almacenar claves, valor
            put(DatabaseHelper.COLUMN_NAME, nombre) //agrega una pareja clave, valor, la clave
            put(DatabaseHelper.COLUMN_SURNAME, apellidos) //agrega una pareja clave, valor, la clave
            put(DatabaseHelper.COLUMN_DIRECTION, direccion) //agrega una pareja clave, valor, la clave
            put(DatabaseHelper.COLUMN_CP, cp) //agrega una pareja clave, valor, la clave
            put(DatabaseHelper.COLUMN_CITY, ciudad) //agrega una pareja clave, valor, la clave
            put(DatabaseHelper.COLUMN_PROVINCE, provincia) //agrega una pareja clave, valor, la clave
            put(DatabaseHelper.COLUMN_TLF, telefono) //agrega una pareja clave, valor, la clave
            //en este caso es el nombre de la columna, el valor, el que introduzcamos
        }
        db.insert(DatabaseHelper.TABLE_NAME, null, values) //insertar el valor
        db.close()
    }

    fun getAllNames(context: Context): String {
        val db = dbHelper.readableDatabase
        // crea un cursor con el resultado de la consulta, los cursores son objetos que representan filas, columnas de una tabla
        val cursor = db.rawQuery("SELECT * FROM ${DatabaseHelper.TABLE_NAME}", null)
        val names = StringBuilder() //construye cadenas de caracteres

        while (cursor.moveToNext()) {
            val name = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_NAME))
            names.append("$name\n")
        }

        cursor.close()
        db.close()

        if (names.isEmpty()) {
            return "No hay nombres en la base de datos"
        }

        return names.toString()
    }

    fun getAllUsers(context: Context): String {
        val db = dbHelper.readableDatabase
        // crea un cursor con el resultado de la consulta, los cursores son objetos que representan filas, columnas de una tabla
        val cursor = db.rawQuery("SELECT * FROM ${DatabaseHelper.TABLE_NAME}", null)
        val users = StringBuilder() //construye cadenas de caracteres

        while (cursor.moveToNext()) {
            val name = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_NAME))
            val apellidos = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_SURNAME))
            val direccion = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_DIRECTION))
            val cp = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CP))
            val ciudad = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CITY))
            val provincia = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_PROVINCE))
            val telefono = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_TLF))
            users.append("$name - $apellidos - $direccion - $cp - $ciudad - $provincia - $telefono\n")
        }

        cursor.close()
        db.close()

        if (users.isEmpty()) {
            return "No hay usuarios en la base de datos"
        }

        return users.toString()
    }

    fun deleteAll() {
        val db = dbHelper.writableDatabase
        db.delete(DatabaseHelper.TABLE_NAME, "", arrayOf())
        db.close()
    }

    fun updateName(oldName: String, newName: String) {
        val db = dbHelper.writableDatabase
        val values = ContentValues().apply {
            put(DatabaseHelper.COLUMN_NAME, newName)
        }
        db.update(DatabaseHelper.TABLE_NAME, values, "${DatabaseHelper.COLUMN_NAME}=?", arrayOf(oldName))
        db.close()
    }



}

