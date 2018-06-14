public class Triangle extends Shape implements Measure{
    private int a,b,c,ahight;
    public Triangle(int a1,int b1,int c1,int ahight1){
        this.setA(a1);
        this.setB(b1);
        this.setC(c1);
        this.setAhight(ahight1);
    }
    public void setA(int a1){
        this.a = a1;
    }
    public int getA(){
        return a;
    }
    public void setB(int b1){
        this.b = b1;
    }

    public int getB() {
        return b;
    }

    public void setC(int c1){
        this.c = c1;
    }
    public int getC(){
        return c;
    }
    public void setAhight(int ahight1){
        this.ahight = ahight1;
    }
    public int getAhight(){
        return ahight;
    }

    @Override
    public void area(){
        System.out.println((a*ahight)/2);
    }

    @Override
    public void perimeter(){
        System.out.println(a+b+c);
    }

    @Override
    public void show(){
        System.out.print("面積");area();
        System.out.println("周長");perimeter();
    }
}
