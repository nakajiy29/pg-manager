# book table
CREATE TABLE books.book (
    isbn varchar(255) NOT NULL PRIMARY KEY,
    title varchar(255) NOT NULL,
    auhor varchar(255) NOT NULL,
    publisher varchar(255) NOT NULL,
    issue_year year NOT NULL
);

# user table
CREATE TABLE books.user (
    user_id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    bitrhday datetime NOT NULL
);

# borrow table
CREATE TABLE books.borrow (
    borrow_id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    user_id int(11) UNIQUE NOT NULL,
    library_id int(11) UNIQUE NOT NULL,
    checkout_at datetime NOT NULL,
    return_at datetime NOT NULL
);

# library table
CREATE TABLE books.library (
    library_id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    isbn varchar(255) NOT NULL UNIQUE,
    purchased_at datetime NOT NULL
);