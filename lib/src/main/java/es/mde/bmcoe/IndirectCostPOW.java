package es.mde.bmcoe;

public class IndirectCostPOW extends Row {

	public IndirectCostPOW() {
	}

	public IndirectCostPOW(Float amount) {
		setAmount(amount);
	}

	public Float calculateTotal() {
		return getAmount();
	}

	public void obtainDetails() {
		System.out.println("Indirect Cost POW Details:");
		System.out.println("- Type: Indirect Cost");
		System.out.println("- CISI Account: " + getCisiAccount());
		System.out.println("- Code: " + getCode());
		System.out.println("- Amount: " + getAmount());
		System.out.println("- Description: " + getBriefDescription());
		if (getRemarks() != null && !getRemarks().isEmpty()) {
			System.out.println("- Remarks: " + getRemarks());
		}
	}
}
