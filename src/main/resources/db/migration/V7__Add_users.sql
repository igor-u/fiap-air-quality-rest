CREATE SEQUENCE "SEQ_USER_ID"
    START WITH 1
    NOCACHE
    NOCYCLE;

CREATE TABLE users (
    "ID" INTEGER DEFAULT SEQ_USER_ID.nextval,
    "NAME" VARCHAR(100) NOT NULL,
    "EMAIL" VARCHAR(100) UNIQUE NOT NULL,
    "PASSWORD" VARCHAR(100) NOT NULL,
    "ROLE" VARCHAR(50) DEFAULT 'MONITOR',
    );

ALTER TABLE users
ADD CONSTRAINT pk_users PRIMARY KEY ("ID");