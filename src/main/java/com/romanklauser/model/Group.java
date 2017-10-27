package com.romanklauser.model;

import java.util.ArrayList;


public class Group {

    private ArrayList<Customer> members = new ArrayList<Customer>();

    public Group() {}

    public Group(Customer c1, Customer c2) {
        members.add(c1);
        members.add(c2);
    }

    public void addMember(Customer customer) {
        members.add(customer);
    }

    public ArrayList<Customer> getMembers() {
        return members;
    }



}
