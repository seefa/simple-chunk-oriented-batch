package ir.seefa.batch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 7/29/22 T 20:05
 */
public class SimpleItemReader implements ItemReader<String> {

    private List<String> dataset = new ArrayList<>();
    private Iterator<String> iterator;

    public SimpleItemReader() {
        this.dataset.add("Saman");
        this.dataset.add("Ali");
        this.dataset.add("Kristy");
        this.dataset.add("Reza");
        this.dataset.add("John");
        this.dataset.add("Mark");
        this.dataset.add("Alex");
        this.dataset.add("Hamid");
        this.dataset.add("Martin");
        this.dataset.add("Nima");
        this.dataset.add("Mona");
        this.dataset.add("Iran");
        this.dataset.add("Kevin");
        this.dataset.add("Delfani");
        this.dataset.add("Ziba");
        this.dataset.add("Rahman");
        this.dataset.add("Benita");

        this.iterator = this.dataset.iterator();
    }

    @Override
    public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        return iterator.hasNext() ? iterator.next() : null;
    }
}
