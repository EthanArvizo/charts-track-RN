package com.nurseproject.RNchart.model;

import java.sql.Timestamp;

public class Chart {
    private int entryId;
    private int patientId;
    private int nurseId;
    private Timestamp entryTime;
    private String vitalSigns;
    private String diagnosis;
    private String treatmentPlan;

    public Chart(int entryId, int patientId, int nurseId, Timestamp entryTime, String vitalSigns, String diagnosis, String treatmentPlan) {
        this.entryId = entryId;
        this.patientId = patientId;
        this.nurseId = nurseId;
        this.entryTime = entryTime;
        this.vitalSigns = vitalSigns;
        this.diagnosis = diagnosis;
        this.treatmentPlan = treatmentPlan;
    }

    public int getEntryId() {
        return entryId;
    }

    public void setEntryId(int entryId) {
        this.entryId = entryId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getNurseId() {
        return nurseId;
    }

    public void setNurseId(int nurseId) {
        this.nurseId = nurseId;
    }

    public Timestamp getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Timestamp entryTime) {
        this.entryTime = entryTime;
    }

    public String getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(String vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(String treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }
}
