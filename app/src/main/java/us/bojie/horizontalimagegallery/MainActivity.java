package us.bojie.horizontalimagegallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.backends.pipeline.Fresco;

public class MainActivity extends AppCompatActivity {

    HorizontalImageGalleryView mHorizontalImageGalleryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        mHorizontalImageGalleryView = new HorizontalImageGalleryView(this);
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mHorizontalImageGalleryView.onDestroy();
    }
}
