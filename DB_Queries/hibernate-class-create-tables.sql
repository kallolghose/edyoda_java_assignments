DROP TABLE IF EXISTS `instructor_detail`;

CREATE TABLE `instructor_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `twitter_handle` varchar(128) DEFAULT NULL,
  `linkedin_profile` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);


DROP TABLE IF EXISTS `instructor`;

CREATE TABLE `instructor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `instructor_detail_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_DETAIL` FOREIGN KEY (`instructor_detail_id`) REFERENCES `instructor_detail` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
);


DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(128) DEFAULT NULL,
  `instructor_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `TITLE_UNIQUE` (`title`),
  CONSTRAINT `FK_INSTRUCTOR` 
  FOREIGN KEY (`instructor_id`) 
  REFERENCES `instructor` (`id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION
);

DROP TABLE IF EXISTS `review`;

CREATE TABLE `review` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment` varchar(256) DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_COURSE` 
  FOREIGN KEY (`course_id`) 
  REFERENCES `course` (`id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION
);

DROP TABLE IF EXISTS `course_student`;

CREATE TABLE `course_student` (
  `course_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  PRIMARY KEY (`course_id`,`student_id`),
  CONSTRAINT `FK_COURSE_05` FOREIGN KEY (`course_id`) 
  REFERENCES `course` (`id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_STUDENT` FOREIGN KEY (`student_id`) 
  REFERENCES `student` (`ID`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION
);


