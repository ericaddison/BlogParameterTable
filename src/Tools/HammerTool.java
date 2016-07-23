package Tools;
import Data.Data;
import ParameterSets.HammerParms;


public class HammerTool implements Tool<HammerParms>{

  private HammerParms parms;
  public static final String TOOLNAME = "Hammer";
  
  public HammerTool() {
    parms = new HammerParms();
  }
  
  @Override
  public HammerParms getParms() {
    return parms;
  }

  @Override
  public void runTool(Data data) {
    System.out.println("Hammering data with a " 
        + parms.getParm(HammerParms.WEIGHT) + "oz "
        + parms.getParm(HammerParms.TYPE) + " hammer!");
  }

  @Override
  public String getName() {
    return TOOLNAME;
  }

}
