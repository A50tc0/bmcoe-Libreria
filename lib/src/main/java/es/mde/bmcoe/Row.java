package es.mde.bmcoe;

public interface Row {
	Float getAmount();
	void setAmount(Float amount);
	String getCisiAccount();
	void setCisiAccount(String cisiAccount);
	Integer getCode();
	void setCode(Integer code);
	String getRemarks();
	void setRemarks(String remarks);
	String getBriefDescription();
	void setBriefDescription(String briefDescription);
	String getBranch();
	void setBranch(String branch);
	String getObservation();
	void setObservation(String observation);	
	Float calculateTotal();
	void obtainDetails();
}