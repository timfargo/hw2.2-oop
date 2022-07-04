public class HufflepuffStudent extends HogwartsStudent{
    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String name, int magic, int transgression, int diligence,int loyalty,int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }
    private int ability(){
        return diligence + honesty + loyalty;
    }

    public void comperHufflrpuffStudents(HufflepuffStudent hufflepuffStudent) {
        int ability1 = ability();
        int ability2 = hufflepuffStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент Гриффиндора %s лучше студента Гриффиндора %s (%d VS %d)%n", getName(), hufflepuffStudent.getName(), ability1, ability2);
        } else if (ability1 > ability2) {
            System.out.printf("Студент Гриффиндора %s лучше студента Гриффиндора %s (%d VS %d)%n", hufflepuffStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент Гриффиндора %s точно такой же,как студента Гриффиндора %s (%d VS %d)%n", hufflepuffStudent.getName(), getName(), ability2, ability1);
        }
    }

    @Override
    public String toString() {
        return String.format("%s;благородство: %d;честь:%d;храбрость:%d",super.toString(),diligence,honesty,loyalty);
    }
}
