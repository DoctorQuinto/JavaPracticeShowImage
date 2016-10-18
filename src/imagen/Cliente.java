/*
 * MyQuery, TheModelTeble,,,
*/
package imagen;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Desarrollo
 */
public class Cliente {

    private String nit;
    private String nom;
    private String sta;
    private String ema;
    private String dir;
    private String tel;
    private String cor;
    private String pai;
    private String nim;
    private byte[] img;
    
public Cliente(){}  
/*public Cliente (String 1, String 2,String  3, String 4, String 5, String  6, String 7, String 8, String 9, byte [] fot)
{
    this.nit = 1;
    this.nom = 2;
    this.sta = 3;
    this.ema = 4;
    this.dir = 5;
    this.tel = 6;
    this.cor = 7;
    this.pai = 8;
    this.nim = 9;
    this.img = fot;
    
}*/
// Getters
public String get_Nombre()
{
    return this.nom;
}
public String get_Nit()
{
    return this.nit;
}
public String get_Telefono()
{
    return this.tel;
}
public String get_Estatus()
{
    return this.sta;
}
public String get_Direccion()
{
    return this.dir;
}
public String get_Email()
{
    return this.ema;
}
public String get_Correo()
{
    return this.cor;
}
public String get_Pais()
{
    return this.pai;
}
public String get_NImagen()
{
    return this.nim;
}
public byte[] get_Imagen()
{
    return this.img;
}
// Setters
public void set_Nombre (String n)
{   this.nom = n;
}
public void set_Nit (String i )
{   this.nit = i ;
}
public void set_Direccion(String d)
{   this.dir = d;
}
public void set_Email (String e)
{   this.ema = e;
}
public void set_Estatus (String s)
{   this.sta = s;
}
public void set_Telefono (String t)
{   this.tel = t;
}
public void set_Correo (String c)
{   this.cor = c;
}
public void set_Pais (String p)
{   this.pai = p;
}
public void set_NImagen (String im)
{   this.nim = im;
}
public void set_Imagen (byte [] f )
{   this.img = f;
}

/*
//Para Bind table
public ArrayList<Cliente> BindTable()
{
    ArrayList<Cliente> lista = new ArrayList<Cliente>();
    Conexion con;
    Connection co = con.conectar();
    Statement st;
    ResultSet rs;
    try{
        st=co.createStatement();
        rs=st.executeQuery("select * from tbl_cliente");
        Cliente cli;
        while(rs.next())
        {    
            cli = new Cliente(
        rs.getString("nit_cliente"),
        rs.getString("nombre"),
        rs.getString("estatus"),
        rs.getString("telefono"),
        rs.getString("direccion"),
        rs.getString("telefono"),
        rs.getString("correo"),
        rs.getString("pais_region"),
        rs.getString("nombre_imagen"),
        rs.getBlob("archivo_imagen"));//Render???? el ejemplo usa getBytes uardar blob o bytes????
        lista.add(cli);
        }    
    }catch(Exception ex)
    {   
        
    }
    return lista;
}
        */
}
