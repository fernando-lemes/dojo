public class RomanNumberGenerator {

    public String generateRomanNumber(int number){
        String str = "";

        switch (number) {
            case 1:
                str = "I";
                break;
            case 5:
                str = "V";
                break;
            case 10:
                str = "X";
                break;
            case 50:
                str = "L";
                break;
            case 100:
                str = "C";
                break;
            case 500:
                str = "D";
                break;
            case 1000:
                str = "M";
                break;
        }
        return str;
    }

    public int generateAlgNumber(char romanNumber){
        int str = 1;

        switch (romanNumber) {
            case 'I':
                str = 1;
                break;
            case 'V':
                str = 5;
                break;
            case 'X':
                str = 10;
                break;
            case 'L':
                str = 50;
                break;
            case 'C':
                str = 100;
                break;
            case 'D':
                str = 500;
                break;
            case 'M':
                str = 1000;
                break;
        }
        return str;
    }

    public String convertToRoman(int number, int position) {
        int[] algNum = {1, 5, 10, 50, 100, 500, 1000};
        String[] algRomNum = {"I", "V", "X", "L", "C", "D", "M"};

        while(number != 0){

            if(number % algNum[position] > 0){
                number -=  algNum[position];
                String var = algRomNum[position] + convertToRoman(number - algNum[position],position );
            }
        }

        return "";
    }

    /*public int generateAlgNumberFromString(String romanNumber){
        int contx = 0; int contv =0;
        for(int i =0;i < romanNumber.length(); i++){
            char c = romanNumber.charAt(i);
        }

        return str;
    }*/


}
