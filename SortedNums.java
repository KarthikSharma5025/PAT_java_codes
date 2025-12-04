import java.util.*;
class SortedNums{
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(5,3,8,1,2,7,4,6);
        List<Integer> n = 
            num.stream()
                   .sorted()
                   .toList();
        System.out.println(n);
    }
}