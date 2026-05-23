 package AdvancedJava.BinarySearchTrees;

public class NonEmptyBST<D extends Comparable> implements Tree<D> {

    /* A non-empty Binary Search Tree's properties:
       1. A data element of type D (here)
       2. Left and Right Trees  */
    D data;
    Tree<D> left;
    Tree<D> right;

    // Adding a Constructor - that takes parameter to add an element
    public NonEmptyBST(D elem) {
        this.data = elem;
        this.left = new EmptyBST<D>();
        this.right = new EmptyBST<D>();
    }

    public NonEmptyBST(D elem , Tree<D> leftTree , Tree<D> rightTree){
        this.data = elem;
        this.left = leftTree;
        this.right = rightTree;
    }

    // Implementing the Tree's methods
    @Override
    public boolean isEmpty(){
        return false;
    }

    @Override
    public int cardinality(){
        // Total Cardinality = Root + Left Tree Cardinality + Right Tree Cardinality
        return 1 + left.cardinality() + right.cardinality();
    }

    @Override
    /* Concept used:
     * 1. Checking if the root is equal to the specified element, return true
     * 2. Else if :
          * element is smaller than root, just check the left tree where all the small element lie
          * else check the right tree for all the bigger elements. */
    public boolean member(D elem){
        if(data == elem){
            return true;
        }
        else {
            if (elem.compareTo(data) < 0){ // Means on comparison : the difference comes out less than 0 [smaller than root]
                return left.member(elem);
            }
            else {
                return right.member(elem);
            }
        }
    }

    @Override
    /* Concept:
       * For smaller elements than root: all the elements should be added to the left tree
       * For all the elements greater than the root, must be added to the right tree! */
    public NonEmptyBST<D> add(D elem){
        if(data == elem){
            return this;  // We will just return the method no need to add!
        }
        else {
            /* Concept:
               * First we will create a constructor taking data , left tree , right tree!
               * If, data is less than root, return all other as it is and " add on left tree "
               * else if, data is greater than the root, return all other and " add on right tree " */
            if(elem.compareTo(data) < 0){
                return new NonEmptyBST<>(data , left.add(elem) , right);
                // Adding to the left tree
            }
            else {
                return new NonEmptyBST<>(data , left , right.add(elem));
                // Adding to the right tree
            }
        }
    }
}


/* Theory:
   # Path Finding Algorithms:
     * Breadth First Search:
       - Discover each element at a level before moving on to the next level.
       - That is all the child of a root before moving on to child's on next level

     * Depth First Search:
       - Checks all the childs of a single root that is:
         - A -> B , C , D -> B' , C' , D'
         - But for Depth first it will check: A -> B -> B' leaving C , D and their child as it is.  */