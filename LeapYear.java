import java.util.*;
class LeapYear {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1996, 2000, 1900, 2020, 2021, 2100, 2400);
        nums
        .stream()
            .filter(n -> (n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) 
            .forEach(n -> System.out.println(n)); 
    }
}