public class Main {

    public static void main(String[] args) {
        System.out.println("圓形");

        Shape s1 = new Circle(6);
        s1.show();
        System.out.println("====================");
        System.out.println("矩形");

        Shape s2 = new Rectangle(3,4);
        s2.show();
        System.out.println("====================");
        System.out.println("三角形");

        Shape s3 = new Triangle(3,4,5,6);
        s3.show();
    }
}
