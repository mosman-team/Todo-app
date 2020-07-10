DROP TABLE IF EXISTS todo;

CREATE TABLE todo (
  id serial primary key,
  title varchar(255) NOT NULL,
  description VARCHAR(255),
  completed BOOLEAN
);

