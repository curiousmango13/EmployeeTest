package week05;

import static org.junit.jupiter.api.Assertions.*;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import org.junit.Test;


/**
 *  
 * @author Julia Smith
 * 
 */

public class Week05JUnitTest
{

	/**
	 * method creates multiple Die instances and verify the rolls are unique 
	 */
	@Test
	public void testMultipleDie()
	{
		
		Die rolled = new Die(true);
		Die rolled2 = new Die(true);
		Die rolled3 = new Die(true);
		
	
		int num = rolled.getNumber();
		int num2 = rolled2.getNumber();
		int num3 = rolled3.getNumber();
		
	
//		System.out.print(num);
//		System.out.print(num2);
//		System.out.print(num3);
		
		if ((num == num2) || (num2 ==num3) || (num3 ==num))
		{
			System.out.println("\n");
			System.out.println(" Rolls are not unique");
		}
		else {
			System.out.println(" Rolls are unique");
		}
		
		
		System.out.println("****************************************************************************");
		
		if ((rolled.equals(rolled2) ) || (rolled2.equals(rolled3)) || (rolled3.equals(rolled) ))
		{
			System.out.println("\n");
			System.out.println(" Rolls are definitely not unique");
		}
		else {
			System.out.println(" Rolls are definitely unique");
		}
	}
	

	
	
	/**
	 * method runs a number of tests (in this case 1000) and checks
	 *  that each facet (1-6) has a value (non-zero) count, 
	 *  calculates the mean and standard deviation
	 *  */
	@Test
	public void testRandomDie()
	{
			
			int ones = 0;
			int twos = 0;
			int threes = 0;
			int fours = 0;
			int fives = 0;
			int sixes = 0;
			double mean = 0;
			double stDev = 0;
			double dist1 = 0;
			double dist2 = 0;
			double dist3 = 0;
			double dist4 = 0;
			double dist5 = 0;
			double dist6 = 0;
			
						
			int testQuantity =  1000;
			
		for(int i = 0; i < testQuantity; ++i)
		{
			
			Die rolled = new Die(true);
			int num = rolled.getNumber();
						
			switch (num) {
				case 1:
					ones = ones +1;
					break;
				case 2:
					twos = twos +1;
					break;
				case 3:
					threes = threes +1;
					break;
				case 4:
					fours = fours +1;
					break;	
				case 5:
					fives = fives +1;
					break;
				case 6:
					sixes = sixes +1;
					break;
		}
			

	}			
		
			mean = (((double)(ones+twos+threes+fours+fives+sixes)) / (double)6);
	
			double oneMinMean = ones-mean;
			double twoMinMean = twos-mean;
			double threeMinMean = threes-mean;
			double fourMinMean = fours-mean;
			double fiveMinMean = fives-mean;
			double sixMinMean = sixes-mean;
			
			double oneMinMeanSq = Math.pow(oneMinMean, 2);
			double twoMinMeanSq = Math.pow(twoMinMean, 2);
			double threeMinMeanSq = Math.pow(threeMinMean, 2);
			double fourMinMeanSq = Math.pow(fourMinMean, 2);
			double fiveMinMeanSq = Math.pow(fiveMinMean, 2);
			double sixMinMeanSq = Math.pow(sixMinMean, 2);
			
			double meanOfSq = (oneMinMeanSq+twoMinMeanSq+threeMinMeanSq+fourMinMeanSq+fiveMinMeanSq+sixMinMeanSq)/6;
			
			stDev= Math.sqrt(meanOfSq);
				
				
			dist1= ((double)ones/(double)testQuantity)*100;
			dist2= ((double)twos/(double)testQuantity)*100;
			dist3= ((double)threes/(double)testQuantity)*100;
			dist4= ((double)fours/(double)testQuantity)*100;
			dist5= ((double)fives/(double)testQuantity)*100;
			dist6= ((double)sixes/(double)testQuantity)*100;
		
		
			double minRange = 0;
			double maxRange = 0;
			
			minRange = mean - stDev ;
			maxRange = mean + stDev;
			
			if ((ones > minRange)&(ones < maxRange)|| (twos > minRange)&(twos < maxRange) ||
					(threes > minRange)&(threes < maxRange) || (fours > minRange)&(fours < maxRange)||
					(fives > minRange)&(fives < maxRange)||(sixes > minRange)&(sixes < maxRange))
			
			{
			
			System.out.println("Counts: "+ "bucket 1 - " +ones + "; bucket 2 - " +twos+ "; bucket 3 - " +threes+
					"; bucket 4 - " +fours+ "; bucket 5 - " +fives+ "; bucket 6 - " +sixes+ ";");
			System.out.println("Distribution per bucket: bucket 1 - "+ dist1+" ; " +
					"bucket 2 - " + dist2+ " ; "+ "bucket 3 - " + dist3+ " ; "+ "bucket 4 - " + dist4+ " ; "+
					"bucket 5 - " + dist5+ " ; "+ "bucket 6 - " + dist6);
			 System.out.println("Mean: " + String.format("%.2f",mean) + ", " +"Standard deviation: "+String.format("%.2f",stDev));
			 System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
			 
		
			} 
			 
//			 if ((dist1 > stDev*2) || (dist1 < stDev*2)){
//				System.out.println("This dist is out of range"); 
//			 }
//			 else {
//				 System.out.println(dist1);
//			 }
	}
}
