package com.rongchaozhou.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumFragment extends Fragment {
    public MuseumFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> museums = new ArrayList<Place>();
        museums.add(new Place(R.string.museum1_name, R.string.museum1_chinese_name, R.string.museum1_address, R.string.museum1_phone, R.drawable.museum1, R.string.museum1_detail));
        museums.add(new Place(R.string.museum2_name, R.string.museum2_chinese_name, R.string.museum2_address, R.string.museum2_phone, R.drawable.museum2, R.string.museum2_detail));
        museums.add(new Place(R.string.museum3_name, R.string.museum3_chinese_name, R.string.museum3_address, R.string.museum3_phone, R.drawable.museum3, R.string.museum3_detail));
        museums.add(new Place(R.string.museum4_name, R.string.museum4_chinese_name, R.string.museum4_address, R.string.museum4_phone, R.drawable.museum4, R.string.museum4_detail));
        museums.add(new Place(R.string.museum5_name, R.string.museum5_chinese_name, R.string.museum5_address, R.string.museum5_phone, R.drawable.museum5, R.string.museum5_detail));
        museums.add(new Place(R.string.museum6_name, R.string.museum6_chinese_name, R.string.museum6_address, R.string.museum6_phone, R.drawable.museum6, R.string.museum6_detail));
        museums.add(new Place(R.string.museum7_name, R.string.museum7_chinese_name, R.string.museum7_address, R.string.museum7_phone, R.drawable.museum7, R.string.museum7_detail));
        museums.add(new Place(R.string.museum8_name, R.string.museum8_chinese_name, R.string.museum8_address, R.string.museum8_phone, R.drawable.museum8, R.string.museum8_detail));
        museums.add(new Place(R.string.museum9_name, R.string.museum9_chinese_name, R.string.museum9_address, R.string.museum9_phone, R.drawable.museum9, R.string.museum9_detail));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), museums);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Place placeItem = museums.get(position);

                // Invoke DetailActivity
                Intent intent = new Intent(getContext(), DetailActivity.class);
                intent.putExtra(getString(R.string.key_picture_id), placeItem.getImageResourceId());
                intent.putExtra(getString(R.string.key_detail_id), placeItem.getPlaceDetailId());
                startActivity(intent);
            }
        });

        return rootView;
    }
}
