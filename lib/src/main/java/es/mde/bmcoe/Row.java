package es.mde.externas;

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

}