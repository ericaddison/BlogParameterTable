package ParameterSets;
import java.util.ArrayList;
import java.util.List;



public class HammerParms implements ParameterSet {

  public static final String TYPE = "Type";
  public static final String WEIGHT = "Weight";
  
  private String hammerType = "Claw";
  private int hammerWeight = 10;
  
  
  @Override
  public void setParm(String parmName, Object parm) {
    if(parmName.equals(TYPE) && (parm instanceof String))
      hammerType = (String)parm;
    else if(parmName.equals(WEIGHT) && (parm instanceof Integer))
      hammerWeight = (Integer)parm;
  }

  @Override
  public Object getParm(String parmName) {
    if(parmName.equals(TYPE))
      return hammerType;
    else if(parmName.equals(WEIGHT))
      return hammerWeight;
    return null;
  }

  @Override
  public List<String> getParmNames() {
    List<String> names = new ArrayList<String>();
    names.add(TYPE);
    names.add(WEIGHT);
    return names;
  }

  @Override
  public int getNParms() {
    return getParmNames().size();
  }

}

