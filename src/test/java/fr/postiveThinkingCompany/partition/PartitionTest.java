package fr.postiveThinkingCompany.partition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PartitionTest {

    @Test
    void should_partition_list_case_2() {
        //GIVEN
        Partition partition = new Partition();
        List<Integer> toBePartitoined = Arrays.asList(1,2, 3, 4, 5);
        List<List<Integer>> expectedList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5));
        //WHEN
        List<List<Integer>> partitionedList = partition.partition(toBePartitoined, 2);
        //THEN
        Assertions.assertEquals(expectedList, partitionedList);
    }

    @Test
    void should_partition_list_case_3() {
        //GIVEN
        Partition partition = new Partition();
        List<Integer> toBePartitoined = Arrays.asList(1,2, 3, 4, 5);
        List<List<Integer>> expectedList = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5));
        //WHEN
        List<List<Integer>> partitionedList = partition.partition(toBePartitoined, 3);
        //THEN
        Assertions.assertEquals(expectedList, partitionedList);
    }

    @Test
    void should_partition_list_case_1() {
        //GIVEN
        Partition partition = new Partition();
        List<Integer> toBePartitoined = Arrays.asList(1,2, 3, 4, 5);
        List<List<Integer>> expectedList = Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3), Arrays.asList(4), Arrays.asList(5));
        //WHEN
        List<List<Integer>> partitionedList = partition.partition(toBePartitoined, 3);
        //THEN
        Assertions.assertEquals(expectedList, partitionedList);
    }
}