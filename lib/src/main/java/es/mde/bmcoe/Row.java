package es.mde.bmcoe;

public class Row {
	private String description;
    private Double amount;
    
    // Constructores
    public Row() {}
    
    public Row(String description, Double amount) {
        this.description = description;
        this.amount = amount;
    }
    
    // Getters y setters
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Double getAmount() {
        return amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
