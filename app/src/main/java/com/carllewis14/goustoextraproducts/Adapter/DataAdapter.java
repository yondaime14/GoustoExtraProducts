package com.carllewis14.goustoextraproducts.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.carllewis14.goustoextraproducts.DataModel.Datum;
import com.carllewis14.goustoextraproducts.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Data Adapter Class for Product List using Api
 *
 */

public class DataAdapter extends ArrayAdapter<Datum>{

    private List<Datum> productList;
    private Context context;
    private LayoutInflater mInflater;


    public DataAdapter(@NonNull Context context, @NonNull List<Datum> objects) {
        super(context, 0, objects);
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        productList = objects;

    }


    @Nullable
    @Override
    public Datum getItem(int position) {
        return productList.get(position);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        final ViewHolder vh;
        if (convertView == null) {
            View view = mInflater.inflate(R.layout.list_item_row, parent, false);
            vh = ViewHolder.create((RelativeLayout) view);
            view.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        Datum product = getItem(position);


        try {
            Picasso.with(context).load(product != null ? product.getImages().get500().getSrc() : null).into(vh.productImage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        vh.textViewproductTitle.setText(product != null ? product.getTitle() : null);
            vh.textViewproductPrice.setText(context.getString(R.string.poundSignPriceTV) + product.getListPrice());


        vh.rootView.getTag();


        return vh.rootView;
    }

//

    private static class ViewHolder {
        public final RelativeLayout rootView;
        public final ImageView productImage;
        public final TextView textViewproductTitle;
        public final TextView textViewproductPrice;


        private ViewHolder(RelativeLayout rootView, ImageView productImage, TextView textViewproductTitle, TextView textViewproductPrice) {
            this.rootView = rootView;
            this.productImage = productImage;
            this.textViewproductTitle = textViewproductTitle;
            this.textViewproductPrice = textViewproductPrice;
        }

        public static ViewHolder create(RelativeLayout rootView) {
            ImageView productImage = (ImageView) rootView.findViewById(R.id.productImage);
            TextView textViewproductTitle = (TextView) rootView.findViewById(R.id.tvProductTitle);
            TextView textViewproductPrice = (TextView) rootView.findViewById(R.id.tvProductPrice);
            return new ViewHolder(rootView, productImage, textViewproductTitle, textViewproductPrice);
        }
    }
}
