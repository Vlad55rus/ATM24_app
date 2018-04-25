package com.my_company.atm24_app.activitiesClasses;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.my_company.atm24_app.R;

import java.util.ArrayList;

//TODO !!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class RegularWorkAdapter extends RecyclerView.Adapter<OrderAdapter.RequestViewHolder> {
    private ArrayList<RegularWork> worksArray;
    private Context context;
    private TextView textView;
    private String result="";

    RegularWorkAdapter(ArrayList<Status> statusesArray, Context context, TextView textView) {
        this.worksArray = worksArray;
        this.context = context;
        this.textView = textView;
    }

    @Override
    public OrderAdapter.RequestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_work_view, parent, false);
        OrderAdapter.RequestViewHolder rvh = new OrderAdapter.RequestViewHolder(v);
        return rvh;
    }

    @Override
    public void onBindViewHolder(OrderAdapter.RequestViewHolder holder, int position) {
        //TODO Установка текста в формы для заказов из бд
        //Установка текста с кнопки, в который он попадает из бд ??
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result+= holder.btn.getText();
                textView.setText(result);
            }
        });
    }

    @Override
    public int getItemCount() {
        System.out.println(worksArray.size());
        return worksArray.size();
    }

    public static class RegularWorkViewHolder extends RecyclerView.ViewHolder {

        Button btn;

        RegularWorkViewHolder(View itemView) {
            super(itemView);
            btn = (Button) itemView.findViewById(R.id.workBtn);
        }
    }
}