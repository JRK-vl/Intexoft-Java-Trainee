import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};

        List<Pair<Integer, Integer>> pairs = Pair.findPairs(Arrays.asList(arr1), Arrays.asList(arr2),
                (a,b) -> a + b == 11);
        System.out.println(pairs);*/

        List<Person> list1 = Arrays.asList(
                new Person("Valera", 25),
                new Person("Alex", 30),
                new Person("Vika", 35)
        );
        List<Person> list2 = Arrays.asList(
                new Person("Alice", 28),
                new Person("Rik", 42),
                new Person("Morty", 35)
        );
        System.out.println(list1);
        System.out.println(list2);
        List<Pair<Person, Person>> pairs = Pair.findPairs(list1, list2,
                (p1,p2) -> Math.abs(p1.getAge() - p2.getAge()) <= 5);
        System.out.println("Pairs: " + pairs);
    }
}