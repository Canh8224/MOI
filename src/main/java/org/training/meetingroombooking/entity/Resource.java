package org.training.meetingroombooking.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "resources")
public class Resource {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int resourceId;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false, unique = true)
  private String email;

  @Column(nullable = false)
  private String phone;

  private String stepProcess;
  private String action;
  private String location;
  private String skill;
  private String attachFile;

  @ManyToOne
  @JoinColumn(name = "created_by")
  private User createdBy;

  @ManyToOne
  @JoinColumn(name = "assignee_id")
  private User assignee;

  public Resource() {}

  public Resource(int resourceId, String name, String email, String phone, String stepProcess, String action,
                  String location, String skill, String attachFile, User createdBy, User assignee) {
    this.resourceId = resourceId;
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

  public int getResourceId() {
    return resourceId;
  }

  public void setResourceId(int resourceId) {
    this.resourceId = resourceId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getStepProcess() {
    return stepProcess;
  }

  public void setStepProcess(String stepProcess) {
    this.stepProcess = stepProcess;
  }

  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getSkill() {
    return skill;
  }

  public void setSkill(String skill) {
    this.skill = skill;
  }

  public String getAttachFile() {
    return attachFile;
  }

  public void setAttachFile(String attachFile) {
    this.attachFile = attachFile;
  }

  public User getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(User createdBy) {
    this.createdBy = createdBy;
  }

  public User getAssignee() {
    return assignee;
  }

  public void setAssignee(User assignee) {
    this.assignee = assignee;
  }
}
