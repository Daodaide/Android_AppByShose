package com.example.se1603_prm392_shoestoreapp_group05.Data;

import com.example.se1603_prm392_shoestoreapp_group05.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductData {
    public static List<Product> getSampleProducts() {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/i1-45a98dff-ee55-4c43-be36-6e128a417bdd/killshot-2-leather-shoe-DqWZ4j.png", "Nike Killshot 2 Leather", 118.12));
        productList.add(new Product("https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/374915/01/sv01/fnd/PNA/fmt/png/Suede-Classic-XXI-Men's-Sneakers", "Suede Classic XXI Men's Sneakers", 75.00));
        productList.add(new Product("https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/0869a27a-c36b-497e-9c16-c50db2d1e1a3/air-max-97-shoes-EBZrb8.png", "Nike Air Max 97", 199.72));
        productList.add(new Product("https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/377333/02/sv01/fnd/PNA/fmt/png/Viz-Runner-Repeat-Men's-Running-Sneakers", "Viz Runner Repeat Men's Running Sneakers", 40.99));
        productList.add(new Product("https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/1a484a7a-4b86-49e7-85f3-e53aed0bdbde/tech-hera-shoes-8MQgCL.png", "Nike Tech Hera", 137.67));
        productList.add(new Product("https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/356999/12/sv01/fnd/PNA/fmt/png/Super-Liga-OG-Retro-Sneakers", "Super Liga OG Retro Sneakers", 66.99));
        productList.add(new Product("https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/4b5264a2-7885-44b6-8e5d-7074e28289bf/air-jordan-1-mid-shoes-SQf7DM.png", "Air Jordan 1 Mid", 155.95));
        productList.add(new Product("https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/369115/08/sv01/fnd/PNA/fmt/png/Astro-Kick-Sneakers", "Astro Kick Sneakers", 35.99));
        productList.add(new Product("https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/a2eaf301-687e-4235-9dc6-d1cb70f927be/blazer-mid-77-shoes-fW78R7.png", "Nike Blazer Mid '77", 137.67));
        productList.add(new Product("https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_500,h_500/global/356999/19/sv01/fnd/PNA/fmt/png/Super-Liga-OG-Retro-Sneakers", "Super Liga OG Retro Sneakers", 66.99));
        return productList;
    }
}
