package com.example.hayaalzawwadmidterm1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class act3 extends AppCompatActivity {
    Integer[] pics ={R.drawable.pic1, R.drawable.pic2,R.drawable.pic3,
            R.drawable.pic4};

    ImageView pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           openact2();

          button1 = (Button) findViewById(R.id.button3);
                   @Override
                                               public void onClick(View v) {
                                                   openact1();
                                               }


        GridView grid =(GridView)findViewById(R.id.gridView);
        final ImageView pic =(ImageView)findViewById(R.id.imgLarge);
        grid.setAdapter(new ImageAdapter(this));

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),"Selected pic" +
                        (position+1), Toast.LENGTH_LONG).show();



                pic.setImageResource(pics[position]);
            }
        });
    }
    public class ImageAdapter extends BaseAdapter {
        private Context context;

        public ImageAdapter(Context c){
            context = c;


        }

        @Override
        public int getCount() {
            return pics.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            pic = new ImageView((context));
            pic.setImageResource(pics[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new ViewGroup.LayoutParams(300,300));

            return pic;
        }
    }
}

//there is string thing