public class Rectangle extends Shape implements Measure {
    private int lenght,weight;
    public Rectangle(int l1,int w1){
        this.setLength(l1);
        this.setWeight(w1);
    }
    public void setLength(int l1){
        this.lenght = l1;
    }
    public int getLength(){
        return lenght;
    }
    public void setWeight(int w1){
        this.weight = w1;
    }
    public int getWeight(){
        return weight;
    }

    @Override
    public void area(){
        System.out.println(lenght*weight);
    }

    @Override
    public void perimeter(){
        System.out.println((lenght+weight)*2);
    }

    @Override
    public void show(){
        System.out.println("面積");area();
        System.out.println("周長");perimeter();
    }
}
