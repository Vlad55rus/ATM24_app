package com.my_company.atm24_app.activitiesClasses;

import com.orm.SugarRecord;

public class LeaveRegularWorks extends SugarRecord {

    private long id_leave;
    private long id_regularWork;

    public LeaveRegularWorks(){
    }

    public LeaveRegularWorks(long id_leave,long id_regularWork){
        this.id_leave=id_leave;
        this.id_regularWork=id_regularWork;
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    public void setId_leave(long id_leave) {
        this.id_leave = id_leave;
    }

    public void setId_regularWork(long id_regularWork) {
        this.id_regularWork = id_regularWork;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    public long getId_leave() {
        return id_leave;
    }

    public long getId_regularWork() {
        return id_regularWork;
    }
}
