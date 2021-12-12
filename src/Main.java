public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int add = 1700;
        int bonus;
        if (add > 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }
        startBalance += add + bonus;
        System.out.println(bonus);
        System.out.println(startBalance);
        }
    }
