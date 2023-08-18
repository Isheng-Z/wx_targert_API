package com.example.wx.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "groupinfo")
public class Groupinfo {
    @Id
    private int groupID;
    @Id
    private int eventID;
    private String password;
    private int finished;
    private String rule;
}
