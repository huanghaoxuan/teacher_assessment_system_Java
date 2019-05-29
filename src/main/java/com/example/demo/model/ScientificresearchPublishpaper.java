package com.example.demo.model;

import java.io.Serializable;

public class ScientificresearchPublishpaper implements Serializable {
    private Integer id;

    private String classTeacher;

    private String status;

    private String name;

    private String journals;

    private String publicationDate;

    private String level;

    public ScientificresearchPublishpaper() {
    }

    public ScientificresearchPublishpaper(String classTeacher, String status, String name, String journals, String publicationDate, String level, String collectionInformation, String character, String type, String note, Integer year) {
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.journals = journals;
        this.publicationDate = publicationDate;
        this.level = level;
        this.collectionInformation = collectionInformation;
        this.character = character;
        this.type = type;
        this.note = note;
        this.year = year;
    }

    public ScientificresearchPublishpaper(Integer id, String classTeacher, String status, String name, String journals, String publicationDate, String level, String collectionInformation, String character, String type, String note, Integer year) {
        this.id = id;
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.journals = journals;
        this.publicationDate = publicationDate;
        this.level = level;
        this.collectionInformation = collectionInformation;
        this.character = character;
        this.type = type;
        this.note = note;
        this.year = year;
    }

    private String collectionInformation;

    private String character;

    private String type;

    private String note;

    private Integer year;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher == null ? null : classTeacher.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getJournals() {
        return journals;
    }

    public void setJournals(String journals) {
        this.journals = journals == null ? null : journals.trim();
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate == null ? null : publicationDate.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getCollectionInformation() {
        return collectionInformation;
    }

    public void setCollectionInformation(String collectionInformation) {
        this.collectionInformation = collectionInformation == null ? null : collectionInformation.trim();
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character == null ? null : character.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", classTeacher=").append(classTeacher);
        sb.append(", status=").append(status);
        sb.append(", name=").append(name);
        sb.append(", journals=").append(journals);
        sb.append(", publicationDate=").append(publicationDate);
        sb.append(", level=").append(level);
        sb.append(", collectionInformation=").append(collectionInformation);
        sb.append(", character=").append(character);
        sb.append(", type=").append(type);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}