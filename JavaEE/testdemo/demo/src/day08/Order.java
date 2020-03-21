package day08;

public class Order {
	public int orderId;
	public String OrderName;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return OrderName;
	}
	public void setOrderName(String orderName) {
		OrderName = orderName;
	}
	public Order(int orderId,String OrderName) {
		this.orderId = orderId;
		this.OrderName = OrderName;
	}
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if(obj instanceof Order) {
			Order o = (Order) obj;
			if(this.orderId == o.orderId && this.OrderName.equals(o.OrderName)) {
				flag = true;
			}
		}
		return flag;
	}
}
