CREATE TABLE daily_limit (
   id SERIAL NOT NULL,
   agency INT NOT NULL,
   account INT NOT NULL,
   data DATE NOT NULL,
   daily_limits DECIMAL(8,2),
   PRIMARY KEY (id)
);