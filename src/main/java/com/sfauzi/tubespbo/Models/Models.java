/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sfauzi.tubespbo.Models;

/**
 *
 * @author S FAUZI
 */
public class Models {
    private int id;
    private String nama;
    private String brand;
    private String harga;   
    private String jumlah;
    
    public Models(){ 
    }
    
    public Models(int id, String nama, String brand, String harga, String jumlah){
        this.id = id;
        this.nama = nama;
        this.nama = brand;
        this.harga = harga;    
        this.jumlah = jumlah;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getId() {
        return id;
    }

    public String getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }
}
