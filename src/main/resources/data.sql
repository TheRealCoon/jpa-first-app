insert into doctor (id, name, doctor_type)
values  (1, 'Dr. Bubó', 'MEDICAL'),
        (2, 'Dr. Furcsa', 'RESIDENT');

insert into patient (id, name, date_of_birth, doctor_id)
values  (1, 'Gipsz Jakab', '1985-06-21', 1),
        (2, 'John Doe', '1999-02-21', 1);