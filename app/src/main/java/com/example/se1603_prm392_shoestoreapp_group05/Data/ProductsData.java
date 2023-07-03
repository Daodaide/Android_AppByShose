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
            nikeProducts.add(new Product(1, "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/ec2539ca-f2a1-47b3-a5a0-18206cd4023e/blazer-low-77-shoes-FW01p3.png", " Nike Blazer Low '77", 117.21, "Nike", " Praised by the streets for its simplicity and comfort, the Blazer returns with its classic hoops style. The two-tone accents on the Swoosh logos and outsole give it a new twist, while durable leather and suede accents make this a wardrobe staple.", " Summit White/Black/Summit White/Light Silver","EU40"));
            nikeProducts.add(new Product(2, "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/220a9e95-2e4e-48ab-87af-6e1e914e3c04/air-force-1-07-shoes-G4VDWz.png", "Nike Air Force 1 '07", 136.61, "Nike", "The radiance lives on in the AF-1 '07, bringing you timeless style that's easy to wear. Durable leather gives these sneakers a classic feel while perforated side panels in University Red add just the right amount of style to make you shine. Of course, some things never change: Nike Air units still cushion your every step.", " Sail/University Red/Coconut Milk/Sail","EU38"));
            nikeProducts.add(new Product(3, "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/91397f06-dc7f-49a4-90f3-0abf0a3c2884/air-max-97-shoes-EBZrb8.png", "Nike Air Max 97", 198.19, "Nike", "Featuring the original ripple design inspired by Japanese bullet trains, the Nike Air Max 97 lets you push your style full-speed ahead.Taking the revolutionary full-length Nike Air unit that shook up the running world and adding fresh colours and crisp details, it lets you ride in first-class comfort.", "Oxygen Purple","EU38"));
            nikeProducts.add(new Product(4, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/9764792d-d405-4c6e-8561-1f350001aedd/e-series-1-shoes-j57hxR.png", "Nike E-Series 1.0", 105.00, "Nike", "Supercharge simplicity with the Nike E-Series 1.0. From the easy-to-style colours to the plush materials, including a padded collar and foam midsole, it's your invitation to get going. And for the finishing touch, the outsole pattern is inspired by zen sand gardens. Go ahead—find your calm place.", "Light Orewood Brown","EU40"));
            nikeProducts.add(new Product(5, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/8142d726-b5ac-4917-a60e-7e6e8889e766/impact-4-basketball-shoes-CcJxBx.png", "Nike Impact 4", 111.73, "Nike", "Elevate your game and your hops. Charged with Max Air cushioning in the heel, this lightweight, secure shoe helps you get off the ground confidently and land comfortably. Plus, rubber wraps up the sides for added durability and stability.", "University Gold","EU38"));
            nikeProducts.add(new Product(6, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/338ccc32-f24a-4c0b-996c-679a9c534f00/tech-hera-shoes-8MQgCL.png", "Nike Tech Hera", 136.61, "Nike", "Nike Tech HeraThe Tech Hera is here to fulfil all of your chunky sneakers wishes. The wavy lifted midsole and suede accents level up your look while keeping you comfortable. And its durable design holds up beautifully to everyday wear—which is perfect, because you'll definitely want to wear these every day.", "White/Black","EU39"));
            nikeProducts.add(new Product(7, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/79bc1aba-c8b7-4975-89b9-99eda79cf5b4/air-force-1-mid-07-lv8-shoes-4Qsjls.png", "Nike Air Force 1 Mid '07 LV8", 161.49, "Nike", "The radiance lives on in the Air Force 1 '07. This b-ball original offers a fresh look with stitched overlays, crisp leather and the perfect amount of colour. Colour-blocking on the sole and Swooshes is combined with mismatched logos for a look that's part retro, part modern and all you.", "University Red","EU39"));
            nikeProducts.add(new Product(8, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/79ecdc1b-bca8-4a57-912c-2a128ef2277a/air-jordan-1-mid-shoes-SQf7DM.png", "Air Jordan 1 Mid", 154.74, "Nike", "Inspired by the original AJ1, this mid-top edition maintains the iconic look you love while choice colours and crisp leather give it a distinct identity.", "White/Green","EU39"));
            nikeProducts.add(new Product(9, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/f21a648c-4017-442c-b1c6-270b28fab14d/air-max-plus-3-shoes-m3bzP8.png", "Nike Air Max Plus 3", 235.72, "Nike", "Featuring the same Tuned Air technology as its predecessors, the Nike Air Max Plus 3 updates the look with TPU fused to the upper while paying homage to the iconic colour fade of the OG.", "White/Green","EU40"));
            nikeProducts.add(new Product(10, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/a4fe47a4-6eaf-4df6-9684-9586e1a2596e/jumpman-mvp-shoes-JV1HCs.png", "Jumpman MVP", 204.51, "Nike", "We didn't invent the remix—but considering the material we get to sample, this one's a no-brainer. We fired up the SP-12 and took elements from the AJ6, 7 and 8, making them into a completely new shoe that celebrates MJ's first 3-peat championship run. With leather, textile and nubuck details, these sneakers honour one legacy while encouraging you to cement your own.", "Black/University","EU37"));
            nikeProducts.add(new Product(11, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/13721f24-2774-443e-a27d-998d2c6be068/air-force-1-07-flyease-shoes-LKXPhZ.png", "Nike Air Force 1 '07 FlyEase", 136.61, "Nike", "Quicker than 1, 2, 3—the original hoops shoe lets you step in and get going. Its easy-entry FlyEase system gives you a hands-free experience, while crisp leather dons the cleanest colour for ultimate wearability. Yeah, it's everything you love and then some.", "White","EU36.5"));
            nikeProducts.add(new Product(12, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/1853308a-2d38-43c2-b978-05a18e6ec40d/dunk-high-retro-shoes-c4lpG4.png", "Nike Dunk High Retro Premium", 154.74, "Nike", "50 years after the birth of the genre, hip-hop is still influencing streetwear. Nike shoes have always been an integral part of this culture, both influencing and being influenced by iconic musicians, artists and fans. Celebrate half a century of art and culture with platinum details like a microphone charm. Lace up and get spinning.", "Grey/Beach/Black","EU37.5"));
            nikeProducts.add(new Product(13, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/b04d4c27-d586-46c7-809e-6b0de2bb0480/air-force-1-high-07-lx-shoes-wb31gJ.png", "Nike Air Force 1 High '07 LX", 179.63, "Nike", "50 years after the birth of the genre, hip-hop is still influencing streetwear. Nike shoes have always been an integral part of this culture—both influencing and being influenced by iconic musicians, artists and fans. Celebrate half a century of art and culture with platinum and gold records on your soles and metallic grey details on the upper to match. Lace up and get spinning.", "Black/Beach/Smoke Grey/White","EU38.5"));
            nikeProducts.add(new Product(14, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/bc4ea557-e918-4ff5-af44-4bc71f97eb28/air-max-plus-shoes-pFKxz0.png", "Nike Air Max Plus", 210.84, "Nike", "Let your attitude have the edge with flame-like caging that adds heat to the streets, while airy mesh keeps you cool. The Nike Air Max Plus gives you a tuned Nike Air experience that offers premium stability and unbelievable cushioning.", "Black/White/Deep Royal/Scream Green","EU36"));
            nikeProducts.add(new Product(15, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/f2c02ade-2a08-459e-8a0d-6bc9247c5a40/air-trainer-1-shoes-d2gTvV.png", "Nike Air Trainer 1", 148.42, "Nike", "The original cross-trainer from '87 now lets you cross the city centre without a glitch. Details like a forefoot strap add retro appeal, leather breaks in beautifully, and if that's not enough, Air cushioning keeps you comfortable on long outings. So where will you take your Trainers?", "White/Black","EU39.5"));

            // Danh sách sản phẩm Puma
            List<Product> pumaProducts = new ArrayList<>();
            pumaProducts.add(new Product(16, " https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/377232/04/sv01/fnd/PNA/fmt/png/Tazon-Advance-Leather-Men's-Running-Shoe", "Tazon Advance Leather Men's Running Shoe", 31.99, "Puma"," The Tazon's you know and love get an exciting upgrade with the Tazon Advance. We've made imporvements to both comfort and efficiency. Get ready to run further, longer, and smoother.", "Puma Black-Puma White","EU40"));
            pumaProducts.add(new Product(17, " https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/374915/01/sv01/fnd/PNA/fmt/png/Suede-Classic-XXI-Men's-Sneakers", "Suede Classic XXI Men's Sneakers", 75.00,  "Puma", "The Suede hit the scene in 1968 and has been changing the game ever since. It’s been worn by icons of every generation, and it’s stayed classic through it all. Instantly recognizable and constantly reinvented, Suede’s legacy continues to grow and be legitimized by the authentic and expressive individuals that embrace the iconic shoe. Be apart of the history of Suede."," Puma Black-Puma White","EU39"));
            pumaProducts.add(new Product(18, " https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/377333/02/sv01/fnd/PNA/fmt/png/Viz-Runner-Repeat-Men's-Running-Sneakers", "Viz Runner Repeat Men's Running Sneakers", 40.99, "Puma", "Viz Runner's stable cushioning will take care of all your running needs."," Puma Black-Puma White","EU39"));
            pumaProducts.add(new Product(19, " https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/391518/01/sv01/fnd/PNA/fmt/png/PUMA-x-THUNDERCATS-RS-X-T3CH-Thundercats-Men's-Sneakers", "PUMA x THUNDERCATS RS-X T3CH Thundercats Men's Sneakers", 120.00, "Puma", " ThunderCats, ho! We've paired the iconic 1980's cartoon with our RS-X T3CH sneaker for a style that would make Lion-O proud. Designed by Alexander John, these sneakers are outfitted with plenty of references to the classic series, including spike details and tiger stripes. Jump into these shoes and let everyone on Third Earth hear your roar.","Anise Flower-Rickie Orange","EU38"));
            pumaProducts.add(new Product(20, " https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/378319/01/sv01/fnd/PNA/fmt/png/PUMA-x-LAMELO-BALL-MB.02-Whispers-Men's-Basketball-Shoes", "PUMA x LAMELO BALL MB.02 Whispers Men's Basketball Shoes", 130.00, "Puma"," The second signature shoe. The follow up. The MB.02. This version is just as disruptive as the first, just as bold, and just as Melo. It has a NITRO Infused midsole that takes you high above the rim, a non-slip rubber outsole to help you cut to the basket, and a whole load of flair that makes you stand out even more on the court. It’s Melo in shoe form. And it’s still Not From Here.","Frosted Ivory-PUMA Black","EU39"));
            pumaProducts.add(new Product(21, " https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/356999/12/sv01/fnd/PNA/fmt/png/Super-Liga-OG-Retro-Sneakers", "Super Liga OG Retro Sneakers", 70.00, "Puma", "From the PUMA Soccer archives, the Super Liga is an '80s icon. The low profile design, vintage suede and leather material mix, and laid-back style hit the streets this season to continue the legacy off the field", "Puma White-Puma Black-Puma Team Gold","EU39"));
            pumaProducts.add(new Product(22, " https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/376941/12/sv01/fnd/PNA/fmt/png/PUMA-x-LAMELO-BALL-MB.01-Lo-Men's-Basketball-Shoes", "PUMA x LAMELO BALL MB.01 Lo Men's Basketball Shoes ", 120.00, "Puma"," For the latest LaMelo Ball drop, we went back to the original. Featuring that distinctly intricate upper in crisp white, with Melo-branded Not From Here accents—like his signature wings and “1 of 1” motto—in a clean, tonal treatment, these low-top kicks are in a league all their own. The galactic sole and space-age PUMA Hoops tech, including NITRO foam, make tournament ready look interplanetary. Your game will never be the same. ","PUMA Black-PUMA Black","EU39.5"));
            pumaProducts.add(new Product(23, " https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/391931/01/sv01/fnd/PNA/fmt/png/RS-X-The-Flash-Men's-Sneakers", "RS-X The Flash Men's Sneakers", 120.00, "Puma"," The DC Universe will never be the same. In preparation for the upcoming new movie, The Flash, PUMA has teamed up with the scarlet speedster in this electrifying new collab. At the center of it all, the RS-X gets a crimson and yellow redesign by the streetwear superheroes at BAIT.", "Red Dahlia ","EU37"));
            pumaProducts.add(new Product(24, " https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/379408/01/sv01/fnd/PNA/fmt/png/PUMA-x-LAMELO-BALL-MB.02-Lo-LaMel-O-Men's-Basketball-Shoes", "PUMA x LAMELO BALL MB.02 Lo LaMel-O Men's Basketball Shoes", 125.00, "Puma", " Inspired by our favorite fictional kids’ cereal, PUMA Hoops brings you MB.02 Lo LaMel-O’s. A streaming giant-worthy shade of green sits atop a bespeckled treatment at the NITRO™ foam-infused midsole, which mimics Melo’s signature wings, while a milky white upper serves as the perfect backdrop for “1 of 1” branding. There’s no doubt these sweet low-top kicks are breakfast—er, fast break—ready. MarshLaMel-Os not included.", "Elektro Green-PUMA White","EU37.5"));
            pumaProducts.add(new Product(25, " https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/366613/01/sv01/fnd/PNA/fmt/png/GV-Special+-Sneakers", "GV Special+ Sneakers", 75.00, "Puma", " In the late 1970s, Argentinean tennis player Guillermo Vilas went on a title-winning rampage. Known for his one-handed backhand and off-the-court charm, he paired with PUMA to create a line of tennis shoes that matched his winning style. Among them? The GV Special. And much like the man behind the legend, it quickly secured its rank: Icon.", "Puma White-Puma White ","EU36"));
            pumaProducts.add(new Product(26, " https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/374915/02/sv01/fnd/PNA/fmt/png/Suede-Classic-XXI-Men's-Sneakers", "Suede Classic XXI Men's Sneakers", 75.00, "Puma"," The Suede hit the scene in 1968 and has been changing the game ever since. It’s been worn by icons of every generation, and it’s stayed classic through it all. Instantly recognizable and constantly reinvented, Suede’s legacy continues to grow and be legitimized by the authentic and expressive individuals that embrace the iconic shoe. Be apart of the history of Suede.", "High Risk Red-Puma White","EU36.5"));
            pumaProducts.add(new Product(27, " https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/389289/01/sv01/fnd/PNA/fmt/png/Trinity-Men's-Sneakers", "Trinity Men's Sneakers", 69.99, "Puma", " The Trinity is all about our Futro aesthetic, taking heritage inspiration and reinterpreting it with a modern twist. This edition features a mesh base with cool overlay details and a sporty silhouette, for sneakers that pack a punch. Best of all, the SoftFoam+ sockliner keeps you feeling comfortable all day long.", "PUMA White-PUMA Black-Cool Light Gray ","EU40"));
            pumaProducts.add(new Product(28, " https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/393487/02/sv01/fnd/PNA/fmt/png/RS-X-MONO-Sneakers", "RS-X MONO Sneakers", 83.99, "Puma"," The RS family is getting wider with the new update with the RS-X. This sneaker uses textures instead of color to block the RS-X. We mix in tonal embossing with different materials to add more style and a mono look.", " Royal Sapphire-PUMA Black ","EU39"));
            pumaProducts.add(new Product(29, " https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/391132/02/sv01/fnd/PNA/fmt/png/Pacer-Future-Street-Knit-Sneakers", "Pacer Future Street Knit Sneakers", 56.99, "Puma"," These stripped-back sneakers feature a simplified design that showcases their distinctive silhouette. They're designed for moments of contemporary leisure.", "PUMA Black-Cool Dark Gray ","EU38"));
            pumaProducts.add(new Product(30, " https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_1350,h_1350/global/394981/01/sv01/fnd/PNA/fmt/png/RS-X-Faded-Daytona-Sneakers", "RS-X Faded Daytona Sneakers", 110.00, "Puma","A style that never fades, a sneaker that does. From the RS-X family comes Faded, boasting a two-tone colorway that stays true to its namesake. ", "Day Dream-Evening Sky-PUMA White","EU39"));

            // Kết hợp danh sách sản phẩm Nike và Puma theo thứ tự ngẫu nhiên
            productList.addAll(nikeProducts);
            productList.addAll(pumaProducts);

            Collections.shuffle(productList);

            return productList;
        }
    }
