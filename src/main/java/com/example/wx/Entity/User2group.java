package com.example.wx.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "user2group")
public class User2group {
    @Id
    private int userID;
    @Id
    private int groupID;
}
