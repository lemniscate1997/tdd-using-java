/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testingutest.dfs;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Rahul
 */
public class DepthFirstSearch {

    public String getDFSString(int array[][], int size) {
        List<Integer> dfs = new ArrayList<>();
        DFSAlgo(array, size, 0, dfs);
        return dfs.toString();
    }

    private void DFSAlgo(int array[][], int size, int pointer, List<Integer> dfs) {
        dfs.add(pointer);

        if (dfs.size() == size) {
            return;
        }

        for (int i = 0; i < size; i++) {
            if (i == pointer) {
                continue;
            }

            if (array[pointer][i] != 0 && !dfs.contains(i)) {
                DFSAlgo(array, size, i, dfs);
            }
        }
    }
}
