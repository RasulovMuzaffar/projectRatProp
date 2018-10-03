package uty.ivc.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "spr_users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(name = "personnel_number")
    private int personnelNumber;
    @Column(name = "year_of_birth")
    private int yearOfBirth;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_dept")
    private Department dept;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_position")
    private UserPosition position;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_education")
    private UserEducation education;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_role")
    private Roles role;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<PropUser> propUsers = new HashSet<>(0);

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(int personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public UserPosition getPosition() {
        return position;
    }

    public void setPosition(UserPosition position) {
        this.position = position;
    }

    public UserEducation getEducation() {
        return education;
    }

    public void setEducation(UserEducation education) {
        this.education = education;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public Set<PropUser> getPropUsers() {
        return propUsers;
    }

    public void setPropUsers(Set<PropUser> propUsers) {
        this.propUsers = propUsers;
    }
}
