import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class ProfileDemo {
    public static void main(String[] args) {
        Profile profile = new Profile("Janaka Premathilaka",
                                       "janaka2@gmail.com",
                                       "Software Engineer",
                                       Arrays.asList("Java", "Python", "C++"),
                                       Map.of("LinkedIn", "https://www.linkedin.com/in/janaka-premathilaka/",
                                              "GitHub", "https://github.com/janaka-premathilaka"));

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String profileJson = objectMapper.writeValueAsString(profile);
            System.out.println(profileJson);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
