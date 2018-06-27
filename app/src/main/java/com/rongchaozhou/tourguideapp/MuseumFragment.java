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
        museums.add(new Place(R.string.museum1_name, R.string.museum1_chinese_name, R.string.museum1_address, R.string.museum1_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/museum1.png?raw=true", R.string.museum1_detail));
        museums.add(new Place(R.string.museum2_name, R.string.museum2_chinese_name, R.string.museum2_address, R.string.museum2_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/museum2.png?raw=true", R.string.museum2_detail));
        museums.add(new Place(R.string.museum3_name, R.string.museum3_chinese_name, R.string.museum3_address, R.string.museum3_phone,"https://github.com/rongchaozhou/PICTURE/blob/master/museum3.png?raw=true", R.string.museum3_detail));
        museums.add(new Place(R.string.museum4_name, R.string.museum4_chinese_name, R.string.museum4_address, R.string.museum4_phone,"https://github.com/rongchaozhou/PICTURE/blob/master/museum4.png?raw=true", R.string.museum4_detail));
        museums.add(new Place(R.string.museum5_name, R.string.museum5_chinese_name, R.string.museum5_address, R.string.museum5_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/museum5.png?raw=true", R.string.museum5_detail));
        museums.add(new Place(R.string.museum6_name, R.string.museum6_chinese_name, R.string.museum6_address, R.string.museum6_phone,"https://github.com/rongchaozhou/PICTURE/blob/master/museum6.png?raw=true", R.string.museum6_detail));
        museums.add(new Place(R.string.museum7_name, R.string.museum7_chinese_name, R.string.museum7_address, R.string.museum7_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/museum7.png?raw=true", R.string.museum7_detail));
        museums.add(new Place(R.string.museum8_name, R.string.museum8_chinese_name, R.string.museum8_address, R.string.museum8_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/museum8.png?raw=true", R.string.museum8_detail));
        museums.add(new Place(R.string.museum9_name, R.string.museum9_chinese_name, R.string.museum9_address, R.string.museum9_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/museum9.png?raw=true", R.string.museum9_detail));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), museums);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Place placeItem = museums.get(position);

                // Invoke DetailActivity
                Intent intent = new Intent(getContext(), DetailActivity.class);
                intent.putExtra(getString(R.string.key_picture_id), placeItem.getImageResourceURL());
                intent.putExtra(getString(R.string.key_detail_id), placeItem.getPlaceDetailId());
                startActivity(intent);
            }
        });

        return rootView;
    }
}
