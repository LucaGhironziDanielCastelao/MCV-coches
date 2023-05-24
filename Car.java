public class Car {
  private String name;
  private Integer speed;
  
  public Car(String name, Integer speed) {
    this.name = name;
    this.speed = speed;
  }
  public void increaseSpeed() {
    this.speed++;
  }
  public void decreaseSpeed() {
    this.speed--;
  }
}
