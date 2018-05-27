import javax.swing.*;
import java.util.ArrayList;

public class Data {
        private static ArrayList<Student> stud = new ArrayList<Student>(0);


        public void shfaqStudentin ( int i) {

            if (i == -1) {
                JOptionPane.showMessageDialog(null, "Ju nuk keni student te regjistruar me kete ID");
            } else {
                JOptionPane.showMessageDialog(null, stud.get(i));
            }


        }
        public void deleteStud(int i) {
            if (i == -1) {
                JOptionPane.showMessageDialog(null, "Ju nuk keni student te regjistruar me kete ID");
            } else {
               stud.remove(i);


        }
        }


        public int kerkoStudentin (String ID){
            int index=0;
            int arg = -1;
            for (Student studentet : stud) {
                if (studentet.getID().equals(ID) ) {
                  return index;

                }
              index++;
            }
            return -1;
        }
        public void shfaq () {
            for (Student a : stud) {
                System.out.println(a.getID());
            }
        }


        public void addStudent (String ID, String emri, String mbiemri, String ditelindja){
            stud.add(new Student(ID, emri, mbiemri, ditelindja));
        }
        public ArrayList<Student> getStudents () {
            return stud;
        }
        public int numOfStudent () {
            return stud.size();
        }
        public String bashk()
        {
            return stud.toString();
        }
}
