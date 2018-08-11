package com.kodilla.good.patterns.ordering;

import java.time.LocalDateTime;

public interface OrderLog {

    void log(User user, LocalDateTime date, Product product);
}
