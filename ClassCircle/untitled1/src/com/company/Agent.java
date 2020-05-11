package com.company;

import java.util.Objects;

public class Agent extends Person{
    public String phone;
    public String email;
    public int herPercent;
    public String summary;

    public Agent() {
    }

    public Agent(String phone, String email, int herPercent, String summary) {
        this.phone = phone;
        this.email = email;
        this.herPercent = herPercent;
        this.summary = summary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getHerPercent() {
        return herPercent;
    }

    public void setHerPercent(int herPercent) {
        this.herPercent = herPercent;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", herPercent=" + herPercent +
                ", summary='" + summary + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Agent)) return false;
        Agent agent = (Agent) o;
        return getHerPercent() == agent.getHerPercent() &&
                getPhone().equals(agent.getPhone()) &&
                getEmail().equals(agent.getEmail()) &&
                getSummary().equals(agent.getSummary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPhone(), getEmail(), getHerPercent(), getSummary());
    }
}
