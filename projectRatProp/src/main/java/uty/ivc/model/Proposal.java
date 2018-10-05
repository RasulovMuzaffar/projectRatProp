package uty.ivc.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "proposal")
public class Proposal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp date;
    private String title;
    @Column(name = "offer_description")
    private String offerDescription;
    @Column(name = "opinion_conclusion")
    private String opinionConclusion;
    @Column(name = "expected_reward")
    private Double expectedReward;
    @Column(name = "approved_reward")
    private Double approvedReward;

    @JsonManagedReference
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_k1")
    private K1 k1;
    @JsonManagedReference
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_k2")
    private K2 k2;
    @JsonManagedReference
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_k3")
    private K3 k3;
    @JsonManagedReference
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_p")
    private P p;

    @JsonBackReference
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "proposal")
    private Set<PropUser> propUsers = new HashSet<>(0);


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public String getOpinionConclusion() {
        return opinionConclusion;
    }

    public void setOpinionConclusion(String opinionConclusion) {
        this.opinionConclusion = opinionConclusion;
    }

    public Double getExpectedReward() {
        return expectedReward;
    }

    public void setExpectedReward(Double expectedReward) {
        this.expectedReward = expectedReward;
    }

    public Double getApprovedReward() {
        return approvedReward;
    }

    public void setApprovedReward(Double approvedReward) {
        this.approvedReward = approvedReward;
    }

    public K1 getK1() {
        return k1;
    }

    public void setK1(K1 k1) {
        this.k1 = k1;
    }

    public K2 getK2() {
        return k2;
    }

    public void setK2(K2 k2) {
        this.k2 = k2;
    }

    public K3 getK3() {
        return k3;
    }

    public void setK3(K3 k3) {
        this.k3 = k3;
    }

    public P getP() {
        return p;
    }

    public void setP(P p) {
        this.p = p;
    }

    public Set<PropUser> getPropUsers() {
        return propUsers;
    }

    public void setPropUsers(Set<PropUser> propUsers) {
        this.propUsers = propUsers;
    }
}
