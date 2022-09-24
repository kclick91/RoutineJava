public class ProductSale extends RJ {


    public ProductSale(int[] arr, double[] doubleArr)
    {
        intArray = arr;
        doubleArray = doubleArr;
    }

    public void PrintProductsAndPrices()
    {
        System.out.println("Quantities of Products: ");
        PrintArrayInt();
        System.out.println();
        System.out.println("Price of each Product in $");
        PrintArrayDoub();
    }

    @Override
    public void PrintArrayDoub()
    {
        for (int i = 0; i < doubleArray.length; i++)
        {
            System.out.printf("%.2f", doubleArray[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
    }

    




}
