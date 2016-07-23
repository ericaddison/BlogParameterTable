package Tools;
import Data.Data;
import ParameterSets.ParameterSet;


public interface Tool <P extends ParameterSet>{
  public P getParms();
  public void runTool(Data data);
  public String getName();
}
