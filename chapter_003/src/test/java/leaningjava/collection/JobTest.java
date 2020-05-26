package leaningjava.collection;

import leaningjava.tracker.Item;
import leaningjava.tracker.SortedByName;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorIncreaseByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobIncrByName().thenComparing(new JobIncrByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenSortNameIncrease() {
        List<Job> jobs = Arrays.asList(
                new Job("Impl task", 5),
                new Job("Fix bugs", 2),
                new Job("Reboot server", 0)
        );
        Collections.sort(jobs, new JobIncrByName());

        assertThat(jobs.toString(), is("[Job{Fix bugs, 2}, Job{Impl task, 5}, Job{Reboot server, 0}]"));
    }

    @Test
    public void whenSortPriorityIncrease() {
        List<Job> jobs = Arrays.asList(
                new Job("Impl task", 5),
                new Job("Fix bugs", 2),
                new Job("Reboot server", 0)
        );
        Collections.sort(jobs, new JobIncrByPriority());
        assertThat(jobs.toString(), is("[Job{Reboot server, 0}, Job{Fix bugs, 2}, Job{Impl task, 5}]"));
    }
}
//    List<Job> jobs = Arrays.asList(
//            new Job("Fix bug", 1),
//            new Job("Fix bug", 4),
//            new Job("Fix bug", 2),
//            new Job("X task", 0)
//    );
//        Collections.sort(jobs, new JobDescByName().thenComparing(new JobDescByPriority()));
//                System.out.println(jobs);
