import java.util.*;
class threedigit{
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(100,250,345,6789,4567,890);
        nums
        .stream()
        .filter(n-> n>=100 && n<=999)
        .forEach(n->System.out.println(n));
    }
}