package Tools;
import Data.Data;
import ParameterSets.ScrewDriverParms;


public class ScrewDriverTool implements Tool<ScrewDriverParms>{

  private ScrewDriverParms parms;
  public static final String TOOLNAME = "Screwdriver";
  
  public ScrewDriverTool() {
    parms = new ScrewDriverParms();
  }
  
  @Override
  public ScrewDriverParms getParms() {
    return parms;
  }

  @Override
  public void runTool(Data data) {
    System.out.println("Screwing the data with a " 
        + parms.getParm(ScrewDriverParms.TYPE) + " screwdriver!");
  }

  @Override
  public String getName() {
    return TOOLNAME;
  }

}
