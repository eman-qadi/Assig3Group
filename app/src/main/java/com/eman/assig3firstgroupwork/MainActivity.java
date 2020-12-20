package com.eman.assig3firstgroupwork;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recycler = findViewById(R.id.mario);

        String[] captions= new String[MarioBakery.mariobaber.length];
        int[] ids = new int[MarioBakery.mariobaber.length];
        for (int i =0;i<captions.length ;i++){
            captions[i]=MarioBakery.mariobaber[i].getName();
            ids[i]= MarioBakery.mariobaber[i].getIdImg();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter=new Adapter(captions,ids,MainActivity.this,this);
        recycler.setAdapter(adapter);
    }

}