package com.carllewis14.goustoextraproducts.DataBase;

import android.content.Context;

/**
 * Database Manager Class
 */

public class DatabaseManager {

    static private DatabaseManager instance;

    static public void init(Context ctx) {
        if (null==instance) {
            instance = new DatabaseManager(ctx);
        }
    }

    static public DatabaseManager getInstance() {
        return instance;
    }

    private DataBaseHelper helper;
    private DatabaseManager(Context ctx) {
        helper = new DataBaseHelper(ctx);
    }

    public DataBaseHelper getHelper() {
        return helper;
    }
}
