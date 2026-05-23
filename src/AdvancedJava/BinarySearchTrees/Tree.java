package AdvancedJava.BinarySearchTrees;

public interface Tree<D extends Comparable> {
    // This Interface contains some methods for the BST

    // 1. Checking if the tree is empty
    public boolean isEmpty();

    // 2. The Size or cardinality of a tree
    public int cardinality();

    // 3. Checking for a member if exist
    public boolean member(D elem);
        /* Note: D here extends Comparable class because in BST elements are placed in a function format,
                 i.e. smaller to root on left and larger on right! hence the 'D' needs to be compared! */

    // 4. Creating a Non-empty BST when adding something
    public NonEmptyBST<D> add(D elem);
}
