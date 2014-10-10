/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ak_dwa_cztery;

import java.util.Arrays;
/**
 *
 * @author MightySheldor
 */
public class AK_dwa_cztery 
{
    public static void main(String[] args) 
    {
        int set = 4;
        int rank = 1;
        System.out.println(Arrays.toString(unrank(set,rank)));
    }

    public static int[] unrank(int n,int r)
    {
        int array[] = new int[n];
        Arrays.fill(array, 0);
        int elementsCount = 0 ;
        
        while(r>0)
        {
            if( (r%2) == 1)
            {
                array[elementsCount] = n;
                elementsCount++;
            }
            n--;
            r/=2;
        }
        int[] result = Arrays.copyOf(array, elementsCount);
        Arrays.sort(result);
        
        return result;
    }
}
