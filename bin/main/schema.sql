use shopping;

create table user
(
    id        bigint primary key auto_increment,
    account   varchar(50) not null unique,
    password  varchar(30) not null,
    user_name varchar(20),
    tel       varchar(20),
    phone     varchar(20),
    zip_code  varchar(20),
    address   varchar(100),
    email     varchar(20) not null unique,
    created   datetime default current_timestamp,
    modified  datetime default current_timestamp on update current_timestamp
    point int,
);

create table product
(
    id          bigint primary key auto_increment,
    name        varchar(50),
    price       int,
    menu_id     bigint,
    FOREIGN KEY (menu_id) REFERENCES menu (id),
    sub_menu_id bigint,
    detail      varchar(1000),
    image       varchar(100),
    factory     varchar(50)
);

create table cart
(
    id         bigint primary key auto_increment,
    user_id    bigint,
    FOREIGN KEY (user_id) REFERENCES user (id),
    product_id bigint,
    FOREIGN KEY (product_id) REFERENCES product (id),
    price      int,
    amount     int,
    total      int,
    created    datetime default current_timestamp
);