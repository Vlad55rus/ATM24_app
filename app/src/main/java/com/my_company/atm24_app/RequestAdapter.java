package com.my_company.atm24_app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;

import static android.support.v4.content.ContextCompat.startActivity;

public class RequestAdapter extends RecyclerView.Adapter<RequestAdapter.RequestViewHolder> {
    private ArrayList<RequestView> requestsArray ;
    private static final String LOG_TAG = "RequestAdapter";
    private Context context;

    RequestAdapter(ArrayList<RequestView> requestsArray, Context context) {
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
        //Установка текста в формы для заказов

        holder.request_id.setText(requestsArray.get(position).getId_request());
        //Log.d(LOG_TAG, "!!!!!! id = "+ requestsArray.get(position).getId_request());
        holder.adress_id.setText(requestsArray.get(position).getAdress());
        holder.time_id.setText(requestsArray.get(position).getTime_reaction());
        holder.btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,RequestTotalInfoActivity.class);
                //TODO В будущем нужно будет передавать id, чтобы сделать запрос из БД на след активити и достать нужную инфу
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
