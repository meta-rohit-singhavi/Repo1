
-- Q-1
select member_nm from members where category = (select category from members where member_nm = 'Jhon Snow');

-- --Q-2
select ti.title_nm ,mi.member_nm , bi.issue_dt , bi.due_dt from book_issue bi 
left join members mi
on bi.member_id = mi.member_id
left join books t
on t.accession_no = bi.accession_no
left join title ti
on t.title_id = ti.title_id
where (bi.member_id, bi.issue_dt)
not in (select member_id, issue_dt
from book_return) ;

select  * from members;
select * from book_return;
select * from book_issue;
select * from books;
select * from title;

-- --Q-3
select ti.title_nm ,mi.member_nm , bi.issue_dt , bi.due_dt ,br.return_date from book_issue bi 
left join members mi
on bi.member_id = mi.member_id 
left join books t
on t.accession_no = bi.accession_no
left join title ti
on t.title_id = ti.title_id
left join book_return br
on bi.member_id = br.member_id and bi.issue_dt = br.issue_dt
where (bi.member_id, bi.issue_dt)
in (select member_id, issue_dt
from book_return where return_date > bi.due_dt) ;

-- Q4--
select * from books;

select * 
from books 
where price = (select max(price) from books );

-- Q5--
select * 
from books 
where price = (select max(price) 
from books
where price not in (select price 
from books 
where price = (select max(price) from books )));