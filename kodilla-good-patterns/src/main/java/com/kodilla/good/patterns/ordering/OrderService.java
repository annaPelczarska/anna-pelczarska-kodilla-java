package com.kodilla.good.patterns.ordering;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order(User user, LocalDateTime date, Product product);
}
