import Model.Book;
import Service.WriteToDatabase;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Book book = new Book("Ikki Eshik orasi","O'tkir Hoshimov","Roman",624,25000.0,"2012-01-01");
        WriteToDatabase.write(book);
    }
}
