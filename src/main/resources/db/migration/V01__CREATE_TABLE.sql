--------------------------------------------------------------------------------------------------
--  Category table
---------------------------------------------------------------------------------------------------
CREATE TABLE category
(
	category_id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL UNIQUE,
	description VARCHAR(200) NOT NULL
);

---------------------------------------------------------------------------------------------------

--------------------------------------------------------------------------------------------------
--  customer table
---------------------------------------------------------------------------------------------------
CREATE TABLE customer
(
    customer_id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE,
    email VARCHAR(50) NOT NULL UNIQUE,
    document_identifier VARCHAR(11) NOT NULL UNIQUE
);

---------------------------------------------------------------------------------------------------
-- category enum

CREATE TYPE category_type as enum('SNACK', 'SIDE', 'DRINK', 'DESSERT');

--------------------------------------------------------------------------------------------------

--------------------------------------------------------------------------------------------------
--  product table
---------------------------------------------------------------------------------------------------
CREATE TABLE product
(
    product_id SERIAL PRIMARY KEY,
    product_name VARCHAR(100) NOT NULL UNIQUE,
    product_description VARCHAR(200) NOT NULL,
    price double precision NOT NULL,
    category category_type NOT NULL
);

---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
-- order type enum

CREATE TYPE order_status as enum('RECEIVED', 'ONGOING', 'READY', 'FINISHED');

--------------------------------------------------------------------------------------------------

-------------------------------------------------------------------------------------------------
--  order table
---------------------------------------------------------------------------------------------------
CREATE TABLE order
(
    order_id SERIAL PRIMARY KEY,
    order_status order_status NOT NULL,
    price double precision not null,
    start_time timestamp default localtimestamp not null,
    end_time timestamp,
    category category_type NOT NULL
);

---------------------------------------------------------------------------------------------------

-------------------------------------------------------------------------------------------------
--  order_item table
---------------------------------------------------------------------------------------------------
CREATE TABLE order_item
(
    order_item_id SERIAL PRIMARY KEY,
    product_id int NOT NULL,
    order_id bigint NOT NULL,
    price double precision not null,
    FOREIGN KEY (product_id) REFERENCES produto (product_id),
    FOREIGN KEY (order_id)   REFERENCES order   (order_id)
);

---------------------------------------------------------------------------------------------------