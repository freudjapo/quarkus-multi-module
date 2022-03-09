drop table if exists user;
create table user(
    id int auto_increment not null primary key ,
    nickname varchar(255) not null ,
    create_time datetime not null,
    update_time datetime not null
);
