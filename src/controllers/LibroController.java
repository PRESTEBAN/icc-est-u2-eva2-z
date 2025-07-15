package controllers;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import models.Book;

public class LibroController {

    public Map<Book, Book> procesarLibros(List<Book> libros) {

        Comparator<Book> comp = new Comparator<Book>() {
            @Override
            public int compare(Book lib1, Book lib2) {

                int result = lib2.getTitulo().compareTo(lib1.getTitulo());

                if (result == 0) {
                    result = Integer.compare(lib1.getAnio(), lib2.getAnio());
                }

                if (result == 0) {
                    return 0;
                }

                return result;
            }
        };

        Map<Book, Book> libMap = new TreeMap<>(comp);

        for (Book book : libros) {
            libMap.put(book, book);
        }

        return libMap;
    }
}
