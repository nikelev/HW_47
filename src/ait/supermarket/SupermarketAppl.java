package ait.supermarket;

import ait.supermarket.dao.Supermarket;
import ait.supermarket.dao.SupermarketImpl;
import ait.supermarket.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class SupermarketAppl {
    public static void main(String[] args) {
        Collection<Product> supermarket=new ArrayList<Product>();
        supermarket.add(new Product(111,"name1", "category1", "brand1", 1.1, LocalDate.now().plusYears(1)));
        supermarket.add(new Product(222,"name2", "category1", "brand2", 1.2, LocalDate.now().plusYears(1)));
        supermarket.add(new Product(333,"name3", "category2", "brand3", 1.3, LocalDate.now().plusYears(1)));

        supermarket.forEach(s-> System.out.println(s));
    }
}
