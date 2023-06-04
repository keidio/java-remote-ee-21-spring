--to postpone script look application.properties
--TODO: fix PRODUCTION_YEAR_MONTH values
insert into CARS(brand, colour, fuel_type, insurance, mileage, model, production_year_month, vin)
values ( 'Mazda', 'SOUL_RED', 'GASOLINE', true, 100, 6, null, '123456');


insert into CARS(brand, colour, fuel_type, insurance, mileage, model, production_year_month, vin)
values ( 'Mazda', 'ELECTRIC_BLUE', 'GASOLINE', false, 100, 5, null, 'aBCD123');