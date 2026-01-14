# Write your MySQL query statement below

select  
   Round( sum(if(min_order=min_pref_date ,1,0)) * 100/count(customer_id),2) as immediate_percentage


from(
 select
 customer_id,
 min(order_date) as min_order,
 min(customer_pref_delivery_date) min_pref_date
 from Delivery
 group by customer_id
) as new_table