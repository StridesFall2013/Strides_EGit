package com.usf.strides;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class StridesDBManager {
	// DB for Striders table
	private static final String STRIDERS_DB_TABLE = "striders";
	private static final String STRIDERS_KEY_STRIDERNAME = "_striderName";
	private static final String STRIDERS_MEMO = "_striderMemo";
	private static final String STRIDERS_PASSWORD = "_striderPassword";
	private static final String STRIDERS_EMAIL = "_striderEmail";
	private static final String STRIDERS_RAITING = "_striderRaiting";
	
	// DB for Strides table
	private static final String STRIDES_DB_TABLE = "striders";
	private static final String STRIDES_KEY_ROWID = "_id";
	private static final String STRIDES_STRIDE = "_strideStr";
	private static final String STRIDES_TERM = "_strideTerm";
	
	private Context context;
	private SQLiteDatabase database;
	private StridesDBHelper dbHelper;
	
	public StridesDBManager(Context context) {
		this.context = context;
	}
	
	public void open() throws SQLException {
		dbHelper = new StridesDBHelper(context);
		database = dbHelper.getWritableDatabase();
	}
	
	public void close() {
		dbHelper.close();
	}
	
	private ContentValues createStriderValues(String name, 
			String memo, 
			String password, 
			String email, 
			int raiting)
	{
		ContentValues values = new ContentValues();
		values.put(STRIDERS_KEY_STRIDERNAME, name);
		values.put(STRIDERS_MEMO, memo);
		values.put(STRIDERS_PASSWORD, password);
		values.put(STRIDERS_EMAIL, email);
		values.put(STRIDERS_RAITING, raiting);
		return values;
	}
	
	public long createStrider(String name, 
			String memo, 
			String password, 
			String email, 
			int raiting)
	{
		ContentValues initialValues = createStriderValues(name, memo, password, email, raiting);
		return database.insert(STRIDERS_DB_TABLE, null, initialValues);
	}
	
	// Update the striders database
	public boolean updateStriders(String name, 
			String memo, 
			String password, 
			String email, 
			int raiting)
	{
		ContentValues updateValues = createStriderValues(name, memo, password, email, raiting);
		return database.update(STRIDERS_DB_TABLE, updateValues, STRIDERS_KEY_STRIDERNAME + "=" + name, null) > 0;
	}
	
	public boolean deleteStrider(String name) {
		return database.delete(STRIDERS_DB_TABLE, STRIDERS_KEY_STRIDERNAME + "=" + name, null) > 0;
	}
	
	// Retrieves every strider from the database for the search function
	public Cursor getAllStriders() {
		return database.query(STRIDERS_DB_TABLE, new String[] {STRIDERS_KEY_STRIDERNAME}, 
				null, null, null, null, "order by " + STRIDERS_KEY_STRIDERNAME + " asc");
	}
	
	// Retrieving the Striders name from the database
	public Cursor getSpecificStriderName(String striderName) {
		Cursor mCursor = database.query(STRIDERS_DB_TABLE, new String[] {STRIDERS_KEY_STRIDERNAME}, 
				STRIDERS_KEY_STRIDERNAME + "=" + striderName, null, null, null, null);
		if(mCursor != null) {
			mCursor.moveToFirst();
		}
		return mCursor;
	}
	
	// Retrieving the Striders Memo from the database
	public Cursor getSpecificStriderMemo(String striderName) {
		Cursor mCursor = database.query(STRIDERS_DB_TABLE, new String[] {STRIDERS_MEMO}, 
				STRIDERS_KEY_STRIDERNAME + "=" + striderName, null, null, null, null);
		if(mCursor != null) {
			mCursor.moveToFirst();
		}
		return mCursor;
	}
	
	// Retrieving the Striders Raiting from the database
	public Cursor getSpecificStriderRaiting(String striderName) {
		Cursor mCursor = database.query(STRIDERS_DB_TABLE, new String[] {STRIDERS_RAITING}, 
				STRIDERS_KEY_STRIDERNAME + "=" + striderName, null, null, null, null);
		if(mCursor != null) {
			mCursor.moveToFirst();
		}
		return mCursor;
	}
}
