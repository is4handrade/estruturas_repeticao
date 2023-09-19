public class ExemplosBasicos{
    public static void main(String[] args){
        //for, while e do/while
       // repetição manual = System.out.println()
       // repetição controlada por contador
    //    int cont =1;
    //    while(cont <= 3){
    //     System.out.println(cont);
    //     cont = cont + 1;
    //    }
    //    for(int cont = 1;cont <= 3;cont = cont + 1 ){
    //     System.out.println(cont);
    //    }

    int cont = 1;
    do{
        System.out.printf("Valor da vez: %d\n", cont);
        cont += 1; // cont = cont + 1;
        }while(cont <= 3);
    }
}