-- 
-- 用户表：users
-- 字段：user_id int(5),user_name varchar(20),user_pass varchar(64),user_realname varchar(20)
-- 班级表：classes
-- 字段：class_id int(5),class_name varchar(20),class_grade varchar(10)


DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS classes;
DROP TABLE IF EXISTS students;
DROP TABLE IF EXISTS groups999;
DROP TABLE IF EXISTS scores_stu;
DROP TABLE IF EXISTS scores_group;


-- 用户表
CREATE TABLE users(
user_id INT(5) AUTO_INCREMENT PRIMARY KEY,  # 用户id
user_name varchar(20),	# 用户名
user_password varchar(64),	# 密码
user_realname varchar(20)	# 真实姓名
);


-- 班级表
CREATE TABLE classes(
class_id int(5) AUTO_INCREMENT PRIMARY KEY, # 班级id
class_name varchar(20),	# 班级名字
class_grade varchar(10)	# 年级
);


-- 学生表：students
-- 字段：stu_id int(5),stu_name varchar(10),stu_gender int(1),stu_class_id int(5) [学生表和班级表关联字段], stu_group_id int(5)[学生表和小组表关联字段]
CREATE TABLE students(
stu_id int(5) AUTO_INCREMENT PRIMARY KEY, # 学生id
stu_name varchar(10), # 学生姓名
stu_gender VARCHAR(1), # 学生性别
stu_class_id int(5), # [学生表和班级表关联字段]
stu_group_id int(5) # [学生表和小组表关联字段]
);
ALTER TABLE students ADD CONSTRAINT fk_students_classes FOREIGN KEY(stu_class_id) REFERENCES classes(class_id);
ALTER TABLE students ADD CONSTRAINT fk_students_groups FOREIGN KEY(stu_class_id) REFERENCES groups999(group_id);



-- 小组表：groups999
-- 字段：group_id int(5),group_name varchar(20), group_score double(3,2), group_class_id int(5)[小组表和班级表关联字段]
CREATE TABLE groups999(
group_id INT(5) AUTO_INCREMENT PRIMARY KEY,
group_name varchar(20),
group_score DOUBLE(3,2),
group_class_id INT(5)
);
ALTER TABLE groups999 ADD CONSTRAINT fk_groups_classes FOREIGN KEY(group_class_id) REFERENCES classes(class_id);



-- 
-- 学生积分表：scores_stu
-- 字段：scores_stu_id int(5) , stu_id int(5)[积分和学生表关联字段], score_details varchar(100).score_chage double(3,2)
CREATE TABLE scores_stu(
scores_stu_id int(5) AUTO_INCREMENT PRIMARY KEY, # 积分表id
 stu_id int(5), # [积分和学生表关联字段]
 score_details varchar(100), # 分值的原因
 score_chage double(3,2)  # 分数
);
ALTER TABLE scores_stu ADD CONSTRAINT fk_scores_stu_students FOREIGN KEY(stu_id) REFERENCES students(stu_id);



-- 小组积分表：scores_group
-- 字段：scores_group_id int(5) , group_id int(5)[积分和小组表关联字段], score_details varchar(100).score_chage double(3,2)
-- 
CREATE TABLE scores_group(
scores_group_id int(5) AUTO_INCREMENT PRIMARY KEY, # 小组积分表id
 group_id int(5), #[积分和小组表关联字段]
 score_details varchar(100), # 分值的原因
 score_chage double(3,2)  # 分数
);
ALTER TABLE scores_group ADD CONSTRAINT fk_scores_group_groups   FOREIGN KEY(group_id) REFERENCES groups999(group_id);








