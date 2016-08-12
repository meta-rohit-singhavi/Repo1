select * from book_issue;
select * from title;

-- Q-1
select I.accession_no as 'Accession Number' , I.member_id as 'Member ID', members.member_nm as 'Name', I.issue_dt as 'Issue Date' ,
IFNULL(R.return_date,'Not Returned') as 'Return Date',IFNULL( DATEDIFF(R.return_date,I.issue_dt) ,DATEDIFF(now(),I.issue_dt)) AS days ,
t.title_nm as 'Title' 
from book_issue I   left join book_return R on 
I.accession_no = R.accession_no and I.member_id = R.member_id and I.issue_dt = R.issue_dt 
LEFT JOIN members on I.member_id = members.member_id  
left join books b on I.accession_no = b.accession_no
left join title t on t.title_id = b.title_id
having days > 60 order by I.issue_dt, members.member_nm;


-- Q-2
select  *from members ;
select member_nm , length(member_nm) as Length from members where  length(member_nm) = (select max(length(member_nm)) from members);

-- Q-3
select * from book_issue;
select * from book_return;
select  count(distinct accession_no) from book_issue;





