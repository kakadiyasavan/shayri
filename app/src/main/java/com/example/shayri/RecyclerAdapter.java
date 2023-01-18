package com.example.shayri;

import android.app.Activity;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Locale;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.DataHolder> {

    Activity activity;
    TextToSpeech s1;
    String[] car;

    public RecyclerAdapter(MainActivity Activity, String[] car) {
        this.activity = Activity;
        this.car = car;
    }
    @NonNull
    @Override
    public DataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.list_layout,parent,false);
        return new DataHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.DataHolder holder, int i) {
        
        s1=new TextToSpeech(activity, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i != TextToSpeech.ERROR);
                  //s1.setLanguage(Locale.ENGLISH);
                  s1.setLanguage(new Locale("h1","in"));
            }
        });
        holder.textView.setText(car[i]);
        holder.speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1.speak(car[i],TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        
    }
    @Override
    public int getItemCount() {
        return car.length;
    }
    public class DataHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageButton speak;
        public DataHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.list);
            speak=view.findViewById(R.id.speech);
            
        }
    }
}
