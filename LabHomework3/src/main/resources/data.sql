insert into car (model, carclass, price, text, seats) values
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

insert into order_table (car_id, user_id, date_begin, date_end, passport_data, driver_needed) values
    (1, 1, '2022-02-22', '2022-02-23', 'AB123456', 'true');

