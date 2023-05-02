//Дан список Account{Person person, String iban, double balance}.
// Необходимо сформировать Map<Person, Account>, где ключом будет Person, а значением список его счетов.

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List <Account> accounts = List.of(
                new Account("DE123456", 100.50, new Person("Adam", 20)),
                new Account("DE654321", 110.00, new Person("Eve", 25)),
                new Account("DE123123", 1000.00, new Person("Adam", 20)),
                new Account("DE111111", 300.20, new Person("Adam", 20)),
                new Account("DE456789", 538.20, new Person("Adam", 45))
        );


        Map<Person, List> map = accounts.stream()
                .collect(Collectors.toMap(o -> o.getPerson(), o -> List.of(o.getIban()+": "+o.getBalance()),
                        (o1, o2) -> (List.of(o1+","+o2))));
        System.out.println(map);




    }
}