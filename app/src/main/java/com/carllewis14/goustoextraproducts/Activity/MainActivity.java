package com.carllewis14.goustoextraproducts.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.carllewis14.goustoextraproducts.Adapter.DataAdapter;
import com.carllewis14.goustoextraproducts.DataBase.DatabaseManager;
import com.carllewis14.goustoextraproducts.DataModel.Datum;
import com.carllewis14.goustoextraproducts.DataModel.GustoProducts;
import com.carllewis14.goustoextraproducts.Network.ApiInterface;
import com.carllewis14.goustoextraproducts.Network.RetroClient;
import com.carllewis14.goustoextraproducts.R;
import com.carllewis14.goustoextraproducts.repo.ProductRepo;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<Datum> productList;
    private DataAdapter dataAdapter;
    private ProductRepo mRepo = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);


        initViews();
        loadJson();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    //Database Init

    private void initDB()
    {
        DatabaseManager.init(this);
        mRepo = new ProductRepo(this);

    }

    private void initViews(){

        productList = new ArrayList<>();

        /**
         * Getting List and then set Adapter
         */

        listView = (ListView) findViewById(R.id.productListView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                //Convert Image to byte Array
                String strImage = productList.get(position).getImages().get500().getSrc();


                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                try {
                    intent.putExtra("imageView", strImage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                intent.putExtra("description", productList.get(position).getDescription());
                intent.putExtra("price",  "£ " + productList.get(position).getListPrice());
                intent.putExtra("title", productList.get(position).getTitle());
                try {
                    intent.putExtra("category", "Category: " + productList.get(position).getCategories().get(position).getTitle());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                startActivity(intent);

            }
        });

    }

    private void loadJson() {

        final ProgressDialog dialog;
        /**
         * Progress Dialog for User Interaction
         */
        dialog = new ProgressDialog(MainActivity.this);
        dialog.setTitle(getString(R.string.dialogTitle));
        dialog.setMessage(getString(R.string.dialogMessage));
        dialog.show();

        ApiInterface api = RetroClient.getApiService();

        Call<GustoProducts> call = api.getProductList();

        call.enqueue(new Callback<GustoProducts>() {

            @Override
            public void onResponse(Call<GustoProducts> call, Response<GustoProducts> response) {

                dialog.dismiss();
                if (response.isSuccessful()){

                    /**
                     * Got Data successfully
                     */
                    productList = response.body().getData();
                    dataAdapter = new DataAdapter(MainActivity.this, productList);
                    listView.setAdapter(dataAdapter);



                }

            }

            @Override
            public void onFailure(Call<GustoProducts> call, Throwable t) {

            }
        });
    }


    private void addDummyItems() {
        Datum list = new Datum();
        list.setTitle("Test");
        list.setDescription("test description");

        int index = mRepo.create(list);

        if(index > -1)
        {
            Log.d("ORMLiteDemo", "Products created");

            List<Datum> lists = (List<Datum>) mRepo.findAll();

        }
    }





}
