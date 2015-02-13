package com.gtr.studyproject.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * 
 * @author xiaotian
 * @information �û����ݱ�ʵ����
 */
public class DataBaseUser extends SQLiteOpenHelper {
	/**
	 * ���ݱ���
	 */
	public static final String TABLE_ANME = "user_information_table";
	/**
	 * �û���
	 */
	public static final String USER_ANME = "user_anme";
	/**
	 * �û�����
	 */
	public static final String USER_PASSWORD = "user_password";
	/**
	 * �û����ID
	 */
	public static final String USER_ID = "user_id";
	/**
	 * �û���¼����
	 */
	public static final String USER_SIGN_ACCOUNT = "user_sign_account";

	public DataBaseUser(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_ANME + "("
				+ "id integer PRIMARY KEY," + USER_ANME + " varchar,"
				+ USER_PASSWORD + " varchar," + USER_ID + " varchar,"
				+ USER_SIGN_ACCOUNT + " integer" + ")");

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_ANME);
		onCreate(db);

	}

}
