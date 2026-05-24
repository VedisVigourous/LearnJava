package AdvancedJava.BinarySearchTrees.LevelOrderTraversal;

public class BreadthFirstSearch {
    // Find the Reference Image in the repo:
    // Link: https://github.com/VedisVigourous/LearnJava/blob/main/src/AdvancedJava/BinarySearchTrees/LevelOrderTraversal/Breadth_First_Search.png

    /* The Problem with Breadth First Search is:
       - Once you print the root node and move to the left, and it's child nodes
       - We are unable to go back and print the right node of the previous root and its child nodes

       Ex:                   1
                            /\
                           2  3
                          /\  /\
                         4 5 6 7

        - Once we reach 2 and print 4 & 5, we are unable to reach to 3rd and print 6 & 7.

        - Solution
          - Reach the root node and store childs to a Collection
          - Then move to the left node: Store child to the collection and remove the left node now
          - Then move to the right node: Store child to the Collection and remove the right node now from collection and so on...


          - For the above tree:
            # Print 1 and store: [ 2 3 ]
            # move to left node : i.e. 2 : [ 3 4 5 ]
            # move to right node : i.e. 3 : [ 4 5 6 7 ] and so on...

            Overall we get: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7  */

           /* Note: Since we store the child nodes and then remove it after obtaining the further nodes the phenomenon happening is:
                                                      " First In , First Out "
                                                      ==       QUEUE        ==

                   - Hence, the collection used in BFS is 'Queue' */


    /* We Overall get a list of list which here is:
       [ [1] , [2,3] , [4,5,6,7] ] - with each nested list representing a level of the Tree */
}
