package com.nerdery.jvm.resistance.models;

import java.util.Objects;

/**
 * A simple description of the prescription for a patient in the previous round.
 *
 * @author Josh Klun (jklun@nerdery.com)
 */
public class Prescription {

    private String userId;
    private boolean prescribedAntibiotics;
    private float temperature;

    public Prescription(String theUserId, boolean thePrescribedAntibiotics, float theTemperature) {
        userId = theUserId;
        prescribedAntibiotics = thePrescribedAntibiotics;
        temperature = theTemperature;
    }

    public String getUserId() {
        return userId;
    }

    public boolean isPrescribedAntibiotics() {
        return prescribedAntibiotics;
    }

    public float getTemperature() {
        return temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prescription that = (Prescription) o;
        return prescribedAntibiotics == that.prescribedAntibiotics &&
                Float.compare(that.temperature, temperature) == 0 &&
                Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, prescribedAntibiotics, temperature);
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "userId='" + userId + '\'' +
                ", prescribedAntibiotics=" + prescribedAntibiotics +
                ", temperature=" + temperature +
                '}';
    }
}
