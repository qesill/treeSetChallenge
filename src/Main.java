import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /*
        1. Stwórz TreeSet typu Integer o nazwie numbers. Dodaj pętle for z 30 iteracjami
           i dodaj losową liczbę do TreeSet z zakresu od 0 do 100.
        2. Wyświetl w konsoli cały TreeSet
         */

        TreeSet<Integer> numbers = new TreeSet<>();

        for (int i=0; i<30; i++) {
        numbers.add((int)Math.floor(Math.random()*101));
            //numbers.add(i);
        }

        Iterator<Integer> numbersIterator = numbers.iterator();
        while (numbersIterator.hasNext()) {
            System.out.println(numbersIterator.next());
        }
    }
}
