package com.example.group;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class GroupTest {

  private final static String CREATED = " - Created";
  private final static String UPDATED = " - Updated";

  public static void main(String[] args) {
    List<Group> groups = new ArrayList<>();
    List<Group> savedGroups = new ArrayList<>();
    List<String> createdLst = new ArrayList<>();
    List<String> updatedLst = new ArrayList<>();

    Group group1 = new Group("", "Group 1");
    Group group2 = new Group("2", "Group 2");
    Group group3 = new Group("", "Group 3");
    Group group4 = new Group("4", "Group 4");

    groups.add(group1);
    groups.add(group2);
    groups.add(group3);
    groups.add(group4);
    
    Group savedGroup1 = new Group("1", "Group 1");
    Group savedGroup2 = new Group("2", "Group 2");
    Group savedGroup3 = new Group("3", "Group 3");
    Group savedGroup4 = new Group("4", "Group 4");
    
    savedGroups.add(savedGroup1);
    savedGroups.add(savedGroup2);
    savedGroups.add(savedGroup3);
    savedGroups.add(savedGroup4);

    groups.stream().forEach(gr -> {
      if (StringUtils.isBlank(gr.getId())) {
        createdLst.add(gr.getName());
      } else {
        updatedLst.add(gr.getName());
      }
    });

    if (!createdLst.isEmpty()) {
      System.out.println(String.join(",", createdLst)+CREATED);
    }
    
    if (!updatedLst.isEmpty()) {
      System.out.println(String.join(",", updatedLst)+UPDATED);
    }
  }

}
