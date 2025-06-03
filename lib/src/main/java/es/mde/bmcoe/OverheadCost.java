package es.mde.bmcoe;

public interface OverheadCost extends Row {
    boolean isValidated();
    void setValidated(boolean validated);
    void validate();
    void validate(String comment); // Comentario: método validate con parámetro comment
    Float calculateTotal();
    void obtainDetails();
}