package com.my_company.atm24_app.activitiesClasses;

import com.orm.SugarRecord;

public class OwnWork extends SugarRecord {

    private String name_work;

    public OwnWork(){
    }

    public OwnWork(String name_work){
        this.name_work=name_work;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    public String getName_work() {
        return name_work;
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    public void setName_work(String name_work) {
        this.name_work = name_work;
    }
}
