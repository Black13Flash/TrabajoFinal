/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan Yáñez (Brujo)
 */
public class Vehiculo {
    private String Patente; // Primary KEY

    private Vehiculo(String Patente, String Marca, String Modelo, String Color, int Ano, int Precio) {
        
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String Patente) {
        this.Patente = Patente;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
    
    public Vehiculo() {
    }
    
    // Las demas variables
    
    private String Marca;
    private String Modelo;
    private String Color;
    private int Ano;
    private int Precio;

    private Statement state; // Ejecuta la querys
    private ResultSet res;   // Guarda una consulta SELECT
    
    public boolean insertaVehiculo(Vehiculo v){
        
        Conexion con=new Conexion();
        
        String query = "INSERT INTO Vehiculo VALUES('"+v.getPatente()+"','"
                +v.getMarca()+"','"
                +v.getModelo()+"','"
                +v.getColor()+"','"
                +v.getAno()+"','"
                +v.getPrecio()
                +"')";
        
        try {
            state = con.usaConexion().createStatement();
            if(state.executeUpdate(query) > 0)
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            con.cierraConexion();
        }
        return false;
    }
    
    public boolean eliminarVehiculo(Vehiculo v){
        
        Conexion con=new Conexion();
        
        String query ="DELETE FROM Vehiculo WHERE patente='"+v.getPatente()+"'";
        
        try {
            state = con.usaConexion().createStatement();
            if (state.execute(query)) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            con.cierraConexion();
        }
        return false;
    }
    
    
    
    // BUSCA 1
    
    public Vehiculo buscaUno(Vehiculo v){
        
        String query="SELECT * FROM Vehiculo WHERE Patente='"+v.getPatente()+"'";
        
        Conexion con = new Conexion();
        
        Vehiculo ve=null;
        
        try {
            state = con.usaConexion().createStatement();
            res = state.executeQuery(query);
            
            while(res.next()){
                ve = new Vehiculo();
                ve.setPatente(res.getString("Patente"));
                ve.setMarca(res.getString("Marca"));
                ve.setModelo(res.getString("Modelo"));
                ve.setColor(res.getString("Color"));
                ve.setAno(res.getInt("Ano"));
                ve.setPrecio(res.getInt("Precio"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            con.cierraConexion();
        }
        return ve;
    }
    
    // BUSCA TODOS
    
    public ArrayList<Vehiculo> buscarTodos(){
        
        String query="SELECT * FROM Vehiculo";
        
        Conexion con = new Conexion();
        
        ArrayList<Vehiculo> vei=null;
        
        try {
            state = con.usaConexion().createStatement();
            res = state.executeQuery(query);
            
            vei = new ArrayList<>();
            
            while(res.next()){
                
                vei.add(
                        new Vehiculo (res.getString("Patente"),
                                      res.getString("Marca"),
                                      res.getString("Modelo"),
                                      res.getString("Color"),
                                      res.getInt("Ano"),
                                      res.getInt("Precio")
                                     )
                      );
                
            }
            
            return vei;
            
        } catch (SQLException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            con.cierraConexion();
        }
        return vei;
    }

}
