create table car
(
    car_id integer not null auto_increment,
    carclass enum ('MINI', 'ECONOMY', 'SUV', 'ESTATE', 'PREMIUM'),
    model varchar(255),
    price float not null,
    seats integer not null,
    text varchar(255),
    primary key (car_id)
);

create table order_table
(
    id integer not null auto_increment,
    user_id integer not null,
    car_id integer not null,
    additional_info varchar(255),
    date_begin date,
    date_end date,
    driver_needed boolean not null,
    orderstatus enum('NEW ORDER', 'PENDING', 'APPROVED', 'PAID',  'DECLINED', 'COMPLETE'),
    passport_data varchar(255) not null,
    total float,
    primary key (id)
);

create table user_table
(
    user_id integer not null auto_increment,
    accesslevel enum('ADMIN', 'USER', 'MANAGER', 'BLOCKED'),
    email varchar(255) not null,
    name varchar(255),
    password varchar(255),
    primary key (user_id)
);