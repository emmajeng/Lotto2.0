/**
 *
 * @author x15575767
 */
public class LotteryApp 
{
    public static void main(String[] args)
    {
        //variables
        int[] randomNums = new int[5];
        
        //constructer
        RandomGenerator myRG = new RandomGenerator();
            
        //compute
        myRG.compute();
        
        //get
        randomNums = myRG.getRandomNums();
        
        //print
        System.out.println(randomNums);
    }
    
}
