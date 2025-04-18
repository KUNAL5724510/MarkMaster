package MarkMaster.com.MarkMaster.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher {

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
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public int getClasst() {
        return classt;
    }
    public void setClasst(int classt) {
        this.classt = classt;
    }
   @Id
   @GeneratedValue
   private int id;

   @Column(name = "name")
   private String name; 

   @Column(name = "subject")
   private String subject;

   @Column(name = "tclass")
   private int classt;

}
