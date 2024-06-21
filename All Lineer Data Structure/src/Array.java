public class Array {
    public static void main(String[] args) {
        int[] array = new int[5];// Create Array
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5; // Add items to array

        for (int i = 0 ; i<array.length ; i++)
        {
            System.out.println("Element in Array: "+array[i]);
        } // Print elements in array

    }
}
