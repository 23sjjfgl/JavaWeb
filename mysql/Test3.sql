


-- 用户表：users
INSERT INTO users(user_name,user_password,user_realname)VALUES
("DKYYDS","123","等风来");

SELECT * FROM users;


-- 班级表 classes
INSERT INTO classes(class_name,class_grade)VALUES
("计算机应用技术3班","2023级"),
("信息应用技术1班","2023级"),
("软件工程3班","2023级"),
("数字媒体技术2班","2023级"),
("物联网工程4班","2023级");

SELECT * FROM classes;



INSERT INTO students(stu_name,stu_gender,stu_class_id,stu_group_id)VALUES
("等风来","男","1","1");
INSERT INTO students(stu_name,stu_gender,stu_class_id,stu_group_id)VALUES
("代坤","男","6","1");

SELECT * FROM students;

SELECT students.stu_id,students.stu_name,students.stu_gender,classes.class_name,groups999.group_name
FROM students INNER JOIN classes 
ON students.stu_class_id = classes.class_id
INNER JOIN groups999
ON students.stu_group_id = groups999.group_id;


SELECT * FROM classes JOIN students ON students.stu_class_id = classes.class_id WHERE class_id = 1;



INSERT INTO groups999(group_name,group_score,group_class_id)VALUES
("强盛集团",1.1,1);
SELECT * FROM groups999;




