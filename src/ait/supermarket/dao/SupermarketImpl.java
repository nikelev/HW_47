package ait.supermarket.dao;

import ait.supermarket.model.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class SupermarketImpl implements Supermarket {
    private Collection<Product> products;

    public SupermarketImpl(Collection<Product> products) {

        for (Product p : products) {
            addProduct(p);
        }
    }

    @Override
    public boolean addProduct(Product product) {
        if (product == null) {
            throw new RuntimeException("null");
        }
        if (findByBarCode(product.getBarCode()) != null) {
            return false;
        }

        return products.add(product);
    }

    @Override
    public Product removeProduct(long barCode) {
        Product product = findByBarCode(barCode);
        products.remove(product);

        return product;
    }

    @Override
    public Product findByBarCode(long barCode) {
        for (Product product : products) {
            if (product.getBarCode() == barCode) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        Collection<Product> res = new ArrayList<Product>();
        for (Product p : products) {
            if (p.getCategory().equals(category)) {
                res.add(p);
                return res;
            }

        }

        return null;
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        Collection<Product> res = new ArrayList<Product>();
        for (Product p : products) {
            if (p.getBrand().equals(brand)) {
                res.add(p);
                return res;
            }

        }

        return null;
    }

    @Override
    public Iterable<Product> findProductsWithExpiredDate(String brand) {
        Collection<Product> res = new ArrayList<Product>();

        return null;
    }

    @Override
    public int skuQuantity() {
        return products.size();
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
