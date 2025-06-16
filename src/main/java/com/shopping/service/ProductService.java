package com.shopping.service;

import com.shopping.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    private final Map<Long, Product> productMap = new HashMap<>();

    public ProductService() {
        productMap.put(1L, new Product(1L, "카푸치노", 4500, "맛있는 카푸치노", "/images/cappuccino01.png"));
        productMap.put(2L, new Product(2L, "크로아상", 5000, "빵은 역시 크로아상^^", "/images/croissant_01.png"));
        productMap.put(3L, new Product(3L, "우유", 3000, "따듯한 우유 조아요ㅎㅎ", "/images/milk01.jpg"));
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(productMap.values());
    }

    public Product getProductById(Long id) {
        return productMap.get(id);
    }
}