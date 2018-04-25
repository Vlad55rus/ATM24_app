package com.my_company.atm24_app.activitiesClasses;

import com.orm.SugarRecord;

public class Status extends SugarRecord {

    private String status;
    private int color;

    public Status(){
    }

    Status(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    @Override
    public Long getId() {
        return super.getId();
    }
}
