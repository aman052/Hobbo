package com.pcon.hobbo.Models;

public class SearchFragmentItemsModel {
    private int mItemImage;
    private String mItemName;
    private String mItemAddress;
    private String mItemActiveMembers;
    private String mItemRating;

    public int getmItemImage() {
        return mItemImage;
    }

    public void setmItemImage(int mItemImage) {
        this.mItemImage = mItemImage;
    }

    public String getmItemName() {
        return mItemName;
    }

    public void setmItemName(String mItemName) {
        this.mItemName = mItemName;
    }

    public String getmItemAddress() {
        return mItemAddress;
    }

    public void setmItemAddress(String mItemAddress) {
        this.mItemAddress = mItemAddress;
    }

    public String getmItemActiveMembers() {
        return mItemActiveMembers;
    }

    public void setmItemActiveMembers(String mItemActiveMembers) {
        this.mItemActiveMembers = mItemActiveMembers;
    }

    public String getmItemRating() {
       return mItemRating;
    }

    public void setmItemRating(String mItemRating) {
        this.mItemRating = mItemRating;
    }

    public SearchFragmentItemsModel(int mItemImage, String mItemName, String mItemAddress, String mItemActiveMembers, String mItemRating) {
        this.mItemImage = mItemImage;
        this.mItemName = mItemName;
        this.mItemAddress = mItemAddress;
        this.mItemActiveMembers = mItemActiveMembers;
        this.mItemRating = mItemRating;
    }
}
