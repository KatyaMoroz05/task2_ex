import java.util.Random;

public class Cat
{
    private Random random = new Random();

    private void sleep()
    {
        System.out.println("Sleep");
    }

    private void meow()
    {
        System.out.println("Meow");
    }

    private void eat()
    {
        System.out.println("Eat");
    }


    public void status()
    {
        int action = random.nextInt(3);
        switch (action)
        {
            case 0:
                sleep();
                break;
            case 1:
                meow();
                break;
            case 2:
                eat();
                break;
        }
    }
}