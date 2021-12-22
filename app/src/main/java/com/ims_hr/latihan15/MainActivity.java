package com.ims_hr.latihan15;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    GridView GV_Data;
    private String List_Huruf[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N"
            ,"O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    private int List_Icon[] = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e
            ,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k
            ,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q
            ,R.drawable.r,R.drawable.s,R.drawable.t,R.drawable.u,R.drawable.v,R.drawable.w
            ,R.drawable.x,R.drawable.y,R.drawable.z};
    GridAdapter gridAdapter;
    Grid_Adapter grid_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Inisial();
        Set_Grid();
        Listen_GV_Data();
    }

    private void Inisial() {
        GV_Data = findViewById(R.id.GridView_Main_Data);
    }

    private void Set_Grid() {
        //gridAdapter = new GridAdapter(List_Icon,List_Huruf, MainActivity.this);
        //GV_Data.setAdapter(gridAdapter);
        grid_adapter = new Grid_Adapter(List_Icon,List_Huruf,MainActivity.this,R.layout.template_grid);
        GV_Data.setAdapter(grid_adapter);
    }

    private void Listen_GV_Data() {
        GV_Data.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(MainActivity.this,DetailActivity.class);
            intent.putExtra(GlobalVar.EXTRA_HURUF,List_Huruf[position]);
            intent.putExtra(GlobalVar.EXTRA_GAMBAR,List_Icon[position]);
            startActivity(intent);
        });
    }

}
