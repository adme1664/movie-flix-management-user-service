create table user_verification_token (
    id          BIGINT PRIMARY KEY,
    user_id     BIGINT NOT NULL,
    token       VARCHAR(255) NOT NULL UNIQUE,
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    expires_at  TIMESTAMP NOT NULL,
    is_used     BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (user_id) REFERENCES users_info(user_id)
);