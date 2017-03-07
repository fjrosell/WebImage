package com.example.lof70.webimage;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class WebImageActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_image);

        WebImageView imageView = (WebImageView)findViewById(R.id.webImage);
        imageView.setPlaceholderImage(R.mipmap.ic_launcher);
        imageView.setImageUrl("http://www.um.es/gite/escudoum2.gif");
    }
}
