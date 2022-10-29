import auto.*;
import auto.utils.*;
import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args){

        BufferedReader buffReader = null;
        ArrayList<Auto> cars = new ArrayList<Auto>();

        try{
            File inputFile = new File("inp.txt");
            buffReader = new BufferedReader(new FileReader(inputFile));

            String line;
            while((line = buffReader.readLine()) != null){
                String[] lineChunks = line.split(",");
                String plateNum = lineChunks[0];
                String colorEnumValue = lineChunks[1];
                int maxSpeed = Integer.parseInt(lineChunks[2]);
                cars.add(new Auto(plateNum, Color.valueOf(colorEnumValue), maxSpeed));
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("IO error");
        }
        finally{
            try{
                buffReader.close();
            }
            catch(IOException e){
                System.out.println("IO error when closing files");
            }
            finally{
                System.out.println("Num of objects: " + Auto.getCounter());
            }
        }
    }
}