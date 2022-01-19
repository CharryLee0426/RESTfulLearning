# create.sql
# @author           Charry Lee
# @date             2022-01-19
# @description      create the REST database you will use.

CREATE DATABASE IF NOT EXISTS REST;

USE REST;

CREATE TABLE department (
                            id BIGINT PRIMARY KEY,
                            name VARCHAR(255) NOT NULL
);

CREATE TABLE employee (
                          id      BIGINT          PRIMARY KEY,
                          name    VARCHAR(255)    NOT NULL,
                          dep_id  BIGINT          NOT NULL,
                          FOREIGN KEY (dep_id) REFERENCES department(id)
);

INSERT INTO department (id, name)
VALUES
    (1, 'CS Dep.'),
    (2, 'FIN Dep.');

INSERT INTO employee (id, name, dep_id)
VALUES
    (1, 'Tom', 1),
    (2, 'Jerry', 2);