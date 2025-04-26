package es.mde.externas;

public abstract class RowImpl implements Row {
    private Float amount;
    private String cisiAccount;
    private Integer code;
    private String remarks;
    private String briefDescription; 
       
    // Getters y setters originales
    
    @Override
	public Float getAmount() {
        return amount;
    }
    
    @Override
	public void setAmount(Float amount) {
        this.amount = amount;
    }
    
    // Nuevos getters y setters
    @Override
	public String getCisiAccount() {
        return cisiAccount;
    }
    
    @Override
	public void setCisiAccount(String cisiAccount) {
        this.cisiAccount = cisiAccount;
    }
    
    @Override
	public Integer getCode() {
        return code;
    }
    
    @Override
	public void setCode(Integer code) {
        this.code = code;
    }
    
    @Override
	public String getRemarks() {
        return remarks;
    }
    
    @Override
	public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    @Override
	public String getBriefDescription() {
        return briefDescription;
    }
    
    @Override
	public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }
    
    abstract void obtainDetails();
    abstract Float calculateTotal();

	@Override
	public String toString() {
		return "RowImpl [amount=" + amount + ", cisiAccount=" + cisiAccount + ", code=" + code + ", remarks=" + remarks
				+ ", briefDescription=" + briefDescription + "]";
	}
	
	

    

}