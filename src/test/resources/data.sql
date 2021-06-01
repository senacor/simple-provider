DROP TABLE IF EXISTS items;

CREATE TABLE ITEMS(
    id INT NOT NULL PRIMARY KEY,
    name TEXT NOT NULL,
    available INT NOT NULL,
    price DECIMAL NOT NULL
);

INSERT INTO items
    (id, name, price, available)
VALUES
    (0, 'Screwdriver', 2, 4),
    (1, 'Gear', 4, 4),
    (2, 'Blade', 8, 4);