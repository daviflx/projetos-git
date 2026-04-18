CREATE database treina_recife;

CREATE TABLE tb_alunos (
   id INTEGER AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR (50) NOT NULL,
    e-mail VARCHAR (150) NOT NULL,
    data_nascimento DATETIME NOT NULL

);