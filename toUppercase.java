import java.util.*;
class toUppercase{  
    public static void main(String[] args) {
        List<String> words = Arrays.asList("allah", "ram", "Krishna", "arjun","Jesus");
        List<String> result =
            words.stream()
            .map(String::toUpperCase)
            .toList();
        System.out.println(result);    
    }
}