package es.mde.bmcoe;

public class OverheadCostImpl extends RowImpl implements OverheadCost {

	private boolean validated = false;

	public OverheadCostImpl() {
	}

	public OverheadCostImpl(Float amount, boolean validated) {
		setAmount(amount);
		this.validated = validated;
	}

	@Override
	public boolean isValidated() {
		return validated;
	}

	@Override
	public void setValidated(boolean validated) {
		this.validated = validated;
	}

	@Override
	public void validate() {
		this.validated = true;
	}
	
	@Override
	public void validate(String comment) {
		this.validated = true;
		
		if (comment != null && !comment.trim().isEmpty()) {
			this.setObservation(comment);
		}
	}

	@Override
	public Float calculateTotal() {
		// Solo sumar al total si está validado
		return isValidated() ? getAmount() : 0f;
	}

	@Override
	public void obtainDetails() {
		System.out.println("OverheadCost: " + calculateTotal() + " - Validated: " + validated);
	}
}