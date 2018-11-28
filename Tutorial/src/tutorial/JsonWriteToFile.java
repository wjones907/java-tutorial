package tutorial;  
 
// importing files for writing JSON   
import java.io.File;  
import java.io.FileWriter;  
import java.io.IOException;  
 
// activate arrays and objects   
import org.json.simple.JSONArray;  
import org.json.simple.JSONObject;  
  
public class JsonWriteToFile {  
  
    public static void main(String[] args) {  
  
        JSONObject countryObj = new JSONObject();  
        countryObj.put("Name", "Australia");  
        countryObj.put("Population", new Integer(23000000));  
  
        JSONArray listOfStates = new JSONArray();  
        listOfStates.add("New South Wales");  
        listOfStates.add("Queensland");  
        listOfStates.add("South Australia");  
  
        countryObj.put("States", listOfStates);  
  
        try {  
              
            // writing data to a file in JSON  
            File file=new File("c:\\temp\\CountryJSONTutorial.json");  
            file.createNewFile();  
            FileWriter fileWriter = new FileWriter(file);  
            System.out.println("Writing JSON object to file");  
            System.out.print(countryObj);  
  
            fileWriter.write(countryObj.toJSONString());  
            fileWriter.flush();  
            fileWriter.close();  
  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}