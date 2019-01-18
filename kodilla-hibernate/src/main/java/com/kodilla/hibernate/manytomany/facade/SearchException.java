package com.kodilla.hibernate.manytomany.facade;

public class SearchException extends Exception {

    public static String ERR_NOT_FOUND_EMPLOYEE = "No employee matching the search parameters was found";
    public static String ERR_NOT_FOUND_COMPANY = "No company matching the search parameters was found";

    public SearchException(String message) {
        super(message);
}
}
