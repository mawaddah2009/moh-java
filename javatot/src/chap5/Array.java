
package chap5;
//array vs collection
//collection byk digunakan dalam java

public class Array {
    public static void main(String[] args){
        //kalau php ----> $people = [];
        //bil data dlm array = 3 -dia fixed
        String[] people = new String[3];
        people[0] = "abu";
        people[1] = "ali";
        people[2] = "ramasamy";
       // people[3] = "nita"; x boleh lebih sebab dah declare 3
        System.out.println(people[2]);
        
        //int[] bil = new int ---> x boleh (yg semua hrf besar blh sbb dia 
        //kelas
        
        Integer[] bil = new Integer[5];
        int[] jum = {1,2,3,4,5};
        
        for (int i=0; i<jum.length; i++){
            System.out.println(jum[i]);
        }
        
        int j =0;
        while (j < jum.length){
            System.out.printf("Val = %s", jum[j]);
           //  System.out.println(jum[j]);
         
            j++;
        }
        //%s utk keluarkan value
        //Val = 1Val = 2Val = 3Val = 4Val = 5
        
    }
}
