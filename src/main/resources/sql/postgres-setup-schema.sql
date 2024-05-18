create user larku password 'tetyana' CREATEDB CREATEROLE;

ALTER ROLE tetyana WITH LOGIN;
ALTER ROLE tetyana INHERIT;

set role tetyana;

create database adoptapp;

