package model;

public class Rhum {
    public int mId;
    private String mNom;
    private String mDescription;
    private String mType;
    private String mLieuProduction;
    private double mNote;
    private double mDegresAlcool;

    public Rhum(int id, String nom, String description) {
        mId = id;
        mNom = nom;
        mDescription = description;
    }

    public Rhum(String nom, String description, String type, String lieuProduction, double note, double degresAlcool) {
        mNom = nom;
        mDescription = description;
        mType = type;
        mLieuProduction = lieuProduction;
        mNote = note;
        mDegresAlcool = degresAlcool;
    }

    public String getNom() {
        return mNom;
    }

    public void setNom(String nom) {
        mNom = nom;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public String getLieuProduction() {
        return mLieuProduction;
    }

    public void setLieuProduction(String lieuProduction) {
        mLieuProduction = lieuProduction;
    }

    public double getNote() {
        return mNote;
    }

    public void setNote(double note) {
        mNote = note;
    }

    public double getDegresAlcool() {
        return mDegresAlcool;
    }

    public void setDegresAlcool(double degresAlcool) {
        mDegresAlcool = degresAlcool;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
