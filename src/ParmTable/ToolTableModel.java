package ParmTable;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.table.AbstractTableModel;

import Tools.Tool;

public class ToolTableModel extends AbstractTableModel{

  private static final long serialVersionUID = 1L;
  private List<Tool<?>> tools;
  private List<JScrollPane> panes;
  
  public ToolTableModel(List<Tool<?>> tools) {
    this.tools = tools;
    panes = new ArrayList<JScrollPane>();
    
    for(Tool<?> tool : tools){
      ParameterTable newTable = new ParameterTable(tool.getParms());
      JScrollPane newPane = new JScrollPane(newTable);
      newPane.setPreferredSize(
          new Dimension(200,
              tool.getParms().getNParms()*ParameterTable.ROWHEIGHT));
      newPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
      newPane.setBorder(BorderFactory.createEmptyBorder());
      panes.add(newPane);
    }
  }
  
  @Override
  public int getColumnCount() {
    return 2;
  }

  @Override
  public int getRowCount() {
    return tools.size();
  }

  @Override
  public Object getValueAt(int row, int col) {
    if(col==0)
      return tools.get(row).getName();
    else if(col==1)
      return panes.get(row);
    return null;
  }

}
