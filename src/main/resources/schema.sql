CREATE sequence seq;
CREATE TABLE HANDBOOKS
(
    id int default seq.nextval not null primary key,
    full_name_of_region varchar(50) not null,
    abbreviation_of_region varchar(10) not null,
    unique (id, full_name_of_region, abbreviation_of_region)
);
INSERT INTO HANDBOOKS (full_name_of_region, abbreviation_of_region) VALUES
('Московская область','МО'),
('Архангельская область','АО'),
('Ленинградская область','ЛО'),
('Челябинская область','ЧО');
