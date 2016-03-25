package crowdfunding;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "donates")
public class Donate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private User user;

    @Column
    private double amount;

    @ManyToOne
    private Project project;

    @Column
    private Timestamp date;


    public Donate() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Project getProjectId() {
        return project;
    }

    public void setProjectId(Project project) {
        this.project = project;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
