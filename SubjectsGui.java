import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class SubjectsGui extends JFrame {
    public int c;
   public int n1, n2,n3, n4 , n5;
    JLabel alLabel = new JLabel("Algjeber Lineare me Gjeometri Analitike ");
    JButton alTexButton = new JButton("Nota1");
    JLabel analizeLabel = new JLabel("Analize 1: ");
    JButton analizTextButton = new JButton("Nota2");
    JLabel gjuheLabel = new JLabel("Gjuhe Angleze 2");
    JButton gjuheTextButton = new JButton("Nota3");
    JLabel strukturLabel = new JLabel("Struktura e te dhenave");
    JButton strukturTextButton = new JButton("Nota4");
    JLabel rrjeaLabel = new JLabel("Rrjeta Kompjuterike");
    JButton rrjetaTextButton = new JButton("Nota5");

    JButton mesatarjaButton = new JButton("Get Average");

    private ArrayList<Subject> nots = new ArrayList<Subject>();
    public Subject[] a = new Subject[20];



    public SubjectsGui(int i) {
        c = i;

        JPanel flow1Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel flow2Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel flow3Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel flow4Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel flow5Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel flow6Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel gridPanel = new JPanel(new GridLayout(5, 1));
        flow1Panel.add(alLabel);
        flow1Panel.add(alTexButton);
        flow2Panel.add(analizeLabel);
        flow2Panel.add(analizTextButton);
        flow3Panel.add(gjuheLabel);
        flow3Panel.add(gjuheTextButton);
        flow4Panel.add(strukturLabel);
        flow4Panel.add(strukturTextButton);
        flow5Panel.add(rrjeaLabel);
        flow5Panel.add(rrjetaTextButton);
        flow6Panel.add(mesatarjaButton);

        gridPanel.add(flow1Panel);
        gridPanel.add(flow2Panel);
        gridPanel.add(flow3Panel);
        gridPanel.add(flow4Panel);
        gridPanel.add(flow5Panel);
        gridPanel.add(flow6Panel);

        add(gridPanel, BorderLayout.CENTER);

        mesatarjaButton.addActionListener(event -> getAverage());
        alTexButton.addActionListener(event -> getNota1());
        strukturTextButton.addActionListener(event -> getNota2());
        gjuheTextButton.addActionListener(event -> getNota3());
        analizTextButton.addActionListener(event -> getNota4());
        rrjetaTextButton.addActionListener(event -> getNota5());

    }
    //Subject s = new Subject(getNota1(),getNota2(),getNota3(),getNota4(),getNota5());
    public int getNota1() {
        String s = JOptionPane.showInputDialog("Grade: ");
         n1 = new Integer(s).intValue();
        return n1;
    }
    public int getNota2(){
        String s2 = JOptionPane.showInputDialog("Grade: ");
         n2 = new Integer(s2).intValue();
        return n2;

    }
    public int getNota3(){
        String s3 = JOptionPane.showInputDialog("Grade: ");
         n3 = new Integer(s3).intValue();
        return n3;
    }
    public int getNota4(){
        String s4 = JOptionPane.showInputDialog("Grade: ");
        n4 = new Integer(s4).intValue();
        return n4;
    }
    public int getNota5(){
        String s5 = JOptionPane.showInputDialog("Grade: ");
         n5 = new Integer(s5).intValue();
        return n5;
    }
    public void getAverage(){
        double mes = (n1+n2+n3+n4+n5)/5 ;
        JOptionPane.showMessageDialog(null,"Nota Messatare eshte: "+mes);
    }

}
