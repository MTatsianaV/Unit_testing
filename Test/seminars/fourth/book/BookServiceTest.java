package seminars.fourth.book;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
public class BookServiceTest {
    @Mock
    private BookRepository bookRepository;

    private BookService bookService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testFindBookById() {
        // Arrange
        String id = "1";
        Book book = new Book(id, "Book1", "Author1");
        when(bookRepository.findById(id)).thenReturn(book);

        // Act
        Book result = bookService.findBookById(id);

        // Assert
        assertEquals(book, result);
    }

    @Test
    public void testFindAllBooks() {
        // Arrange
        List<Book> books = Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        );
        when(bookRepository.findAll()).thenReturn(books);

        // Act
        List<Book> result = bookService.findAllBooks();

        // Assert
        assertEquals(books, result);
    }
}