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

public class SightseeingFragment extends Fragment {
    public SightseeingFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> attractions = new ArrayList<Place>();
        attractions.add(new Place(R.string.attraction1_name, R.string.attraction1_chinese_name, R.string.attraction1_address, R.string.attraction1_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/attraction1.png?raw=true", R.string.attraction1_detail));
        attractions.add(new Place(R.string.attraction2_name, R.string.attraction2_chinese_name, R.string.attraction2_address, R.string.attraction2_phone,"https://github.com/rongchaozhou/PICTURE/blob/master/attraction2.png?raw=true", R.string.attraction2_detail));
        attractions.add(new Place(R.string.attraction3_name, R.string.attraction3_chinese_name, R.string.attraction3_address, R.string.attraction3_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/attraction3.png?raw=true", R.string.attraction3_detail));
        attractions.add(new Place(R.string.attraction4_name, R.string.attraction4_chinese_name, R.string.attraction4_address, R.string.attraction4_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/attraction4.png?raw=true", R.string.attraction4_detail));
        attractions.add(new Place(R.string.attraction5_name, R.string.attraction5_chinese_name, R.string.attraction5_address, R.string.attraction5_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/attraction5.png?raw=true", R.string.attraction5_detail));
        attractions.add(new Place(R.string.attraction6_name, R.string.attraction6_chinese_name, R.string.attraction6_address, R.string.attraction6_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/attraction6.png?raw=true", R.string.attraction6_detail));
        attractions.add(new Place(R.string.attraction7_name, R.string.attraction7_chinese_name, R.string.attraction7_address, R.string.attraction7_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/attraction7.png?raw=true", R.string.attraction7_detail));
        attractions.add(new Place(R.string.attraction8_name, R.string.attraction8_chinese_name, R.string.attraction8_address, R.string.attraction8_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/attraction8.png?raw=true", R.string.attraction8_detail));
        attractions.add(new Place(R.string.attraction9_name, R.string.attraction9_chinese_name, R.string.attraction9_address, R.string.attraction9_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/attraction9.png?raw=true", R.string.attraction9_detail));
        attractions.add(new Place(R.string.attraction10_name, R.string.attraction10_chinese_name, R.string.attraction10_address, R.string.attraction10_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/attraction10.png?raw=true", R.string.attraction10_detail));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), attractions);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Place placeItem = attractions.get(position);

                // Invoke PlaceActivity
                Intent intent = new Intent(getContext(), DetailActivity.class);
                intent.putExtra(getString(R.string.key_picture_id), placeItem.getImageResourceURL());
                intent.putExtra(getString(R.string.key_detail_id), placeItem.getPlaceDetailId());
                startActivity(intent);
            }
        });

        return rootView;
    }
}
