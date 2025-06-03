package es.mde.bmcoe;

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
	@Override
	public boolean isValidated() {
		return validated;
	}

	@Override
	public void setValidated(boolean validated) {
		this.validated = validated;
	}

	// Métodos específicos
	@Override
	public void validate() {
		this.validated = true;
	}
	
	@Override
	public void validate(String comment) {
		// Establecer como validado
		this.validated = true;
		
		// Guardar el comentario de validación si existe
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