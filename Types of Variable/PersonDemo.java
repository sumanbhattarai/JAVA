class PersonDemo
{
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.enterRoom();
        Person person2 = new Person();
        person2.enterRoom();
        System.out.println("Total entering is : " + Person.totalCount());
        
    }

}