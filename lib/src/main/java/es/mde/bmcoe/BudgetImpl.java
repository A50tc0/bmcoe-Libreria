package es.mde.externas;

import java.util.ArrayList;
import java.util.List;

public class BudgetImpl implements Budget {

    private String fiscalYear;
    private List<RowImpl> rows = new ArrayList<>();
    private Float totalAmount = 0.0f;
    
    // Constructores
    public BudgetImpl() {}
    
    public BudgetImpl(Float totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    public BudgetImpl(Float totalAmount, String fiscalYear) {
        this.totalAmount = totalAmount;
        this.fiscalYear = fiscalYear;
    }
    
    // Getters y setters 
    public String getFiscalYear() {
        return fiscalYear;
    }
    
    public void setFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }
    
    public List<RowImpl> getRows() {
        return rows;
    }
    
    public void setRows(List<RowImpl> rows) {
        this.rows = rows;
    }
    
    public Float getTotalAmount() {
        return totalAmount;
    }
    
    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    @Override
	public void addRow(RowImpl row) {
        rows.add(row);
        obtainTotal();
    }
    
    @Override
	public void removeRow(Row row) {
		if (row != null && rows.contains(row)) {
			rows.remove(row);
			float newTotal = obtainTotal();
			setTotalAmount(newTotal);
		}
	}
    
    @Override
	public Float obtainTotal() {
        totalAmount = (float)rows.stream()
                .filter(row -> row != null && row.getAmount() != null)
                .mapToDouble(RowImpl::getAmount)
                .sum();
        return totalAmount;
    }

}