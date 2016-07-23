package ParameterSets;
import java.util.ArrayList;
import java.util.List;



public class ScrewDriverParms implements ParameterSet {

  public static final String TYPE = "Bit Type";
  
  private String bitType = "Phillips";
  
  
  @Override
  public void setParm(String parmName, Object parm) {
    if(parmName.equals(TYPE) && (parm instanceof String))
      bitType = (String)parm;
  }

  @Override
  public Object getParm(String parmName) {
    if(parmName.equals(TYPE))
      return bitType;
    return null;
  }

  @Override
  public List<String> getParmNames() {
    List<String> names = new ArrayList<String>();
    names.add(TYPE);
    return names;
  }

  @Override
  public int getNParms() {
    return getParmNames().size();
  }

}

