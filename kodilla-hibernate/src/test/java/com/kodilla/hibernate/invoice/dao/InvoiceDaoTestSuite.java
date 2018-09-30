package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("stapler");
        Product product2 = new Product("sticky notes");
        Product product3 = new Product("folder");
        Item item1 = new Item(product1, new BigDecimal(24.99), 5);
        Item item2 = new Item(product1, new BigDecimal(24.99), 10);
        Item item3 = new Item(product2, new BigDecimal(9.99), 12);
        Item item4 = new Item(product3, new BigDecimal(16.50), 60);

        List<Item> itemList1 = new ArrayList<>();
        itemList1.add(item1);
        itemList1.add(item3);
        itemList1.add(item4);
        List<Item> itemList2 = new ArrayList<>();
        itemList1.add(item2);

        Invoice invoice = new Invoice("1.2018", itemList1);
        Invoice invoice2 = new Invoice("2.2018", itemList2);

        //When
        invoiceDao.save(invoice);
        //Then
        int id = invoice.getId();
        Invoice readInvoice = invoiceDao.findOne(id);
        Assert.assertEquals(id, readInvoice.getId());
        //CleanUp
        invoiceDao.delete(id);
    }
}
