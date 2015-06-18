package cz.fi.muni.pa165.dao;

import java.util.List;

import cz.fi.muni.pa165.entity.Order;
import cz.fi.muni.pa165.entity.OrderItem;

public interface OrderItemDao {
	public void create(OrderItem orderItem);
	public void update(OrderItem order);
	public void delete(OrderItem order);
	public List<Order> findAll();
}
