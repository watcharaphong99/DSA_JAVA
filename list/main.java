package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        //Defintion
        List<String> names = new ArrayList<>();
        List<Person> personList = new ArrayList<>();

        //inser object
        var Boo = new Person("Boo");
        //Insertion -1
        names.add("Best");
        personList.add(Boo);
        
        System.out.println(names);
        System.out.println(personList);
        System.out.println();


        //Insert many (all)
        List<String> newUsers = List.of(
            "Toby",
            "Person",
            "Elf"
        );

        names.addAll(newUsers);
        names.add(3,"Amily");
        System.out.println(names);
        
        //Remove
        names.remove("Best");
        System.out.println(names);
        personList.remove(Boo);

        personList.removeAll(List.of(new Person("Amily")));
        System.out.println(personList);
        personList.clear();
        System.out.println(personList);
        var isPoppyInList = names.contains("Person");
        System.out.println("isPopyInlist " + isPoppyInList);
        System.out.println();

        var numberList2 = new ArrayList<>(List.of(1,2,3,5,3,2,34,5,666,77,888));
        numberList2.sort((e1,e2)-> Integer.compare(e1,e2));//ASC
        System.out.println(numberList2);

        //what if DESC
//        numberList2.sort(Comparator.reverseOrder());
        numberList2.sort((e1,e2)-> Integer.compare(e2,e1));
        System.out.println(numberList2);

        List<Stat> statList = new ArrayList<>(
                List.of(
                        new Stat(1,8),
                        new Stat(2,5),
                        new Stat(3,10),
                        new Stat(4,9)
                )
        );

        System.out.println(statList);
        System.out.println();
        statList.sort((e1,e2)-> Integer.compare(e2.overall,e1.overall));
        System.out.println(statList);

        var result = statList.stream()
                .filter(s -> s.overall > 5)
                .map(s -> new Stat(s.playerId, s.overall * 3))
                .sorted((e1,e2)->Integer.compare(e2.overall,e1.overall))
                .limit(3)
                .toList();
        var iterator = result.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



    }

    private record Person( String name) {

    }

    private record Stat(int playerId,int overall) {

    }

}
