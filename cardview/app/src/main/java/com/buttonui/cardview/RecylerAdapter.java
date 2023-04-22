package com.buttonui.cardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecylerAdapter  extends RecyclerView.Adapter<RecylerAdapter.PersonViewHolder> {


    private List<persons>personsList;
    public  RecylerAdapter(List<persons>personsList){this.personsList = personsList;}

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {

        persons person = personsList.get(position);
        holder.txt.setText(person.getTxt());
        holder.img.setImageResource(person.getImg());

    }

    @Override
    public int getItemCount() {

        return personsList.size();
    }
    public static class PersonViewHolder extends  RecyclerView.ViewHolder
    {
        public TextView txt;
        public ImageView img;
        public  PersonViewHolder(View itemView){
            super(itemView);
            txt = itemView.findViewById(R.id.brandtext);
            img = itemView.findViewById(R.id.logopic);
        }
    }
}
