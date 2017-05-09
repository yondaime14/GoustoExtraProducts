package com.carllewis14.goustoextraproducts.Network;

import com.carllewis14.goustoextraproducts.DataModel.GustoProducts;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * API Interface to
 */

public interface ApiInterface {

    @GET("/products/v2.0/products?includes[]=categories&includes[]=attributes&image_sizes[]=500")
  Call<GustoProducts> getProductList();


}
