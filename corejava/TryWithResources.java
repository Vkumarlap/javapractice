import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) {

        try (BufferedReader b = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter Number");
            int a = Integer.parseInt(b.readLine());

            System.out.print(a);
        } catch (Exception e) {

            System.out.print(e);
        }

    }
}
