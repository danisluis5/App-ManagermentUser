/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author vuongluis
 */
public class User {
    private int id;
    private String username;
    private String hoTen;
    private boolean active;

    public User(int id, String username, String hoTen, boolean active) {
        this.id = id;
        this.username = username;
        this.hoTen = hoTen;
        this.active = active;
    }
    
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getHoTen() {
        return hoTen;
    }

    public boolean isActive() {
        return active;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
}
