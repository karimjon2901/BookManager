package Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Book {
    String name;
    String author;
    String genre;
    Integer pageCount;
    Double price;
    String release_date;
}
