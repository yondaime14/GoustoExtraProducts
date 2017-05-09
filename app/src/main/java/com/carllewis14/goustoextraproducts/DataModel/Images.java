
package com.carllewis14.goustoextraproducts.DataModel;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Images implements Serializable, Parcelable
{

    @SerializedName("500")
    @Expose
    private com.carllewis14.goustoextraproducts.DataModel._500 _500;
    public final static Creator<Images> CREATOR = new Creator<Images>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Images createFromParcel(Parcel in) {
            Images instance = new Images();
            instance._500 = ((com.carllewis14.goustoextraproducts.DataModel._500) in.readValue((_500.class.getClassLoader())));
            return instance;
        }

        public Images[] newArray(int size) {
            return (new Images[size]);
        }

    }
    ;
    private final static long serialVersionUID = 227832399755651540L;

    public com.carllewis14.goustoextraproducts.DataModel._500 get500() {
        return _500;
    }

    public void set500(com.carllewis14.goustoextraproducts.DataModel._500 _500) {
        this._500 = _500;
    }

    public Images with500(com.carllewis14.goustoextraproducts.DataModel._500 _500) {
        this._500 = _500;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(_500);
    }

    public int describeContents() {
        return  0;
    }

}
