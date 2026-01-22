package com.HeightOfOrganization;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class OrganizationHeightCalculator {
//    /**
//     * Calculates the height (number of levels) of the organization hierarchy.
//     * * @param managerIds An array where managerIds[i] is the manager of employee i.
//     * The CEO's manager ID is -1.
//     * @return The maximum height (longest path from CEO to a leaf employee).
//     */
//    public static int calculateHeight(int[] managerIds) {
//        int N = managerIds.length;
//        if (N == 0) {
//            return 0; // Empty organization has a height of 0
//        }
//
//        // 1. Build the Adjacency List (Manager ID -> List of Subordinate IDs)
//        // We use an ArrayList of ArrayLists to represent the tree structure.
//        List<List<Integer>> adjList = new ArrayList<>(N);
//        for (int i = 0; i < N; i++) {
//            adjList.add(new ArrayList<>());
//        }
//        
//        int ceoId = -1;
//
//        for (int employeeId = 0; employeeId < N; employeeId++) {
//            int managerId = managerIds[employeeId];
//            
//            if (managerId == -1) {
//                ceoId = employeeId;
//            } else {
//                // Since employeeId reports to managerId, employeeId is a subordinate of managerId
//                adjList.get(managerId).add(employeeId);
//            }
//        }
//        
//        // This should not happen based on problem constraints, but a safeguard is wise
//        if (ceoId == -1) {
//            // No CEO found (e.g., if N > 0 and no -1 manager ID exists, or the structure is cyclic)
//            return 0; 
//        }
//
//        // 2. Start the DFS from the CEO (Root)
//        return getHeightDFS(ceoId, adjList);
//    }
//
//    /**
//     * Recursive helper function to find the height of the subtree rooted at employeeId.
//     * * @param employeeId The current node/employee.
//     * @param adjList The adjacency list representing the hierarchy.
//     * @return The height of the subtree starting at employeeId.
//     */
//    private static int getHeightDFS(int employeeId, List<List<Integer>> adjList) {
//        // Base Case: If the employee is a leaf node (has no subordinates)
//        List<Integer> subordinates = adjList.get(employeeId);
//        if (subordinates.isEmpty()) {
//            return 1; // A leaf is Level 1 of its own subtree (or 1 level from itself)
//        }
//
//        // Recursive Step: Find the maximum height among all subordinate subtrees
//        int maxSubordinateHeight = 0;
//        for (int subordinateId : subordinates) {
//            int currentSubHeight = getHeightDFS(subordinateId, adjList);
//            maxSubordinateHeight = Math.max(maxSubordinateHeight, currentSubHeight);
//        }
//
//        // Current node's height is 1 (for itself) + the longest path from its children
//        return 1 + maxSubordinateHeight;
//    }
//
//    // --- Main method for testing ---
//    public static void main(String[] args) {
//        // Example from the problem: N=8, Manager IDs: [-1, 0, 0, 1, 1, 2, 2, 3]
//        int[] managerIds = {-1, 0, 0, 1, 1, 2, 2, 3}; 
//
//        int height = calculateHeight(managerIds);
//
//        System.out.println("Input Manager IDs: " + Arrays.toString(managerIds));
//        System.out.println("The maximum organization height (number of levels) is: " + height); // Expected output: 4
//        
//        // Test Case 2: A simple linear chain (0 -> 1 -> 2)
//        int[] linearChain = {-1, 0, 1};
//        System.out.println("\nInput Manager IDs: " + Arrays.toString(linearChain));
//        System.out.println("The maximum organization height (number of levels) is: " + calculateHeight(linearChain)); // Expected output: 3
//    }
//}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Global list to store the adjacency list (Manager -> Subordinates)
    // We make it static to be accessible from the main and recursive methods
    static List<List<Integer>> subordinates; 

    /**
     * Recursive function to find the height of the subtree starting at 'empId'.
     * The height is defined as 1 (for the current node) + the maximum height 
     * of all its children's subtrees.
     * @param empId The employee ID (node) to calculate the height from.
     * @return The height (number of levels) of the subtree rooted at empId.
     */
    static int findHeight(int empId) {
        // Base Case: If the employee has no subordinates (a leaf node)
        List<Integer> children = subordinates.get(empId);
        if (children.isEmpty()) {
            return 1; // The height of a single node is 1 (Level 1)
        }

        // Recursive Step: Find the max height among all children
        int maxSubordinateHeight = 0;
        
        for (int childId : children) {
            // Recursively find the height of the child's subtree
            int currentSubHeight = findHeight(childId);
            // Track the longest path found so far
            maxSubordinateHeight = Math.max(maxSubordinateHeight, currentSubHeight);
        }

        // The height of the current employee is 1 (for themself) 
        // plus the max height found among their subordinates.
        return 1 + maxSubordinateHeight;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read N: total number of employees
        int N = sc.nextInt();
        
        if (N == 0) {
            System.out.println(0);
            return;
        }

        int[] manager = new int[N];
        int ceoId = -1;

        // Initialize the global adjacency list
        subordinates = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            subordinates.add(new ArrayList<>());
        }

        // Read the manager IDs and build the adjacency list
        for (int i = 0; i < N; i++) {
            manager[i] = sc.nextInt();
            
            int managerId = manager[i];
            int employeeId = i; // The index is the employee ID
            
            if (managerId == -1) {
                ceoId = employeeId; // Identify the CEO
            } else {
                // Build the Adjacency List: Manager -> Subordinate
                subordinates.get(managerId).add(employeeId);
            }
        }
        
        sc.close(); // Close the scanner

        // If a valid CEO was found, calculate and print the height
        if (ceoId != -1) {
            int height = findHeight(ceoId);
            System.out.println(height);
        } else {
            // This case handles errors where N>0 but no CEO (-1 manager) is found
            System.out.println(0); 
        }
    }
}