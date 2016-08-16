-- Q1
create view vw_members
as
select members.member_nm , b.issue_dt  ,b.due_dt,b.accession_no
from members , book_issue b
where members.member_id = b.member_id;

select * from vw_members;

-- Q2
select * from members;

drop view if exists vw_memberCat;
create view vw_memberCat
as
select member_id , member_nm , REPLACE(REPLACE(REPLACE(category,"M","Members"),"S","Student"),"F","Faculty")  as Category
from members;

select * from vw_memberCat;

-- Q3
select * from book_issue;
select * from book_return;

create view vw_detail
as
select ti.title_nm , s.subject_nm,mi.member_nm ,mi.category , bi.issue_dt , bi.due_dt ,br.return_date from book_issue bi 
left join members mi
on bi.member_id = mi.member_id 
left join books t
on t.accession_no = bi.accession_no
left join title ti
on t.title_id = ti.title_id
left join book_return br
on bi.member_id = br.member_id and bi.issue_dt = br.issue_dt
left join subjects s 
on ti.subject_id = s.subject_id;
;

drop view if exists vw_detail;
select * from vw_detail;