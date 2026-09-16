-- Insert sample categories
INSERT INTO categories (name, description) VALUES
            ('Electronics', 'Electronic devices and accessories'),
            ('Clothing', 'Apparel and fashion items'),
            ('Books', 'Books and publications');
-- Insert sample products
INSERT INTO products (name, description, price, category_id) VALUES
            ('Smartphone', 'Latest model smartphone', 699.99, 1),
            ('Laptop', 'High performance laptop', 999.99, 1),
            ('T-Shirt', 'Cotton T-Shirt', 19.99, 2),
            ('Java Programming', 'Learn Java Programming', 49.99, 3);
-- Insert initial stock
INSERT INTO stocks (product_id, quantity) VALUES
                                        (1, 50),
                                        (2, 30),
                                        (3, 100),
                                        (4, 75);