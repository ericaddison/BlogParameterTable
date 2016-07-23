package ParmTable;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.TableModel;

import Tools.Tool;

public class ToolTable extends JTable{

  private static final long serialVersionUID = 1L;

  public ToolTable(List<Tool<?>> tools) {
    
    // make the table model
    TableModel m = new ToolTableModel(tools);
    this.setModel(m);
    this.setDefaultRenderer(Object.class,new ToolTableCellRenderer());
    int w = 120;
    this.getColumnModel().getColumn(0).setMaxWidth(w);
    this.getColumnModel().getColumn(0).setMinWidth(w);
    this.setTableHeader(null);
  }
  
}
