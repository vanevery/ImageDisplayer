package com.example.imagedisplayer;

import java.io.IOException;
import java.io.InputStream;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView imageView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        imageView = (ImageView) this.findViewById(R.id.imageView1);
        
        
        	/*
        		BitmapFactory.Options bmpFactoryOptions = new BitmapFactory.Options();
        		bmpFactoryOptions.inSampleSize = 24;
        		
        
				Bitmap bm = BitmapFactory.decodeFile(Environment.getExternalStorageDirectory() + "/DCIM/Camera/IMG_20140211_093322.jpg", bmpFactoryOptions);
				Bitmap bm1 = BitmapFactory.decodeFile(Environment.getExternalStorageDirectory() + "/DCIM/Camera/IMG_20140211_093322.jpg", bmpFactoryOptions);
				Bitmap bm2 = BitmapFactory.decodeFile(Environment.getExternalStorageDirectory() + "/DCIM/Camera/IMG_20140211_093322.jpg", bmpFactoryOptions);
				Bitmap bm3 = BitmapFactory.decodeFile(Environment.getExternalStorageDirectory() + "/DCIM/Camera/IMG_20140211_093322.jpg", bmpFactoryOptions);
				Bitmap bm4 = BitmapFactory.decodeFile(Environment.getExternalStorageDirectory() + "/DCIM/Camera/IMG_20140211_093322.jpg", bmpFactoryOptions);
				Bitmap bm5 = BitmapFactory.decodeFile(Environment.getExternalStorageDirectory() + "/DCIM/Camera/IMG_20140211_093322.jpg", bmpFactoryOptions);
				Bitmap bm10 = BitmapFactory.decodeFile(Environment.getExternalStorageDirectory() + "/DCIM/Camera/IMG_20140211_093322.jpg", bmpFactoryOptions);
				Bitmap bm20 = BitmapFactory.decodeFile(Environment.getExternalStorageDirectory() + "/DCIM/Camera/IMG_20140211_093322.jpg", bmpFactoryOptions);
				Bitmap bm30 = BitmapFactory.decodeFile(Environment.getExternalStorageDirectory() + "/DCIM/Camera/IMG_20140211_093322.jpg", bmpFactoryOptions);
				Bitmap bm40 = BitmapFactory.decodeFile(Environment.getExternalStorageDirectory() + "/DCIM/Camera/IMG_20140211_093322.jpg", bmpFactoryOptions);
				Bitmap bm50 = BitmapFactory.decodeFile(Environment.getExternalStorageDirectory() + "/DCIM/Camera/IMG_20140211_093322.jpg", bmpFactoryOptions);

				Log.v("MAINACTIVITY", Environment.getExternalStorageDirectory() + "/DCIM/Camera/IMG_20140211_093322.jpg");
				imageView.setImageBitmap(bm);
				*/        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
    
}
