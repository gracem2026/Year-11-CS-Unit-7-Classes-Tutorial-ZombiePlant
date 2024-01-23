public class ZombiePlant {
    // properties
    private int potency;
    private int treatments;

    // constructors
    public ZombiePlant(int pot, int init) {
        potency = pot;
        treatments = init;
    }
    public void treat(int tr) {
        if (tr > 0) {
            if (tr <= 10 && treatments > 0) {
                treatments --;
            }
            else if (tr > 10){
                treatments ++;
            }
        }
    }
    public int getPotency() {
        return potency;
    }
    public int treatmentsNeeded() {
        return treatments;
    }
    public boolean isDangerous() {
        return treatments > 0;
    }
}
