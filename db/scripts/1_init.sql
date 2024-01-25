CREATE TABLE gruz (
	id INT UNSIGNED auto_increment NOT NULL,
	name varchar(100) NOT NULL,
	cargo_contents TEXT NOT NULL,
	city_out varchar(100) NOT NULL,
	date_out DATE NOT NULL,
	city_in varchar(100) NOT NULL,
	date_in DATE NOT NULL,
	PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4;

INSERT INTO `gruz` VALUES (1,'овощи','помидоры','Армавир','2022-07-25','Москва','2023-07-29'),(2,'фрукты','яблоки\r\nвишни\r\nсливы','Джанкой','2023-06-12','Москва','2023-06-14'),(3,'стройматериалы','доска струганая','Новосибирск','2023-10-12','Омск','2023-11-28'),(4,'одежда','','Шанхай','2023-06-20','Москва','2023-06-14');

