package org.launchcode.techjobs_oo.Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

public class JobTest {

    private static Job job1;
    private static Job job2;
    private static Job job3;
    private static Job job4;
    private static Job job5;

    @BeforeClass
    public static void setUp() {
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        job3 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        job4 = new Job("", new Employer(), new Location(), new PositionType(), new CoreCompetency());
        job5 = new Job();
    }

    @Test
    public void emptyTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void testSettingJobId() {
        Assert.assertEquals(job1.getId(), job2.getId() - 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Assert.assertEquals(job1.getName(), "Product tester");
        Assert.assertEquals(job1.getEmployer().getValue(), "ACME");
        Assert.assertEquals(job1.getLocation().getValue(), "Desert");
        Assert.assertEquals(job1.getPositionType().getValue(), "Quality control");
        Assert.assertEquals(job1.getCoreCompetency().getValue(), "Persistence");
        Assert.assertTrue(job1.getId() == 1);
        Assert.assertTrue(job1.getEmployer() instanceof Employer);
        Assert.assertTrue(job1.getLocation() instanceof Location);
        Assert.assertTrue(job1.getPositionType() instanceof PositionType);
        Assert.assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Assert.assertFalse(job2.equals(job3));
    }

    @Test
    public void testJobToStringAddsBlankLines() {
        String lines[] = job1.toString().split("\\R",-1);
        Assert.assertEquals(lines[0], "");
        Assert.assertEquals(lines[lines.length-1],"");
    }

    @Test
    public void testJobToStringAddsEachLine() {
        Assert.assertEquals(job1.toString(),"\n" +
                "ID:  1\n" +
                "Name:  Product tester\n" +
                "Employer:  ACME\n" +
                "Location:  Desert\n" +
                "Position Type:  Quality control\n" +
                "Core Competency:  Persistence\n" +
                "");
    }

    @Test
    public void testJobToStringEmptyFieldPrintsDataNotAvailable() {
        Assert.assertEquals(job4.toString(),"\n" +
                "ID:  4\n" +
                "Name:  Data not available\n" +
                "Employer:  Data not available\n" +
                "Location:  Data not available\n" +
                "Position Type:  Data not available\n" +
                "Core Competency:  Data not available\n" +
                "");
    }

    @Test
    public void testJobToStringAllEmptyFieldsPrintsOops() {
        Assert.assertEquals(job5.toString(),"Oops.  This job doesn't seem to exist!");
    }
}