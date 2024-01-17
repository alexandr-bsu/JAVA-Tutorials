package OOP.Decorator.ChemicalReactor;

public class OxygenFilter extends ChemicalFilter{
    BaseSubstance bs;

    public OxygenFilter(BaseSubstance bs) {
        this.bs = bs;
    }

    @Override
    public String getSubstance() {
        return bs.getSubstance()+"O ";
    }
}
