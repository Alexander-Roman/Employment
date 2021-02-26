CREATE TABLE employees
(
    id       BIGINT AUTO_INCREMENT,
    name     VARCHAR(255) NOT NULL,
    email    VARCHAR(255) UNIQUE,
    position VARCHAR(255),
    phone    VARCHAR(255) UNIQUE,
    photo    VARCHAR(255),
    code     VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);