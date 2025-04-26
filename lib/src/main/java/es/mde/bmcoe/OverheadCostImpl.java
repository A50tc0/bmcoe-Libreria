package es.mde.externas;

public class OverheadCostImpl extends RowImpl implements OverheadCost {

	private boolean validated = false;

	// Constructores
	public OverheadCostImpl() {
	}

	public OverheadCostImpl(Float amount, boolean validated) {
		setAmount(amount);
		this.validated = validated;
	}

	// Getters y setters
	public boolean isValidated() {
		return validated;
	}

	public void setValidated(boolean validated) {
		this.validated = validated;
	}

	// Métodos específicos
	public void validate() {
		this.validated = true;
	}

	public Float calculateTotal() {
		return getAmount();
	}

	public void obtainDetails() {
		System.out.println("OverheadCost: " + calculateTotal() + " - Validated: " + validated);
	}
    
    
}