package ro.kudostech.sfgthymeleafcourse.service;

import ro.kudostech.sfgthymeleafcourse.domain.Product;

import java.util.List;

public interface ProductService {
    Product getProduct(Integer id);

    List<Product> listProducts();
}
