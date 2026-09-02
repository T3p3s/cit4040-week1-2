CREATE DATABASE library;

\connect library

CREATE TABLE books (
    id SERIAL PRIMARY KEY,
    title VARCHAR(200) NOT NULL,
    author VARCHAR(120) NOT NULL,
    pages INTEGER,
    available BOOLEAN DEFAULT TRUE
);

INSERT INTO books (title, author, pages)
VALUES
    ('1984', 'George Orwell', 328),
    ('The Hobbit', 'J.R.R. Tolkien', 310),
    ('Animal Farm', 'George Orwell', 112),
    ('Dune', 'Frank Herbert', 412);

SELECT *
FROM books
WHERE pages > 300;

SELECT title
FROM books
ORDER BY title ASC;
