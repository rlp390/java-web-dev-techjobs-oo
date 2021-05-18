package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Employer extends JobField{
    public Employer(String value) {
        super(value);
    }

    public Employer() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer that = (Employer) o;
        return this.getId() == that.getId();
    }
}
