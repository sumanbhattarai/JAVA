class PersonDemo
{
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.enterRoom();
        Person person2 = new Person();
        person2.enterRoom();
        System.out.println("Total entering is : " + Person.totalCount());
        // We can also write this in another way .

        System.out.println("Total entering is : " + Person.count);
        System.out.println("Total entering is : " + person1.totalCount());
        System.out.println("Total entering is : " + person2.totalCount());
        System.out.println("Total entering is : " + person2.count);
        System.out.println("Total entering is : " + person2.count);



        
        
    }

}