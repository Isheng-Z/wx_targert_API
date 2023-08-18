package com.example.wx.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "activity")
public class Activity {
    @Id
    private int userID;
    private int finishedID;
    private int coin;
    private int begintime;
    private int endtime;
}
