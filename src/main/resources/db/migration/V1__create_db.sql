CREATE TABLE Client (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(200) NOT NULL
);

CREATE TABLE Planet (
    id VARCHAR(255) PRIMARY KEY,
    name VARCHAR(500) NOT NULL
);

CREATE TABLE Ticket (
    id INT AUTO_INCREMENT PRIMARY KEY,
    created_at TIMESTAMP NOT NULL,
    client_id INT NOT NULL,
    from_planet_id VARCHAR(255) NOT NULL,
    to_planet_id VARCHAR(255) NOT NULL,
    FOREIGN KEY (client_id) REFERENCES Client(id),
    FOREIGN KEY (from_planet_id) REFERENCES Planet(id),
    FOREIGN KEY (to_planet_id) REFERENCES Planet(id)
);