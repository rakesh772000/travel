CREATE TABLE places (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    city VARCHAR(100),
    category VARCHAR(100),
    rating DOUBLE,
    price_per_day DOUBLE
);

INSERT INTO places (name, city, category, rating, price_per_day) VALUES
('Goa Beaches', 'Goa', 'Beach', 4.5, 3000),
('Manali', 'Manali', 'Hill', 4.6, 2500);