package com.my_company.atm24_app.activitiesClasses;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.my_company.atm24_app.R;

import java.util.ArrayList;


//TODO !!!!!! По запросу пихае в arraylist еняем флаг (boolean) и после сетим визибл по необходимости
public class StatusAdapter extends RecyclerView.Adapter<OrderAdapter.RequestViewHolder> {
    private ArrayList<Status> statusesArray;
    private Context context;

    StatusAdapter(ArrayList<Status> statusesArray, Context context) {
        this.statusesArray = statusesArray;
        this.context = context;
    }

    @Override
    public OrderAdapter.RequestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activite_status_view, parent, false);
        OrderAdapter.RequestViewHolder rvh = new OrderAdapter.RequestViewHolder(v);
        return rvh;
    }

    @Override
    public void onBindViewHolder(OrderAdapter.RequestViewHolder holder, int position) {
        //TODO Установка текста в формы для заказов из бд
        //Добавить в arraylist в классе Status и тут ловить элементы ?
        holder.btn.setBackgroundColor(Color.LTGRAY);
        holder.btn.setText("Тест");
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.btn.setBackgroundColor(Color.GRAY);//Вроде должно работать, по клику меняется цвет кнопки нажатой
            }
        });

    }

    @Override
    public int getItemCount() {
        System.out.println(statusesArray.size());
        return statusesArray.size();
    }

    public static class StatusesViewHolder extends RecyclerView.ViewHolder {

        Button btn;

        StatusesViewHolder(View itemView) {
            super(itemView);
            btn = (Button) itemView.findViewById(R.id.status);
        }
    }
}
