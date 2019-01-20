package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookAset = new HashSet<>();
        bookAset.add(new Book("author1","title1", 1813,"sig1"));
        bookAset.add(new Book("author2","title2", 1913,"sig2"));
        bookAset.add(new Book("author3","title3", 2013,"sig3"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int libApublicationYearMedian = medianAdapter.publicationYearMedian(bookAset);
        //Then
        System.out.println(libApublicationYearMedian);
        assertEquals(libApublicationYearMedian,1913,0);

    }
}
