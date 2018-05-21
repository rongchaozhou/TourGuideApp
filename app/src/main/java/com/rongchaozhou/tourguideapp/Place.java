package com.rongchaozhou.tourguideapp;

public class Place {
    private int mPlaceNameId;
    private int mPlaceChineseNameId;
    private int mPlaceAddressId;
    private int mPlacePhoneId;
    private int mImageResourceId;
    private int mPlaceDetailId;

    public Place(int placeNameId, int placeChineseNameId, int placeAddressId, int placePhoneId, int imageResourceId, int placeDetailId) {
        mPlaceNameId = placeNameId;
        mPlaceChineseNameId = placeChineseNameId;
        mPlaceAddressId = placeAddressId;
        mPlacePhoneId = placePhoneId;
        mImageResourceId = imageResourceId;
        mPlaceDetailId = placeDetailId;
    }

    public int getPlaceNameId() {
        return mPlaceNameId;
    }

    public int getPlaceChineseNameId() {
        return mPlaceChineseNameId;
    }

    public int getPlaceAdressId() {
        return mPlaceAddressId;
    }

    public int getPlacePhoneId() {
        return mPlacePhoneId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getPlaceDetailId() {
        return mPlaceDetailId;
    }
}
