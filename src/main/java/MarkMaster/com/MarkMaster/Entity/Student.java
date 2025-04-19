package MarkMaster.com.MarkMaster.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
   
    @GeneratedValue
    @Column(name = "id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClasst() {
        return sclass;
    }

    public void setClasst(int classt) {
        this.sclass = classt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "name")
    private String name;

    @Column(name = "sclass")
    private int sclass;

    @Column(name = "phone")
    private String phone;
}
