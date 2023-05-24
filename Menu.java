public class Menu {
  Car[] cars = null;
  void viewCars() {
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
    System.out.println("2 - Change car speed.")
  }
}
