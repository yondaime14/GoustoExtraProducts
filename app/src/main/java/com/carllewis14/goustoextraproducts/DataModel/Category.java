
package com.carllewis14.goustoextraproducts.DataModel;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

import static android.R.attr.description;

@DatabaseTable
public class Category implements Serializable
{

    @SerializedName("id")
    @Expose
    @DatabaseField(generatedId = true)
    private String id;
    @SerializedName("title")
    @Expose
    @DatabaseField
    private String title;
    @SerializedName("box_limit")
    @Expose
    @DatabaseField
    private String boxLimit;
    @SerializedName("is_default")
    @Expose
    private Boolean isDefault;
    @SerializedName("recently_added")
    @Expose
    private Boolean recentlyAdded;
    @SerializedName("hidden")
    @Expose
    private Boolean hidden;
    @SerializedName("pivot")
    @Expose
    private Pivot pivot;

    @DatabaseField(foreign = true)
    private Datum data;

    public Category(){

    }



    public Category[] newArray(int size) {
    return (new Category[size]);
}
    private final static long serialVersionUID = -7154830504696086365L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Category withId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getBoxLimit() {
        return boxLimit;
    }

    public void setBoxLimit(String boxLimit) {
        this.boxLimit = boxLimit;
    }

    public Category withBoxLimit(String boxLimit) {
        this.boxLimit = boxLimit;
        return this;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Category withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    public Boolean getRecentlyAdded() {
        return recentlyAdded;
    }

    public void setRecentlyAdded(Boolean recentlyAdded) {
        this.recentlyAdded = recentlyAdded;
    }

    public Category withRecentlyAdded(Boolean recentlyAdded) {
        this.recentlyAdded = recentlyAdded;
        return this;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Category withHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    public Pivot getPivot() {
        return pivot;
    }

    public void setPivot(Pivot pivot) {
        this.pivot = pivot;
    }

    public Category withPivot(Pivot pivot) {
        this.pivot = pivot;
        return this;
    }

    public Datum getData() {
        return data;
    }

    public void setData(Datum data) {
        this.data = data;
    }

    public int describeContents() {
        return  0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("%02d", id)).append(" - ").append(description);
        return sb.toString();
    }



}
