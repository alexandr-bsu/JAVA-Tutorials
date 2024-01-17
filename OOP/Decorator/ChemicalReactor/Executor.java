package OOP.Decorator.ChemicalReactor;

public class Executor {
    public void execute(){
        BaseSubstance water = new Water();
        BaseSubstance hydrogenPeroxide = new OxygenFilter(water);
        System.out.println(hydrogenPeroxide.getSubstance());
        BaseSubstance oxygen = new DehydrationFilter(hydrogenPeroxide);
        System.out.println(oxygen.getSubstance());
    }
}
