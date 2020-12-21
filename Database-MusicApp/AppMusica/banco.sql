DROP DATABASE IF EXISTS appMusica;

CREATE DATABASE appMusica;

USE appMusica;

CREATE TABLE tipoUsuario(
	idTipoUsuario INT PRIMARY KEY
);

CREATE TABLE usuario(
	idUsuario INT AUTO_INCREMENT PRIMARY KEY,
    nomeUsuario VARCHAR(45) NOT NULL,
    email VARCHAR(100) NOT NULL,
    senha VARCHAR(45) NOT NULL,
    idTipoUsuario INT,
    
    CONSTRAINT `tipo_id` FOREIGN KEY (idTipoUsuario)
        REFERENCES tipoUsuario (idTipoUsuario)
        ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE artista(
    nomeArtista VARCHAR(80) NOT NULL PRIMARY KEY,
    qtdMusica int
);

CREATE TABLE playlist(
	idPlaylist INT AUTO_INCREMENT PRIMARY KEY,
    nomePlay VARCHAR(80) NOT NULL,
    qtdMusicaPlay LONG,
    idUsuario INT,
    
    CONSTRAINT `usuario_id` FOREIGN KEY (idUsuario)
        REFERENCES usuario (idUsuario)
        ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE musica(
    idMusica INT AUTO_INCREMENT PRIMARY KEY,
    nomeMusica VARCHAR(80) NOT NULL,
    tempoDuracao double,
    ano int,
    genero VARCHAR(80),
    nomeArtista VARCHAR(80),
  
    CONSTRAINT `artista_nome` FOREIGN KEY (nomeArtista)
        REFERENCES artista (nomeArtista)
        ON DELETE NO ACTION ON UPDATE CASCADE
);

CREATE TABLE playmusica(
	idMusica INT,
    idPlaylist INT,
    
    CONSTRAINT `musica_id` FOREIGN KEY (idMusica)
        REFERENCES  musica (idMusica)
        ON DELETE CASCADE ON UPDATE CASCADE,
        
    CONSTRAINT `playlist_id` FOREIGN KEY (idPlaylist)
        REFERENCES  playlist (idPlaylist)
        ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO artista (nomeArtista,qtdMusica) VALUES ('Tones and I',1),
										           ('Harry Styles',1),
                                                   ('Jonas Esticado',1),
                                                   ('Os Baroes da Pisadinha',1),
												   ('Anitta',1),
                                                   ('Henrique e Juliano',1),
                                                   ('Marilia Mendonça',1),
												   ('Dua Lipa',1),
                                                   ('The Weeknd',1),
                                                   ('Ariana Grande',1),
                                                   ('Imagine Dragons',1),
                                                   ('Tierry',1),
                                                   ('Saint Jhn',1),
                                                   ('Shawn Mendes',1),
                                                   ('Lewis Capaldi',1),
                                                   ('Giulia Be',1),
                                                   ('Grupo Menos É Mais',1),
                                                   ('Queen',1),
                                                   ('Guns N Roses',1),
                                                   ('Highway to Hell',1);

INSERT INTO musica (nomeMusica, nomeArtista, tempoDuracao, ano, genero) VALUES
('Dance Monkey', 'Tones and I', 3.29 , 2019, 'Indie'),
('Watermelon Sugar', 'Harry Styles', 3.53 , 2019, 'Pop'),
('Investe em mim', 'Jonas Esticado', 3.20 , 2019, 'Sertanejo'),
('Desce pro Play', 'Anitta', 2.51, 2020, 'Pop'),
('Liberdade Provisoria', 'Henrique e Juliano', 3.03, 2020, 'Sertanejo'),
('Bebi Liguei', 'Marilia Mendonça', 3.39, 2019, 'Sertanejo'),
('Dont Start Now', 'Dua Lipa', 3.00, 2019, 'Pop'),
('Blinding Lights', 'The Weeknd', 4.22, 2019, 'Pop'),
('Positions', 'Ariana Grande', 2.57, 2020, 'Pop'),
('Beliver', 'Imagine Dragons', 3.36, 2017, 'Pop'),
('Rita', 'Tierry', 2.36, 2020, 'Pagode'),
('Roses', 'Saint Jhn', 2.36, 2018, 'Eletronica'),
('Senorita', 'Shawn Mendes', 3.25, 2018, 'Pop'),
('Someone You Loved', 'Lewis Capaldi', 3.25, 2019, 'Indie'),
('Menina Solta', 'Giulia Be', 2.48, 2020, 'Indie'),
('Thunder', 'Imagine Dragons', 3.24, 2017, 'Pop'),
('Melhor eu ir', 'Grupo Menos É Mais', 8.45, 2019, 'Pagode'),
('Dont Stop Me Now', 'Queen', 3.37, 1979, 'Rock'),
('Sweet Child O Mine', 'Guns N Roses', 5.03, 1987, 'Rock'),
('Highway to Hell', 'Highway to Hell', 3.27, 1979, 'Rock');

INSERT INTO tipoUsuario(idTipoUsuario) VALUES (101),(202),(303);

SELECT *FROM tipoUsuario;
SELECT *FROM usuario;
SELECT *FROM musica;
SELECT *FROM playlist;
SELECT *FROM artista;
SELECT *FROM playmusica;

SELECT COUNT(idMusica) AS idMusica FROM playmusica WHERE idPlaylist = 1;
UPDATE playlist SET qtdMusicaPlay = 2 WHERE idPlaylist =1; 