package model;

public class User {
  public String name;
  public String surname;
  public int age;
  public WorkPlace workPlace;

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", age=" + age +
        ", workPlace=" + workPlace +
        '}';
  }
}
