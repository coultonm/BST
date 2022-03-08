package com.company;

public class BST {
    /**
     * head for the BST
     */
    private Node head;

    /**
     * Default constructor
     */
    public BST(){
        head = null;
    }

    /**
     * Constructor that takes in a node to start
     * @param n the node to set for BST
     */
    public BST(Node n){
        head = n;
    }

    /**
     * TO DO: Checks to see that the integer value can be found in the BST, returns true if found, false if not
     * @param: the number to search for in BST
     */

    public boolean contains(int num){
        return true;// modify code to behave properly
    }

    /**
     * TO DO: returns a String the pre-order version of the BST
     */

    public void displayPreOrder(){

    }

    /**
     * TO DO: helper recursive method to display preorder
     * @param curr the current node to print
     */

    private void displayPreOrder(Node curr){

    }

    /**
     * TO DO : prints the in-order version of the BST
     */

    public void displayInOrder(){

    }

    /**
     *  TO DO : helper recursive method to display in-order
     * @param curr the current node to print
     */
    private void displayInOrder(Node curr){

    }

    /**
     * TO DO: prints the post order version of the BST
     */
    public void displayPostOrder(){

    }
    /**
     *  TO DO : helper recursive method to display post order
     * @param curr the current node to print
     */

    private void displayPostOrder(Node curr){

    }

    /**
     * TO DO: Adds the node to the BST at the proper location. Returns true if element is not initially
     * contained, and therefore can be added to the BST. Returns false if number is already contained in BST.
     * @param n the number to add to the BST
     * @return true when Node is added, false if the integer is already in the BST and can't be added
     */

    public boolean add(int n){
        return true;// modify code to behave properly
    }

    /**
     * TO DO : helper recursive method to add the Node to the BST
     * @param curr the current node to check
     * @param n the node to add
     */

    private void add(Node curr, Node n){

    }

    /**
     * TO DO : Removes the node, if contained, from the BST, returns true if removed, false if not contained and not removed
     * @param n the number to remove from the BST
     * @return true if a Node with the number is removed, false if the number is not in the BST
     */

    public boolean remove(int n){
        return true;// modify code to behave properly
    }

    /**
     * TO DO: helper recursive method to remove the Node to the BST
     * @param curr the current node
     * @param n the number to remove from the BST
     */

    private void remove(Node curr, int n){

    }

    /**
     * private helper method to delete  the node
     * @param n the Node to remove
     * @param item
     */

    private void makeDeletion(Node n, int item){
       Node curr = null;
        if (n != null) {
            if (n.getLeft() == null) {
                curr = n;
                n = n.getRight();
            } else if (n.getRight() == null) {
                curr = n;
                n = n.getLeft();
            } else {
                curr = n.getRight();
                while (curr.getLeft() != null)
                    curr = curr.getLeft();
                n.setNumber(curr.getNumber());
                remove(n.getRight(), curr.getNumber());
            }
        }
    }
}
