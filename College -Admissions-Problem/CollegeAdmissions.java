package collegeadmissions;
 
/**
 *
 * @author Michael Levet
 * @date 01/10/2016
 */
import java.util.*;
public class CollegeAdmissions {
 
     
    public static void main(String[] args) {
        System.out.println("Executing the SODA Algorithm:");
        sodaMakeMatches();
         
        System.out.println("\n\nExecuting the CODA Algorithm:");
        codaMakeMatches();
    }
     
    public static void codaMakeMatches() {
        List<Student> students = new ArrayList<Student>();
        List<College> colleges = new ArrayList<College>();
         
        College c0 = new College("X", 2);
        College c1 = new College("Y", 2);
        College c2 = new College("Z", 2);
        colleges.add(c0);
        colleges.add(c1);
        colleges.add(c2);
         
        for(int i = 0; i < 6; i++){
            Student s = new Student((i+1) + "");
            students.add(s);
             
            if(i != 0 &amp;&amp; i != 3){
                s.insertLeastPreferredCollege(c0);
                s.insertLeastPreferredCollege(c2);
                s.insertLeastPreferredCollege(c1);
            }
        }
         
        Student s0 = students.get(0);
        Student s3 = students.get(3);
         
        s0.insertLeastPreferredCollege(c1);
        s0.insertLeastPreferredCollege(c0);
        s0.insertLeastPreferredCollege(c2);
        s3.insertLeastPreferredCollege(c1);
        s3.insertLeastPreferredCollege(c0);
        s3.insertLeastPreferredCollege(c2);
         
        int[] prefs1 = new int[]{1, 4, 2, 5, 0, 3};
        int[] prefs2 = new int[]{0, 3, 1, 4, 2, 5};
         
        for(int i:prefs1){
            c0.insertLeastPreferredStudent(students.get(i));
            c1.insertLeastPreferredStudent(students.get(i));
        }
         
        for(int i:prefs2){
            c2.insertLeastPreferredStudent(students.get(i));
        }
         
        MatchMaker matchMaker = new MatchMaker(students, colleges);
        matchMaker.codaMakeMatches();
         
        for(Student s : students){
            System.out.println(s + " is matched with " + s.getMatch());
        }
         
        for(College c : colleges){
            System.out.println(c + " is matched with " + c.getMatches());
        }
    }
 
    public static void sodaMakeMatches(){
        List<Student> students = new ArrayList<Student>();
        List<College> colleges = new ArrayList<College>();
         
        College c0 = new College("A", 2);
        College c1 = new College("B", 1);
        College c2 = new College("C", 1);
        colleges.add(c0);
        colleges.add(c1);
        colleges.add(c2);
         
        for(int i = 0; i < 5; i++){
            Student s = new Student((i+1) + "");
            students.add(s);
            c0.insertLeastPreferredStudent(s);
            c1.insertStudent(s, 0);
            for(College c:colleges){
                s.insertLeastPreferredCollege(c);
            }
        }
         
        c2.insertLeastPreferredStudent(students.get(0));
        c2.insertLeastPreferredStudent(students.get(1));
         
        MatchMaker matchMaker = new MatchMaker(students, colleges);
        matchMaker.sodaMakeMatches();
         
        for(Student s : students){
            System.out.println(s + " is matched with " + s.getMatch());
        }
         
        for(College c : colleges){
            System.out.println(c + " is matched with " + c.getMatches());
        }
    }
     
}