public class Car {
  private String name;
    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }
  private Integer speed;
    public void setSpeed(Integer speed) { this.speed = speed; }
    public Integer getSpeed() { return this.speed; }
  
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
