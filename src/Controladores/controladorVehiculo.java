/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;
import Modelos.Vehiculo;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan Yáñez (Brujo)
 */
public class controladorVehiculo {
    
    public String registro(String Patente, String Marca, String Modelo, String Color, String an, String pr){
        
        Vehiculo v = new Vehiculo();
        
        int Ano;
        int Precio;
        
        //int Ano = Integer.parseInt(an);
        //int Precio = Integer.parseInt(pr);
        
        v.setPatente(Patente);
        v.setMarca(Marca);
        v.setModelo(Modelo);
        v.setColor(Color);
        //v.setAno(Ano);
        //v.setPrecio(Precio);
        
        if (Patente == null || Patente.equals("") ||
            Marca == null   || Marca.equals("") ||
            Modelo == null  || Modelo.equals("") ||
            Color == null   || Color.equals("") ||
            an == null      || an.equals("") ||
            pr == null      || pr.equals("")
           ) {
            return "Favor completar todos los campos";
        }else{
            
            try{
                Ano = Integer.parseInt(an);
                Precio = Integer.parseInt(pr);
                
                v.setAno(Ano);
                v.setPrecio(Precio);
            }catch(java.lang.NumberFormatException Ex){
                return "Error al ingresar digitos";
            }
            
            if (Ano < 1950 || Ano > 2015) {
                return "El año del vehiculo no corresponde (1951 a 2015)";
            }else{
                
                if (Precio < 500000 || Precio > 50000000) {
                    return "El Precio del vehiculo no es compatible (500K a 50M)";
                }else{
                    
                    //AHORA VALIDAR PREXISTENCIA
                    
                    Vehiculo ve = new Vehiculo();
                    ve = v.buscaUno(v);
                    
                    if(ve==null){
                        if(v.insertaVehiculo(v)){
                            return "El Vehiculo fue ingresado correctamente";
                        }else{
                            return "Error al ingresar el Vehiculo";
                        }
                    }else{
                        return "La Patente ya fue registrada";
                    }
                    
                }
                
            }
            
        }
    }
    
    public DefaultTableModel modeloTabla(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Patente");
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Color");
        modelo.addColumn("Año");
        modelo.addColumn("Precio");
        
        Vehiculo v = new Vehiculo();
        ArrayList<Vehiculo> vehiculos = v.buscarTodos();
        
        // Llenando la tabla
        
        if (vehiculos==null) {
            return modelo;
        }else{
            for (int i = 0; i < vehiculos.size(); i++) {
                
                String datos[]=new String[6];
                
                datos[0]= vehiculos.get(i).getPatente();
                datos[1]= vehiculos.get(i).getMarca();
                datos[2]= vehiculos.get(i).getModelo();
                datos[3]= vehiculos.get(i).getColor();
                datos[4]= ""+vehiculos.get(i).getAno();
                datos[5]= ""+vehiculos.get(i).getPrecio();
                
                modelo.addRow(datos);
            }
        }
        
        return modelo;
    }
    
   
}
