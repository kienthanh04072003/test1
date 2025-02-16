

public class arr {
    public static void main(String[] args) {
        int[] demso = {1,2,3,4,5,5};
        int socandem = 5;
        int dem = 0;
        for(int i = 0; i < demso.length; i++){
            if(demso[i] == socandem){
                dem++;
            }
        }
        System.out.println("so lan xuat hien cua " + socandem + " la " +dem);
    }
}
