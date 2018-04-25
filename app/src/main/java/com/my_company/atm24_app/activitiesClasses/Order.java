package com.my_company.atm24_app.activitiesClasses;

import com.orm.SugarDb;
import com.orm.SugarRecord;

public class Order extends SugarRecord{

    private String id_request;
    private String status;
    private String adress;
    private String time_reaction;
    

    public Order(){

    }

    public Order(String id_request, String status, String adress, String time_reaction){
        this.id_request = id_request;
        this.status = status;
        this.adress = adress;
        this.time_reaction = time_reaction;
    }

    public String getId_request() {
        return id_request;
    }

    public String getStatus() {
        return status;
    }

    public String getAdress() {
        return adress;
    }

    public String getTime_reaction() {
        return time_reaction;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setId_request(String id_request) {
        this.id_request = id_request;
    }

    public void setTime_reaction(String time_reaction) {
        this.time_reaction = time_reaction;
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public Long getId() {
        return super.getId();
    }
}
