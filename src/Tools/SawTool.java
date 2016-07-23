package Tools;
import Data.Data;
import ParameterSets.SawParms;


public class SawTool implements Tool<SawParms>{

  private SawParms parms;
  public static final String TOOLNAME = "Saw";
  
  public SawTool() {
    parms = new SawParms();
  }
  
  @Override
  public SawParms getParms() {
    return parms;
  }

  @Override
  public void runTool(Data data) {
    System.out.println("Sawing data with a " 
        + parms.getParm(SawParms.TEETHPERINCH) + " teeth/inch "
        + parms.getParm(SawParms.TYPE) + " hammer!");
  }

  @Override
  public String getName() {
    return TOOLNAME;
  }

}
