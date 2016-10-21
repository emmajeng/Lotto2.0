import java.util.Random;

/**
 *
 * @author x15575767
 */
public class RandomGenerator 
{
    //private variables
    private int[] randomNums = new int[5];
    
    //constructer
    public RandomGenerator()
    {
        this.randomNums = randomNums;
    }
    
    //overloaded constructer
    
    //number generator
    public void compute()
    {
        for(int i = 0; i<5; i++)
            {
                Random rnd = new Random();

                while(i != 5)
                {
                  randomNums[i] = 1 + (int)(Math.random() * 40);
                }

            }
    }
    
    //get
    public int[] getRandomNums() 
    {
        return randomNums;
    }
    
            
}
