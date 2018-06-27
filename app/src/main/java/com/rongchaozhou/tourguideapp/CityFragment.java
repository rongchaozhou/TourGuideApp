package com.rongchaozhou.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class CityFragment extends Fragment {

    String url = "https://github.com/rongchaozhou/PICTURE/blob/master/hangzhou_fragment.png?raw=true";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_city, container, false);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.cityImage);
        Picasso.get().load(url).placeholder(R.drawable.placeholder).into(imageView);

        return rootView;
    }
}
