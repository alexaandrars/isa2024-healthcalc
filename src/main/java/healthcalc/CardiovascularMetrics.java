package healthcalc;

public class CardiovascularMetrics {

    public double getIdealBodyWeight(Person person) throws Exception {
        int height = person.height();
        Gender gender = person.gender();

        if(height <= 0 || height > 300) {
            throw new Exception("Altura no válida.");
        }
        if(height <= 100) {
            throw new Exception("Altura no válida.");
        }
        if (gender == Gender.FEMALE) {
            return height - 100 - (height - 150) / 2.5;
        } else if (gender == Gender.MALE) {
            return height - 100 - (height - 150) / 4.0;
        } else {
            throw new Exception("El género no es correcto.");
        }
    }
}