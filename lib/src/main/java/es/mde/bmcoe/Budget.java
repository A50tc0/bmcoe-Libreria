package es.mde.bmcoe;

import java.util.List;

public interface Budget {

	String getFiscalYear();
	
	void setFiscalYear(String fiscalYear);
	
	List<? extends Row> getRows();
	
	void setRows(List<? extends Row> rows);
	
	void addRow(Row row);
	
	void removeRow(Row row);

}