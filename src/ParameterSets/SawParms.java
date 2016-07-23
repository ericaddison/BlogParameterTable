package ParameterSets;
import java.util.ArrayList;
import java.util.List;



public class SawParms implements ParameterSet {

  public static final String TYPE = "Saw Type";
  public static final String TEETHPERINCH = "Teeth/inch";
  
  private String sawType = "Hacksaw";
  private int teethPerInch = 50;
  
  
  @Override
  public void setParm(String parmName, Object parm) {
    if(parmName.equals(TYPE) && (parm instanceof String))
      sawType = (String)parm;
    else if(parmName.equals(TEETHPERINCH) && (parm instanceof Integer))
      teethPerInch = (Integer)parm;
  }

  @Override
  public Object getParm(String parmName) {
    if(parmName.equals(TYPE))
      return sawType;
    else if(parmName.equals(TEETHPERINCH))
      return teethPerInch;
    return null;
  }

  @Override
  public List<String> getParmNames() {
    List<String> names = new ArrayList<String>();
    names.add(TYPE);
    names.add(TEETHPERINCH);
    return names;
  }

  @Override
  public int getNParms() {
    return getParmNames().size();
  }

}

