SELECT category_id, category_name FROM categories;

SELECT company_name, phone from customers where country = 'USA';

SELECT product_name, unit_price FROM products WHERE unit_price > 50 AND units_in_stock > 20;

SELECT order_id, customer_id, order_date, ship_country
FROM orders
WHERE order_date >= '1997-01-01' AND order_date < '1998-01-01'
ORDER BY order_date ASC;

SELECT product_name, units_in_stock, unit_price
FROM products
ORDER BY units_in_stock DESC, unit_price DESC;

SELECT o.order_id, o.order_date, c.company_name
FROM orders o
JOIN customers c ON o.customer_id = c.customer_id;

SELECT p.product_name, c.category_name, s.company_name
FROM products p
JOIN categories c ON p.category_id = c.category_id
JOIN suppliers s ON p.supplier_id = s.supplier_id;

SELECT c.category_name, COUNT(p.product_id) AS total_products
FROM categories c
JOIN products p ON c.category_id = p.category_id
GROUP BY c.category_name
ORDER BY total_products DESC;

SELECT c.customer_id, c.company_name, COUNT(o.order_id) AS total_orders
FROM customers c
JOIN orders o ON c.customer_id = o.customer_id
GROUP BY c.customer_id, c.company_name
HAVING COUNT(o.order_id) >= 3;

SELECT product_id, product_name, unit_price
FROM products
WHERE unit_price > (
    SELECT AVG(unit_price)
    FROM products
);

select product_name, unit_price from products 
order by unit_price desc limit 10;

select o.order_id, c.company_name, e.first_name ||''|| e.last_name as name
from orders o
join customers c on o.customer_id = c.customer_id 
join employees e on o.employee_id = e.employee_id ;

select c.category_name, count(p.product_id) as total_products
from categories c 
join products p on p.category_id = c.category_id
group by c.category_name 
order by total_products desc;

select o.customer_id, SUM(od.unit_price * od.quantity) as value from orders o
join order_details od on o.order_id = od.order_id 
group by o.customer_id having SUM(od.unit_price * od.quantity) > 10000
order by value desc; 

WITH customer_totals AS (
    SELECT o.customer_id,
           SUM(od.unit_price * od.quantity) AS total_value
    FROM orders o
    JOIN order_details od ON o.order_id = od.order_id
    GROUP BY o.customer_id
)
SELECT c.company_name, total_value
FROM customer_totals ct
JOIN customers c ON ct.customer_id = c.customer_id
WHERE total_value > 10000
ORDER BY total_value DESC;

select product_name, unit_price from products where unit_price >
(select avg(unit_price) from products);

select e.first_name, count(o.order_id)
from employees e 
join orders o on
e.employee_id = o.employee_id
group by e.first_name 
order by count(o.order_id) desc limit 5;

SELECT e.first_name AS employee,
       COUNT(o.order_id) AS total_orders
FROM employees e
JOIN orders o ON e.employee_id = o.employee_id
GROUP BY e.employee_id
ORDER BY total_orders DESC

select c.contact_name, SUM(od.unit_price * od.quantity) AS total_value, c.country 
from customers c 
join orders o on 
c.customer_id = o.customer_id 
join order_details od on
o.order_id = od.order_id
group by c.country, c.contact_name
order by total_value desc;

EXPLAIN
WITH customer_country_totals AS (
    SELECT c.country,
           c.contact_name,
           SUM(od.unit_price * od.quantity) AS total_value,
           RANK() OVER (PARTITION BY c.country ORDER BY 
           SUM(od.unit_price * od.quantity) DESC) AS rank_in_country
    FROM customers c
    JOIN orders o ON c.customer_id = o.customer_id
    JOIN order_details od ON o.order_id = od.order_id
    GROUP BY c.country, c.contact_name
)
SELECT *
FROM customer_country_totals
WHERE rank_in_country <= 3
ORDER BY country, total_value DESC;

select * from orders;

select p.product_name, c.category_name, sum(od.unit_price * od.quantity) 
as total_revenue 
from order_details od join orders o on
od.order_id = o.order_id 
join products p on 
od.product_id = p.product_id
join categories c on
p.product_id = c.category_id 
where o.shipped_date is not null
group by p.product_name, c.category_name 
order by total_revenue desc limit 5;

SELECT p.product_name,
       c.category_name,
       SUM(od.unit_price * od.quantity) AS total_revenue
FROM order_details od
JOIN orders o ON od.order_id = o.order_id
JOIN products p ON od.product_id = p.product_id
JOIN categories c ON p.category_id = c.category_id
WHERE o.shipped_date IS NOT NULL
GROUP BY p.product_name, c.category_name
ORDER BY SUM(od.unit_price * od.quantity)
desc limit 5;


