INSERT INTO Client (name) VALUES
    ('John'),
    ('Mary'),
    ('Michael'),
    ('Jennifer'),
    ('James'),
    ('Linda'),
    ('Robert'),
    ('Sarah'),
    ('William'),
    ('Emily');

INSERT INTO Planet (id, name) VALUES
    ('MARS', 'Mars'),
    ('VEN', 'Venus'),
    ('EARTH', 'Earth'),
    ('JUP', 'Jupiter'),
    ('SAT', 'Saturn');

INSERT INTO Ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES
    ('2023-10-18 12:00:00', 1, 'MARS', 'EARTH'),
    ('2023-10-18 12:30:00', 2, 'VEN', 'EARTH'),
    ('2023-10-18 13:00:00', 3, 'MARS', 'SAT'),
    ('2023-10-18 13:30:00', 4, 'SAT', 'VEN'),
    ('2023-10-18 14:00:00', 5, 'JUP', 'EARTH'),
    ('2023-10-18 14:30:00', 6, 'EARTH', 'SAT'),
    ('2023-10-18 15:00:00', 7, 'MARS', 'EARTH'),
    ('2023-10-18 15:30:00', 8, 'VEN', 'EARTH'),
    ('2023-10-18 16:00:00', 9, 'MARS', 'SAT'),
    ('2023-10-18 16:30:00', 10, 'SAT', 'VEN');
