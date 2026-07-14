
create table employees (
  id char(6) primary key,
  name varchar(100) not null,
  age int not null
);


insert into employees
  (id, name, age)
values
  ('EMP001', '湊 雄輔', 23),
  ('EMP002', '綾部 めぐみ', 22);

