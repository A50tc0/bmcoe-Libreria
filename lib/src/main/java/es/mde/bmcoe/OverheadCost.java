package es.mde.externas;

public interface OverheadCost {
    boolean isValidated();
    void setValidated(boolean validated);
    void validate();
    Float calculateTotal();
    void obtainDetails();
}