package OOP.Decorator.ChemicalReactor;

public class HydrogenFilter extends ChemicalFilter{
    BaseSubstance bs;

    public HydrogenFilter(BaseSubstance bs) {
        this.bs = bs;
    }

    @Override
    public String getSubstance() {
        return bs.getSubstance()+"H ";
    }
}
