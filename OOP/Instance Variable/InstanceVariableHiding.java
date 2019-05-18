
class InstanceVariable
{
    private int x = 100 ; // Instance Variable

    void hiding()
    {
        int x = 39 ;  // Local Variable
        System.out.println("Local varibale x is :" + x);
        System.out.println("Instance variable x is :" + this.x);
    }
}

class InstanceVariableHiding
{
    public static void main(String[] args) {
        InstanceVariable obj = new InstanceVariable();
        obj.hiding();
    }
}