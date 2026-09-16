-- Drop tables if they exist
DROP TABLE IF EXISTS stocks;
DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS categories;
-- Create categories table
CREATE TABLE categories (
                            id BIGINT AUTO_INCREMENT PRIMARY KEY,
                            name VARCHAR(100) NOT NULL UNIQUE,
                            description TEXT,
                            created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                            updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE
CURRENT_TIMESTAMP
);
-- Create products table
CREATE TABLE products (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(100) NOT NULL,
                          description TEXT,
                          price DECIMAL(10,2) NOT NULL,
                          category_id BIGINT NOT NULL,
                          created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE
CURRENT_TIMESTAMP,
                          FOREIGN KEY (category_id) REFERENCES categories(id)
);
-- Create stocks table
CREATE TABLE stocks (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        product_id BIGINT NOT NULL UNIQUE,
                        quantity INT NOT NULL DEFAULT 0,
                        last_updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE
CURRENT_TIMESTAMP,
                        FOREIGN KEY (product_id) REFERENCES products(id)
);
-- Create indexes
CREATE INDEX idx_category_name ON categories(name);
CREATE INDEX idx_product_name ON products(name);
CREATE INDEX idx_product_category ON products(category_id);