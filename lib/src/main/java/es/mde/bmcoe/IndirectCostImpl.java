package es.mde.externas;

public class IndirectCostImpl extends RowImpl implements IndirectCost {
    
    // Constructores
    public IndirectCostImpl() {
    }
    
    public IndirectCostImpl(Float amount) {
        setAmount(amount);
    }    

	// Métodos específicos
    public Float calculateTotal() {
        return getAmount();
    }

	public void obtainDetails() {
		System.out.println("IndirectCost: " + this.toString());
	}
}