package vtx.mk.simulacropmmercidev_1

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "empresa.db"
        const val TABLE_NAME = "datos_personales"
        const val COLUMN_ID = "_id"
        const val COLUMN_NAME = "nombre"
        const val COLUMN_SURNAME = "apellidos"
        const val COLUMN_DIRECTION = "direccion"
        const val COLUMN_CP = "cp"
        const val COLUMN_CITY = "ciudad"
        const val COLUMN_PROVINCE = "provincia"
        const val COLUMN_TLF = "telefono"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val CREATE_TABLE = "CREATE TABLE $TABLE_NAME ($COLUMN_ID INTEGER PRIMARY KEY, $COLUMN_NAME TEXT, $COLUMN_SURNAME TEXT, $COLUMN_DIRECTION TEXT, $COLUMN_CP TEXT, $COLUMN_CITY TEXT, $COLUMN_PROVINCE TEXT, $COLUMN_TLF TEXT)"
        db.execSQL(CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }


}
