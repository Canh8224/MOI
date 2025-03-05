package org.training.meetingroombooking.dto;

public class ResourceDTO {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String stepProcess;
    private String action;
    private String location;
    private String skill;
    private String attachFile;
    private String createdBy;
    private String assignee;

    public ResourceDTO() {}

    public ResourceDTO(int id, String name, String email, String phone, String stepProcess, String action,
                       String location, String skill, String attachFile, String createdBy, String assignee) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.stepProcess = stepProcess;
        this.action = action;
        this.location = location;
        this.skill = skill;
        this.attachFile = attachFile;
        this.createdBy = createdBy;
        this.assignee = assignee;
    }

    // GETTER
    public int getId() {
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

    public String getStepProcess() {
        return stepProcess;
    }

    public String getAction() {
        return action;
    }

    public String getLocation() {
        return location;
    }

    public String getSkill() {
        return skill;
    }

    public String getAttachFile() {
        return attachFile;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getAssignee() {
        return assignee;
    }

    // SETTER
    public void setId(int id) {
        this.id = id;
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

    public void setStepProcess(String stepProcess) {
        this.stepProcess = stepProcess;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setAttachFile(String attachFile) {
        this.attachFile = attachFile;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }
}
