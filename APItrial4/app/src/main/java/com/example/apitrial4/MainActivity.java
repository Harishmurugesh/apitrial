package com.example.apitrial4;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    GridView gridView;
    CustonAdapter custonAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridView);

        Call<List<Animals>> call = APIclient.apIinterface().getAnimals();

        call.enqueue(new Callback<List<Animals>>() {
            @Override
            public void onResponse(Call<List<Animals>> call, Response<List<Animals>> response) {



                if(response.isSuccessful()){

                    custonAdapter = new CustonAdapter(response.body() , MainActivity.this);
                    gridView.setAdapter(custonAdapter);

                    Toast.makeText(MainActivity.this,"success",Toast.LENGTH_LONG).show();

                }else{
                    Toast.makeText(getApplicationContext(),"An error occured" ,Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<List<Animals>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"An error occured"+ t.getLocalizedMessage(),Toast.LENGTH_LONG).show();
            }
        });
    }

    public class CustonAdapter extends BaseAdapter{

        public List<Animals> animalsList;
        public Context context;

        public CustonAdapter(List<Animals> animalsList, Context context) {
            this.animalsList = animalsList;
            this.context = context;
        }

        @Override
        public int getCount() {
            return animalsList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view = LayoutInflater.from(context).inflate(R.layout.row_data,null);

            TextView name = (TextView) findViewById(R.id.textView);
            ImageView image = (ImageView) findViewById(R.id.imageView);

            name.setText(animalsList.get(position).getName());

            return view;
        }
    }
}