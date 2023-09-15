package app;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class ShoppingCartApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Cart cart = context.getBean(Cart.class);
        ProductRepository productRepository = context.getBean(ProductRepository.class);

        cart.addItem(productRepository.getProductById(1));
        cart.addItem(productRepository.getProductById(2));
        cart.removeItemById(1);

        System.out.println("Products in basket");
        for (Product item : cart.getItems()) {
            System.out.println(item.getName());
        }
        context.close();
    }
}
