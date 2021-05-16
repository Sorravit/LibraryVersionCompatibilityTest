import com.fasterxml.jackson.core.JsonProcessingException;
import model.User;

public class Main {
  public static void main(String[] args) throws JsonProcessingException {
    //imagine that this is an API call from other place with JSON
    UserCreator userCreator = new UserCreator();
    String json = "{\"name\":\"first\",\"lastName\":\"Last\",\"age\":12,\"workPlace\":{\"name\":\"work Place\",\"address\":\"Address\"}}";
    User user = userCreator.createUserFromJson(json);
    System.out.println(user);
  }
}
