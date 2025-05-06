CREATE TABLE users_info
(
    user_id     BIGINT PRIMARY KEY,
    username    VARCHAR(50)  NOT NULL UNIQUE,
    password    VARCHAR(255) NOT NULL,
    email       VARCHAR(255) NOT NULL UNIQUE,
    join_date   TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    last_login  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    is_active   BOOLEAN   DEFAULT TRUE,
    create_by   BIGINT,
    create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    update_by   BIGINT,
    update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

create index idx_username on users_info (username);
create index idx_email on users_info (email);