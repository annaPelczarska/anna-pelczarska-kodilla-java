package com.kodilla.good.patterns.ordering;

public class OrderProcessor {

    private InformationService informationService;
    private OrderLog orderLog;
    private OrderService orderService;

    public OrderProcessor(final InformationService informationService, final OrderLog orderLog, final OrderService orderService) {
        this.informationService = informationService;
        this.orderLog = orderLog;
        this.orderService = orderService;
    }

    public OrderDto process(final Order order){
        boolean isOrdered = orderService.order(order.getUser(),order.getDate(),order.getProduct());
        if(isOrdered){
            informationService.inform(order.getUser());
            orderLog.log(order.getUser(),order.getDate(),order.getProduct());
            return new OrderDto(order.getUser(),true,order.getProduct());
        }else {
            return new OrderDto(order.getUser(),false,order.getProduct());
        }
    }
}
