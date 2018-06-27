package com.rongchaozhou.tourguideapp;

public class Place {
    private int mPlaceNameId;
    private int mPlaceChineseNameId;
    private int mPlaceAddressId;
    private int mPlacePhoneId;
    private String mImageResourceURL;
    private int mPlaceDetailId;

    public Place(int placeNameId, int placeChineseNameId, int placeAddressId, int placePhoneId, String imageResourceURL, int placeDetailId) {
        mPlaceNameId = placeNameId;
        mPlaceChineseNameId = placeChineseNameId;
        mPlaceAddressId = placeAddressId;
        mPlacePhoneId = placePhoneId;
        mImageResourceURL = imageResourceURL;
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

    public String getImageResourceURL() {
        return mImageResourceURL;
    }

    public int getPlaceDetailId() {
        return mPlaceDetailId;
    }
}
