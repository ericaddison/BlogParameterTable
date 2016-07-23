package ParameterSets;
import java.util.List;


public interface ParameterSet {
  public void setParm(String parmName, Object parm);
  public Object getParm(String parmName);
  public List<String> getParmNames();
  public int getNParms();
}
