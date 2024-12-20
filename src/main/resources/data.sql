INSERT INTO MOVIES (title, overview, popularity, release_date) VALUES 
('Predator', 'A team of commandos on a mission in a Central American jungle find themselves hunted by an extraterrestrial warrior.', 44.021, '1987-06-12'),
('Snatch', 'Unscrupulous boxing promoters, violent bookmakers, a Russian gangster, incompetent amateur robbers and supposedly Jewish jewelers fight to track down a priceless stolen diamond.', 18.364, '2000-09-01');

INSERT INTO GENRES (name) VALUES
('Science Fiction'), ('Western'), ('Horror'), ('Comedy');

INSERT INTO GENRE_MOVIES (movie_id, genre_id) VALUES 
(1, 1), (1, 3), (2, 4);