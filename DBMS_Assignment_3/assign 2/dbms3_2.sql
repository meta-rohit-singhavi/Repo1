
select * from title;
select * from books;
select * from subjects;


-- Q-1
SELECT S.subject_nm ,   S.subject_id , COUNT(S.subject_id) AS NoOfBooks
FROM books B 
LEFT JOIN  title T ON B.title_id =  T.title_id 
LEFT JOIN subjects S ON T.subject_id = S.subject_id 
GROUP BY S.subject_id;

-- Q-2
select issue_dt ,DATEDIFF(due_dt , issue_dt) from book_issue;
select accession_no as 'Accession Number' , member_id as 'Member ID',issue_dt as 'Issue Date' ,DATEDIFF(due_dt , issue_dt) from book_issue where DATEDIFF(due_dt , issue_dt) > 60;

-- Q-3
select * 
from books 
where price > (select min(price) from books );