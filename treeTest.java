public class treeTest
{
    public static void main(String[] args)
    {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(44, "B Buick", 33);
		bst.insert(41, "Bb Buick", 33);
		bst.insert(43, "Bbb Buick", 33);
		bst.insert(42, "Abt Buick", 33);
		bst.insert(24, "Bat Buick", 33);
		bst.insert(14, "Wat Buick", 33.65);
		bst.insert(1, "Henry Smith", 99.99);
		bst.remove(44);
		bst.insert(22, "Mudge Doug", 57.05);
		bst.insert(3, "Biscuit Nancy", 140);
		bst.insert(33, "Pat Buick", 33);
		bst.insert(11, "Louise Buick", 33);
		bst.insert(32, "Merlinda Shuez", 11399);
		bst.insert(11, "Unknown Unknown", 4000);
		bst.remove(1);
		bst.insert(2, "Joe Mess", 20);
		bst.insert(4, "Bob Smith", 99.99);
		bst.insert(31, "Lots Smith", 99.99);
		bst.remove(11);
		bst.insert(1, "Tots Smith", 99.99);
		bst.insert(12, "Pat Buick", 33);
		bst.remove(33);
		bst.insert(34, "Pat Buick", 33);
		bst.insert(13, "Tat Buick", 33);
		bst.insert(23, "Cat Buick", 33);
		bst.insert(11, "Pat Duick", 33);
		bst.insert(33, "Pat Buick", 33);
		bst.insert(24, "Pat Buick", 33);
		bst.insert(21, "Vat Buick", 33);
		bst.insert(12, "Pat Buit", 33);
		bst.insert(44, "Bob Buick", 33);
       
        System.out.println("display all nodes in in-order:");
		bst.list_all_nodes();
        System.out.println("\ntotal balances: " + bst.sum_of_balances());
        System.out.println("height of the tree: " + bst.height());

    }
}

/* if your program is implemented correctly, it will display:

display all nodes in in-order:
1 Tots Smith 99.99
2 Joe Mess 20.0
3 Biscuit Nancy 140.0
4 Bob Smith 99.99
11 Pat Duick 33.0
12 Pat Buick 33.0
13 Tat Buick 33.0
14 Wat Buick 33.65
21 Vat Buick 33.0
22 Mudge Doug 57.05
23 Cat Buick 33.0
24 Bat Buick 33.0
31 Lots Smith 99.99
32 Merlinda Shuez 11399.0
33 Pat Buick 33.0
34 Pat Buick 33.0
41 Bb Buick 33.0
42 Abt Buick 33.0
43 Bbb Buick 33.0
44 Bob Buick 33.0

total balances: 12345.67
height of the tree: 6

*/
