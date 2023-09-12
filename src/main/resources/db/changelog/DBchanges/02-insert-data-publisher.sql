
--liquibase formatted sql
--changeset jakeChrysler:2

INSERT INTO publisher (id, name, author_id) VALUES (1, 'publisher 1', 1);
INSERT INTO publisher (id, name, author_id) VALUES (2, 'publisher 2', 3);
INSERT INTO publisher (id, name, author_id) VALUES (3, 'publisher 3', 2);
INSERT INTO publisher (id, name, author_id) VALUES (4, 'publisher 4', 2);