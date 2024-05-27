package healthcalc;

public class MetabolicMetrics {

    public double basalMetabolicRate(Person person) throws Exception {
        float weight = person.weight();
        int height = person.height();
        Gender gender = person.gender();
        int age = person.age();

        if(weight <= 0 || height <= 0 || age < 0 || height > 300) {
            throw new Exception("Parámetros no válidos.");
        }

        if (gender == Gender.FEMALE) {
            return 10 * weight + 6.25 * height - 5 * age - 161;
        } else if (gender == Gender.MALE) {
            return 10 * weight + 6.25 * height - 5 * age + 5;
        } else {
            throw new Exception("El género no es correcto.");
        }
    }
}