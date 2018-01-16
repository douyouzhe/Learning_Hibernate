package com.dou.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_INFORMATION")
public class Student_Info{

    @Id
    private int rollNo;
    @Column(name="FULL_NAME")
    private String name;

    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
