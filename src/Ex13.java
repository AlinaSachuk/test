import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Ex13 {
    public static void main(String[] args) {
        ArrayList<String> countryList = new ArrayList<>();
        countryList.add("Japan");
        countryList.add("Australia");
        countryList.add("Kongo");
        System.out.println("2. " + countryList);
        countryList.set(1, "New Zeland");
        System.out.println("3. " + countryList);
        countryList.remove("New Zeland");
        System.out.println("4. " + countryList);
        countryList.remove(1);
        System.out.println("5. " + countryList);
        System.out.println("6. " + countryList.indexOf("Japan"));
        System.out.println("7. " + countryList.contains("Japan"));
        LinkedList<String> countryListNew = new LinkedList<>();
        countryListNew.addFirst("Spain");
        countryListNew.addFirst("Italy");
        countryListNew.addLast("France");
        countryListNew.addLast("Portugal");
        System.out.println("2.2. " + countryListNew);
        countryListNew.removeFirst();
        countryListNew.removeLast();
        System.out.println("2.3. " + countryListNew);
        System.out.println("2.4. " + countryListNew.getFirst());
        System.out.println("2.4. " + countryListNew.getLast());
        System.out.println("Task 3");
        HashSet<PersonEx13> persons = new HashSet<>();
        PersonEx13 person1 = new PersonEx13("Alex", 20);
        PersonEx13 person2 = new PersonEx13("Max", 25);
        PersonEx13 person3 = new PersonEx13("Steve", 30);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        for (PersonEx13 person : persons) {
            System.out.println(person);
        }
        persons.remove(person1);
        persons.remove(person2);
        System.out.println(persons.contains(person3));
        System.out.println(persons);
        System.out.println("Task 4");
        HashMap<Integer, String> countryMap = new HashMap<>();
        countryMap.put(1, "USA");
        countryMap.put(2, "UK");
        countryMap.put(3, "South Africa");
        countryMap.remove(2);
        countryMap.remove(1);
        System.out.println(countryMap.get(3));
        System.out.println(countryMap.keySet());
        System.out.println(countryMap.values());
        System.out.println(countryMap.isEmpty());
    }
}
