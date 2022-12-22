package Service;

import Model.Book;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WriteToDatabase {
    static Connection connection = PostgresConnection.getInstance();
    public static void write (Book book) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into books" +
                "(name,author,genre,pageCount,price,release_date)" +
                "values(?,?,?,?,?)");
        Date date = Date.valueOf(book.getRelease_date());
        preparedStatement.setString(1, book.getName());
        preparedStatement.setString(2, book.getAuthor());
        preparedStatement.setString(3, book.getGenre());
        preparedStatement.setInt(4, book.getPageCount());
        preparedStatement.setDouble(5, book.getPrice());
        preparedStatement.setDate(6, date);
        preparedStatement.execute();
    }
}
