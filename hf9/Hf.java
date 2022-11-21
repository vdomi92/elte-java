import java.util.HashMap;

public class Hf{

    public static HashMap<String, Integer> buildCharacterHashmap(String inputString){
        HashMap<String, Integer> characters = new HashMap<String, Integer>();
        for(String s : inputString.split("")){
            if(characters.containsKey(s)){
                characters.put(s, characters.get(s) + 1);
            }else{
                characters.put(s, 1);
            }
        }

        return characters;
    }

    public static void main(String[] args){

        HashMap<String, Integer> charHasmap = new HashMap<String, Integer>();
        charHasmap = buildCharacterHashmap("Clever homework excercise");

        for (String entry: charHasmap.keySet()) {
            String key = entry.toString();
            String value = charHasmap.get(entry).toString();
            System.out.println(key + " " + value);
        }
    }
}