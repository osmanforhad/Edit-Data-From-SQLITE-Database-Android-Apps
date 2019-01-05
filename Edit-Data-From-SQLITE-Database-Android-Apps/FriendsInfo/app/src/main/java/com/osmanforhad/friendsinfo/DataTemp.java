package com.osmanforhad.friendsinfo;

public class DataTemp {
    //Declare Variable for database table column
    private int id;
    private String name;
    private String contact;
    //Define an Constructor Method and pass parameter
    public DataTemp(String n, String c){
        //Create object for those  parameter using variable
        name = n;
        contact = c;

    }
    /*Setup Get and Set Method for all variable
    *Which will get and set data
    */
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }
}
