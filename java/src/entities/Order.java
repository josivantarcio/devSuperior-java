package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	private Client client;

	private List<OrderItem> items = new ArrayList<>();

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void addItems(OrderItem order) {
		items.add(order);
	}
	
	public void removeItems(OrderItem order) {
		items.remove(order);
	}
	
	public Double Total() {
		double sum = 0;
		for (OrderItem od : items) {
			sum += od.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nOrder Summary: \n");
		
		sb.append("Order Status: " + status + " " + sdf.format(new Date()) +"\n");
		sb.append(client.toString()+"\n");
		sb.append("Products: \n");
		for (OrderItem od : items) {
			sb.append(od.toString()+"\n");
		}
		sb.append("Total: R$ " + String.format("%.2f", Total()));

		return sb.toString();
	}
}
