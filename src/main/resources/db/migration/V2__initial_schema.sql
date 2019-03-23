CREATE SEQUENCE role_pk_seq START WITH 50;

create table role (
       id int8 not null,
        code varchar(255),
        primary key (id)
    );
 
  CREATE SEQUENCE user_role_pk_seq START WITH 50;
  
    create table user_role (
       id int8 not null,
        user_id int8,
        role_id int8,
        primary key (id)
    );
 
    
alter table user_role 
       add constraint user_role_user_id_fk 
       foreign key (role_id) 
       references role;