package com.dodemy.android.filemanager.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.dodemy.android.filemanager.R;

import java.io.File;


public class ImageViewActivity extends AppCompatActivity {
    private ImageView imageFile;
    private TextView lblImageName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview);
        imageFile = (ImageView) findViewById(R.id.image_file);
        lblImageName = (TextView) findViewById(R.id.lbl_image_name);
        Intent imagePath = getIntent();
        String imageFilePath = imagePath.getStringExtra("imagePath");
        lblImageName.setText(imagePath.getStringExtra("imageName"));
        File imgFile = new File(imageFilePath);
        if (imgFile.exists()) {
            Log.d("action", imageFilePath);
            Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());
            imageFile.setImageBitmap(myBitmap);
        }
    }
}
