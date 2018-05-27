public class Subject {

    public double score1, score2, score3, score4, score5;

    public Subject(double score1, double score2, double score3, double score4, double score5) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
        this.score5 = score5;
    }

    public double getScore1(double newscore1) {
        return (this.score1=newscore1);
    }
    public double getScore2(double newscore2){
        return (this.score2=newscore2);
    }
    public double getScore3(double newscore3){
        return (this.score3=newscore3);
    }
    public double getScore4(double newscore4){
        return (this.score4=newscore4);
    }
    public double getScore5(double newscore5){
        return (this.score5=newscore5);
    }

    public double Average() {
        return (this.score5 + this.score2 + this.score3 + this.score4 + this.score5) / 5;
    }
}










