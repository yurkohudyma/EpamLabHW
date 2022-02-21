create table car
(
    id integer not null,
    carclass enum ('MINI', 'ECONOMY', 'SUV', 'ESTATE', 'PREMIUM'),
    model varchar(255),
    price float not null,
    seats integer not null,
    text varchar(255),
    primary key (id)
);

create table order_table
(
    order_id bigint not null,
    additional_info varchar(255),
    carclass enum ('MINI', 'ECONOMY', 'SUV', 'ESTATE', 'PREMIUM'),
    date_begin date, date_end date,
    driver_needed boolean not null,
    model varchar(255) not null,
    orderstatus integer not null,
    passportdata varchar(255) not null,
    price float not null,
    user_id bigint,
    primary key (order_id)
);

create table user
(
    user_id bigint not null,
    access_level enum('ADMIN', 'USER', 'MANAGER', 'BLOCKED'),
    email varchar(255) not null,
    name varchar(255),
    password varchar(255),
    primary key (user_id)
);