import java.util.Scanner;

public class JavaBasic3 {
    
    public static void main(String[] args) {

            int angka;
            Scanner input_angka = new Scanner(System.in);
            System.out.println("Pilih pola yang tersedia dibawah!!");
            System.out.println("1. Segitiga");
            System.out.println("2. belah ketupat");
            System.out.println("3. jajar genjang");
            System.out.println("masukkan angka : ");
            angka = input_angka.nextInt();
            if (angka == 1 ){
                segitiga();
            } else if (angka == 2 ){
                belahketupat();
            } else if (angka == 3 ){
                jajargenjang();
            }else {
                System.out.print("Pola tidak ditemukan, ulangi kembali!");
            }
            }
            
    
    //jajargenjang
    static void jajargenjang() {
         for (int i=0; i<10; i++){
             for (int k= 10; k>i; k--){
                 System.out.print(" ");
             }
             for (int j=10; j<15; j++){
                    System.out.print(" *");
                }
                System.out.println("");
            }
    }


    //Segitiga Function
    static void segitiga(){
        int b = 10;
        for (int a=1; a<=b; a++){

            for(int c = 1; c<=b-a; c++ ){
            System.out.print(" ");
        }

        for (int d=1; d<=a*2-1; d++){
                System.out.print("*");
        }
        System.out.println();
        }
    }
    
    

        //Jajar genjang Function
    static void belahketupat() {
        int a = 10;
        int b = 5;

            for (int i=0; i<10; i++){
                for(int c=10; c>i; c--){
                    System.out.print(" ");
                }
                for (int d=0; d<i; d++){
                    System.out.print(" *");
                }
                System.out.println("");
            }
            for (int e=0; e<10; e++){
                for (int c=0; c<e; c++){
                    System.out.print(" ");
                }
                for (int d=10; d>e; d--){
                    System.out.print(" *");
                }
                System.out.println("");
            }
        }

    }