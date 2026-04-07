create table user(
    user_id int auto_increment primary key,
    user_name varchar(255),
    user_email_address  varchar(255),
    user_password varchar(255),
    created_at date,
    updated_at date,
    constraint pk_user primary(user_id)
);