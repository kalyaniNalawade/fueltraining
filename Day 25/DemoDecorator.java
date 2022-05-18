//Decorator
interface Car
{
   public void assemble();
}
class BasicCar implements Car
{
   public void assemble()
   {
      System.out.print("Basic car.");
   }
}

class CarDecorator implements Car
{
   protected Car car;
   public CarDecorator(Car c)
   {
       this.car=c; 
   }
   public void assemble()
   {
      this.car.assemble();   
   }
}

class SportsCar extends CarDecorator
{
   public SportsCar(Car c)
   {
      super(c);
   }
   public void assemble()
   {
      super.assemble();
      System.out.println("Adding Featres of Sports car");
   }
}

class LuxuryCar extends CarDecorator
{
   public LuxuryCar(Car c)
   {
      super(c);
   }
   public void assemble()
   {
      super.assemble();
      System.out.println("Adding Featres of Luxury car");
   }
}

class DemoDecorator
{
   public static void main(String args[])
   {
      BasicCar c1=new BasicCar();
      SportsCar sports=new SportsCar(c1);
      sports.assemble();
      
      BasicCar c2=new BasicCar();
      LuxuryCar luxury=new LuxuryCar(c2);
      luxury.assemble();
   }
}