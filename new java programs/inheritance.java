class inheritance{
    public void myfunc() {
        System.out.println("this is the parent class");
    }
}
class child extends inheritance{
    public void myfunc2(){
        System.out.println("This is the child class");
    }

    public static void main(String[] args) {
        child myobject = new child();
        myobject.myfunc();
        myobject.myfunc2();
    }
}