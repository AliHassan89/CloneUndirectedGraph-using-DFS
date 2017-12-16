/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clonegraph;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ali_hassan_syed
 */
public class UndirectedGraphNode 
{
    int label;
    List<UndirectedGraphNode> neighbors;
    UndirectedGraphNode(int x) 
    { 
        label = x; neighbors = new ArrayList<>(); 
    }
}
