package libraryIOProjTest;

import java.util.Scanner;
import java.util.stream.Stream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.*;

public class libMain {

    private static List<Book> LIST;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scan = new Scanner(System.in);
        load();
        System.out.println("Initializaing and Loading Data in...");
        while (true) {
            System.out.println("=====Main Interface=========");
            System.out.println("1. Record in books");
            System.out.println("2. Check book info");
            System.out.println("3. Delete book info");
            System.out.println("4. Edit book info");
            System.out.println("5. Exit system");
            System.out.println("============================");

            switch (scan.nextInt()) {
                case 1:
                    insert(scan);
                    break;
                case 2:
                    list();
                    break;
                case 3:
                    delete(scan);
                    break;
                case 4:
                    edit(scan);
                    break;
                case 5:
                    System.out.println("Saving Info Now...");
                    save();
                    System.out.println("System closed");
                    return;
            }
        }
    }

    private static void load(){
        File f = new File("./com/test/libraryIOProjTest/data");
        if(f.exists()){
            try (ObjectInputStream str = new ObjectInputStream(new FileInputStream(f))){
                LIST = (List<Book>)str.readObject();
                
            } catch (IOException e){
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            LIST = new LinkedList<>();
        }
        
    }

    private static void save() throws FileNotFoundException, IOException{
        try (ObjectOutputStream str = new ObjectOutputStream(new FileOutputStream("./com/test/libraryIOProjTest/data"))){
            str.writeObject(LIST);
            str.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void insert(Scanner scan) {
        scan.nextLine();
        System.out.println("Enter info for your book Now");
        System.out.print("Enter title: ");
        String title = scan.nextLine();
        System.out.print("Enter author: ");
        String author = scan.nextLine();
        System.out.print("Enter price: ");
        int price = scan.nextInt();
        // scan.nextLine();
        Book book = new Book(title, author, price);
        LIST.add(book);
        System.out.println(book);
        System.out.println();
    }

    private static void list(){
        for(int i=0;i<LIST.size();i++){
            System.out.println(i + ". "+LIST.get(i));
        }
    }

    private static void delete(Scanner scan){
        //remove first empty input
        System.out.println("Type in book index to delete");
        scan.nextLine();
        int index = scan.nextInt();
        scan.nextLine();
        while(index > LIST.size() - 1 || index < 0){
            System.out.println("book index don't exist");
            index = scan.nextInt();
            scan.nextLine();
        }
        LIST.remove(index);
        System.out.println("Delete Success");
    }

    private static void edit(Scanner scan){
        System.out.println("Type in book index to edit");
        scan.nextLine();
        int index = scan.nextInt();
        while(index > LIST.size() - 1 || index < 0){
            System.out.println("book index don't exist");
            index = scan.nextInt();
            scan.nextLine();
        }
        scan.nextLine();
        //after getting a valid index
        Book b = LIST.get(index); 
        System.out.println("original title: "+ b.getTitle());
        System.out.println("Plz type in new title");
        b.setTitle(scan.nextLine());
        System.out.println("original author: "+ b.getAuthor());
        System.out.println("Plz type in new author");
        b.setAuthor(scan.nextLine());
        System.out.println("original price: "+ b.getPrice());
        System.out.println("Plz type in new price");
        b.setPrice(scan.nextInt());
        scan.nextLine();
    }
}
