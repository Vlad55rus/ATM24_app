package com.my_company.atm24_app.activitiesClasses;

import com.orm.SugarRecord;

public class Photo extends SugarRecord {

    private String path;

    public Photo(){
    }

    public Photo(String path){
        this.path=path;
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    public String getPath() {
        return path;
    }
}
