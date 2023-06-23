import java.util.Scanner;

import com.config.MyConfig;

public class Main { 

    private static Scanner sc;


    private static int selectedOption = 0;
    public static void main(String[] args) {
         sc = new Scanner(System.in);
        printWelcomeMenu();

        selectedOption = sc.nextInt();
        while (selectedOption <1 || selectedOption >4){
            System.out.println("Pilihan tersedia: ");
            printWelcomeMenu();
            selectedOption = sc.nextInt();

        }
        switch (selectedOption){
            case 1:
                readData();
                break;
            case 2:
                insertData();
                break;
            case 3:
                editData();
                break;
            case 4:
                deleteData();
                break;
        } 
    }
    public static void readData(){
        MyConfig.getDatabase();
        
    }
    public static void insertData(){
        MyConfig.insertData();

    }
    public static void editData(){
        MyConfig.EditData();

    }
    public static void deleteData(){
        MyConfig.DeleteData();

    }
    public static void printWelcomeMenu() {
        System.out.println("------------------------");
        System.out.println(" WELCOME TO ...");
        System.out.println("------------------------");
        System.out.println("1.] Read Data");
        System.out.println("2.] Insert data");
        System.out.println("3.] Edit Data");
        System.out.println("4.] Delete data");
        System.out.println("------------------------");
        System.out.print("Pilih: ");

        
    }
}