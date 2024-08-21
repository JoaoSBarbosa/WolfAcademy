INSERT INTO tb_users (first_name, last_name, email, password, uri_image) VALUES ('João', 'Silva', 'joao.silva@example.com', 'senha123', 'https://example.com/images/joao.png');
INSERT INTO tb_users (first_name, last_name, email, password, uri_image) VALUES ('Maria', 'Oliveira', 'maria.oliveira@example.com', 'senha123', 'https://example.com/images/maria.png');
INSERT INTO tb_users (first_name, last_name, email, password, uri_image) VALUES ('Carlos', 'Pereira', 'carlos.pereira@example.com', 'senha123', 'https://example.com/images/carlos.png');
INSERT INTO tb_users (first_name, last_name, email, password, uri_image) VALUES ('Ana', 'Costa', 'ana.costa@example.com', 'senha123', 'https://example.com/images/ana.png');
INSERT INTO tb_users (first_name, last_name, email, password, uri_image) VALUES ('Paulo', 'Santos', 'paulo.santos@example.com', 'senha123', 'https://example.com/images/paulo.png');
INSERT INTO tb_users (first_name, last_name, email, password, uri_image) VALUES ('Fernanda', 'Almeida', 'fernanda.almeida@example.com', 'senha123', 'https://example.com/images/fernanda.png');

INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');
INSERT INTO tb_role (authority) VALUES ('ROLE_USER');
INSERT INTO tb_role (authority) VALUES ('ROLE_MODERATOR');

INSERT INTO tb_user_role (user_id ,role_id) VALUES (1,1);
INSERT INTO tb_user_role (user_id ,role_id) VALUES (1,2);
INSERT INTO tb_user_role (user_id ,role_id) VALUES (1,3);
INSERT INTO tb_user_role (user_id ,role_id) VALUES (3,2);
INSERT INTO tb_user_role (user_id ,role_id) VALUES (4,3);
INSERT INTO tb_user_role (user_id ,role_id) VALUES (5,1);
INSERT INTO tb_user_role (user_id ,role_id) VALUES (5,2);
INSERT INTO tb_user_role (user_id ,role_id) VALUES (5,3);
INSERT INTO tb_user_role (user_id ,role_id) VALUES (6,2);
