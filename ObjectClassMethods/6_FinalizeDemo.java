//Deprecated in Java 9+
class TestFinalize {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize called");
    }

    public static void main(String[] args) {
        TestFinalize obj = new TestFinalize();
        obj = null;
        System.gc(); // Suggest GC
    }
}
