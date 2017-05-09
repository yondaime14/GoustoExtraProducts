package com.carllewis14.goustoextraproducts.Activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.carllewis14.goustoextraproducts.R;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    //Declarable Variables
    Bundle img;
    ImageView imageView;
    Context context;
    Bitmap bitmap;
    TextView tvproductDesc;
    TextView tvProductPrice;
    TextView tvProductCat;
    TextView tvProductTitle;

    //Strings
    String description;
    String price;
    String strImage;
    String category;
    String title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent i = getIntent();


        //Get Image

        //Located TextViews in Detail layout
        description = i.getStringExtra("description");
        price = i.getStringExtra("price");
        strImage = String.valueOf(i.getStringExtra("imageView"));
        category = i.getStringExtra("category");
        title = i.getStringExtra("title");




       // Assign Values to layouts
        tvproductDesc = (TextView) findViewById(R.id.productDetailDescription);
        tvProductPrice = (TextView) findViewById(R.id.productDetailPrice);
        imageView = (ImageView) findViewById(R.id.productDetailImage);
        tvProductCat = (TextView)findViewById(R.id.category);
        tvProductTitle = (TextView)findViewById(R.id.productDetailTitle);




        /**
         * This sets the parse data from intent
         * to display on detail page
         */
        Log.d("LOG_TAG", strImage);
        tvProductTitle.setText(title);
        tvproductDesc.setText(description);
        tvProductPrice.setText(price);
        Picasso.with(this).load(strImage).resize(400,400).into(imageView);
        tvProductCat.setText(category);


    }
}
