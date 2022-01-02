INSERT INTO biblioteca (id, nome) VALUES (1, 'Alceu Amoroso Lima');
INSERT INTO biblioteca (id, nome) VALUES (2, 'Mario de Andrade');
INSERT INTO biblioteca (id, nome) VALUES (3, 'Monteiro Lobato');

INSERT INTO endereco (id, cep, logradouro, numero, bairro, cidade, estado, biblioteca_id) VALUES (1, '06111-111', 'Av João Marques', '121', 'Ipiranga', 'São Paulo', 'SP', 1);
INSERT INTO endereco (id, cep, logradouro, numero, bairro, cidade, estado, biblioteca_id) VALUES (2, '06382-123', 'Rua Mário Jorge', '9490', 'Lapa', 'São Paulo', 'SP', 2);
INSERT INTO endereco (id, cep, logradouro, numero, bairro, cidade, estado, biblioteca_id) VALUES (3, '06230-434', 'Rua Euclides Cunha', '99', 'Osasco', 'São Paulo', 'SP', 3);

INSERT INTO autor (id, nome) VALUES (1, 'Rogério Duarte');
INSERT INTO autor (id, nome) VALUES (2, 'Clarice Ramos');
INSERT INTO autor (id, nome) VALUES (3, 'Sofia Martins');

INSERT INTO livro (id, nome, paginas, biblioteca_id) VALUES (1, 'O poder do hábito', 343, 1);
INSERT INTO livro (id, nome, paginas, biblioteca_id) VALUES (2, 'A psicologia financeira', 120, 1);
INSERT INTO livro (id, nome, paginas, biblioteca_id) VALUES (3, 'Do mil ao milhão', 230, 3);

INSERT INTO livro_autor (livro_id, autor_id) VALUES (1, 1);
INSERT INTO livro_autor (livro_id, autor_id) VALUES (1, 3);
INSERT INTO livro_autor (livro_id, autor_id) VALUES (2, 2);
INSERT INTO livro_autor (livro_id, autor_id) VALUES (3, 1);
