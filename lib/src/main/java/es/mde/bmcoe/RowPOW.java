package es.mde.bmcoe;

public class RowPOW extends Row {
	private String codePow;

	public RowPOW() {
	}

	public RowPOW(String codePow, Float amount) {
		setAmount(amount);
		this.codePow = codePow;
	}

	public String getCodePow() {
		return codePow;
	}

	public void setCodePow(String codePow) {
		this.codePow = codePow;
	}

	public Float calculateTotal() {
		return getAmount();
	}

	public void obtainDetails() {
		System.out.println("Row POW Details:");
		System.out.println("- Type: POW Entry");
		System.out.println("- POW Code: " + codePow);
		System.out.println("- CISI Account: " + getCisiAccount());
		System.out.println("- Code: " + getCode());
		System.out.println("- Amount: " + getAmount());
		System.out.println("- Description: " + getBriefDescription());
		if (getRemarks() != null && !getRemarks().isEmpty()) {
			System.out.println("- Remarks: " + getRemarks());
		}
	}

}
