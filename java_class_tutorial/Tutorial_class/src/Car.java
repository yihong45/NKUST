public class Car {
    int horsePower;
    String color;
    String brandName;
    double price;
    float speed;



    void setCar(int hp) {
        this.horsePower = hp;
    }

    void setCar(String color, String brandName) {
        this.color = color;
        this.brandName = brandName;
    }

   void setCar(double  price) {
        this.price= price;
     }

   void setCar(float speed) {
        this.speed=speed;
   }

void showMyCar() {
    System.out.println("My car's brand is " + this.brandName);
    System.out.println("My car's horsepower is " + this.horsePower);
    System.out.println("My car's color is " + this.color);
    System.out.println("My car's price is " + this.price);
    System.out.println("My car's speed is " + this.speed);
}
}
