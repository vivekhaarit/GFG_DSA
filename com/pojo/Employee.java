package com.pojo;

public class Employee {

    private int emp_id;
    private String name;


    public Employee(int emp_id, String name) {
        this.emp_id = emp_id;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getEmp_id() {
        return this.emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }


}
