public class MethodsLecture {
    public static void main(String[] args) {
    bark();
    bark(15);
    bark(50);
    bark(15, "fifi");
    bark(50, "dumptruck");
    }

    public static void bark(int weight, String name) {
        System.out.printf("%s goes ", name);
        bark(weight);
    }

}
