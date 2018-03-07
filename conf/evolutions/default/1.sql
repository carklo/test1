# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table entry (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  phone                         varchar(255),
  constraint pk_entry primary key (id)
);


# --- !Downs

drop table if exists entry;

