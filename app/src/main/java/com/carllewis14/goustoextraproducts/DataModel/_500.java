
package com.carllewis14.goustoextraproducts.DataModel;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class _500 implements Serializable, Parcelable
{

    @SerializedName("src")
    @Expose
    private String src;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("width")
    @Expose
    private Integer width;
    public final static Creator<_500> CREATOR = new Creator<_500>() {


        @SuppressWarnings({
            "unchecked"
        })
        public _500 createFromParcel(Parcel in) {
            _500 instance = new _500();
            instance.src = ((String) in.readValue((String.class.getClassLoader())));
            instance.url = ((String) in.readValue((String.class.getClassLoader())));
            instance.width = ((Integer) in.readValue((Integer.class.getClassLoader())));
            return instance;
        }

        public _500 [] newArray(int size) {
            return (new _500[size]);
        }

    }
    ;
    private final static long serialVersionUID = -6052724713798416829L;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public _500 withSrc(String src) {
        this.src = src;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public _500 withUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public _500 withWidth(Integer width) {
        this.width = width;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(src);
        dest.writeValue(url);
        dest.writeValue(width);
    }

    public int describeContents() {
        return  0;
    }

}
