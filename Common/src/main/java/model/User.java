package model;

public class User {
  public String name;
  public String lastName;
  public int age;
  public WorkPlace workPlace;

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", lastName='" + lastName + '\'' +
        ", age=" + age +
        ", workPlace=" + workPlace +
        '}';
  }
}
