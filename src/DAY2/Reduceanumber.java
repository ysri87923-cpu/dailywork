public class NumberOfSteps {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        NumberOfSteps obj = new NumberOfSteps();
        int num = 14;
        int result = obj.numberOfSteps(num);
        System.out.println("Input: " + num);
        System.out.println("Output: " + result);
    }
}