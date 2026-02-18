
/**
 * Write a description of class TestArreglos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestArreglos
{
   // tipo nombre[]
   int arreglo1[], arreglo4;
   int []arreglo2, arreglo5 = { 0,1,2,3,4,5,6};
   int[] arreglo3, arreglo6 = new int[6];
   int matriz[][] = { {1,2,3,}, {4}, {5,6,7,8}, {9, 0} };
   
   public TestArreglos() {
       arreglo1 = new int[5];
       arreglo2 = arreglo1;
       arreglo3 = new int[100];
       
       for(int indice = 0; indice < arreglo3.length; indice++)
           arreglo3[indice] = indice;
        int suma = 0; 
        // For..each
        for(int elemento : arreglo3 )
             suma += elemento;

       //arreglo1[2] = 50;
       //arreglo2[2] =  60;
       matriz[0] = new int[3];
       
       función(arreglo1);
    }
    
    public void función(int arr[]) {

        
    }
}




