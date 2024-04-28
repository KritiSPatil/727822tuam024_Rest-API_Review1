package com.example.day4post.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;
    private String address;
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDeliverypincode() {
        return deliverypincode;
    }
    public void setDeliverypincode(String deliverypincode) {
        this.deliverypincode = deliverypincode;
    }
    public String getDoctorname() {
        return doctorname;
    }
    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }
    public String getPrescriptid() {
        return prescriptid;
    }
    public void setPrescriptid(String prescriptid) {
        this.prescriptid = prescriptid;
    }
    public String getPhoneno() {
        return phoneno;
    }
    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
    private String deliverypincode;
    private String doctorname;
    private String prescriptid;
    private String phoneno;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public User(int id, String name, String email, String password,String address,String deliverypincode, String doctorname, String prescriptid, String phoneno) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address=address;
        this.deliverypincode=deliverypincode;
        this.doctorname=doctorname;
        this.prescriptid=prescriptid;
        this.phoneno=phoneno;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public User() {
    }

}
