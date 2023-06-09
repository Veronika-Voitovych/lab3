public class Task1 implements Task_Interface {
    public void task1(String text, int counter){
        for (int i = 0; i < counter; i++) {
            System.out.println(text);
        }
    }
    public void task1_1(String text, int counter){
        int i =0 ;
        while(i<counter){
            System.out.println(text);
            i++;
        }
    }


}
