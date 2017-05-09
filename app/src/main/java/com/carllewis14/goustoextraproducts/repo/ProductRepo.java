package com.carllewis14.goustoextraproducts.repo;

import android.content.Context;
import android.database.SQLException;

import com.carllewis14.goustoextraproducts.DataBase.DataBaseHelper;
import com.carllewis14.goustoextraproducts.DataBase.DatabaseManager;
import com.carllewis14.goustoextraproducts.DataModel.Datum;

import java.util.List;

/**
 * Created by carllewis on 09/05/2017.
 */

public class ProductRepo implements Crud{

    private DataBaseHelper helper;

    public ProductRepo(Context context)
    {
        DatabaseManager.init(context);
        helper = DatabaseManager.getInstance().getHelper();
    }

    @Override
    public int create(Object item) {

        int index = -1;

        Datum object = (Datum) item;
        try {
            index = helper.getProductDao().create(object);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }

        return index;

    }


    @Override
    public int update(Object item) {

        int index = -1;

        Datum object = (Datum) item;

        try {
            helper.getProductDao().update(object);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }

        return index;
    }


    @Override
    public Object findById(int id) {

        Datum productList = null;
        try {
            productList = helper.getProductDao().queryForId(id);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }


    @Override
    public List<?> findAll() {

        List<Datum> items = null;

        try {
            items =  helper.getProductDao().queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }

        return items;
    }
}
