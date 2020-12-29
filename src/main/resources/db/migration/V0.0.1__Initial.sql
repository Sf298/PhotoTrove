
CREATE TABLE PHOTOS (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    file VARCHAR(45) NOT NULL UNIQUE,
    width INT NOT NULL,
    height INT NOT NULL,
    latitude DOUBLE,
    longitude DOUBLE
);

CREATE TABLE CHANGES (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    photo_id BIGINT NOT NULL,
    parent_id BIGINT,
    type VARCHAR(45) NOT NULL,
    param_1 VARCHAR(45),
    param_2 VARCHAR(45),
    param_3 VARCHAR(45),
    param_4 VARCHAR(45),
    param_5 VARCHAR(45)
);
