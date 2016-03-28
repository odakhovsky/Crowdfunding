package crowdfunding;

import javax.persistence.*;
import java.util.List;

@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 45)
    private String firstName;

    @Column(length = 45)
    private String lastName;

    @Column(length = 80)
    private String email;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "user")
    private List<Project> projects;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "user")
    private List<Donate> donates;


    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Donate> getDonates() {
        return donates;
    }

    public void setDonates(List<Donate> donates) {
        this.donates = donates;
    }
}
