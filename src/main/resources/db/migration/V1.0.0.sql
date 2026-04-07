create table user(
    user_id int auto_increment ,
    user_first_name varchar(255),
    user_last_name varchar(255),
    user_email_address  varchar(255) primary key,
    user_password varchar(255),
    role varchar(255),
    created_at date,
    updated_at date,
    constraint pk_user primary(user_email_address)
);