import java.util.*;
class palindrome{
    public static void main(String[] args) {
        List<String> words = Arrays.asList("ram","Krishna","nitin","arjun");
        List<String> result =
            words.stream()
            .filter(s ->{
                String rev = "";
                for(int i = s.length() - 1; i >= 0; i--) {
                    rev += s.charAt(i);
                }
                return s.equals(rev);
            })
            .toList();
       System.out.println(result);    
    }
}