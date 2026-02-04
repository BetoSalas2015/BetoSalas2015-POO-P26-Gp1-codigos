
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
   
   public TestArreglos() {
       arreglo1 = new int[5];
       arreglo2 = arreglo1;
       arreglo3 = new int[100];
       
       for(int indice = 0; indice < arreglo3.length; indice++)
           arreglo3[indice] = indice;

       //arreglo1[2] = 50;
       //arreglo2[2] =  60;
    }
}
