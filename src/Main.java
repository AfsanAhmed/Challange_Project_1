import java.util.Scanner;
public class Main {
    static int secondMaxNumber(int array[],int length) // Method to find 2nd maximum number from an array
    {
        int highestNumber;
        int secondHighestNumber;

        if(array[0] > array[1])
        {
            highestNumber = array[0];
            secondHighestNumber = array[1];
        }
        else
        {
            highestNumber = array[1];
            secondHighestNumber= array [0];
        }
        for (int i = 2; i<length; i++)
        {
            if (array[i] > highestNumber)
            {
                secondHighestNumber = highestNumber;
                highestNumber = array[i];
            }
            else if (array[i] > secondHighestNumber && array[i] < highestNumber)
            {
                secondHighestNumber = array[i];
            }
        }
        return secondHighestNumber;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println ("Please Enter the size of the Array: "); // First define the size of an array
        int num = input.nextInt();
        int numbers[] = new int[num];

        for (int i = 0; i < num; i++)
        {
            System.out.println ("number" + i + ":");
            numbers[i] = input.nextInt();
        }

        for (int i=0; i<num;i++)
        {
            System.out.println(numbers[i]);
        }
        int result = secondMaxNumber(numbers,num); // Calling the method
        System.out.println("The Second Maximum number is " + result);
        input.close();
    }
}