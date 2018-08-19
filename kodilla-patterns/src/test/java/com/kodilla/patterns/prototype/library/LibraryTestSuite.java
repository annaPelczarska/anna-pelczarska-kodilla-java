package com.kodilla.patterns.prototype.library;

import org.junit.Test;
import org.junit.Assert;
import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        Library library = new Library("Library no1");

        Book book1 = new Book("title1", "author1", LocalDate.of(2001, 1, 1));
        Book book2 = new Book("title2", "author2", LocalDate.of(2002, 1, 1));
        Book book3 = new Book("title3", "author3", LocalDate.of(2003, 1, 1));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making a shallow clone of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library no2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library no3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        clonedLibrary.getBooks().remove(book2);

        //Then
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
    }
}
