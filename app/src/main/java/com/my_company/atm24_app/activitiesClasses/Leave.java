package com.my_company.atm24_app.activitiesClasses;

import com.orm.SugarRecord;

public class Leave extends SugarRecord {

    private String date_begin;
    private String date_end;
    private String works; // Работы с лейаута после вбивания своих и регулярных
    private String comment;

    public Leave(){
    }

    public Leave(String date_begin,String date_end,String works, String comment){
        this.date_begin=date_begin;
        this.date_end=date_end;
        this.works=works;
        this.comment=comment;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    public String getComment() {
        return comment;
    }

    public String getDate_begin() {
        return date_begin;
    }

    public String getDate_end() {
        return date_end;
    }

    public String getWorks() {
        return works;
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setDate_begin(String date_begin) {
        this.date_begin = date_begin;
    }

    public void setDate_end(String date_end) {
        this.date_end = date_end;
    }

    public void setWorks(String works) {
        this.works = works;
    }
}
