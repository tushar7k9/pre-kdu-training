-- 1
SELECT e.employee_id, e.employee_name, d.department_name
FROM employee e
JOIN department d
ON e.department_id = d.department_id;


-- 2
SELECT employee_name, salary
FROM employee
ORDER BY salary DESC;

-- 3
SELECT d.department_name, AVG(e.salary) AS avg_salary
FROM employee e
JOIN department d
ON e.department_id = d.department_id
GROUP BY d.department_name;

