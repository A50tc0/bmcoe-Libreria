package es.mde.bmcoe;

import java.util.ArrayList;
import java.util.Collection;

public class Budget {
	private String name;
    private Double amount;
    private String fiscalYear;
    private Collection<Row> rows = new ArrayList<>();
    
    // Constructores
    public Budget() {}
    
    public Budget(String name, Double amount) {
        this.name = name;
        this.amount = amount;
    }
    
    public Budget(String name, Double amount, String fiscalYear) {
        this.name = name;
        this.amount = amount;
        this.fiscalYear = fiscalYear;
    }
    
    // Getters y setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Double getAmount() {
        return amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
    public String getFiscalYear() {
        return fiscalYear;
    }
    
    public void setFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }
    
    public Collection<Row> getRows() {
        return rows;
    }
    
    public void setRows(Collection<Row> rows) {
        this.rows = rows;
    }
    
    public void addRow(Row row) {
        this.rows.add(row);
    }
    
    // Método para calcular el total del presupuesto
    public double obtainTotal() {
        return rows.stream()
                .filter(row -> row != null)
                .mapToDouble(Row::getAmount)
                .sum();
    }
}
