package com.config;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MyConfig {

    private static final String DB_URL = "jdbc:mysql://localhost:3307/db_sisfo";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";
    
    private static Connection connect;
    private static Statement statement;
    private static ResultSet resultset;

    public static void connection(){
        try {
             connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection: Gagal");
        }
    }

    // READ
    public static void getDatabase(){
        MyConfig.connection();
        try {
            statement = connect.createStatement();
            resultset = statement.executeQuery("SELECT * FROM tb_barang ORDER BY ID DESC");

            while(resultset.next()){
                System.out.println(
                    resultset.getString("Nama") + ": Rp."+
                    resultset.getString("Harga") + " (" +
                    resultset.getString("Jumlah") + ")"
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void insertData(){
        String namaBaru;
        long hargaBaru;
        int jumlahBaru;

        Scanner input = new Scanner(System.in);

        System.out.print("Nama  : ");
        namaBaru = input.nextLine();

        System.out.print("Harga : ");
        hargaBaru = input.nextLong();

        System.out.print("Jumlah : ");
        jumlahBaru = input.nextInt();

        MyConfig.connection();

        try {
            statement = connect.createStatement();
            statement.executeUpdate("INSERT INTO `tb_barang` (`ID`, `Nama`, `Harga`, `Jumlah`) VALUES (NULL, '"+namaBaru+"', '"+hargaBaru+"', '"+jumlahBaru+"')");

            System.out.println("Data berhasil di simpan");

            statement.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void EditData(){
        int jumlah = 45;
        try {
            statement = connect.createStatement();
            statement.executeUpdate("UPDATE `tb_barang` SET `Jumlah` = '"+jumlah+"', WHERE `tb_barang`.`ID` = 7;");

            System.out.println("Data berhasil di Update");

            statement.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void DeleteData(){
        MyConfig.connection();
        try {
            statement = connect.createStatement();
            statement.executeQuery("DELETE FROM `tb_barang` WHERE `tb_barang`.`ID` = 7;");
            statement.close();

            System.out.println("Data berhasil di Delete");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
