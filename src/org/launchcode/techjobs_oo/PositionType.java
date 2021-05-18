package org.launchcode.techjobs_oo;

import java.util.Objects;

public class PositionType extends JobField {
    public PositionType(String value) {
        super(value);
    }

    public PositionType() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType that = (PositionType) o;
        return this.getId() == that.getId();
    }
}
