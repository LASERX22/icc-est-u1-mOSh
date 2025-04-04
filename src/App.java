import controller.ShellSort;

public class App {
    public static void main(String[] args) throws Exception {
        ShellSort ss= new ShellSort();
        int[] a= {-10, 0, 4, 7, 2, 1, 9, 6, 5};
        System.out.println("Joey Diaz");
        ss.printArray(a);
        System.out.println("=====Ascendente=====");
        ss.sort(a,true);
        ss.printArray(a);
        System.out.println("=====Descendente=====");
        ss.sort(a,false);
    }
}
