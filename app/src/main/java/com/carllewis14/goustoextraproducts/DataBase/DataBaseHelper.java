package com.carllewis14.goustoextraproducts.DataBase;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.carllewis14.goustoextraproducts.DataModel.Datum;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

/**
 * Created by carllewis on 09/05/2017.
 */

public class DataBaseHelper extends OrmLiteSqliteOpenHelper {


    // name of the database
    private static final String DATABASE_NAME = "Products.sqlite";

    //
    private static final int DATABASE_VERSION = 1;

   private SQLiteDatabase db;
    private Dao<Datum, Integer> productDao = null;
    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {

        try {

            this.db = db;
            Log.i(DataBaseHelper.class.getName(), "onCreate");

            TableUtils.createTable(connectionSource, Datum.class);

        } catch (SQLException e) {
            Log.e(DataBaseHelper.class.getName(), "Can't create database", e);
            throw new RuntimeException(e);
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource, int oldVersion, int newVersion) {

        try {
            Log.i(DataBaseHelper.class.getName(), "onUpgrade");
            TableUtils.dropTable(connectionSource, Datum.class, true);
            onCreate(db, connectionSource);
        } catch (SQLException e) {
            Log.e(DataBaseHelper.class.getName(), "Can't drop databases", e);
            throw new RuntimeException(e);
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        super.close();
    }

    public Dao<Datum, Integer> getProductDao() throws SQLException {
        if (productDao == null) {
            try {
                productDao = getDao(Datum.class);
            } catch (java.sql.SQLException e) {
                e.printStackTrace();
            }
        }
        return productDao;
    }


}
