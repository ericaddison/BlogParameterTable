package ParmTable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import Data.Data;
import Tools.HammerTool;
import Tools.Tool;

public class ParmTableDemo {

  public static void main(String[] args){
    
    Tool<?> hammer = new HammerTool();
    
    hammer.runTool(new Data() {});
    
    ParameterTable table = new ParameterTable(hammer.getParms());
    JScrollPane pane = new JScrollPane(table); 
    
    JFrame fr = new JFrame("ParmTable");
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fr.add(pane);
    fr.setSize(300,300);
    fr.setVisible(true);    
  }
  
  
}
