package model;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor


public class Book {
    private Long id;
    private UUID uuid;
    private String title;
    private String originalTitle;
    private Long numberOfEdition;
    private String yearOfEdition;
    private String isbnOriginal;
    private String isbnTranslate;
    private String yearOfEditionTranslate;
    private PubHouse pubHouse;
    private PubHouse pubHouseTranslate;
    private FileFormatBook fileFormatBook;
    private Genre genre;
    private Set<Author> authors;
    private String fileName;

    @Override
    public String toString() {
        String line = "\nАвторы: " +
                authors.stream().map(Author::toString).collect(Collectors.joining(", "));
        return "Название: " + title
                + "\nОригинальное название: " + originalTitle
                +  genre
                + line + "\nГод издания: " + yearOfEdition
                + "\nНомер издания :" + numberOfEdition +" издание"
                + "\nISBN :" + isbnTranslate
                + "\nISBN :" + isbnOriginal
                + "\nГод издания перевода :" + yearOfEditionTranslate
                +  pubHouse
                +  pubHouseTranslate
                + "\nИмя файла :" + fileName;
    }
}

