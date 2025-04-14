package es.mde.bmcoe;

public abstract class Row {
	private Float amount;
	private String cisiAccount;
	private Integer code;
	private String remarks;
	private String briefDescription;

	public Row() {
	}

	public Row(Float amount) {
		this.amount = amount;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public String getCisiAccount() {
		return cisiAccount;
	}

	public void setCisiAccount(String cisiAccount) {
		this.cisiAccount = cisiAccount;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getBriefDescription() {
		return briefDescription;
	}

	public void setBriefDescription(String briefDescription) {
		this.briefDescription = briefDescription;
	}

	public abstract Float calculateTotal();

	public abstract void obtainDetails();
}
