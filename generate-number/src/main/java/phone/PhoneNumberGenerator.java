package phone;

import java.util.HashMap;

public class PhoneNumberGenerator {

    private HashMap<String, String> hashMap;

    public PhoneNumberGenerator(){
        this.hashMap = new HashMap<String, String>();
        this.hashMap.put("A", "2");
        this.hashMap.put("B", "2");
        this.hashMap.put("C", "2");
        this.hashMap.put("D", "3");
        this.hashMap.put("E", "3");
        this.hashMap.put("F", "3");
        this.hashMap.put("G", "4");
        this.hashMap.put("H", "4");
        this.hashMap.put("I", "4");
        this.hashMap.put("J", "5");
        this.hashMap.put("K", "5");
        this.hashMap.put("L", "5");
        this.hashMap.put("M", "6");
        this.hashMap.put("N", "6");
        this.hashMap.put("O", "6");
        this.hashMap.put("P", "7");
        this.hashMap.put("Q", "7");
        this.hashMap.put("R", "7");
        this.hashMap.put("S", "7");
        this.hashMap.put("T", "8");
        this.hashMap.put("U", "8");
        this.hashMap.put("V", "8");
        this.hashMap.put("W", "9");
        this.hashMap.put("X", "9");
        this.hashMap.put("Y", "9");
        this.hashMap.put("Z", "9");

    }

    public String generateNumber(String str) throws PhoneNumberException{
        String upperStr = str.toUpperCase();
        String result = "";
        for(int i = 0; i < upperStr.length(); i++){
            char character = upperStr.charAt(i);

            switch (character){
                case '-' : result += character; break;
                case '1' : result += character; break;
                case '0' : result += character; break;
                default: result += this.getNumberFromMap(character);
            }

        }

        return result;
    }

    public String getNumberFromMap(char character) throws PhoneNumberException{
        String number = this.hashMap.get(character  + "");
        if(number != null){
            return number;
        }else {
            throw new PhoneNumberException();
        }
    }

}
