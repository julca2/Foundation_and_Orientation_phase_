SELECT avg(cognitive score) as avg_cognitive_score, min(cognitive score) as min_cognitive_score, max(cognitive score) as max_cognitive_score
FROM applicants
GROUP BY Preffered-language

SELECT [name and surname] 
FROM applicants
WHERE age < 66 and age > 34

SELECT TOP 3 max(cognitive score), programming language 
FROM applicants
GROUP BY cognitive score, programming language 

SELECT [name and surname], max(age)
FROM applicants a
join classes c ON a.classid = c.classid
GROUP BY programming language, className, [name and surname], age