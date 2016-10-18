/*
*   Test Imagen Ejemplo Tabla
*   Practica
*   con error 
*   java.lang.NullPointerException                  al visualizar!!
*   com.mysql.jdbc.MysqlDataTruncation:             al guardar!!
*   Data truncation: Data too long for column 'foto' at row 1
*/
package imagen;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Desarrollo
 */
public class Conexion {

   //Para usar imagenes Nuevo!!!!!!!!!
    public Connection conectar()
    {
        Connection con = null;
        //con.FnBoolConnectionOpen("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/punto_de_venta", "bambinodecocha", "alfasis");
        String url = "jdbc:mysql://localhost/punto_de_venta";//Driver servidor base de datos
        try{
            Class.forName("com.mysql.jdbc.Driver");//Espcificación del driver
            con = DriverManager.getConnection(url,"bambinodecocha", "alfasis");
            System.out.println("En linea jdbc:Mysql lclhst pv");
            }
        catch(Exception ex)
        {   System.out.println("Error: "+ex);
        }
        return con;
    }
    public ResultSet visualizar ()//Para el caso de usuario
    {   Connection con = conectar();
        ResultSet rs = null;
        try{
            PreparedStatement ps = con.prepareStatement("Select * from usuario");//("Select * from tbl_cliente");//
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println("Error ResultSest: "+e); 
        }
        return rs;
    }
     public void guardar(String ruta, String nombre)
    {
        Connection con = conectar();        //  1     2
        String insert = "insert into usuario (nombre,foto) values (?,?)";
        FileInputStream fi = null;
        PreparedStatement ps = null;
        try{
            File file = new File(ruta); // Crea un archivo File con la ruta
            fi = new FileInputStream(file); // Crea FileInputStream del File(ruta) 
            
            ps = con.prepareStatement(insert);
            
            ps.setString(1, nombre);
            ps.setBinaryStream(2, fi); // Inserta con setBynaryStream(FileInputStream(new File(ruta)));
            
            ps.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Error guardar:imagen Conexion: "+ex); 
        }
    }
    /*
    public void guardar(String nit, String nom, String est, String mail, String dir, String tel , String cor, String pai, String nim, String ruta)
    {
        Connection con = conectar();
        String insert = "insert into tbl_cliente (nit_cliente,nombre,estatus,email,direccion,telefono,correo, pais_region, nombre_imagen, archivo_imagen) values (?,?,?,?,?,?,?,?,?,?)";
        entrada = null;
        PreparedStatement ps = null;
        try{
            File file = new File(ruta);
            entrada = new FileInputStream(file);
            
            ps = con.prepareStatement(insert);
            ps.setString(0, nit);
            ps.setString(1, nom);
            ps.setString(2, est);
            ps.setString(3, mail);
            ps.setString(4, dir);
            ps.setString(5, tel);
            ps.setString(6, cor);
            ps.setString(7, pai);
            ps.setString(8, nim);
            ps.setBinaryStream(9, entrada);
            ps.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Error guardar:imagen: "+ex); 
        }
    }*/
    
}
