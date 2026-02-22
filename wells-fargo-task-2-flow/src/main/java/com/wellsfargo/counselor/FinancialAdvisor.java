package com.wellsfargo.counselor;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String phone;

    @OneToMany(mappedBy = "financialAdvisor", cascade = CascadeType.ALL)
    private List<Client> clients;

    public FinancialAdvisor() {
    }

    public FinancialAdvisor(Long advisorId, String name, String email, String phone, List<Client> clients) {
        this.advisorId = advisorId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.clients = clients;
    }

    public Long getAdvisorId() { return advisorId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public List<Client> getClients() { return clients; }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setClients(List<Client> clients) { this.clients = clients; }
}