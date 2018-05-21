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

public class ShoppingFragment extends Fragment {
    public ShoppingFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> stores = new ArrayList<Place>();
        stores.add(new Place(R.string.store1_name, R.string.store1_chinese_name, R.string.store1_address, R.string.store1_phone, R.drawable.store1, R.string.store1_detail));
        stores.add(new Place(R.string.store2_name, R.string.store2_chinese_name, R.string.store2_address, R.string.store2_phone, R.drawable.store2, R.string.store2_detail));
        stores.add(new Place(R.string.store3_name, R.string.store3_chinese_name, R.string.store3_address, R.string.store3_phone, R.drawable.store3, R.string.store3_detail));
        stores.add(new Place(R.string.store4_name, R.string.store4_chinese_name, R.string.store4_address, R.string.store4_phone, R.drawable.store4, R.string.store4_detail));
        stores.add(new Place(R.string.store5_name, R.string.store5_chinese_name, R.string.store5_address, R.string.store5_phone, R.drawable.store5, R.string.store5_detail));
        stores.add(new Place(R.string.store6_name, R.string.store6_chinese_name, R.string.store6_address, R.string.store6_phone, R.drawable.store6, R.string.store6_detail));
        stores.add(new Place(R.string.store7_name, R.string.store7_chinese_name, R.string.store7_address, R.string.store7_phone, R.drawable.store7, R.string.store7_detail));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), stores);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Place placeItem = stores.get(position);

                // Invoke PlaceActivity
                Intent intent = new Intent(getContext(), DetailActivity.class);
                intent.putExtra(getString(R.string.key_picture_id), placeItem.getImageResourceId());
                intent.putExtra(getString(R.string.key_detail_id), placeItem.getPlaceDetailId());
                startActivity(intent);
            }
        });

        return rootView;
    }
}
