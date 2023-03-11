import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {
    public List<String> copies3(List<String> strings) {

//
//        Lista strings jest zamieniana na stream przez metodę/funkcję stream().
//        Dalej używamy fukncji map(), która mapuje każdy element stream'a na jakiś inny element ,
//        w naszym przypadku pojedyńczy string n jest mapowany na potrojny string n.
//        Argumentem funkcji map jest lambda.
//        Funkcja map zwraca Stream'a ze zmienionymi, zmapowanymi elementami.
//        Funkcja collect zamienia stream  z powrotem na listę.
//        Collectors.toList to argument który mówi fukncji collect jak zamieniać elementy stream na elementy listy.
//        return strings.stream().map(n->n+n+n).collect(Collectors.toList());


//        Tworzymy nową zmienną typu List<String>, która jest listą którą chcemy zwrócić z fukncji/metody Copies3.
        List<String> resultStrings = new ArrayList<>();
//      Początek pętli for
        for (int i = 0; i < strings.size(); i++) {
//            Pobranie konkretnego stringa z konkretnego indexu listy wyjściowej strings
            String input = strings.get(i);
//            Stworzenie nowego sformatowanego stringa zgodnie z wymogami zadania
            String output = input + input + input;
//            Dodanie sformatowanego stringa do nowej listy
            resultStrings.add(output);
//        }

//

        }
//        Zwrócenie nowej listy ze mienionymi stringami z metody Copies3
        return resultStrings;
    }
}