public class Circle extends Shape implements Measure {
    private int r;
    public Circle(int r1){
        this.r = r1;
    }
    public int gerR(){
        return r;
    }
    @Override
    public void area(){
        System.out.println(r*r*PI);
    }
    @Override
    public void perimeter(){
        System.out.println(2*PI*r);
    }
    @Override
    public void show(){
        System.out.print("面積");area();
        System.out.print("周長");perimeter();
    }
}
