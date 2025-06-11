package es.mde.bmcoe;

public class RowPOWImpl extends RowImpl implements RowPOW {
    
    private String codePow;

    public RowPOWImpl() {
    }
    
    public RowPOWImpl(String codePow, Float amount) {
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
        System.out.println("RowPOW: " + getCodePow() + this.toString());
    }   
    
}