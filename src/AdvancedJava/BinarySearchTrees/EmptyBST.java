package AdvancedJava.BinarySearchTrees;

public class EmptyBST<D extends Comparable> implements Tree<D>{

    // Creating a constructor
    public EmptyBST() {
    }

    // Implementing all methods of the Interface
    @Override
    public boolean isEmpty(){
        return true;
    }

    @Override
    public int cardinality(){
        return 0;
    }

    @Override
    public boolean member(D elem) {
        return false;
    }

    // Since the EmptyBST doesn't have any element this method will create and return a new NonEmptyBST with the given Element
    @Override
    public NonEmptyBST<D> add(D elem){
        return new NonEmptyBST<D>(elem);
    }
}
