CREATE TABLE daily_limit (
   id SERIAL NOT NULL,
   agency INT NOT NULL,
   account INT NOT NULL,
   data DATE NOT NULL,
   dailyLimits DECIMAL(8,2),
   PRIMARY KEY (id)
);