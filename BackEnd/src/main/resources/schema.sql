DROP TABLE IF EXISTS `Menu`;

DROP TABLE IF EXISTS `Orders`;

DROP TABLE IF EXISTS `Menu_Orders`;


CREATE TABLE `Menu`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `plate` VARCHAR(255) NOT NULL,
    `description` VARCHAR(255) NOT NULL,
    `image` VARCHAR(255) NOT NULL,
    `price` DECIMAL(8, 2) NOT NULL
);

CREATE TABLE `Orders`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `customer_name` VARCHAR(255) NOT NULL,
    `order_status` ENUM('en_preparation', 'prete') NOT NULL,
);

CREATE TABLE `Menu_Orders`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `id_menu` INT UNSIGNED NOT NULL,
    `id_order` INT UNSIGNED NOT NULL,
    `quantity` INT NOT NULL
);

ALTER TABLE
    `Menu_Orders` ADD CONSTRAINT `menu_orders_id_order_foreign` FOREIGN KEY(`id_order`) REFERENCES `Orders`(`id`) ON DELETE CASCADE;
ALTER TABLE
    `Menu_Orders` ADD CONSTRAINT `menu_orders_id_menu_foreign` FOREIGN KEY(`id_menu`) REFERENCES `Menu`(`id`);


INSERT INTO `Menu` (`plate`, `description`, `image`, `price`) VALUES
('Hello World Burger', 'Un cheeseburger classique (pain, steak, fromage, salade, sauce).', '🍔', 9.99),
('404 Not Found Fries', 'Des frites maison avec une sauce mystère (choisie aléatoirement par le backend !).', '🍟', 4.50),
('JSON Nuggets', 'Nuggets de poulet avec 3 sauces au choix (ketchup, mayo, barbecue).', '🍗', 6.99),
('Git Pull Tacos', 'Un taco simple avec poulet, salade, fromage et sauce.', '🌮', 7.99),
('Front-end Salad', 'Une salade légère avec tomates, feta et vinaigrette maison.', '🥗', 8.50),
('Back-End Brownie', 'Un brownie moelleux au chocolat.', '🍫', 4.99),
('Full Stack Menu', 'Un combo burger, frites et boisson.', '🍔', 15.99);