package ru.bulatmukhutdinov.persistance.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private Set<CategoryText> categoryTexts;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private Set<Service> services;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Set<CategoryText> getCategoryTexts() {
        return categoryTexts;
    }

    public void setCategoryTexts(Set<CategoryText> categoryTexts) {
        this.categoryTexts = categoryTexts;
    }

    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }
}
