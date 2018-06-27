package com.rongchaozhou.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.image);
        Picasso.get().load(currentPlace.getImageResourceURL()).into(imageView);

        TextView placeName = listItemView.findViewById(R.id.placeName_text_view);
        placeName.setText(currentPlace.getPlaceNameId());

        TextView placeChineseName = listItemView.findViewById(R.id.placeChineseName_text_view);
        placeChineseName.setText(currentPlace.getPlaceChineseNameId());

        TextView placeAddress = listItemView.findViewById(R.id.placeAddress_text_view);
        placeAddress.setText(currentPlace.getPlaceAdressId());

        TextView placePhone = listItemView.findViewById(R.id.placePhone_text_view);
        placePhone.setText(currentPlace.getPlacePhoneId());

        return listItemView;
    }
}
