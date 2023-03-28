package com.urartusoftware.urartusoftwarecontactservice.models;

public class ContactRequestDTO {

    private String id;
    private String name;
    private String email;
    private String phone;
    private String websiteUrl;
    private String budget;
    private String projectDescription;
    private String businessSource;

    public ContactRequestDTO() {
    }

    public ContactRequestDTO(String id, String name, String email, String phone, String websiteUrl, String projectDescription, String budget, String businessSource) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.websiteUrl = websiteUrl;
        this.projectDescription = projectDescription;
        this.budget = budget;
        this.businessSource = businessSource;
    }

    public ContactRequestDTO(String name, String email, String phone, String websiteUrl, String projectDescription, String budget, String businessSource) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.websiteUrl = websiteUrl;
        this.projectDescription = projectDescription;
        this.budget = budget;
        this.businessSource = businessSource;
    }

    @Override
    public String toString() {
        return "ContactRequest{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", websiteUrl='" + websiteUrl + '\'' +
                ", budget='" + budget + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                ", businessSource='" + businessSource + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactRequest that = (ContactRequest) o;

        return id.equals(that.getId());
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public String getBudget() {
        return budget;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public String getBusinessSource() {
        return businessSource;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public void setBusinessSource(String businessSource) {
        this.businessSource = businessSource;
    }
}