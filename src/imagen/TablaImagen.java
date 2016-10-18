/*
*   Test Imagen Ejemplo Tabla
*   Practica
*   con error 
*   java.lang.NullPointerException                  al visualizar!!
*   com.mysql.jdbc.MysqlDataTruncation:             al guardar!!
*   Data truncation: Data too long for column 'foto' at row 1
*/
package imagen;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class TablaImagen extends DefaultTableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,boolean isSelected,boolean hasFocus,int row,int colmn)
    {
      if(value instanceof JLabel)
      {
          JLabel lbl=(JLabel)value;
          return lbl;
      }
      return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, colmn);
    }
    
}
