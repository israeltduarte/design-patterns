package behavioral.observable;

public class HospitalListener implements NewsListener {

    @Override
    public void update(String message) {
        System.out.println("The doctor is treating the patient.");
    }

}
