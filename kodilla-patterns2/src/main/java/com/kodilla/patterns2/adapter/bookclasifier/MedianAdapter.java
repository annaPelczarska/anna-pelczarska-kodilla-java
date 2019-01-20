package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet){
        Map<BookSignature,com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> LibraryABookMap = new HashMap<>();
        for (Book bA:bookSet) {
            com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book signatureLibraryABook =
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(bA.getAuthor(), bA.getTitle(), bA.getPublicationYear());
        BookSignature bookSignature = new BookSignature(bA.getSignature());
        LibraryABookMap.put(bookSignature, signatureLibraryABook);
        }
        return medianPublicationYear(LibraryABookMap);
    }
}
