/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sfauzi.tubespbo.Controller;

import com.sfauzi.tubespbo.Interface.Interface;
import com.sfauzi.tubespbo.koneksi.Koneksi;
import com.sfauzi.tubespbo.Models.Models;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author S FAUZI
 */
public class Controller implements Interface{
    PreparedStatement pr;
    
    @Override
    public Models insert(Models models) throws SQLException{
        pr=Koneksi.getConnection().prepareStatement("INSERT INTO tbl_data (id, pnama, brand, harga, jumlah) VALUES (?,?,?,?,?)");
        pr.setInt(1, models.getId());
        pr.setString(2, models.getNama());
        pr.setString(3, models.getBrand());
        pr.setString(4, models.getHarga());
        pr.setString(5, models.getJumlah());
        pr.executeUpdate();
        pr.close();
        
        return models;
    }
    
    
    @Override
    public void update(Models models) throws SQLException{
        pr=Koneksi.getConnection().prepareStatement("UPDATE tbl_data SET pnama=?, harga=?, jumlah=? WHERE id=?");
        pr.setInt(1, models.getId());
        pr.setString(2, models.getNama());
        pr.setString(3, models.getBrand());
        pr.setString(4, models.getHarga());
        pr.setString(5, models.getJumlah());
        pr.executeUpdate();
        pr.close();
    }
    
    @Override
    public void delete(int id) throws SQLException{
        
        pr = Koneksi.getConnection().prepareStatement("DELETE FROM tbl_data WHERE id=?");
        pr.setInt(1, id);
        pr.executeUpdate();
        pr.close();
    }
    
    @Override
    public List<Models> getAll() throws SQLException {
        
        Statement st = Koneksi.getConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM tbl_data");
        List<Models> dataBarang = new ArrayList<>();
        
        while(rs.next()) {
            
            Models models = new Models();
            models.setId(rs.getInt("id"));
            models.setNama(rs.getString("nama"));
            models.setNama(rs.getString("brand"));
            models.setHarga(rs.getString("harga"));
            models.setJumlah(rs.getString("jumlah"));
            dataBarang.add(models);
        }
        return dataBarang;
    }  
}
