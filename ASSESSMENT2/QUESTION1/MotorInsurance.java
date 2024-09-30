package ASSESSMENT2.QUESTION1;

public class MotorInsurance extends Insurance{

    private double idv;
    private float depPercent;

    public MotorInsurance(String insuranceNo, String insuranceName, double amountCovered, float depPercent) {
        super(insuranceNo, insuranceName, amountCovered);
        this.depPercent = depPercent;
        calculateIdv();
    }

    private void calculateIdv() {
        idv = getAmountCovered() - ((getAmountCovered() * depPercent) / 100);
    }

    public double calculatePremium() {
        return idv * 0.03;
    }

    public double getIdv() {
        return idv;
    }

    public float getDepPercent() {
        return depPercent;
    }
}
