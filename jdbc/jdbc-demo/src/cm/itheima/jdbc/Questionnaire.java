package cm.itheima.jdbc;

public class Questionnaire {
    private int qe_id = 0;
    private String qe_title = "";
    private String qe_creator = "";

    public int getQe_id() {
        return qe_id;
    }

    public void setQe_id(int qe_id) {
        this.qe_id = qe_id;
    }

    public String getQe_title() {
        return qe_title;
    }

    public void setQe_title(String qe_title) {
        this.qe_title = qe_title;
    }

    public String getQe_creator() {
        return qe_creator;
    }

    public void setQe_creator(String qe_creator) {
        this.qe_creator = qe_creator;
    }

    @Override
    public String toString() {
        return "Questionnaire{" +
                "qe_id=" + qe_id +
                ", qe_title='" + qe_title + '\'' +
                ", qe_creator='" + qe_creator + '\'' +
                '}';
    }
}
