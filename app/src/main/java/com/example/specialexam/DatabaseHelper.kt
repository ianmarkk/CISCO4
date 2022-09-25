package com.example.specialexam

import android.database.sqlite.SQLiteOpenHelper
import android.database.sqlite.SQLiteDatabase
import android.content.ContentValues
import android.content.Context

class DatabaseHelper(context: Context?) : SQLiteOpenHelper(context, DATABASE_NAME, null, 1) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE user(ID INTEGER PRIMARY KEY AUTOINCREMENT, username TEXT, password TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXIST user")
    }

    fun Insert(username: String?, password: String?): Boolean {
        val sqLiteDatabase = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put("username", username)
        contentValues.put("password", password)
        val result = sqLiteDatabase.insert("user", null, contentValues)
        return if (result == -1L) {
            false
        } else {
            true
        }
    }

    fun CheckUsername(username: String): Boolean {
        val sqLiteDatabase = this.writableDatabase
        val cursor =
            sqLiteDatabase.rawQuery("SELECT * FROM user WHERE username=?", arrayOf(username))
        return if (cursor.count > 0) {
            false
        } else {
            true
        }
    }

    fun CheckLogin(username: String, password: String): Boolean {
        val sqLiteDatabase = this.readableDatabase
        val cursor = sqLiteDatabase.rawQuery(
            "SELECT * FROM user WHERE username=? AND password=?",
            arrayOf(username, password)
        )
        return if (cursor.count > 0) {
            true
        } else {
            false
        }
    }

    companion object {
        const val DATABASE_NAME = "login.db"
    }
}