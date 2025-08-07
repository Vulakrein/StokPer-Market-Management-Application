/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package stokper;




import java.sql.Connection;
import java.sql.DriverManager;

public class VeritabaniBaglantisi {
    public static Connection baglantiAc() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/stokper?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
        String kullanici = "root"; 
        String sifre = "";

        return DriverManager.getConnection(url, kullanici, sifre);
    }
}
