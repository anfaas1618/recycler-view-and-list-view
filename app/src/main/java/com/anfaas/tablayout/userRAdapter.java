package com.anfaas.tablayout;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class userRAdapter extends RecyclerView.Adapter<userRAdapter.MyHolder> {
    List <users> usersList;
    Context context;
    static class MyHolder extends  RecyclerView.ViewHolder{
         TextView name;
         TextView score;
        public MyHolder( View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            score=itemView.findViewById(R.id.score);

        }

    }
    userRAdapter (Context context,List<users> usersList)
    {
        this.usersList=usersList;
        this.context=context;

    }

    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myview = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listvirew, parent, false);
        return  new MyHolder(myview);
    }

    @Override
    public void onBindViewHolder(@NonNull userRAdapter.MyHolder holder, int position) {
   users usr= usersList.get(position);
holder.name.setText(usr.getName());
holder.score.setText(""+usr.getScore());
    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }
}
