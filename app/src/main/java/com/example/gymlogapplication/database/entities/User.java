/*
 * @author: Manuel Caro
 * @date: November 2025
 * Assignment: HW3 - Gym Log Application
 */


package com.example.gymlogapplication.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.gymlogapplication.database.GymLogDatabase;

import java.util.Objects;

/**
 * Entity class representing a User in the database.
 */
@Entity(tableName = GymLogDatabase.USER_TABLE)
public class User {
    /**
     * Primary key for the User table.
     * Requirement: @PrimaryKey(autoGenerate = true)
     */
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String username;
    private String password;
    private boolean isAdmin;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        isAdmin = false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && isAdmin == user.isAdmin && Objects.equals(username, user.username) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, isAdmin);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
