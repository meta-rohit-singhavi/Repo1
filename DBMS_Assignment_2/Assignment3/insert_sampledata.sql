

-- database on which operation will perform
-- ----------------------------------------
use lis;

-- insert data into publisher table
-- ------------------------------
INSERT INTO `publishers` (`publisher_nm`) VALUES ("Madhula T. Ismail"),("Sharmistha S. Khan"),("Rathik P. Singh"),("Kanwal I. Jain"),("Hridayanand S. Ismail"),("Anjum E. Kumar"),("Iniya Q. Raj"),("Ruchir Y. Patel"),("Gagana N. Khan"),("Charuvindha Y. Khan"),("Uddhav A. Kumar"),("Sumana Q. Khan"),("Iniyavan H. Ismail"),("Sasmita E. Raj"),("Shobhan P. Kumar");
INSERT INTO `publishers` (`publisher_nm`) VALUES ("Shreela R. Raj"),("Dheerendra Y. Raj"),("Samarendra Y. Ismail"),("Jayashekhar B. Patel"),("Nila Y. Ismail"),("Uddhav G. Singh"),("Dilip H. Patel"),("Abhyudaya Y. Kumar"),("Jalahasini W. Patel"),("Chakrapani A. Kumar"),("Dhritiman G. Khan"),("Chandramohan S. Kumar"),("Ayesha Q. Khan"),("Ketaki D. Raj"),("Anindita F. Kumar");
INSERT INTO `publishers` (`publisher_nm`) VALUES ("Kanyana K. Khan"),("Anjuman G. Kumar"),("Omrao P. Raj"),("Karuka C. Khan"),("Prayag S. Raj"),("Sulalit N. Kumar"),("Velan M. Jain"),("Manjeet U. Jain"),("Indukanta U. Singh"),("Dheeran A. Jain"),("Tamalika L. Raj"),("Dalbhya K. Ismail"),("Abhilasa U. Raj"),("Pratiti Q. Ismail"),("Avatar A. Singh");
INSERT INTO `publishers` (`publisher_nm`) VALUES ("Padmalochana U. Jain"),("Abhinithi I. Ismail"),("Vinod R. Singh"),("Gajra F. Kumar"),("Chitralekha S. Raj"),("Devasree E. Khan"),("Jayantika Q. Ismail"),("Praval V. Kumar"),("Madhuja O. Kumar"),("Arun T. Raj"),("Gunjan Z. Raj"),("Muthunagai B. Patel"),("Urmila P. Raj"),("Sakhi T. Patel"),("Hussain G. Ismail");


-- insert data into authors table
-- ------------------------------
INSERT INTO `authors` (`authors_nm`) VALUES ("Shraddha P. Khan"),("Ekram B. Patel"),("Poojan D. Patel"),("Balaaditya I. Jain"),("Aashika Y. Singh");
INSERT INTO `authors` (`authors_nm`) VALUES ("Sultana S. Ismail"),("Shobhan S. Jain"),("Ojaswini M. Singh"),("Mudra V. Jain"),("Prashansa C. Kumar");
INSERT INTO `authors` (`authors_nm`) VALUES ("Disha T. Jain"),("Shivanne G. Singh"),("Chandramohan C. Singh"),("Dhriti V. Singh"),("Shaheen H. Singh");
INSERT INTO `authors` (`authors_nm`) VALUES ("Mayuri Q. Singh"),("Amar N. Patel"),("Meghdutt W. Kumar"),("Yamya R. Khan"),("Surya H. Raj");
INSERT INTO `authors` (`authors_nm`) VALUES ("Kshanika S. Singh"),("Jahnavi K. Singh"),("Lakshmishree L. Patel"),("Rukma W. Kumar"),("Trishul N. Singh");

-- insert data into subjects table
-- ------------------------------
INSERT INTO `subjects` (`subject_nm`) VALUES ("Eu Eleifend Corp."),("Arcu Vestibulum Corp."),("Urna Suscipit Associates"),("Mauris Ltd"),("Fringilla Cursus Corp.");
INSERT INTO `subjects` (`subject_nm`) VALUES ("Ornare Associates"),("Augue Malesuada Limited"),("Tristique Ac Inc."),("Mi Foundation"),("Sagittis Augue PC");
INSERT INTO `subjects` (`subject_nm`) VALUES ("Diam Luctus Lobortis Institute"),("Fringilla PC"),("Interdum Ligula Eu Corporation"),("Malesuada Malesuada LLC"),("Phasellus LLP");
INSERT INTO `subjects` (`subject_nm`) VALUES ("Ac Incorporated"),("Convallis Foundation"),("Primis In Ltd"),("Non Justo Proin Company"),("Nulla Eget Inc.");
INSERT INTO `subjects` (`subject_nm`) VALUES ("Adipiscing Mauris Foundation"),("Neque Nullam Nisl Industries"),("Integer Mollis Inc."),("Phasellus At Augue Industries"),("Erat Vivamus PC");

-- insert data into titles table
-- ------------------------------
INSERT INTO `title` (`title_nm`,`publisher_id`,`subject_id`) VALUES ('abc', 1,1);
INSERT INTO `title` (`title_nm`,`publisher_id`,`subject_id`) VALUES ('abcd', 2,2);
INSERT INTO `title` (`title_nm`,`publisher_id`,`subject_id`) VALUES ('abcde', 3,3);
INSERT INTO `title` (`title_nm`,`publisher_id`,`subject_id`) VALUES ('abcdef', 4,4);
INSERT INTO `title` (`title_nm`,`publisher_id`,`subject_id`) VALUES ('abcdfe', 5,5);

-- insert data into title_authors table
-- -------------------------------------
INSERT INTO `title_authors` (`authors_id`,`title_id`) VALUES (1,2);
INSERT INTO `title_authors` (`authors_id`,`title_id`) VALUES (1,3);
INSERT INTO `title_authors` (`authors_id`,`title_id`) VALUES (1,4);
INSERT INTO `title_authors` (`authors_id`,`title_id`) VALUES (2,2);



-- insert data into title_authors table
-- -------------------------------------
insert into books (title_id, purchase_dt, price, status) values (1, '2015-07-09 18:58:48', 825, 'M');
insert into books (title_id, purchase_dt, price, status) values (2, '2016-03-01 22:53:43', 985, 'XS');
insert into books (title_id, purchase_dt, price, status) values (3, '2015-07-03 21:20:21', 321, 'XS');

-- insert data into members table
-- -------------------------------------
insert into members (member_nm, addressline1, addressline2, category) values ('Virginia George', '3 Cherokee Crossing', '020 Daystar Court', '3XL');
insert into members (member_nm, addressline1, addressline2, category) values ('Harold Russell', '90 Dwight Place', '8151 Kipling Park', 'S');
insert into members (member_nm, addressline1, addressline2, category) values ('Brian Ramirez', '579 Rieder Avenue', '644 Calypso Circle', 'S');
insert into members (member_nm, addressline1, addressline2, category) values ('Carl Carroll', '2286 Dawn Crossing', '42034 Thierer Drive', 'S');
insert into members (member_nm, addressline1, addressline2, category) values ('Jennifer Ferguson', '9370 Darwin Road', '1 Hanover Trail', 'S');
insert into members (member_nm, addressline1, addressline2, category) values ('Harry Powell', '83 Annamark Park', '4 Corry Lane', '2XL');

-- insert data into book_issue table
-- -------------------------------------
insert into book_issue (issue_dt, accession_no, member_id, due_dt) values ('2016-03-16', 2, 1, '2016-06-17');
insert into book_issue (issue_dt, accession_no, member_id, due_dt) values ('2016-01-01', 1, 2, '2015-09-24');
insert into book_issue (issue_dt, accession_no, member_id, due_dt) values ('2015-07-17', 1, 2, '2016-01-19');

-- insert data into book_issue table
-- -------------------------------------
insert into book_return (return_date, issue_dt, accession_no, member_id) values ('2016-07-15', '2016-07-09', 1, 1);
insert into book_return (return_date, issue_dt, accession_no, member_id) values ('2016-07-17', '2016-07-04', 2, 2);
insert into book_return (return_date, issue_dt, accession_no, member_id) values ('2016-07-17', '2016-07-03', 3, 3);

-- -----------------------------------
-- Update members table's Category
UPDATE `lis`.`members` SET `category`='F' WHERE `member_id`='6';
UPDATE `lis`.`members` SET `category`='M' WHERE `member_id`='1';
UPDATE `lis`.`members` SET `category`='F' WHERE `member_id`='2';
UPDATE `lis`.`members` SET `category`='M' WHERE `member_id`='3';
UPDATE `lis`.`members` SET `category`='F' WHERE `member_id`='4';
UPDATE `lis`.`members` SET `category`='M' WHERE `member_id`='5';
INSERT INTO `lis`.`members` (`member_id`, `member_nm`, `addressLine1`, `addressLine2`, `category`) VALUES (7, 'Keshav Sharma', 'EPIP sitapura', 'sp 6 phase 4', 'M');

-- Update titles table's title name
-- -----------------------------------
UPDATE `lis`.`title` SET `title_nm`='Fundamental Of C' WHERE `title_id`='1';
UPDATE `lis`.`title` SET `title_nm`='Organic Chemestry' WHERE `title_id`='2';
UPDATE `lis`.`title` SET `title_nm`='Mastering C++' WHERE `title_id`='4';
UPDATE `lis`.`title` SET `title_nm`='OOP\'s' WHERE `title_id`='5';

-- Update Subjects table's subject name
-- -------------------------------------
UPDATE `lis`.`subjects` SET `subject_nm`='Computer Science' WHERE `subject_id`='1';
UPDATE `lis`.`subjects` SET `subject_nm`='Oop\'s' WHERE `subject_id`='2';
UPDATE `lis`.`subjects` SET `subject_nm`='JAVA' WHERE `subject_id`='3';
UPDATE `lis`.`subjects` SET `subject_nm`='C' WHERE `subject_id`='4';
UPDATE `lis`.`subjects` SET `subject_nm`='C++' WHERE `subject_id`='5';

-- Alter book return table
-- --------------------------------
select * from book_return;
alter table book_return  modify return_date DATETIME null default null;
UPDATE `lis`.`book_return` SET `return_date`=null WHERE `return_date`='0000-00-00 00:00:00';

