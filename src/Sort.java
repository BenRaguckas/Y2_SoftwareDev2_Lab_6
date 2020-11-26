public class Sort {
    public static void bubble(String[] array){
        for (int i =0; i < array.length-1; i++){
            for(int j = 0; j < array.length -i -1; j++){
                if (array[j].toLowerCase().compareTo(array[j+1].toLowerCase()) > 0){
                    swap(array, j, j+1);
                }
            }
        }
    }
    public static void bubble(char[] array){
        for (int i =0; i < array.length-1; i++){
            for(int j = 0; j < array.length -i -1; j++){
                if (array[j] > (array[j+1])){
                    swap(array, j, j+1);
                }
            }
        }
    }
    public static void swap(String[] array,int index1,int index2){
        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static void swap(char[] array,int index1,int index2){
        char temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
