import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Pair<T,U>{
    private T first;
    private U second;

    public Pair(T first, U second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static <A, B> List<Pair<A,B>> findPairs(List<A> firstList, List<B> secondList, BiPredicate<A,B> predicate){
        List<Pair<A,B>> pairs = new ArrayList<>();
        for (A a : firstList){
            for (B b: secondList){
                if (predicate.test(a,b)){
                    pairs.add(new Pair<>(a,b));
                }
            }
        }
        return pairs;
    }

    @Override
    public String toString(){
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
