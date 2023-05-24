import java.util.LinkedList;
import java.util.Scanner;


public class Menu {
  private LinkedList<Car> cars = new LinkedList<Car>();
  private Scanner scanner = new Scanner(System.in);
  
  public void newCar() {
    System.out.print("Insert car name: ");
    String name = scanner.nextLine();

    System.out.print("Insert car speed: ");
    Integer speed = Integer.valueOf(scanner.nextLine());

    cars.add(new Car(name, speed));
    System.out.println("\nCar created.");
  }
  public void increaseSpeed() {
    System.out.print("Insert car name: ");
    String name = scanner.nextLine();
    Boolean found = false;
    for(Car car : cars) if(car.getName().equals(name)) {
      found = true;
      car.increaseSpeed();
      System.out.println("\nSpeed of car " + name + " increased.");
    }
    if(!found) System.out.println("\nCar " + name + " not found.");
  }
  public void decreaseSpeed() {
    System.out.print("Insert car name: ");
    String name = scanner.nextLine();
    Boolean found = false;
    for(Car car : cars) if(car.getName().equals(name)) {
      found = true;
      if(car.getSpeed() > 0) {
        car.decreaseSpeed();
        System.out.println("\nSpeed of car " + name + " decreased.");
      } else System.out.println("\nCar " + name + " at minimum speed.");
    }
    if(!found) System.out.println("\nCar " + name + " not found.");
  }

  public Menu() {
    while(true) {
      if(cars.isEmpty()) System.out.println("No cars to display.");
      else {
        System.out.println("Cars\nName\tSpeed(km/h)");
        for(Car car : cars) System.out.println(car.getName() + "\t" + car.getSpeed());
      }
      System.out.println();

      System.out.println("1 - New car.");
      System.out.println("2 - Increase car speed.");
      System.out.println("3 - Decrease car speed.");
      System.out.print("Select a number for a command: ");

      String input = null;
      do {
        input = scanner.nextLine();
        switch(input) {
          case "1":
            newCar();
            break;
          case "2":
            increaseSpeed();
            break;
          case "3":
            decreaseSpeed();
            break;
          default:
            System.out.print("Select a valid option: ");
            input = null;
            break;
        }
      } while(input == null);
    }
  }
}
