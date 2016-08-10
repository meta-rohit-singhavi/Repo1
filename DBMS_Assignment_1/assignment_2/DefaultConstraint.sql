
-- alter table for default constraint
-- ------------------------------------

ALTER TABLE book_issue MODIFY COLUMN due_dt DATE DEFAULT NOW();
ALTER TABLE book_issue MODIFY COLUMN due_dt DATE DEFAULT DATE_ADD(issue_dt, INTERVAL 15 DAY);