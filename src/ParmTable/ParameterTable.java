package ParmTable;

import javax.swing.JTable;
import javax.swing.table.TableModel;

import ParameterSets.ParameterSet;


public class ParameterTable extends JTable{

  private static final long serialVersionUID = 1L;
  protected static int ROWHEIGHT = 30;

  public ParameterTable(ParameterSet parms){
    // make the table model
    TableModel m = new ParameterTableModel(parms);
    this.setModel(m);
    this.setTableHeader(null);
    this.setRowHeight(ROWHEIGHT);
  }
  
  
}
