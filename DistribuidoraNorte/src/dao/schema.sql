CREATE DATABASE distributor;
USE distrubutor;

CREATE TABLE client(
	code VARCHAR(25) NOT NULL PRIMARY KEY,
	name VARCHAR(25),
	lastName VARCHAR(25),
	address VARCHAR(25),
	numAddress INT(10),
	isActive INT(10),
        cantBought INT(10)
)ENGINE = INNODB;


CREATE TABLE provider(
	name VARCHAR(25) NOT NULL PRIMARY KEY,
	city VARCHAR(25),
	address VARCHAR(25),
	numAddress INT(10),
	numPhone VARCHAR(25),
	email VARCHAR(25),
	area VARCHAR(25)
)ENGINE = INNODB;


CREATE TABLE product(
	code VARCHAR(25) NOT NULL PRIMARY KEY,
	description VARCHAR(50),
	stock INT(10),
        cantBought INT(10),
	isActive INT(10),
	cost FLOAT,
	price FLOAT,
	area VARCHAR(25),
	nameProvider VARCHAR(25),
	INDEX (nameProvider),
	FOREIGN KEY (nameProvider) REFERENCES provider(name)
	ON DELETE SET NULL ON UPDATE CASCADE
)ENGINE = INNODB;


CREATE TABLE buy(
	code VARCHAR(25) NOT NULL PRIMARY KEY,
	cant INT(10),
	cost FLOAT,
	buyDate DATE,
	FOREIGN KEY (code) REFERENCES product(code)
	ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE = INNODB;

CREATE TABLE invoice(
	numberInvoice INT NOT NULL PRIMARY KEY,
	clientCode VARCHAR(25) NOT NULL,
	invoiceDate DATE,
	total FLOAT,
	FOREIGN KEY (clientCode) REFERENCES client(code)
	ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE = INNODB;

-- clientPhone table is a list of client's phones
CREATE TABLE clientPhone(
	code VARCHAR(25) NOT NULL,
	numberPhone VARCHAR(25) NOT NULL,
	PRIMARY KEY (code, numberPhone),
	FOREIGN KEY (code) REFERENCES client(code)
	ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE = INNODB;

-- providerPhone table is a list of provider's phones
CREATE TABLE providerPhone(
	name VARCHAR(25) NOT NULL,
	numberPhone VARCHAR(25) NOT NULL,
	PRIMARY KEY (name, numberPhone),
	FOREIGN KEY (name) REFERENCES provider(name)
	ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE = INNODB;


-- invoiceProduct table is a list of products that was sold in invoice table 
CREATE TABLE invoiceProduct(
	numberInvoice INT NOT NULL,
	codeProduct VARCHAR(25),
	cant INT,
	PRIMARY KEY (numberInvoice, codeProduct),
	FOREIGN KEY (numberInvoice) REFERENCES invoice(numberInvoice)
	ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY (codeProduct) REFERENCES product(code)
	ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE = INNODB;


-- Triggers definition
-- When the user buy a product then update the product stock and if the price of product is change, update it
CREATE TRIGGER fixProduct_AfterBuy AFTER INSERT ON buy
	FOR EACH ROW
            UPDATE product SET cost = NEW.cost, stock = stock + NEW.cant, cantBought = cantBought + NEW.cant;

-- When the user invoice a product then update the product stock
CREATE TRIGGER fixProduct_AfterInvoice AFTER INSERT ON invoiceProduct
	FOR EACH ROW 
  	   UPDATE product SET stock = stock - NEW.cant;
