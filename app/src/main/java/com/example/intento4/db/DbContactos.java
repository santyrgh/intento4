package com.example.intento4.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class DbContactos  extends  DbHelper{
    Context context; /*esto se utilizara mas tarde*/

    public DbContactos(@Nullable Context context) {
        super(context);
        this.context = context;
    }
    public long insertarContacto(String nombre, String telefono, String correro_electronico ){
        long id = 0;
        try {
            DbHelper dbHelper = new DbHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();/*Para escribir en la base de datos */
            ContentValues values = new ContentValues();/*Contenedor de valores*/
            values.put("nombre",nombre);/*Guardado para clave valor*/
            values.put("telefono",telefono);
            values.put("correro_electronico",correro_electronico);
            id = db.insert(TABLE_CONTACTO, null , values);/* guardamos el id del resgistro guardado*/
        }catch (Exception ex){
            ex.toString();
        }
        return id;
    }
}
