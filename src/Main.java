import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        GryffindorStudent harry = generateGryffindorStudent("Гари Порттор");
        GryffindorStudent ron = generateGryffindorStudent("Рон Уизли");

        RavenclawStudent luna = generateRavenclawSstudent("Полуна Лавгуд");

        SlytherinStudent draco = generateSlaytherinStudent("Драко Малфой");

        HufflepuffStudent cedric = generateHufflepuffStudent("Седрик Диггори");


        harry.comperGryffindorStudents(ron);
        harry.comperHogwartsStudents(draco);

        luna.comperHogwartsStudents(ron);
    }

    private static GryffindorStudent generateGryffindorStudent(String name) {
        return new GryffindorStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static HufflepuffStudent generateHufflepuffStudent(String name) {
        return new HufflepuffStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static RavenclawStudent generateRavenclawSstudent(String name) {
        return new RavenclawStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static SlytherinStudent generateSlaytherinStudent(String name) {
        return new SlytherinStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
                );
    }
}
