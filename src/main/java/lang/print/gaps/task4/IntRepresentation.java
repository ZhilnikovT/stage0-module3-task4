package lang.print.gaps.task4;

public class IntRepresentation {
    public static void main(String[] args) {
//        for(int i =0; i < 128 ;i++){
//            char simbol =  (char)i;
//            System.out.println(i + " - " + simbol);
//        }
        //Print chars :'c', 'h', 'a', 'r' using int 
        short[] array = new short[]{99, 104, 97, 114};
        for(int i = 0; i < array.length ;i++){
            char simbol =  (char)array[i];
            System.out.println(i + " - " + simbol);
        }
    }
}
