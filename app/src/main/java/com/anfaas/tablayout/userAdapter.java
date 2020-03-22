package com.anfaas.tablayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class userAdapter extends ArrayAdapter<users> {
    private static class ViewHolder {
        TextView name;
        TextView home;
    }
    List<users> usersList;
    Context context;
    public userAdapter( Context context,List<users> usersList) {
        super(context,-1,usersList);
        this.usersList=usersList;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;
        users usr = getItem(position);
        if (convertView==null) {
            holder =new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listvirew, null, false);
             holder.name = convertView.findViewById(R.id.name);
            holder.home = convertView.findViewById(R.id.score);
            convertView.setTag(holder);
        }
        else {
          holder= (ViewHolder) convertView.getTag();
        }
        holder.name.setText(usr.getName());
        holder.home.setText("" + usr.getScore());
    return  convertView;
    }
}
