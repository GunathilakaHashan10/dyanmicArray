
public class Main {
    public static void main(String[] args) {

        Array<Integer> intArray = new Array<>(1);
        System.out.println(intArray.size());

        intArray.add(1);
        intArray.add(2);
        intArray.add(3);

        System.out.println(intArray.size());

        System.out.println(intArray);
    }
}