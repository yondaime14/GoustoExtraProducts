package com.carllewis14.goustoextraproducts.repo;

import java.util.List;

/**
 * Created by carllewis on 09/05/2017.
 */

public interface Crud {

    public int create(Object item);
    public int update(Object item);
    public Object findById(int id);
    public List<?> findAll();
}
