import hw.*;
import org.junit.jupiter.api.Test;

public class HomeWorkPractice {
    @Test
    public void workingOnHomeWork() {
        AmericanPie firstAmericanPie = new AmericanPie();

        firstAmericanPie.setApples(6);
        firstAmericanPie.setCinnamon(5);
        firstAmericanPie.setEgg(1);
        firstAmericanPie.setFlour(500);
        firstAmericanPie.setBrownSugar(100);
        firstAmericanPie.setWhiteSugar(50);

        Art firstArt = new Art();

        firstArt.setArchitecture("Renaissance");
        firstArt.setLiterature("Fairy Tale");
        firstArt.setMusic("Classical Music");
        firstArt.setPainting("Expressionism");

        DeviceStatistics firstDeviceStatistics = new DeviceStatistics();

        firstDeviceStatistics.setDesktopDevice("MacBook Air");
        firstDeviceStatistics.setMobileDevice("Iphone 5");
        firstDeviceStatistics.setResolutions(8.85);
        firstDeviceStatistics.setTabletDevice("ipad Air");

        FitnessStudio firstFitnessStudio = new FitnessStudio();

        firstFitnessStudio.setAttendance(true);
        firstFitnessStudio.setGym("Riga Center Gym");
        firstFitnessStudio.setPrice(10);
        firstFitnessStudio.setGroupTraining("Aerobics");

        /*House firstHouse = new House();

         */

        House firstHouse = new House();

        firstHouse.setBathroom(1);
        firstHouse.setBedroom(2);
        firstHouse.setKaraoke(true);
        firstHouse.setDoor(6);

        ItemsForKindergarten firstItemsForKindergarten = new ItemsForKindergarten();

        firstItemsForKindergarten.setIndoorShoes(1);
        firstItemsForKindergarten.setChangeOfClothes(5);
        firstItemsForKindergarten.setSunHat(1);
        firstItemsForKindergarten.setPyjama(1);

        Room firstRoom = new Room();

        firstRoom.setChair(4);
        firstRoom.setLamp(1);
        firstRoom.setTable(2);

        ShoppingAlfa firstShoppingAlfa = new ShoppingAlfa();

        firstShoppingAlfa.setClothes("Apranga, Camel Active, Cropp, Mango, Zara");
        firstShoppingAlfa.setForKids("Kidzone, Nord Baby, Okaidi");
        firstShoppingAlfa.setFootwear("Alicante, Ecco, Elche");

        TicketRequestForm firstClientsRequestFormSubmitting = new TicketRequestForm();

        firstClientsRequestFormSubmitting.setDepartureCity("Riga");
        firstClientsRequestFormSubmitting.setDestinationCity("Barcelona");
        firstClientsRequestFormSubmitting.setDepartDate(15.12);
        firstClientsRequestFormSubmitting.setReturnDate(31.12);
        firstClientsRequestFormSubmitting.setName("Test Client 1");
        firstClientsRequestFormSubmitting.setMail("clients@mail.com");
        firstClientsRequestFormSubmitting.setPhone(371268459);
        firstClientsRequestFormSubmitting.setAdults(2);
        firstClientsRequestFormSubmitting.setChildren(1);

        WeatherForecast november1stForecast =  new WeatherForecast();

        november1stForecast.setDate("1st of November");
        november1stForecast.setHumidity(50);
        november1stForecast.setTemperature(13.55);
        november1stForecast.setTime("07:00");
        november1stForecast.setWind(5);


        System.out.println("American Pie Recipe");
        System.out.println("Apples:");
        System.out.println(firstAmericanPie.getApples());
        System.out.println("Flour:");
        System.out.println(firstAmericanPie.getFlour());
        System.out.println("Eggs:");
        System.out.println(firstAmericanPie.getEgg());
        System.out.println("Cinnamon(g):");
        System.out.println(firstAmericanPie.getCinnamon());

        System.out.println("Art types:");
        System.out.println(firstArt.getArchitecture());
        System.out.println(firstArt.getMusic());
        System.out.println(firstArt.getPainting());
        System.out.println(firstArt.getMusic());

        System.out.println("2022 Device Statistics:");
        System.out.println("Top desktop device:");
        System.out.println(firstDeviceStatistics.getDesktopDevice());
        System.out.println("Top mobile device:");
        System.out.println(firstDeviceStatistics.getMobileDevice());

        System.out.println("Fitness studio home page:");
        System.out.println("Location of the studio:");
        System.out.println(firstFitnessStudio.getGym());
        System.out.println("Chosen training:");
        System.out.println(firstFitnessStudio.getGroupTraining());
        System.out.println("Total:");
        System.out.println(firstFitnessStudio.getPrice());

        System.out.println("House");
        System.out.println("How many bedrooms?");
        System.out.println(firstHouse.getBedroom());
        System.out.println("How many doors?");
        System.out.println(firstHouse.getDoor());

        System.out.println("Items for kindergarten to prepare each week");
        System.out.println("Indoor Shoes:");
        System.out.println(firstItemsForKindergarten.getIndoorShoes());
        System.out.println("How many items of change clothes?");
        System.out.println(firstItemsForKindergarten.getChangeOfClothes());

        System.out.println("What is in the room?");
        System.out.println("Chairs:");
        System.out.println(firstRoom.getChair());
        System.out.println("How many lamps?");
        System.out.println(firstRoom.getLamp());
        System.out.println("How many tables?");
        System.out.println(firstRoom.getTable());

        System.out.println("Alfa Shopping center has such stores for adults and children as:");
        System.out.println(firstShoppingAlfa.getClothes());
        System.out.println(firstShoppingAlfa.getFootwear());
        System.out.println(firstShoppingAlfa.getForKids());

        System.out.println("Online airline request form:");
        System.out.println(firstClientsRequestFormSubmitting.getDepartureCity());
        System.out.println(firstClientsRequestFormSubmitting.getDestinationCity());
        System.out.println(firstClientsRequestFormSubmitting.getDepartDate());
        System.out.println(firstClientsRequestFormSubmitting.getReturnDate());
        System.out.println(firstClientsRequestFormSubmitting.getName());
        System.out.println(firstClientsRequestFormSubmitting.getMail());
        System.out.println(firstClientsRequestFormSubmitting.getPhone());

        System.out.println("Weather forecast for November");
        System.out.println(november1stForecast.getLocation());
        System.out.println("Average Temperature C/t");
        System.out.println(november1stForecast.getTemperature());
        System.out.println("Wind, m/s");
        System.out.println(november1stForecast.getWind());
    }
}
