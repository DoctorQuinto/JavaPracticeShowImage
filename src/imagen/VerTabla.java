/*
*   Test Imagen Ejemplo Tabla
*   Practica
*   con error 
*   java.lang.NullPointerException                  al visualizar!!
*   com.mysql.jdbc.MysqlDataTruncation:             al guardar!!
*   Data truncation: Data too long for column 'foto' at row 1
*/
package imagen;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class VerTabla {

    public void visualizar_tabla (JTable tabla)
    {
        Conexion conn = new Conexion();
        Connection con =  conn.conectar();
        ResultSet rs = conn.visualizar();
        
        tabla.setDefaultRenderer(Object.class, new TablaImagen());//Renderizamos y se podra ver imagenes
        
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Nombre");
        dt.addColumn("Foto");
        try
        {
            while(rs.next())
            {
                Object[] fila = new Object[2];
                fila[0]=rs.getObject(1);//corresponde a nombre en tb
                
                //Para  tratar Binarios
                Blob blob = rs.getBlob(3);//(10)//Obtiene el valor binario de la columna 3
                byte[]data= blob.getBytes(1,(int)blob.length());// Convierte en un arreglo de bytes
                BufferedImage img = null;//
                try
                {
                    img = ImageIO.read(new ByteArrayInputStream(data));//Crea un BufferedImage del cual se obitiene imageicon
                }
                catch(Exception ex)
                {
                    System.out.println("Error Stream Byte ArrayInputStream: "+ex); 
                }
                ImageIcon icono = new ImageIcon(img);
                fila[1] = new JLabel(icono);//1 == corresponde a foto en tb
                
                dt.addRow(fila);
            }
        tabla.setModel(dt);
        tabla.setRowHeight(85);
            
        }catch(Exception ex)
        {
            System.out.println("Error visualizar tabla while next: "+ex); 
        }
        
    }
    
}
