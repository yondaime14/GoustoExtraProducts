
package com.carllewis14.goustoextraproducts.DataModel;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class GustoProducts implements Serializable, Parcelable
{

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    public final static Creator<GustoProducts> CREATOR = new Creator<GustoProducts>() {


        @SuppressWarnings({
            "unchecked"
        })
        public GustoProducts createFromParcel(Parcel in) {
            GustoProducts instance = new GustoProducts();
            instance.status = ((String) in.readValue((String.class.getClassLoader())));
            instance.meta = ((Meta) in.readValue((Meta.class.getClassLoader())));
            in.readList(instance.data, (com.carllewis14.goustoextraproducts.DataModel.Datum.class.getClassLoader()));
            return instance;
        }

        public GustoProducts[] newArray(int size) {
            return (new GustoProducts[size]);
        }

    }
    ;
    private final static long serialVersionUID = -7579681891204191864L;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GustoProducts withStatus(String status) {
        this.status = status;
        return this;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public GustoProducts withMeta(Meta meta) {
        this.meta = meta;
        return this;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public GustoProducts withData(List<Datum> data) {
        this.data = data;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeValue(meta);
        dest.writeList(data);
    }

    public int describeContents() {
        return  0;
    }

}
