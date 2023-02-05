/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sfauzi.tubespbo.Interface;

import com.sfauzi.tubespbo.Models.Models;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author S FAUZI
 */
public interface Interface {
    
    Models insert (Models m) throws SQLException;
    
    void update(Models m) throws SQLException;
    
    void delete(int id) throws SQLException;
    
    List<Models> getAll() throws SQLException;
    
}
