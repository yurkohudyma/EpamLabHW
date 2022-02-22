insert into car_table (model, carclass, price, text, seats) values
    ('Запорожець', 'MINI', 15.32, 'бімба', 2),
    ('Renault Logan', 'ECONOMY', 35.42, 'економна і компактна', 4),
    ('Volkswagen Passat', 'ESTATE', 47.12, 'файна машина', 5),
    ('Fiat 500', 'MINI', 18.04, 'дуже маленька бібіка', 2),
    ('Ford Fiesta', 'ECONOMY', 43.39, 'шустра та потужна', 4),
    ('Kia Ceed SW', 'ESTATE', 61.23, 'комфортна та безпечна', 5);

insert into user_table (name, accesslevel, email) values
    ('Юрко Гудима', 'ADMIN', 'hudyma@gmail.com'),
    ('Степан Жменя', 'MANAGER', 'zhmenia@epam.com'),
    ('Опанас Наливайко', 'BLOCKED', 'opanas@mail.sru'),
    ('Дифузор Катафоскін', 'USER', 'diff@gmail.com');

insert into order_table (car_id, user_id, date_begin, date_end, passport_data, driver_needed, total, orderstatus) values
    (1, 1, '2022-02-22', '2022-02-23', 'AB123456', 'true', 0, 'NEW_ORDER'),
    (2, 2, '2022-02-28', '2022-03-01', 'AB456789', 'false', 0, 'NEW_ORDER'),
    (3, 3, '2022-03-12', '2022-03-14', 'BF545174', 'false', 0, 'NEW_ORDER'),
    (4, 4, '2022-03-12', '2022-03-14', 'DF545174', 'true', 0, 'NEW_ORDER');

