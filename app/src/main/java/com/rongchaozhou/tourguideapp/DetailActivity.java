package com.rongchaozhou.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    private String mImageResourceURL;
    private int mPlaceDetailId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (getIntent().getExtras() != null) {
            Bundle bundle = getIntent().getExtras();
            mImageResourceURL = bundle.getString(getString(R.string.key_picture_id));
            mPlaceDetailId = bundle.getInt(getString(R.string.key_detail_id));
        }

        ImageView detail_image_view = (ImageView) findViewById(R.id.detail_image_view);
        Picasso.get().load(mImageResourceURL).into(detail_image_view);

        TextView detail_text_view = (TextView) findViewById(R.id.detail_text_view);
        detail_text_view.setText(mPlaceDetailId);
    }
}
