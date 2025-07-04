import java.util.Random;

public class V4 {

    public static boolean dropEgg(int floor, int T){
        return floor >= T;
    }

    public static void main(String[] args) {

        Random random = new Random();

        int totalFloors = Integer.parseInt(args[0]);
        int T = random.nextInt(totalFloors);
        int x = (int)Math.ceil((-1 + Math.sqrt(1 + 8 * T)) / 2);
        int attempts = 0;
        int step = x;
        int prev = 0;
        int floor = 0;

        while (step > 0 && floor < totalFloors){
            floor += step;
            step--;
            attempts++;

            if (dropEgg(floor, T)){
                System.out.println("Egg BROKEN at " + floor);
                break;
            } else {
                System.out.println("Egg PASSED at " + floor);
                prev = floor;
            }
        }

        for (int i = prev + 1; i < floor && i <= totalFloors; i++){
            attempts++;
            if (dropEgg(i, T)){
                System.out.println("Egg BROKEN at " + i);
                break;
            } else {
                System.out.println("Egg PASSED at " + i);
            }
        }



        System.out.println("T: " + T);
        System.out.println("Attempts: " + attempts);

    }
}
