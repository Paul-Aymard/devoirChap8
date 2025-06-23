package bookstoread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookShelf {
    private final List<Book> books = new ArrayList<>();

    public void add(Book... booksToAdd) {
        Arrays.stream(booksToAdd).forEach(books::add);
    }

    public List<Book> arrangeByPublicationDate() {
        return books.stream()
                .sorted(Comparator.comparing(Book::getPublishedOn))
                .collect(Collectors.toList());
    }

}
