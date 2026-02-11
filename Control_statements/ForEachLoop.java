/*
* Syntax:
* for (datatype variable : arrayName) {
*    // code
*}
*
* --Used for arrays and collections --No index needed --Read-only traversal (cannot modify elements directly)
*/
public class ForEachLoop {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
