import java.util.Random;

public class V3 {

    public static boolean dropEgg(int floor, int N){
        return floor >= N;
    }


    public static void main(String[] args) {

        Random random = new Random();

        int totalFloors = Integer.parseInt(args[0]);
        int T = random.nextInt(totalFloors) + 1;

        int x = (int)Math.ceil(Math.sqrt(totalFloors));
        int previous = 0;
        int current = x;
        int attempts = 0;
        boolean broken = false;

        while (current <= totalFloors){
            attempts++;
            if(dropEgg(current, T)){
                System.out.println("Egg BROKEN at " + current);
                broken = true;
                break;
            } else {
                System.out.println("Egg PASSED at " + current);
                previous = current;
                current += x;
            }
        }
        if (!broken){
            current = totalFloors;
        }

        for (int floor = previous + 1; floor <= current; floor++){
            attempts++;
            if (dropEgg(floor, T)){
                System.out.println("Egg BROKEN at " + floor);
                break;
            } else {
                System.out.println("Egg PASSED at " + floor);
            }
        }
        System.out.println("T: " + T);
        System.out.println("Attempts: " + attempts);
    }
}
