package com.cs246.sharedpreferences;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.provider.ContactsContract;

/**
 * Created by Quade on 3/2/16.
 */
public final class CountDatabase {
    public CountDatabase() {
    }

    public static abstract class Database implements BaseColumns {
        public static final String TABLE_NAME = "SaveCount";
        public static final String COLUMN_NAME_COUNT = "count";
    }

    private static final String SQL_CREATE = "CREATE TABLE " + Database.TABLE_NAME + " (" +
            Database.COLUMN_NAME_COUNT + "INTEGER" +  " )";

    public class DatabaseHelper extends SQLiteOpenHelper {
        public static final int DATABASE_VERSION = 1;
        public static final String DATABASE_NAME = "SaveCount.db";

        public DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(SQL_CREATE);
        }

        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        }

        public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            onUpgrade(db, oldVersion, newVersion);
        }
    }
}
