package Week2.day7;

public class BST {

    BSTNode rootNode;

    class BSTNode {
        int value;
        BSTNode leftNode;
        BSTNode rightNode;
        BSTNode(int v){
            this.value = v;
        }
    }

    public void add(int value){
        if( this.rootNode == null ){
            this.rootNode = new BSTNode( value );
        } else {

            BSTNode startNode = this.rootNode;
            int startValue= startNode.value;

            while(true){
                if(  startValue < value) {
                    if( startNode.rightNode == null ){
                        startNode.rightNode = new BSTNode( value );
                        break;
                    } else {
                        startNode = startNode.rightNode;
                        startValue = startNode.value;
                    }

                } else if(  this.rootNode.value > value ){
                    if( startNode.leftNode == null ){
                        startNode.leftNode = new BSTNode( value );
                        break;
                    } else {
                        startNode = startNode.leftNode;
                        startValue = startNode.value;
                    }
                }
            }

        }

    }

    //search
    //delete
    //update

}
