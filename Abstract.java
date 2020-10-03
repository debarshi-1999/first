abstract class x
{
    abstract void show();
}
class y extends x
{
    void show()
    {
        System.out.println("This is inside abstract class");
    }
}
class Abstract 
{
    public static void main(String[]args)
    {
        x obj = new y();
        obj.show();
    }
}