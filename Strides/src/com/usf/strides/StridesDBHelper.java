package com.usf.strides;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

@SuppressWarnings("unused")
public class StridesDBHelper extends SQLiteOpenHelper {
	private static final String DB_NAME = "strider_db";
	private static final int DB_VERSION = 1;
	
	public static final String CREATE_STRIDER_TABLE = 
					"create table striders(" +
					"_striderName text not null primary key, " +
					"_striderMemo text, " +
					"_striderPassword text not null, " +
					"_striderEmail text not null, " +
					"_striderRaiting int)";
	private static final String CREATE_STRIDE_TABLE = 
					"create table strides(" +
					"_id integer primary key autoincrement, " +
					"_strideStr text not null, " +
					"_strideTerm int not null)";

	public StridesDBHelper(Context context) {
		super(context, DB_NAME, null, DB_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase database) {
		database.execSQL(CREATE_STRIDER_TABLE);
		database.execSQL(CREATE_STRIDE_TABLE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		database.execSQL("DROP TABLE IF EXISTS striders");
		database.execSQL("DROP TABLE IF EXISTS strides");
	}

}
