# Write your MySQL query statement below
select q1.person_name from Queue q1 where 1000>=(select SUM(weight) from Queue q2 where q2.turn<=q1.turn) order by q1.turn desc limit 1;