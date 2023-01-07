package com.example.serverse;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;

public class DbHandler  extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "usersdb";
    private static final String TABLE_Users = "userdetails";
    private static final String KEY_ID = "id";
    private static final String KEY_EMAIL = "emailreg";
    private static final String KEY_PASS = "passwordreg";

    public DbHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        String CREATE_TABLE = "CREATE TABLE " + TABLE_Users +
                "(" + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + KEY_EMAIL + " TEXT,"
                + KEY_PASS + " TEXT" +
                ")";
        db.execSQL(CREATE_TABLE);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_Users);
        onCreate(db);

    }

    void insertUserDetails(String emailreg, String passwordreg) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cValues = new ContentValues();
        cValues.put(KEY_EMAIL, emailreg);
        cValues.put(KEY_PASS, passwordreg);

        long newRowId = db.insert(TABLE_Users, null, cValues);
        db.close();
    }

    @SuppressLint("Range")
    public ArrayList<HashMap<String, String>> GetUsers() {
        SQLiteDatabase db = this.getWritableDatabase();
        ArrayList<HashMap<String, String>> userList = new ArrayList<>();
        String query = "SELECT emailreg, passwordreg FROM " +
                TABLE_Users;
        Cursor cursor = db.rawQuery(query, null);
        while (cursor.moveToNext()) {
            HashMap<String, String> user = new HashMap<>();

            user.put("email", cursor.getString(cursor.getColumnIndex(KEY_EMAIL)));

            user.put("password", cursor.getString(cursor.getColumnIndex(KEY_PASS)));

            userList.add(user);
        }
        return userList;
    }

    public Boolean checkuser(String email) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from usersdb where emailreg = ? ", new String[]{email});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;
    }

    public Boolean checkuserpassword(String email, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from usersdb where emailreg = ? and passwordreg = ?", new String[]{email, password});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;


    }
}

