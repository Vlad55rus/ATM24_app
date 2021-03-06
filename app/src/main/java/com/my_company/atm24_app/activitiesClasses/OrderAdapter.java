package com.my_company.atm24_app.activitiesClasses;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.my_company.atm24_app.R;

import java.util.ArrayList;

import static android.support.v4.content.ContextCompat.startActivity;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.RequestViewHolder> {
    private ArrayList<Order> requestsArray ;
    private Context context;

    OrderAdapter(ArrayList<Order> requestsArray, Context context) {
        this.requestsArray = requestsArray;
        this.context = context;
    }

    @Override
    public RequestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_request_view, parent, false);
        RequestViewHolder rvh = new RequestViewHolder(v);
        return rvh;
    }

    @Override
    public void onBindViewHolder(RequestViewHolder holder, int position) {
        //TODO Установка текста в формы для заказов из бд
        holder.request_id.setText(String.format("Заявка - %s", requestsArray.get(position).getId_request()));
        holder.adress_id.setText(String.format("Адрес: %s", requestsArray.get(position).getAdress()));
        holder.time_id.setText(String.format("Время реагирования: %s", requestsArray.get(position).getTime_reaction()));

        switch(requestsArray.get(position).getStatus()){
            case "1111":
                holder.btn.setBackgroundColor(Color.GREEN);
                break;
            case "1234":
                holder.btn.setBackgroundColor(Color.YELLOW);
                break;
        }

        holder.btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,OrderTotalInfoActivity.class);
                startActivity(context,intent,null);
            }
        });
    }

    @Override
    public int getItemCount() {
        System.out.println(requestsArray.size());
        return requestsArray.size();
    }

    public static class RequestViewHolder extends RecyclerView.ViewHolder {

        TextView request_id;
        TextView adress_id;
        TextView time_id;
        Button btn;

        RequestViewHolder(View itemView) {
            super(itemView);
            request_id = (TextView) itemView.findViewById(R.id.request_id);
            adress_id = (TextView) itemView.findViewById(R.id.adress_id);
            time_id = (TextView) itemView.findViewById(R.id.time_id);
            btn = (Button) itemView.findViewById(R.id.btn);
        }
    }
}
