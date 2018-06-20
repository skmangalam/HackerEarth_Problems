package BasicProgramming;

public class Cool_Numbers {
    public static void main(String[] args) {
        System.out.println(nextCoolNumber(471));
    }
    public static int nextCoolNumber(int num) {
        StringBuilder sb = new StringBuilder("");
        while (num > 0) {
            int c = num % 10;
            num /= 10;

            if (c <= 2)
                sb.append("2");
            else if (c <= 5)
                sb.append("5");
            else if (num > 0)
                sb.append("2");

            else sb.append("22");
        }

        sb.reverse();
        return Integer.parseInt(sb.toString());
        }
    }

