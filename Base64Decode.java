import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class Base64Decode {
  public static void main(String[] args) {
    String encoded = "QmFzZTY0IERlY29kZQ==";
    byte[] decoded = Base64.getDecoder().decode(encoded);
    String decodedStr = new String(decoded, StandardCharsets.UTF_8);

    System.out.println(decodedStr);
  }
}
