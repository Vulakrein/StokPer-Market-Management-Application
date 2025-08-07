/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stokper;

/**
 *
 * @author sniff
 */
public class user {
    private String kad;
    private int yetki; // 1-admin, 2-yonetici, 3-personel

    public user(String username, int yetki) {
        this.kad = username;
        this.yetki = yetki;
        
    }

    public String getkad() {
        return kad;
    }

    public int getYetki() {
        return yetki;
    }
}
