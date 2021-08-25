package DataStructure;

public class ArrayExam1 {
    public static void main(String[] args) {
        int [] numbers1 = new int[4];  //new > 객체생성
        int [] numbers2 = new int[] {10, 20, 30};

        System.out.println(numbers2[2]);
        System.out.println(numbers1[2]);  //기본값 0
        System.out.println(numbers2.length);

        for(int  i=0; i<numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }




        


    }
    
}
