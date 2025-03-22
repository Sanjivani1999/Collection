public class HouseTest
{

        public static void main(String[] args){
            House house = new House("medium", "medium");
            house.display();
            House vtHouse = new House("big", "small", "small");
            vtHouse.display();
            House pcsHouse = new House("big", "big", "big", "medium");
            pcsHouse.display();
        }


}
