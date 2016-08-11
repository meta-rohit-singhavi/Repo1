-- Modifying question 9 to display results in ascending order of issue date 
-- and within issue date in ascending order of member's name.
-- --------------------------------------------------------------------------
select I.accession_no as 'Accession Number' , I.member_id as 'Member ID', members.member_nm as 'Name', I.issue_dt as 'Issue Date' ,
IFNULL(R.return_date,'Not Returned') as 'Return Date'
from book_issue I left join book_return R on 
I.accession_no = R.accession_no and I.member_id = R.member_id and I.issue_dt = R.issue_dt 
LEFT JOIN members on I.member_id = members.member_id order by I.issue_dt, members.member_nm;


