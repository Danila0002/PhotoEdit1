package com.example.photoedit;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EditImageActivity extends AppCompatActivity {
    Bitmap selectedimage;
    ImageView photoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_image);
        Init();
    }

    private void Init() {
        ImageView photo = findViewById(R.id.imageView);
        selectedimage=MainActivity.selectedImage;
        photoView.setImageBitmap(selectedimage);
    }

    public void Rotate_90(View view) {
        Matrix matrix=new Matrix();
        matrix.setRotate((float)90);
        selectedimage=Bitmap.createBitmap(selectedimage,0, 0, selectedimage.getWidth(), selectedimage.getHeight(), matrix,false);
        photoView.setImageBitmap(selectedimage);
    }

    public void Reflect (View view) {
        Matrix matrix=new Matrix();
        matrix.setScale(-1,1);
        selectedimage=Bitmap.createBitmap(selectedimage,0, 0, selectedimage.getWidth(), selectedimage.getHeight(), matrix,false);
        photoView.setImageBitmap(selectedimage);
    }
}
