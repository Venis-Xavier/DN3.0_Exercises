public class ProxyTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        // Image will be loaded from disk
        image.display();

        // Image will not be loaded from disk
        image.display();
    }
}
