import java.util.Date;
public class Student {
    private String ID;
    private String emri;
    private String mbiemri;
    private String datelindja;
    public Student(String ID, String emri, String mbiemri,String datelindja ){
        this.ID = ID;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.datelindja = datelindja;

    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmri() {
        return emri + "\t";
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri + "\t";
    }

    public void setMbiemri(String emri) {
        this.mbiemri = mbiemri;
    }
    public String getDatelindja() {
        return datelindja+ "/t";
    }

    public void setDatelindja(String datelindja) {
        this.datelindja = datelindja;
    }

    public String toString(){
        return ID + "\t"+emri+ "\t"+mbiemri +"\t"+datelindja+"\t" +"\n";
    }
}
