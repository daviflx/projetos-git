CREATE database treina_recife;

CREATE TABLE tb_alunos (
   id INTEGER AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR (50) NOT NULL,
    e-mail VARCHAR (150) NOT NULL,
    data_nascimento DATETIME NOT NULL

);

INSERT INTO treina_recife.tb_alunos
('id' , 'nome' , 'e-mail' , 'data_nascimento')
VALUES 
(1 , "Davi Félix." , "davi10@gmail.com", TIMESTAMP '2008')
DELETE FROM treina_recife.tb_alunos WHERE id=1;
DROP TABLE treina_recife.tb_alunos