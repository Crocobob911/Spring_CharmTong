create table course
(
    id     bigint       not null,
    name   varchar(255) not null,
    author varchar(255) not null,
    primary key (id)
);

create table student
(
    id     bigint       not null,
    name   varchar(255) not null,
    email   varchar(100) not null,
    primary key (id)
);