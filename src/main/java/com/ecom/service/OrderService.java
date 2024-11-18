package com.ecom.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.ecom.model.OrderRequest;
import com.ecom.model.ProductOrder;

public interface OrderService {

	// Guardar un pedido basado en el ID de usuario y los detalles del pedido
	void saveOrder(Integer userId, OrderRequest orderRequest) throws Exception;

	// Obtener pedidos por ID de usuario
	List<ProductOrder> getOrdersByUser(Integer userId);

	// Actualizar el estado de un pedido por ID
	ProductOrder updateOrderStatus(Integer id, String status);

	// Obtener todos los pedidos
	List<ProductOrder> getAllOrders();

	// Obtener un pedido por su ID único
	ProductOrder getOrdersByOrderId(String orderId);

	// Obtener pedidos paginados
	Page<ProductOrder> getAllOrdersPagination(Integer pageNo, Integer pageSize);

}
