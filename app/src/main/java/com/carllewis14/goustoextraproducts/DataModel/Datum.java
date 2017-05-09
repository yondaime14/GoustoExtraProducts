
package com.carllewis14.goustoextraproducts.DataModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.util.List;

@DatabaseTable(tableName = "productsTable")
public class Datum implements Serializable
{

    @SerializedName("id")
    @Expose
    @DatabaseField(generatedId = false)
    private String id;

    @SerializedName("sku")
    @Expose
    @DatabaseField
    private String sku;

    @SerializedName("title")
    @Expose
    @DatabaseField
    private String title;


    @SerializedName("description")
    @Expose
    @DatabaseField
    private String description;

    @SerializedName("list_price")
    @Expose
    @DatabaseField
    private String listPrice;


    @SerializedName("is_vatable")
    @Expose
    @DatabaseField
    private Boolean isVatable;

    @SerializedName("is_for_sale")
    @Expose
    private Boolean isForSale;

    @SerializedName("age_restricted")
    @Expose
    private Boolean ageRestricted;
    @SerializedName("box_limit")
    @Expose
    private String boxLimit;
    @SerializedName("always_on_menu")
    @Expose
    private Boolean alwaysOnMenu;
    @SerializedName("created_at")
    @Expose
    private String createdAt;

    @SerializedName("categories")
    @Expose
    private List<Category> categories;

    @SerializedName("attributes")
    @Expose
    private List<Attribute> attributes;


    @SerializedName("images")
    @Expose
    @DatabaseField
    private Images images;


    public Datum() {

    }


    public Datum[] newArray(int size) {
            return (new Datum[size]);
        }

   // }


    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append("id=").append(id);
        return sb.toString();

    }

    private final static long serialVersionUID = -2707453200081199480L;

    /**
     * Constructure
     * @param id
     */
    public Datum(String id, String title, String description, String listPrice) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.listPrice = listPrice;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Datum withId(String id) {
        this.id = id;
        return this;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Datum withSku(String sku) {
        this.sku = sku;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Datum withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Datum withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getListPrice() {
        return listPrice;
    }

    public void setListPrice(String listPrice) {
        this.listPrice = listPrice;
    }

    public Datum withListPrice(String listPrice) {
        this.listPrice = listPrice;
        return this;
    }

    public Boolean getIsVatable() {
        return isVatable;
    }

    public void setIsVatable(Boolean isVatable) {
        this.isVatable = isVatable;
    }

    public Datum withIsVatable(Boolean isVatable) {
        this.isVatable = isVatable;
        return this;
    }

    public Boolean getIsForSale() {
        return isForSale;
    }

    public void setIsForSale(Boolean isForSale) {
        this.isForSale = isForSale;
    }

    public Datum withIsForSale(Boolean isForSale) {
        this.isForSale = isForSale;
        return this;
    }

    public Boolean getAgeRestricted() {
        return ageRestricted;
    }

    public void setAgeRestricted(Boolean ageRestricted) {
        this.ageRestricted = ageRestricted;
    }

    public Datum withAgeRestricted(Boolean ageRestricted) {
        this.ageRestricted = ageRestricted;
        return this;
    }

    public String getBoxLimit() {
        return boxLimit;
    }

    public void setBoxLimit(String boxLimit) {
        this.boxLimit = boxLimit;
    }

    public Datum withBoxLimit(String boxLimit) {
        this.boxLimit = boxLimit;
        return this;
    }

    public Boolean getAlwaysOnMenu() {
        return alwaysOnMenu;
    }

    public void setAlwaysOnMenu(Boolean alwaysOnMenu) {
        this.alwaysOnMenu = alwaysOnMenu;
    }

    public Datum withAlwaysOnMenu(Boolean alwaysOnMenu) {
        this.alwaysOnMenu = alwaysOnMenu;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Datum withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Datum withCategories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public Datum withAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public Datum withImages(Images images) {
        this.images = images;
        return this;
    }

    public int describeContents() {
        return  0;
    }

}
