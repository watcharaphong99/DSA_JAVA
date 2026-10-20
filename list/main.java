package list;

import java.util.ArrayList;
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
        System.out.println(names);

        //Remove
        names.remove("Best");
        System.out.println(names);

        personList.remove(Boo);
        System.out.print(personList);

    }

    private record Person(String name) {

    }
}
