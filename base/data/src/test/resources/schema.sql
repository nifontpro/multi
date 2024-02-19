CREATE SCHEMA IF NOT EXISTS test;;

CREATE TABLE IF NOT EXISTS test.user_data
(
    id bigserial NOT NULL primary key,
    name TEXT NOT NULL
);;