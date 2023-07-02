    package com.example.se1603_prm392_shoestoreapp_group05.Data;

    import com.example.se1603_prm392_shoestoreapp_group05.Model.Product;

    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;

    public class ProductsData {
        public static List<Product> getSampleProducts() {
            List<Product> productList = new ArrayList<>();

            // Danh sách sản phẩm Nike
            List<Product> nikeProducts = new ArrayList<>();
            nikeProducts.add(new Product(1, "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/i1-45a98dff-ee55-4c43-be36-6e128a417bdd/killshot-2-leather-shoe-DqWZ4j.png", "Nike Killshot 2 Leather", 118.12, "Nike", "Inspired by the original low-profile tennis shoe, the Nike Killshot 2 updates the upper with a variety of textured leathers to create a fresh look. From soft suedes to smooth leathers with the perfect sheen, it's court-side attitude with a modern touch. To prove you're on top, the rubber gum sole adds the cherry on bottom.", "Sail/Gum","EU40"));
            nikeProducts.add(new Product(3, "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/0869a27a-c36b-497e-9c16-c50db2d1e1a3/air-max-97-shoes-EBZrb8.png", "Nike Air Max 97", 199.72, "Nike", "Featuring the original ripple design inspired by Japanese bullet trains, the Nike Air Max 97 lets you push your style full-speed ahead.Taking the revolutionary full-length Nike Air unit that shook up the running world and adding fresh colours and crisp details, it lets you ride in first-class comfort.","Blue/White","EU38"));
            nikeProducts.add(new Product(5, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/1a484a7a-4b86-49e7-85f3-e53aed0bdbde/tech-hera-shoes-8MQgCL.png", "Nike Tech Hera", 137.67, "Nike","The Tech Hera is here to fulfil all of your chunky sneaker wishes. The wavy lifted midsole and suede accents level up your look while keeping you comfortable. Its durable design holds up beautifully to everyday wear—which is perfect, because you'll definitely want to wear these every day.", "Green/Brown","EU39"));
            nikeProducts.add(new Product(9, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/a2eaf301-687e-4235-9dc6-d1cb70f927be/blazer-mid-77-shoes-fW78R7.png", "Nike Blazer Mid '77", 137.67, "Nike", "50 years after the birth of the genre, hip-hop is still influencing streetwear. Nike shoes have always been an integral part of this culture—both influencing and being influenced by iconic musicians, artists and fans. Celebrate half a century of art and culture with platinum details like a microphone charm. Lace up and get spinning.","White/Black/White/Smoke Grey", "EU38"));

            // Danh sách sản phẩm Puma
            List<Product> pumaProducts = new ArrayList<>();
            pumaProducts.add(new Product(2, "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/374915/01/sv01/fnd/PNA/fmt/png/Suede-Classic-XXI-Men's-Sneakers", "Suede Classic XXI Men's Sneakers", 75.00, "Puma","The Suede hit the scene in 1968 and has been changing the game ever since. It’s been worn by icons of every generation, and it’s stayed classic through it all. Instantly recognizable and constantly reinvented, Suede’s legacy continues to grow and be legitimized by the authentic and expressive individuals that embrace the iconic shoe. Be apart of the history of Suede.","Puma Black-Puma White","EU40"));
            pumaProducts.add(new Product(4, "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/377333/02/sv01/fnd/PNA/fmt/png/Viz-Runner-Repeat-Men's-Running-Sneakers", "Viz Runner Repeat Men's Running Sneakers", 40.99, "Puma","Viz Runner's stable cushioning will take care of all your running needs.","Puma Black-Puma White","EU39"));
            pumaProducts.add(new Product(6, "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/356999/12/sv01/fnd/PNA/fmt/png/Super-Liga-OG-Retro-Sneakers", "Super Liga OG Retro Sneakers", 66.99, "Puma","From the PUMA Soccer archives, the Super Liga is an '80s icon. The low profile design, vintage suede and leather material mix, and laid-back style hit the streets this season to continue the legacy off the field.", "Puma White-Puma Black-Puma Team Gold", "EU37"));
            pumaProducts.add(new Product(8, "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/369115/08/sv01/fnd/PNA/fmt/png/Astro-Kick-Sneakers", "Astro Kick Sneakers", 35.99, "Puma","Kick it in style in the super-fresh Astro Kick. A clean synthetic leather upper features soccer-inspired deco stitching and a signature PUMA Formstrip for a classic look that scores big every time.","Puma White-Puma Team Gold-Gray Violet","EU41"));

            // Kết hợp danh sách sản phẩm Nike và Puma theo thứ tự ngẫu nhiên
            productList.addAll(nikeProducts);
            productList.addAll(pumaProducts);

            Collections.shuffle(productList);

            return productList;
        }
    }
