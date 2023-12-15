import java.util.Random;

public class main_priority {
    public static void main(String[] args) {

        SortedPriorityQueue<Integer,String> l1=new SortedPriorityQueue<Integer,String>();
        l1.insert(10, "chrome");
        l1.insert(15, "mozila");
        l1.insert(14, "kmplayer");
        l1.insert(19, "visualstudio");
        l1.insert(20, "intelij");
        l1.insert(15, "setting");
        l1.insert(17, "fileexplorer");
        l1.insert(16, "githubdesktop");
        l1.insert(11, "edge");
     
        Random r=new Random();
        
        while (l1.isEmpty()!=true) {
            int time=r.nextInt(1,3);
            Entry<Integer,String> e=l1.removeMin();
            int e_time=e.getKey();
            e_time=e_time-time;
            if(e_time>0){
                l1.insert(e_time, e.getValue());
            }
            l1.print_queue();
            System.out.println();
        }
        

    }
}