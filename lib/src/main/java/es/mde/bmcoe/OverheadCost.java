package es.mde.bmcoe;

public class OverheadCost extends Row {
	private boolean validated = false;

	public OverheadCost() {
	}

	public OverheadCost(Float amount, boolean validated) {
		setAmount(amount);
		this.validated = validated;
	}

	public boolean isValidated() {
		return validated;
	}

	public void setValidated(boolean validated) {
		this.validated = validated;
	}

	public void validate() {
		this.validated = true;
	}

	public Float calculateTotal() {
		return getAmount();
	}

	public void obtainDetails() {
		System.out.println("Overhead Cost Details:");
		System.out.println("- Type: Overhead Cost");
		System.out.println("- Validation Status: " + (isValidated() ? "Validated" : "Not Validated"));
		System.out.println("- CISI Account: " + getCisiAccount());
		System.out.println("- Code: " + getCode());
		System.out.println("- Amount: " + getAmount());
		System.out.println("- Description: " + getBriefDescription());
		if (getRemarks() != null && !getRemarks().isEmpty()) {
			System.out.println("- Remarks: " + getRemarks());
		}
	}
}
