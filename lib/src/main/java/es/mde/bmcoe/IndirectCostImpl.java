package es.mde.bmcoe;

public class IndirectCostImpl extends RowImpl implements IndirectCost {
    
    public IndirectCostImpl() {
    }
    
    public IndirectCostImpl(Float amount) {
        setAmount(amount);
    }    

    public Float calculateTotal() {
        return getAmount();
    }

	public void obtainDetails() {
		System.out.println("IndirectCost: " + this.toString());
	}
}