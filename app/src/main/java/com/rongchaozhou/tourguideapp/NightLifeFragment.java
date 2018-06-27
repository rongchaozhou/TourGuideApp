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

public class NightLifeFragment extends Fragment {
    public NightLifeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> clubs = new ArrayList<Place>();
        clubs.add(new Place(R.string.club1_name, R.string.club1_chinese_name, R.string.club1_address, R.string.club1_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/club1.png?raw=true", R.string.club1_detail));
        clubs.add(new Place(R.string.club2_name, R.string.club2_chinese_name, R.string.club2_address, R.string.club2_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/club2.png?raw=true", R.string.club2_detail));
        clubs.add(new Place(R.string.club3_name, R.string.club3_chinese_name, R.string.club3_address, R.string.club3_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/club3.png?raw=true", R.string.club3_detail));
        clubs.add(new Place(R.string.club4_name, R.string.club4_chinese_name, R.string.club4_address, R.string.club4_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/club4.png?raw=true", R.string.club4_detail));
        clubs.add(new Place(R.string.club5_name, R.string.club5_chinese_name, R.string.club5_address, R.string.club5_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/club5.png?raw=true", R.string.club5_detail));
        clubs.add(new Place(R.string.club6_name, R.string.club6_chinese_name, R.string.club6_address, R.string.club6_phone, "https://github.com/rongchaozhou/PICTURE/blob/master/club6.png?raw=true", R.string.club6_detail));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), clubs);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Place placeItem = clubs.get(position);

                /// Invoke DetailActivity
                Intent intent = new Intent(getContext(), DetailActivity.class);
                intent.putExtra(getString(R.string.key_picture_id), placeItem.getImageResourceURL());
                intent.putExtra(getString(R.string.key_detail_id), placeItem.getPlaceDetailId());
                startActivity(intent);
            }
        });

        return rootView;
    }
}
