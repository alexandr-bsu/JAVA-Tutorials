package OOP.Decorator.ChemicalReactor;

public class DehydrationFilter extends ChemicalFilter{
    BaseSubstance bs;

    public DehydrationFilter(BaseSubstance bs) {
        this.bs = bs;
    }

    @Override
    public String getSubstance() {
        return bs.getSubstance().replace("H H O ", "");
    }
}
