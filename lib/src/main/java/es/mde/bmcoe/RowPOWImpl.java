package es.mde.bmcoe;

public class RowPOWImpl extends RowImpl implements RowPOW {
    
    private String codePow;

    // Constructores
    public RowPOWImpl() {
    }
    
    public RowPOWImpl(String codePow, Float amount) {
        setAmount(amount);
        this.codePow = codePow;
    }

    // Getters y setters
    public String getCodePow() {
        return codePow;
    }

    public void setCodePow(String codePow) {
        this.codePow = codePow;
    }
    
    // Métodos específicos
    public Float calculateTotal() {
        return getAmount();
    }
    
    public void obtainDetails() {
        System.out.println("RowPOW: " + getCodePow() + this.toString());
    }   
    
}