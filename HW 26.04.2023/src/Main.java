import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Programmer> programmers = List.of(
                new Programmer("Pr.1", "Berlin", List.of(new Task(8, "testing", "in process", 2 ))),
                new Programmer("Pr.2", "Oslo", List.of(new Task(3, "tests coding", "finished", 5 ))),
                new Programmer("Pr.3", "Munich", List.of(new Task(1, "app develop", "in process", 30 ))),
                new Programmer("Pr.4", "Berlin", List.of(new Task(2, "updating", "finished", 2 ))),
                new Programmer("Pr.5", "Dubai", List.of(new Task(4, "data analise", "finished", 7 ))),
                new Programmer("Pr.6", "Hamburg", List.of(new Task(5, "visualisation", "in process", 15 ))),
                new Programmer("Pr.7", "Tallinn", List.of(new Task(6, "testing", "failed", 9 )))

        );

        List res = programmers.stream()
                                .flatMap(programmer -> programmer.getTasks().stream())
                                .sorted(Comparator.comparingInt(Task::getDaysInProcessing)
                                    .reversed())
                                .limit(5)
                                .collect(Collectors.toList());

        res.forEach(System.out::println);



    }
}