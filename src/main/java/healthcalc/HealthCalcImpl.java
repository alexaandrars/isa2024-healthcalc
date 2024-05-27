package healthcalc;

public class HealthCalcImpl implements HealthCalc {
    private static HealthCalcImpl instance;
    private CardiovascularMetrics cardiovascularMetrics;
    private MetabolicMetrics metabolicMetrics;

    private HealthCalcImpl() {
        cardiovascularMetrics = new CardiovascularMetrics();
        metabolicMetrics = new MetabolicMetrics();
    }

    public static HealthCalcImpl getInstance() {
        if (instance == null) {
            instance = new HealthCalcImpl();
        }
        return instance;
    }

    @Override
    public float idealWeight(int height, char gender) throws Exception {
        Person person = new PersonImpl(height, gender);
        return (float) cardiovascularMetrics.getIdealBodyWeight(person);
    }

    @Override
    public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {
        Person person = new PersonImpl(weight, height, gender, age);
        return (float) metabolicMetrics.basalMetabolicRate(person);
    }
}