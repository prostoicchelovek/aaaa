package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.util.Log;


public class MainActivity extends AppCompatActivity {
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       Cat cat1 = new Cat();
       cat1.talk();
       Cat cat2 = new Cat(5,"Vaska","Aga","pink");
       cat2.talk();
       Cat cat3 = new Cat(33,"Murzik","submarine","yellow");
       cat3.talk();
       Cat cat4 = new Cat();
       Cat cat5 = new Cat();
       Cat cat6 = new Cat();
       Cat cat7 = new Cat();
       Log.i("count",""+Cat.count);
       Cat.CountResetter countResetter = new Cat.CountResetter();
       Log.i("count",""+Cat.count);
   }
}