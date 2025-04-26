package es.mde.externas;

public interface Budget {

	void addRow(RowImpl row);

	void removeRow(Row row);

	Float obtainTotal();

}