package controllers;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import models.Book;

public class LibroController {


    public Map<Book, Book> procesarLibros(List<Book> libros){
        
    
       Comparator<Book> comp = new Comparator() {
           @Override
           public int compare(Book lib1, Book lib2) {
               int result =  lib1.getTitulo().compareTo(lib2.getTitulo());

               if (result == 0 ) {
                   return Integer.compare(lib1.getAnio(), lib2.getAnio());
               }

               return result;
           }


       };

        Map<Book, Book> lib = new TreeMap<>(comp);
        
        for (Book book : libros) {
             lib.put(book, book);

        }

        

         return null;

    }
}
