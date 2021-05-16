import com.fasterxml.jackson.databind.ObjectMapper;
import model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

@DisplayName("UserCreator Test")
class UserCreatorTest {

  @Test
  @DisplayName("User should be able to deserialize")
  public void deserialize() throws IOException {
//Only this test case because I just want to prove a point
    ObjectMapper objectMapper = new ObjectMapper();
    String json = "{\"name\":\"first\",\"lastName\":\"Last\",\"age\":12,\"workPlace\":{\"name\":\"work Place\",\"address\":\"Address\"}}";
    User actual = objectMapper.readValue(json, User.class);
    objectMapper.writeValueAsString(actual);
  }
}