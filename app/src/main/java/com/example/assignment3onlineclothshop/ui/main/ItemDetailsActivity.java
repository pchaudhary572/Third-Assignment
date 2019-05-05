package com.example.assignment3onlineclothshop.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.CircularPropagation;
import android.widget.TextView;

import com.example.assignment3onlineclothshop.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemDetailsActivity extends AppCompatActivity {

    TextView name, description, price;
    CircleImageView circleImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);

        name = findViewById(R.id.detailName);
        description = findViewById(R.id.detailDescription);
        price = findViewById(R.id.detailPrice);
        circleImageView = findViewById(R.id.detailImgView);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            circleImageView.setImageResource(bundle.getInt("image"));
            name.setText(bundle.getString("name"));
            price.setText(bundle.getString("price"));
            description.setText(bundle.getString("description"));

        }
    }
}
