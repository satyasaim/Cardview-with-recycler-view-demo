package com.ex.cardviewusingrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    Context context;
    ArrayList personname;
    ArrayList studentname;
    ArrayList qulification;
    ArrayList mobile;
    ArrayList enquridate;
    ArrayList nfd;
    ArrayList course;

    public CustomAdapter(Context context, ArrayList personname, ArrayList studentname, ArrayList qulification, ArrayList mobile, ArrayList enquridate, ArrayList nfd, ArrayList course) {
        this.context = context;
        this.personname = personname;
        this.studentname = studentname;
        this.qulification = qulification;
        this.mobile = mobile;
        this.enquridate = enquridate;
        this.nfd = nfd;
        this.course = course;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View  view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rowlayout,viewGroup,false);

        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.student.setText((String) studentname.get(i));
        myViewHolder.enqname.setText((CharSequence) personname.get(i));
        myViewHolder.enqdate.setText((String) enquridate.get(i));
        myViewHolder.mobile.setText((CharSequence) mobile.get(i));
        myViewHolder.qualification.setText((String) qulification.get(i));
        myViewHolder.nfddate.setText((CharSequence) nfd.get(i));
        myViewHolder.course.setText((String) course.get(i));


    }

    @Override
    public int getItemCount() {
        return personname.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView student;
        TextView enqname;
        TextView qualification;
        TextView enqdate;
        TextView mobile;
        TextView nfddate;
        TextView course;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            student = itemView.findViewById(R.id.tv_studentname);
            enqname = itemView.findViewById(R.id.tv_enname);
            qualification = itemView.findViewById(R.id.tv_qualification);
            enqdate = itemView.findViewById(R.id.tv_enqdate);
            mobile = itemView.findViewById(R.id.tv_mobile);
            nfddate = itemView.findViewById(R.id.tv_nfddate);
            course = itemView.findViewById(R.id.tv_course);
        }
    }
}
