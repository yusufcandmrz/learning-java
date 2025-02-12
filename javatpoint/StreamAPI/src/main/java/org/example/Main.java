package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jetbrains.android.facet.AndroidFacet;


public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 30000f));
        productList.add(new Product(3, "Lenovo Laptop", 28000f));
        productList.add(new Product(4, "Sony Laptop", 28000f));
        productList.add(new Product(5, "Apple Laptop", 90000f));

        // Filtering Collection without using Stream
        List<Double> productPriceList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getPrice() < 30000d) {
                productPriceList.add(product.getPrice());
            }
        }
        System.out.println(productPriceList);
        System.out.println("**************************");

        // Filtering Collection with using Stream
        List<Double> productPriceListII = productList.stream().map(Product::getPrice).filter(price -> price < 30000d).toList();
        System.out.println(productPriceListII);
        System.out.println("**************************");

        // Stream Iterating
        Stream.iterate(1, element -> element + 1)
                .filter(element -> element % 5 == 0)
                .limit(5)
                .forEach(System.out::println);

        // Filtering and Iterating Collection
        productList.stream().filter(product -> product.getPrice() == 30000d).forEach(product -> System.out.println(product.getName()));

        // reduce() Method in Collection
        double sumPrice = productList.stream().map(Product::getPrice).reduce(0d, Double::sum);
        System.out.println("sumPrice: " + sumPrice);

        // Sum by Using Collectors Methods
        double sumPriceII = productList.stream().mapToDouble(Product::getPrice).sum();
        System.out.println("sumPriceII: " + sumPriceII);

        // Find Max and Min Product Price
        Product maxPriceProduct = productList.stream().max((product, productII) -> product.getPrice() > productII.getPrice() ? 1 : -1).get();
        System.out.println("maxProduct: " + maxPriceProduct);

        Product minPriceProduct = productList.stream().min((product, productII) -> product.getPrice() > productII.getPrice() ? 1 : -1).get();
        System.out.println("minPriceProduct: " + minPriceProduct);

        // count() Method in Collection
        long productCount = productList.stream().filter(product -> product.getPrice() < 30000d).count();
        System.out.println("productCount: " + productCount);

        // Convert List into Set
        Set<Double> productSet = productList.stream().map(Product::getPrice).filter(productPrice -> productPrice < 30000d).collect(Collectors.toSet());
        System.out.println("productSet: " + productSet);

        // Convert List into Map
        Map<Integer, String> productMap = productList.stream().collect(Collectors.toMap(Product::getId, Product::getName));
        System.out.println("productMap: " + productMap);
    }
}