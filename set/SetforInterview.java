package set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetforInterview {
    public static void main(String[] args) {
        var input =  List.of(7,3,4,5,6,8,9,0,7,1,2,3,4,5);
        Set<Integer>IntegerSet = new HashSet<>(input);
        System.out.println(IntegerSet);
        System.out.println(isContainDuplicate(input));
    }

    private static boolean isContainDuplicate(List<Integer> input) {
        boolean  isDuplicate = false;
        Set<Integer> seen = new HashSet<>();
        for(var n : input) {
            if(seen.contains(n)) {
                return true;
            }
            seen.add(n);
        }
        return isDuplicate;
    }
}
