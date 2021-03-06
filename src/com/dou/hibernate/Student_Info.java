package com.dou.hibernate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="STUDENT_INFORMATION")
public class Student_Info{

    @Id @GeneratedValue
    private int rollNo;
    //@Transient
    @Column(name="FULL_NAME", nullable = false)
    private String name;
//    @Temporal(TemporalType.DATE)
//    private Date birthDay;
//    public Date getBirthDay() {
//        return birthDay;
//    }
//
//    public void setBirthDay(Date birthDay) {
//        this.birthDay = birthDay;
//    }

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
