public class Car {
  private String name;
  private Integer speed;
  
  public Car(String name) {
    this.name = name;
  }
  public void increaseSpeed() {
    this.speed++;
  }
  public void decreaseSpeed() {
    this.speed--;
  }
}
