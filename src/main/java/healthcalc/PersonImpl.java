package healthcalc;

public class PersonImpl implements Person {
    private float weight;
    private int height;
    private Gender gender;
    private int age;

    public PersonImpl(int height, char gender) throws Exception {
        this.height = height;
        this.gender = charToGender(gender);
    }

    public PersonImpl(float weight, int height, char gender, int age) throws Exception {
        this.weight = weight;
        this.height = height;
        this.gender = charToGender(gender);
        this.age = age;
    }

    private Gender charToGender(char gender) throws Exception {
        switch (gender) {
            case 'w':
                return Gender.FEMALE;
            case 'm':
                return Gender.MALE;
            default:
                throw new Exception("El género no es correcto.");
        }
    }

    @Override
    public float weight() {
        return weight;
    }

    @Override
    public int height() {
        return height;
    }

    @Override
    public Gender gender() {
        return gender;
    }

    @Override
    public int age() {
        return age;
    }
}
