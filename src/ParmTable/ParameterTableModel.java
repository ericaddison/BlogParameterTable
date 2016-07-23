package ParmTable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import ParameterSets.ParameterSet;


public class ParameterTableModel extends AbstractTableModel{

  private static final long serialVersionUID = 1L;
  private ParameterSet parms;
  private List<String[]> data;
  
  public ParameterTableModel(ParameterSet parms) {
    this.parms = parms;
    updateData();
  }
  
  @Override
  public int getColumnCount() {
    return 2;
  }

  @Override
  public int getRowCount() {
    if(data==null)
      return 0;
    return data.size();
  }

  @Override
  public String getValueAt(int rowIndex, int columnIndex) {
    if(data==null)
      return null;
    return data.get(rowIndex)[columnIndex%2];
  }

  
  // update the table
  private void updateData(){
    
    data = new ArrayList<String[]>(parms.getNParms());
    
    // fill the table data array
    for(String name : parms.getParmNames()){
      String[] newRow = new String[2];
      newRow[0] = name;
      newRow[1] = parms.getParm(name).toString();
      data.add(newRow);
    }
  }
  
}
