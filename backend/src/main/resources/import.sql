INSERT INTO tb_users (first_name, last_name, email, password, uri_image) VALUES ('João', 'Barbosa', 'joaoa@email.com', 'senha123', 'https://example.com/images/joao.png');
INSERT INTO tb_users (first_name, last_name, email, password, uri_image) VALUES ('Maria', 'Oliveira', 'maria.oliveira@example.com', 'senha123', 'https://example.com/images/maria.png');
INSERT INTO tb_users (first_name, last_name, email, password, uri_image) VALUES ('Carlos', 'Pereira', 'carlos.pereira@example.com', 'senha123', 'https://example.com/images/carlos.png');
INSERT INTO tb_users (first_name, last_name, email, password, uri_image) VALUES ('Ana', 'Costa', 'ana.costa@example.com', 'senha123', 'https://example.com/images/ana.png');
INSERT INTO tb_users (first_name, last_name, email, password, uri_image) VALUES ('Paulo', 'Santos', 'paulo.santos@example.com', 'senha123', 'https://example.com/images/paulo.png');
INSERT INTO tb_users (first_name, last_name, email, password, uri_image) VALUES ('Fernanda', 'Almeida', 'fernanda.almeida@example.com', 'senha123', 'https://example.com/images/fernanda.png');

INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');
INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');

INSERT INTO tb_user_role (user_id ,role_id) VALUES (1,1);
INSERT INTO tb_user_role (user_id ,role_id) VALUES (1,2);
INSERT INTO tb_user_role (user_id ,role_id) VALUES (1,3);

INSERT INTO tb_user_role (user_id ,role_id) VALUES (2,2);

INSERT INTO tb_user_role (user_id ,role_id) VALUES (3,2);
INSERT INTO tb_user_role (user_id ,role_id) VALUES (4,3);
INSERT INTO tb_user_role (user_id ,role_id) VALUES (5,1);
INSERT INTO tb_user_role (user_id ,role_id) VALUES (5,3);

INSERT INTO tb_user_role (user_id ,role_id) VALUES (6,2);


INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES ('Programação Java', 'https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg', 'https://upload.wikimedia.org/wikipedia/en/thumb/3/30/Java_programming_language_logo.svg/1200px-Java_programming_language_logo.svg.png');
INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES ('Framework Spring', 'https://spring.io/img/spring-logo.svg', 'https://spring.io/img/spring-logo.svg');
INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES ('Desenvolvimento React', 'https://upload.wikimedia.org/wikipedia/commons/a/a7/React-icon.svg', 'https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/React-icon.svg/1200px-React-icon.svg.png');
INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES ('Essenciais Next.js', 'https://upload.wikimedia.org/wikipedia/commons/8/8e/Nextjs-logo.svg', 'https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/Nextjs-logo.svg/1200px-Nextjs-logo.svg.png');
INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES ('Fundamentos C#', 'https://upload.wikimedia.org/wikipedia/commons/4/4f/Csharp_Logo.png', 'https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/Csharp_Logo.png/1200px-Csharp_Logo.png');
INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES ('Técnicas Avançadas em Java', 'https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg', 'https://upload.wikimedia.org/wikipedia/en/thumb/3/30/Java_programming_language_logo.svg/1200px-Java_programming_language_logo.svg.png');
INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES ('Desenvolvimento Full Stack com Spring e React', 'https://upload.wikimedia.org/wikipedia/commons/a/a7/React-icon.svg', 'https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/React-icon.svg/1200px-React-icon.svg.png');
INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES ('Microserviços com Spring Boot', 'https://spring.io/img/spring-logo.svg', 'https://spring.io/img/spring-logo.svg');
INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES ('APIs REST com Spring e Node.js', 'https://spring.io/img/spring-logo.svg', 'https://spring.io/img/spring-logo.svg');
INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES ('Next.js com Typescript', 'https://upload.wikimedia.org/wikipedia/commons/8/8e/Nextjs-logo.svg', 'https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/Nextjs-logo.svg/1200px-Nextjs-logo.svg.png');


-- Ofertas para 'Programação Java'
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('Edição 1', '2024-09-01T09:00:00Z', '2024-12-01T17:00:00Z', 1);
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('Edição 2', '2024-12-15T09:00:00Z', '2025-03-15T17:00:00Z', 1);

-- Ofertas para 'Framework Spring'
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('Spring Básico', '2024-09-10T09:00:00Z', '2024-11-30T17:00:00Z', 2);
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('Spring Avançado', '2025-01-05T09:00:00Z', '2025-03-25T17:00:00Z', 2);

-- Ofertas para 'Desenvolvimento React'
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('React para Iniciantes', '2024-10-01T09:00:00Z', '2025-01-15T17:00:00Z', 3);
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('React Avançado', '2025-02-01T09:00:00Z', '2025-05-01T17:00:00Z', 3);

-- Ofertas para 'Essenciais Next.js'
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('Next.js Completo', '2024-11-01T09:00:00Z', '2025-02-15T17:00:00Z', 4);

-- Ofertas para 'Fundamentos C#'
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('C# Básico', '2024-09-15T09:00:00Z', '2024-12-15T17:00:00Z', 5);

-- Ofertas para 'Desenvolvimento Full Stack com Spring e React'
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('Full Stack Master', '2024-09-25T09:00:00Z', '2025-01-25T17:00:00Z', 7);

-- Ofertas para 'Microserviços com Spring Boot'
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('Microserviços Essenciais', '2024-10-10T09:00:00Z', '2025-01-10T17:00:00Z', 8);

-- Ofertas para 'APIs REST com Spring e Node.js'
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('REST APIs Práticas', '2024-11-15T09:00:00Z', '2025-02-28T17:00:00Z', 9);

-- Ofertas para 'Next.js com Typescript'
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('Next.js com TS Avançado', '2025-01-15T09:00:00Z', '2025-04-15T17:00:00Z', 10);
