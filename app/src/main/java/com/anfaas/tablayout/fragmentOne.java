package com.anfaas.tablayout;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragmentOne extends Fragment {

    List<users> usersList;
    Context context;
    public fragmentOne() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        usersList = new ArrayList<>();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        for (int i=0;i<10000;i++)
        {
            users usr= new users("stop "+i,i+10);
            usersList.add(usr);



        }
        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        RecyclerView.LayoutManager manager= new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(manager);
        userRAdapter userAdapter=  new userRAdapter(context,usersList);
        recyclerView.setAdapter(userAdapter);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context =context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false);
    }
}
