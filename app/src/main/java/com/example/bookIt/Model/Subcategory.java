package com.example.bookIt.Model;

public class Subcategory {
  private String  Name, Image,  Description, Price, Discount, CategoryId, WishlistItemId;

    public Subcategory() {
    }

    public Subcategory(String wishlistItemId, String name, String image, String description, String price, String discount, String menuId) {
        Name = name;
        Image = image;
        Description = description;
        Price = price;
        Discount = discount;
        CategoryId = menuId;
        WishlistItemId = wishlistItemId;
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String discount) {
        Discount = discount;
    }

    public String getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(String categoryId) {
        CategoryId = categoryId;
    }
    public String getWishlistItemId() {
        return WishlistItemId;
    }

    public void setWishlistItemId(String wishlistItemId) {
        WishlistItemId = wishlistItemId;
    }
}
