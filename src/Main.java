import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Планетанын атын жазыныз");
            Scanner scanner = new Scanner(System.in);
            String planeta = scanner.nextLine();
            Planeta.valueOf(planeta);
            Planeta planeta1 = Planeta.valueOf(planeta);

            switch (planeta1) {
                case EARTH -> System.out.println(" Жердин жалгыз спутниги - Ай");
                case MARS -> System.out.println("Марс жер планетасына окшош");
                case MERCURIO -> System.out.println(" Күнгө эң жакын жайгашкан планета");
                case NEPTUNE -> System.out.println("Диаметри Жердин экватордук диаметринен 3,88 эсеге чоң (49500 км)");
                case YUPITER -> System.out.println("Юпитер күн системасындагы эң чоң планета");
                case SATURN -> System.out.println("Биринчи космос кемеси планетага 1979-жылы барган.");
                case URANUS -> System.out.println("Уран 84,015 жылда Күндү толук бир жолу айланат");


            }
        }

    }
}