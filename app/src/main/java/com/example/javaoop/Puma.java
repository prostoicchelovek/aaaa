package com.example.javaoop;

import android.util.Log;

public class Puma extends Cat {
    public void talk(){
        Log.i("talk()", "Meow! My name is "+ name+ ", and I'm " + age + " years old. I'm "+breed+" and "+color);
    }
}
