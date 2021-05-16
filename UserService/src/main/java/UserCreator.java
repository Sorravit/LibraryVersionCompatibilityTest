import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.User;

public class UserCreator {
  public User createUserFromJson(String json) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    User user = objectMapper.readValue(json, User.class);
    return user;
  }
}
