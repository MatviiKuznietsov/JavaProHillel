import Orders.*;
import Orders.OrderRepository;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class OrderController extends HttpServlet {
    private OrderRepository orderRepository;
    private Order order;

    public void init() {
        orderRepository = new OrderRepository();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String pathInfo = request.getPathInfo();

        if (pathInfo == null || pathInfo.equals("/")) {
            List<Order> orders = orderRepository.getAllOrders();

        } else {
            try {
                int orderId = Integer.parseInt(pathInfo.substring(1));
                Order order = orderRepository.getOrderById(orderId);
                if (order != null) {
                } else {
                    response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                }
            } catch (NumberFormatException e) {
                response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            }
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        orderRepository.addOrder(order);
        response.setStatus(HttpServletResponse.SC_CREATED);
    }
}
