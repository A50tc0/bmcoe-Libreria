package es.mde.bmcoe;

import java.util.ArrayList;
import java.util.List;

public class Budget {
	private Float totalAmount;
	private String fiscalYear;
	private List<Row> rows = new ArrayList<>();

	public Budget() {
	}

	public Budget(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Budget(Float totalAmount, String fiscalYear) {
		this.totalAmount = totalAmount;
		this.fiscalYear = fiscalYear;
	}

	public Float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getFiscalYear() {
		return fiscalYear;
	}

	public void setFiscalYear(String fiscalYear) {
		this.fiscalYear = fiscalYear;
	}

	public List<Row> getRows() {
		return rows;
	}

	public void setRows(List<Row> rows) {
		this.rows = rows;
	}

	public void addRow(Row row) {
		this.rows.add(row);
		obtainTotal();
	}

	public Float obtainTotal() {
		totalAmount = (float) rows.stream()
								  .filter(row -> row != null && row.getAmount() != null)
								  .mapToDouble(Row::getAmount).sum();
		return totalAmount;
	}
}
