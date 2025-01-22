public class ZombiePlant {
    private int maxPotency;
    private int successfulTreatmentsNeeded;

    public ZombiePlant(int maxPotency, int successfulTreatmentsNeeded){
        this.maxPotency = maxPotency;
        this.successfulTreatmentsNeeded = successfulTreatmentsNeeded;
    }

    public int getPotency(){
        return maxPotency;
    }

    public int treatmentsNeeded(){
        return successfulTreatmentsNeeded;
    }
    public boolean isDangerous(){
        if (successfulTreatmentsNeeded > 0){
            return true;
        }
        return false;
    }
    public void treat (int potency){
            if (potency <= maxPotency && potency >= 1 && successfulTreatmentsNeeded > 0){
                successfulTreatmentsNeeded = successfulTreatmentsNeeded - 1;
            }
            if (potency > maxPotency){
                successfulTreatmentsNeeded = successfulTreatmentsNeeded + 1;
            }
    }
}
