
package com.carllewis14.goustoextraproducts.DataModel;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Pivot implements Serializable, Parcelable
{

    @SerializedName("created_at")
    @Expose
    private String createdAt;
    public final static Creator<Pivot> CREATOR = new Creator<Pivot>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Pivot createFromParcel(Parcel in) {
            Pivot instance = new Pivot();
            instance.createdAt = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Pivot[] newArray(int size) {
            return (new Pivot[size]);
        }

    }
    ;
    private final static long serialVersionUID = -8788659772842192488L;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Pivot withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(createdAt);
    }

    public int describeContents() {
        return  0;
    }

}
