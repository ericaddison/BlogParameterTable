package ParmTable;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class ToolTableCellRenderer implements TableCellRenderer{

  private static final int titleFontSize = 14;
  private static final Color titleBgColor = new Color(150,200,250); 
  
  @Override
  public Component getTableCellRendererComponent(JTable table, Object value,
      boolean isSelected, boolean hasFocus, int row, int column) {
    if(column==0)
      return makeToolNameLabel((String)value);
    else{
      JScrollPane pane = (JScrollPane)value;
      // HERE IS THE PROBLEM
      table.setRowHeight(row,pane.getPreferredSize().height);
      System.out.println("yo");
      pane.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
      return pane;
    }
  }
  
  // make a nice label for the tool name column
  private JLabel makeToolNameLabel(String name){
    JLabel label = new JLabel(name+"  ");
    label.setFont(new Font(Font.SERIF,Font.BOLD,titleFontSize));
    label.setBackground(titleBgColor);
    label.setOpaque(true);
    label.setHorizontalAlignment(JLabel.RIGHT);
    label.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
    return label;
  }

}
