package es.mde.bmcoe;

import java.util.ArrayList;
import java.util.List;

public class BudgetImpl implements Budget {

    private String fiscalYear;
    private List<Row> rows = new ArrayList<>();
    
    // Constructores
    public BudgetImpl() {}
    
    public BudgetImpl(String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }
    
    // Getters y setters 
    @Override
    public String getFiscalYear() {
        return fiscalYear;
    }
    
    @Override
    public void setFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }
    
    @Override
    public List<Row> getRows() {
        return new ArrayList<>(rows);
    }
    
    @Override
    public void setRows(List<? extends Row> rows) {
        this.rows.clear();
        if (rows != null) {
            for (Row row : rows) {
                this.rows.add(row);
            }
        }
    }
    
    @Override
    public void addRow(Row row) {
        rows.add(row);
    }
    
    @Override
    public void removeRow(Row row) {
        if (row != null && rows.contains(row)) {
            rows.remove(row);
        }
    }
    
    @Override
    public Float obtainTotal() {
        return (float)rows.stream()
                .filter(row -> row != null && row.getAmount() != null)
                .mapToDouble(Row::getAmount)
                .sum();
    }
}