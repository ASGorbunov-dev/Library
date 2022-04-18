package main;

import model.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Author author = new Author(1L, "Хорстман", "Кей", "");
        Author author2 = new Author(2L, "Блох", "Джошуа", "");

        Genre genre = new Genre(1L, "Учебная литература");
        PubHouse pubHouse = new PubHouse();
        pubHouse.setId(1L);
        pubHouse.setPubHouseTitle("Pearson Education lnc.");
        PubHouse pubHouseTranslate = new PubHouse();
        pubHouseTranslate.setId(2L);
        pubHouseTranslate.setPubHouseTitle("ООО \"Диалектика\"");
        Book book = new Book();
        book.setId(1L);
        book.setUuid(UUID.randomUUID());
        book.setOriginalTitle("Core Java® Volume 1- Fundamentals");
        book.setTitle("Java®. Том 1 - Основы");
        book.setNumberOfEdition(11L);
        book.setYearOfEdition("2019");
        book.setYearOfEditionTranslate("2019");
        book.setIsbnOriginal("978-0-13-516630-7");
        book.setIsbnTranslate("978-5-907114-79-1");
        book.setPubHouse(pubHouse);
        book.setPubHouseTranslate(pubHouseTranslate);
        book.setFileFormatBook(FileFormatBook.PDF);
        book.setGenre(genre);
        Set<Author> authorSet = new HashSet<>();
        authorSet.add(author);
        authorSet.add(author2);
        book.setAuthors(authorSet);
        book.setFileName("Хорстманн Кей -  Java. Библиотека профессионала Том 1 Основы, 11-е издание - 2019.pdf");
        System.out.println(book);


    }
}
