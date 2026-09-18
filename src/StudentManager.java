import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三", 89));
        students.add(new Student("李四", 66));
        students.add(new Student("王五", 53));
        students.add(new Student("赵六", 94));

        /*for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName()+" "+students.get(i).getScore()+"分");
        }*/

        /*students.add(new Student("钱七", 85));
        System.out.println(students.size());*/

        /*for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getScore() < 60) {
                students.remove(i);
            }
        }*/
        /*for (int size = students.size(); size > 0; size--) {
            if (students.get(size - 1).getScore() < 60) {
                students.remove(size - 1);
            }
        }
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName()+" "+students.get(i).getScore()+"分");
        }*/


        /*Scanner sc = new Scanner(System.in);
        String name=sc.next();
        boolean flag=false;
        for (int i = 0; i < students.size(); i++) {
            if (name.equals(students.get(i).getName())) {
                flag=true;
                System.out.println(students.get(i).getScore());
                break;
            }
        }
        if (!flag) {
            System.out.println("无此人");
        }
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName()+" "+students.get(i).getScore()+"分");
        }*/

        /*Random r=new Random();
        int num=r.nextInt(students.size());
        students.get(num).setScore(100);
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName()+" "+students.get(i).getScore()+"分");
        }*/

        /*int sum=0;
        for (int i = 0; i < students.size(); i++) {
            sum+=students.get(i).getScore();
        }
        double avg=(double) sum/students.size();
        System.out.println(avg);

        int max=students.get(0).getScore();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getScore()>max) {
                max=students.get(i).getScore();
            }
        }
        System.out.println(max);*/

    }
}
