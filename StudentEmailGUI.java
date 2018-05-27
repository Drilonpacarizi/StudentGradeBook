import javax.swing.*;
import java.awt.*;

public class StudentEmailGUI extends JFrame{
    private JTextArea studentTextArea = new JTextArea();
    private JLabel     idLabel       = new JLabel("ID: ");
    private JTextField idTextField   = new JTextField(10);
    private JLabel     nameLabel     = new JLabel ("Name: ");
    private JTextField nameTextField = new JTextField(10);
    private JLabel     lastnameLabel = new JLabel("Last Name");
    private JTextField lastnameTextField = new JTextField(10);
    private JLabel     dateLabel     = new JLabel("Birthday");
    private JTextField dateTextField = new JTextField(10);

    private JButton addButton        = new JButton("Add");
    private JButton deleteButton     = new JButton("Delete");
    private JButton findButton       = new JButton("Find Student");
    private JButton exitButton       = new JButton("Exit");
    private JButton addgradeButton   = new JButton("Add Grades");
    private JButton numButton        = new JButton("Get Number of Student");

    public StudentEmailGUI() {
        JPanel flow1Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel flow2Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel flow3Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel gridPanel = new JPanel(new GridLayout(5, 2));

        studentTextArea.setEditable(false);


        flow1Panel.add(idLabel);
        flow1Panel.add(idTextField);
        flow1Panel.add(nameLabel);
        flow1Panel.add(nameTextField);
        flow3Panel.add(lastnameLabel);
        flow3Panel.add(lastnameTextField);
        flow3Panel.add(dateLabel);
        flow3Panel.add(dateTextField);

        flow1Panel.add(addButton);
        flow3Panel.add(deleteButton);
        flow2Panel.add(findButton);
        flow2Panel.add(exitButton);
        flow2Panel.add(addgradeButton);
        flow2Panel.add(numButton);

        gridPanel.add(flow1Panel);
        gridPanel.add(flow3Panel);
        gridPanel.add(flow2Panel);

        add(studentTextArea, BorderLayout.CENTER);
        add(gridPanel, BorderLayout.SOUTH);

        addButton.addActionListener(event -> addStud());
        numButton.addActionListener(event -> numOfStudent());
        exitButton.addActionListener(event -> exitApp());
        findButton.addActionListener(event -> findStudent());
        addgradeButton.addActionListener(event -> addGrade());
        deleteButton.addActionListener(event -> deleteButton());



        }
        private void addStud(){
               Data a = new Data();

               Student stud = new Student( idTextField.getText(),
                    nameTextField.getText(),
                    lastnameTextField.getText(),
                    dateTextField.getText());
            boolean isID = true;
            if(stud.getID().length()<4){
                isID = false;
            }
            if(isID = false){
                JOptionPane.showMessageDialog(null, "Ju Lutem shtypni ID me se paku 4 numra");
            }
            else{
                a.addStudent(idTextField.getText(),
                        nameTextField.getText(),
                        lastnameTextField.getText(),
                        dateTextField.getText());

                studentTextArea.append( stud.toString()+ "\n");
            }

        }
        Data a = new Data();
        public void addGrade() {
        String w = JOptionPane.showInputDialog("Id e studentit qe deshironi ti jepni noten");

            //Data a = new Data();
            int l=a.kerkoStudentin(w);
            if(l==-1){
                JOptionPane.showMessageDialog(null,"Nuk keni asnje student te till");
            }
            else{       System.out.println(l);
            SubjectsGui obj = new SubjectsGui(l);
            obj.setVisible(true);
            obj.setSize(400, 400);
            obj.setLocation(600, 100);
            obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            obj.nota();
            }
        }
        private void findStudent(){
        String s = JOptionPane.showInputDialog("Ju lutem shkruani id");
        Data stud = new Data();
        stud.shfaqStudentin(stud.kerkoStudentin(s));
    }
        private void exitApp(){
        System.exit(0);
        }
        private void numOfStudent(){
        JOptionPane.showMessageDialog(null,"Number of Student Actual: " +a.numOfStudent());
        }
        public void deleteButton(){
            String s1 = JOptionPane.showInputDialog("Ju Lutem Shkruani ID");
            Data stud = new Data();
            stud.deleteStud(stud.kerkoStudentin(s1));//prove veq pak 1min

        }



        public static void main(String[] args){
        StudentEmailGUI app = new StudentEmailGUI();
        app.setVisible(true);
        app.setSize(600,500);
        app.setLocation(200,100);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

