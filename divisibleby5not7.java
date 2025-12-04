import java.util.*;
class DivisibleBy5Not7 {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(10,27,35,85,25,9);
        nums
        .stream()
        .filter(n-> n%5==0 && n%7!=0)
        .forEach(n->System.out.println(n));
    }
}