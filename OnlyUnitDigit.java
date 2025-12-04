import java.util.*;
class OnlyUnitDigit{
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(163,178,184,2020,2021,2022,224,2025);
        numbers.stream()
               .map(n -> n % 10)
               .forEach(n->System.out.println(n+" "));
    }
}