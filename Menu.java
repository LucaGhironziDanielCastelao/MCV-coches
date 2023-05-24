public class Menu {
  private Car[] cars = null;
  
  void viewCars() {
    System.out.println("Cars\nName\tSpeed");
    if(cars != null) for(Car car : cars) {
      System.out.println(car.name + "\t" + car.speed);
    }
    System.out.println();
  }
  
  public Menu() {
    viewCars();
    viewOptions();
  }
  public viewOptions() {
    System.out.println("1 - New car.")
    System.out.println("2 - Increase car speed.")
    System.out.println("3 - Decrease car speed.")
  }
  public 
}
