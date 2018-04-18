package com.my_company.atm24_app;

public class RequestView {


    private String id_request;
    private String status; //represent a color
    private String adress;
    private String time_reaction;

    public RequestView(String id_request,String status,String adress,String time_reaction){
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
}
