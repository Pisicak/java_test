package classes.sandbox;

public class HelloWorld {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Konstantin");

        double l = 5;
        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));
        double a = 7;
        double b = 13;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));

    }

    public static void hello(String somebody) {
        System.out.println("Hello " + somebody);
    }

    public static double area(double len) {
        return len * len;
    }

    public static double area(double a, double b) {
        return a * b;
    }
}