import java.util.*;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> back = new Stack<>();
        Stack<String> forward = new Stack<>();
        String curr = null;

        while (sc.hasNextLine()) {
            String input = sc.nextLine().trim();
            if (input.length() == 0) break;

            String[] cmd = input.split(" ");

            switch (cmd[0]) {
                case "visit":
                    if (curr != null) {
                        back.push(curr);
                    }
                    curr = cmd[1];
                    forward.clear();
                    System.out.println("visited: " + curr);
                    break;

                case "curr":
                    if (curr != null)
                        System.out.println(curr);
                    else
                        System.out.println("No page visited");
                    break;

                case "back":
                    if (!back.isEmpty()) {
                        forward.push(curr);
                        curr = back.pop();
                        System.out.println(curr);
                    } else {
                        System.out.println("No previous Page");
                    }
                    break;

                case "forward":
                    if (!forward.isEmpty()) {
                        back.push(curr);
                        curr = forward.pop();
                        System.out.println(curr);
                    } else {
                        System.out.println("No next Page");
                    }
                    break;

                case "clear":
                    back.clear();
                    forward.clear();
                    curr = null;
                    break;
            }
        }
        sc.close();
    }
}
