
import Model.Recipe;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class JsonParserExample {

    public static void main(String[] args) throws IOException {

        // -----------------------------------------------------------------
        File myFileDataJson = new File("c:\\Users\\Usuario\\JSON\\DataRecipe.json");
        Scanner myReaderDataJson  = new Scanner(myFileDataJson);

        StringBuilder dataDataJson  = new StringBuilder();
        while (myReaderDataJson.hasNextLine()) {
            dataDataJson.append (myReaderDataJson.nextLine());
        }
        myReaderDataJson.close();
        String datosRecipe = dataDataJson.toString();

        // -----------------------------------------------------------------
        ObjectMapper objectMapper = new ObjectMapper();
        List<Recipe> recipeList = objectMapper.readValue(datosRecipe,new TypeReference<List<Recipe>>() {});
        recipeList.forEach(datosX -> System.out.println(datosX.getReadyInMinutes()));
    }
}
