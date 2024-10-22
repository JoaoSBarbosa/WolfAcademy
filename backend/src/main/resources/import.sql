INSERT INTO tb_users (first_name, last_name, email, password, uri_image) VALUES ('João', 'Barbosa', 'joaoa@email.com', '$2a$12$ldr/6CWXjmd85Z0Ot1HDCOpzqLegefbfU9aSZ.YDxMBKqPVo.VX1S', 'https://example.com/images/joao.png');
INSERT INTO tb_users (first_name, last_name, email, password, uri_image) VALUES ('Maria', 'Oliveira', 'maria.oliveira@example.com', '$2a$12$ldr/6CWXjmd85Z0Ot1HDCOpzqLegefbfU9aSZ.YDxMBKqPVo.VX1S', 'https://example.com/images/maria.png');
INSERT INTO tb_users (first_name, last_name, email, password, uri_image) VALUES ('Carlos', 'Pereira', 'carlos.pereira@example.com', '$2a$12$ldr/6CWXjmd85Z0Ot1HDCOpzqLegefbfU9aSZ.YDxMBKqPVo.VX1S', 'https://example.com/images/carlos.png');
INSERT INTO tb_users (first_name, last_name, email, password, uri_image) VALUES ('Ana', 'Costa', 'ana.costa@example.com', '$2a$12$ldr/6CWXjmd85Z0Ot1HDCOpzqLegefbfU9aSZ.YDxMBKqPVo.VX1S', 'https://example.com/images/ana.png');
INSERT INTO tb_users (first_name, last_name, email, password, uri_image) VALUES ('Paulo', 'Santos', 'paulo.santos@example.com', '$2a$12$ldr/6CWXjmd85Z0Ot1HDCOpzqLegefbfU9aSZ.YDxMBKqPVo.VX1S', 'https://example.com/images/paulo.png');
INSERT INTO tb_users (first_name, last_name, email, password, uri_image) VALUES ('Fernanda', 'Almeida', 'fernanda.almeida@example.com', '$2a$12$ldr/6CWXjmd85Z0Ot1HDCOpzqLegefbfU9aSZ.YDxMBKqPVo.VX1S', 'https://example.com/images/fernanda.png');

INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');
INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');

INSERT INTO tb_user_role (user_id ,role_id) VALUES (1,1);
INSERT INTO tb_user_role (user_id ,role_id) VALUES (1,2);
INSERT INTO tb_user_role (user_id ,role_id) VALUES (1,3);

INSERT INTO tb_user_role (user_id ,role_id) VALUES (2,2);

INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_user_role (user_id ,role_id) VALUES (4,3);
INSERT INTO tb_user_role (user_id ,role_id) VALUES (5,1);
INSERT INTO tb_user_role (user_id ,role_id) VALUES (5,3);

INSERT INTO tb_user_role (user_id ,role_id) VALUES (6,2);

INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) VALUES ('Bootcamp HTML', 'https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 'https://upload.wikimedia.org/wikipedia/commons/1/1f/Switch-course-book-grey.svg');

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

INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2020-11-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2021-11-20T03:00:00Z', 1);
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2020-12-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2021-12-20T03:00:00Z', 1);

-- Ofertas para 'Programação Java'
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('Edição 1', TIMESTAMP WITH TIME ZONE '2024-09-01T09:00:00Z', TIMESTAMP WITH TIME ZONE '2024-12-01T17:00:00Z', 2);
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('Edição 2', TIMESTAMP WITH TIME ZONE '2024-12-15T09:00:00Z', TIMESTAMP WITH TIME ZONE '2025-03-15T17:00:00Z', 2);

-- Ofertas para 'Framework Spring'
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('Spring Básico', '2024-09-10T09:00:00Z', '2024-11-30T17:00:00Z', 3);
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('Spring Avançado', '2025-01-05T09:00:00Z', '2025-03-25T17:00:00Z', 3);

-- Ofertas para 'Desenvolvimento React'
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('React para Iniciantes', '2024-10-01T09:00:00Z', '2025-01-15T17:00:00Z', 4);
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('React Avançado', '2025-02-01T09:00:00Z', '2025-05-01T17:00:00Z', 4);

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


INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Trilha HTML', 'Trilha principal do curso', 1, 'https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 1, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Forum', 'Tire suas dúvidas', 2, 'https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 2, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Lives', 'Lives exclusivas para a turma', 3, 'https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 0, 1);

INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capítulo 1', 'Neste capítulo vamos começar', 1, 'https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 1, null);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capítulo 2', 'Neste capítulo vamos continuar', 2, 'https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 1, 1);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capítulo 3', 'Neste capítulo vamos finalizar', 3, 'https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 1, 2);

INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Nova mensagem recebida', '2024-08-26T14:30:00Z', false, '/messages/1', 1);

INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Curso disponível para inscrição', '2024-08-26T15:00:00Z', false, '/courses/2', 2);

INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Seu certificado está disponível', '2024-08-26T16:00:00Z', true, '/certificates/3', 3);

INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Atualização de perfil concluída', '2024-08-26T17:00:00Z', true, '/profile', 4);


-- INSERT INTO tb_enrollment (user_id, offer_id, enroll_Moment, refund_Moment, available, only_Update) VALUES (1, 1, TIMESTAMP WITH TIME ZONE '2020-11-20T13:00:00Z', null, true, false);
-- INSERT INTO tb_enrollment (user_id, offer_id, enroll_Moment, refund_Moment, available, only_Update) VALUES (2, 1, TIMESTAMP WITH TIME ZONE '2020-11-20T13:00:00Z', null, true, false);
--
-- INSERT INTO tb_lesson (title, position, section_id) VALUES ('Aula 1 do capítulo 1', 1, 1);
-- INSERT INTO tb_content (id, text_Content, video_Uri) VALUES (1, 'Material de apoio: abc', 'https://www.youtube.com/watch?v=sqbqoR-lMf8');
--
-- INSERT INTO tb_lesson (title, position, section_id) VALUES ('Aula 2 do capítulo 1', 2, 1);
-- INSERT INTO tb_content (id, text_Content, video_Uri) VALUES (2, '', 'https://www.youtube.com/watch?v=sqbqoR-lMf8');
--
-- INSERT INTO tb_lesson (title, position, section_id) VALUES ('Aula 3 do capítulo 1', 3, 1);
-- INSERT INTO tb_content (id, text_Content, video_Uri) VALUES (3, '', 'https://www.youtube.com/watch?v=sqbqoR-lMf8');
--
-- INSERT INTO tb_lesson (title, position, section_id) VALUES ('Tarefa do capítulo 1', 4, 1);
-- INSERT INTO tb_task (id, description, question_Count, approval_Count, weight, due_Date) VALUES (4, 'Fazer um trabalho legal', 5, 4, 1.0, TIMESTAMP WITH TIME ZONE '2020-11-25T13:00:00Z');
--
-- INSERT INTO tb_lessons_done (lesson_id, user_id, offer_id) VALUES (1, 1, 1);
-- INSERT INTO tb_lessons_done (lesson_id, user_id, offer_id) VALUES (2, 1, 1);
--
-- INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Primeiro feedback de tarefa: favor revisar', TIMESTAMP WITH TIME ZONE '2020-12-10T13:00:00Z', true, '/offers/1/resource/1/sections/1', 1);
-- INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Segundo feedback: favor revisar', TIMESTAMP WITH TIME ZONE '2020-12-12T13:00:00Z', true, '/offers/1/resource/1/sections/1', 1);
-- INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Terceiro feedback: favor revisar', TIMESTAMP WITH TIME ZONE '2020-12-14T13:00:00Z', true, '/offers/1/resource/1/sections/1', 1);
--
-- INSERT INTO tb_deliver (uri, moment, status, feedback, correct_Count, lesson_id, user_id, offer_id) VALUES ('https://github.com/devsuperior/bds-dslearn', TIMESTAMP WITH TIME ZONE '2020-12-10T10:00:00Z', 0, null, null, 4, 1, 1);
--
-- INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 1', 'Corpo do tópico 1', TIMESTAMP WITH TIME ZONE '2020-12-12T13:00:00Z', 1, 1, 1);
-- INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 2', 'Corpo do tópico 2', TIMESTAMP WITH TIME ZONE '2020-12-13T13:00:00Z', 2, 1, 1);
-- INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 3', 'Corpo do tópico 3', TIMESTAMP WITH TIME ZONE '2020-12-14T13:00:00Z', 2, 1, 1);
-- INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 4', 'Corpo do tópico 4', TIMESTAMP WITH TIME ZONE '2020-12-15T13:00:00Z', 1, 1, 2);
-- INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 5', 'Corpo do tópico 5', TIMESTAMP WITH TIME ZONE '2020-12-16T13:00:00Z', 1, 1, 2);
-- INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 6', 'Corpo do tópico 6', TIMESTAMP WITH TIME ZONE '2020-12-17T13:00:00Z', 2, 1, 3);
--
-- INSERT INTO tb_topic_likes (topic_id, user_id) VALUES (1, 2);
-- INSERT INTO tb_topic_likes (topic_id, user_id) VALUES (2, 1);
--
-- INSERT INTO tb_reply (body, moment, topic_id, author_id) VALUES ('Tente reiniciar o computador', TIMESTAMP WITH TIME ZONE '2020-12-15T13:00:00Z', 1, 2);
-- INSERT INTO tb_reply (body, moment, topic_id, author_id) VALUES ('Deu certo, valeu!', TIMESTAMP WITH TIME ZONE '2020-12-20T13:00:00Z', 1, 1);
--
-- INSERT INTO tb_reply_likes (reply_id, user_id) VALUES (1, 1);