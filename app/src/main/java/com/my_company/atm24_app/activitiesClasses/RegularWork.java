package com.my_company.atm24_app.activitiesClasses;

import com.orm.SugarRecord;

public class RegularWork extends SugarRecord {

    private String name_work;

    RegularWork(String name_work){
        this.name_work = name_work;
    }

    public void setName_work(String name_work) {
        this.name_work = name_work;
    }

    public String getName_work() {
        return name_work;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

}
