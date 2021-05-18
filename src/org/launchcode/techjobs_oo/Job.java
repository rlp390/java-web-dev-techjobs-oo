package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {
    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String nam, Employer emp, Location loc, PositionType pos, CoreCompetency cor) {
        this();
        name = nam;
        employer = emp;
        location = loc;
        positionType = pos;
        coreCompetency = cor;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public String toString() {
        String name1 = name;

        if(name == null) return "Oops.  This job doesn't seem to exist!";

        if(name == "") name1 = "Data not available";

        String response = "\n" +
                "ID:  " + id +"\n" +
                "Name:  " + name1 + "\n" +
                "Employer:  " + employer.toString() + "\n" +
                "Location:  " + location.toString() + "\n" +
                "Position Type:  " + positionType.toString() + "\n" +
                "Core Competency:  " + coreCompetency.toString() + "\n" +
                "";
        return response;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

}
