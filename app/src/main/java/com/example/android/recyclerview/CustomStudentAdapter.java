package com.example.android.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by pc on 12/7/2017.
 */

public class CustomStudentAdapter extends RecyclerView.Adapter<CustomStudentAdapter.ViewHoldeer>{

    List<Student> studentList = new ArrayList<>();

    @Override
    public ViewHoldeer onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // inflate the custom layout
        View view = inflater.inflate(R.layout.recycleview_row, parent, false);

        // return a new holder instance
        ViewHoldeer viewHoldeer = new ViewHoldeer(view);
        return viewHoldeer;
    }

    @Override
    public void onBindViewHolder(ViewHoldeer holder, int position) {

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class ViewHoldeer extends RecyclerView.ViewHolder{
        @BindView(R.id.student)
        TextView student;

        public ViewHoldeer(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);



        }
    }
}
