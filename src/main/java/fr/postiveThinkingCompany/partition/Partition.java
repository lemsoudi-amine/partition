package fr.postiveThinkingCompany.partition;

import java.util.List;
import com.google.common.collect.Lists;

public class Partition {
        public List<List<Integer>> partition(List<Integer> toBePartitioned, int maximum) {
            return Lists.partition(toBePartitioned, maximum);
        }
    }
