package com.example.wx.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "user2_event")
public class User2_event {
    @Id
    private int userID;
    @Id
    private int eventID;
}
