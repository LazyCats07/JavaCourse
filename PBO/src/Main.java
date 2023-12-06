public class Main {
    static void myMetode(){
        System.out.println("Halo Chintia");
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Method.myMethod();
        Method.myMethod();
        Method.myMethod();
        myMetode();
        Param_Arg.myMethod2("Rafi ");
        Param_Arg.metode2("Chintia", 29);
        System.out.println(return_Class.myMethod(8));
        System.out.println(return_Class.myMethod2(8, 9));

//      Error Handling
        try{
            int hasil = 9/0; //penyebab exception ArithmeticException
            System.out.println("Hasil pembagian = "+ hasil);
            System.out.println("Pernyataan dalam blok try setleah excepsi");
        }
        catch(ArithmeticException exc){
            System.err.println("ArithmeticException: exception pembagian oleh nol.");
            System.err.println("\nException yang ditangkap adalah: "+exc + "\n");
        }

//      Error Handling: finally
        try{
            int hasil = 9/0; //penyebab exception ArithmeticException
            System.out.println("Hasil pembagian = "+ hasil);
            System.out.println("Pernyataan dalam blok try setleah excepsi");
        }
        catch(ArithmeticException exc){
            System.err.println("ArithmeticException: exception pembagian oleh nol.");
            System.err.println("\nException yang ditangkap adalah: "+exc);
        }
        finally{
            System.out.println("Wadaww tetap di print");
        }

//      Error Handling:
        try{
            int[] array = new int[9];  //penyebab exception ArithmeticException
            array[9] = 13; // Penyebab Exception
            System.out.println("Elemen Array indeks ke 9 adalah " + array[9]);
            System.out.println("Pernyataan dalam blok try setleah excepsi");
        }
        catch(ArithmeticException exc){
            System.err.println("ArithmeticException: exception pembagian oleh nol.");
            System.err.println("\nException yang ditangkap adalah: "+exc);
        }
        finally{
            System.out.println("Wadaww tetap di print");
        }

    }
}