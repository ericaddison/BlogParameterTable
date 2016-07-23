package ParmTable;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

import ParameterSets.HammerParms;
import ParameterSets.ParameterSet;
import Tools.SawTool;
import Tools.ScrewDriverTool;
import Tools.HammerTool;
import Tools.Tool;

public class ToolTableDemo {

  public static void main(String[] args){
    
    List<Tool<? extends ParameterSet>> tools = new ArrayList<>();
    tools.add(new HammerTool());
    tools.add(new ScrewDriverTool());
    tools.add(new SawTool());
    
    ToolTable table = new ToolTable(tools);
    JScrollPane pane = new JScrollPane(table); 
    
    JFrame fr = new JFrame("ParmTable");
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fr.add(pane);
    fr.setSize(300,300);
    fr.setVisible(true); 
   

    
    // test model change
    table.getModel().addTableModelListener(new TableModelListener() {
      @Override
      public void tableChanged(TableModelEvent arg0) {
        System.out.println("bam!");
      }
    });
    
    tools.get(0).getParms().setParm(HammerParms.WEIGHT,120);
    
  }
  
  
}
