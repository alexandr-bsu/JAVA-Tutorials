package HashCodeTutorial;
import java.util.HashMap;
import java.util.Map;
public class Executor {
    public void execute() throws Exception{
        Map<Ticket, Book> library = new HashMap<>();
        Ticket ticket = new Ticket(10000);
        Book book = new Book("Alex", "Death book");
        library.put(ticket, book);

        System.out.println(library.get(ticket).name);
    }
}
