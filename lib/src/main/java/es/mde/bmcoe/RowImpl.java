package es.mde.bmcoe;

import es.mde.bmcoe.BudgetImpl;

public abstract class RowImpl implements Row {
    private Float amount;
    private String cisiAccount;
    private Integer code;
    private String remarks;
    private String briefDescription; 
    private String branch;
    private String observation;
    private BudgetImpl budget;
    
    public BudgetImpl getBudget() {
        return budget;
    }
    
    public void setBudget(BudgetImpl budget) {
        this.budget = budget;
    }
    
    @Override
    public Float getAmount() {
        return amount;
    }
    
    @Override
    public void setAmount(Float amount) {
        this.amount = amount;
    }
    
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
    
    @Override
    public String getBranch() {
        return branch;
    }
    
    @Override
    public void setBranch(String branch) {
        this.branch = branch;
    }
    
    @Override
    public String getObservation() {
        return observation;
    }
    
    @Override
    public void setObservation(String observation) {
        this.observation = observation;
    }
    
    public abstract Float calculateTotal();
    
    public abstract void obtainDetails();

    @Override
    public String toString() {
        return "RowImpl [amount=" + amount + ", cisiAccount=" + cisiAccount + ", code=" + code + ", remarks=" + remarks
                + ", briefDescription=" + briefDescription + ", branch=" + branch + ", observation=" + observation + "]";
    }
}