public class Menu {
  private Car[] cars = null;
  
  void view() {
    if(cars == null) System.out.println("No cars to display.\n");
    else {
      System.out.println("Cars\nName\tSpeed");
      for(Car car : cars) System.out.println(car.getName() + "\t" + car.getSpeed());
    }
    System.out.println();

    System.out.println("1 - New car.");
    System.out.println("2 - Increase car speed.");
    System.out.println("3 - Decrease car speed.");
  }
  
  public Menu() {
    view();
  }
}
