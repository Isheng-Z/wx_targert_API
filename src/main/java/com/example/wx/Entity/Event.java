package com.example.wx.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "event")
public class Event {
        @Id
        private int eventID;
        private String name;
        private int coin;
        private int duplicate;
        private int alertTime;
        private int degree;
        private int DDL;
        private int DDLTime;
        private int finished;
        private int period;
        private int comment;
}
