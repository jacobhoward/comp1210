import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;
/***************************************
* @author Jacob Howard
* Description : 
***************************************/
public class CardholderProcessor {
   
   private Cardholder[] Cardholders;
   private String[] InvalidRecords;
   
   //Constructor
   public CardholderProcessor() {
      Cardholders = new Cardholder[0];
      InvalidRecords = new String[0];
   }
   
   
   //Methods
   public Cardholder[] getCardholdersArray() {
      return Cardholders;
   }
   
   public String[] getInvalidRecordsArray() {
      return InvalidRecords;
   }
   
   public void addCardholder(Cardholder CardholderIn) {
      Cardholders = Arrays.copyOf(Cardholders, Cardholders.length +1);
      Cardholders[Cardholders.length - 1] = CardholderIn;
   }
   
   public void addInvalidRecord(String invalidRecord) {
   invalidRecords = Arrays.copyOf(InvalidRecords, InvalidRecords.length +1);
   }
   
   //reads cardholder files
   public void readCardholderFile(String fileName) throws FileNotFoundException
   {
   
      Scanner fileScan = new Scanner(new File(fileName));
      Scanner scanLines;
      while (scanFile.hasNext())
      {
      scanLines = scanFile;
      useDelimiter(";");
      String category = scanFile.nextLine();
      account number = scanFile.nextLine();
      name = scanFile.nextLine();
      previous balance;
      payment;
}