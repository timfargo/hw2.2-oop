public class HogwartsStudent {
    private String name;
    private int magic;
    private int transgression;

    public HogwartsStudent(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;

    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return String.format("Студент Хогвортса %s:сила маги - %d,сила трансгрессии:%d", name, magic, transgression);
    }

    private int abilityHogwartsStudent() {
        return magic + transgression;
    }

    public void comperHogwartsStudents(HogwartsStudent hogwartsStudent) {
        int ability1 = abilityHogwartsStudent();
        int ability2 = hogwartsStudent.abilityHogwartsStudent();
        if (ability1 > ability2) {
            System.out.printf("Студент Гриффиндора %s лучше студента Гриффиндора %s (%d VS %d)%n", name, hogwartsStudent.name, ability1, ability2);
        } else if (ability1 > ability2) {
            System.out.printf("Студент Гриффиндора %s лучше студента Гриффиндора %s (%d VS %d)%n", hogwartsStudent.name, name, ability2, ability1);
        } else {
            System.out.printf("Студент Гриффиндора %s точно такой же,как студента Гриффиндора %s (%d VS %d)%n", hogwartsStudent.name, name, ability2, ability1);
        }
    }
}



