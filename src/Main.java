public class Main {
    public static void main(String[] args){

    Animal cat = new Animal();

    cat.setName("Liza");
    cat.setAge(10);
    cat.setMood(6);
    cat.setHealth(8);
    cat.setHungerLevel(6);
    cat.setFavouriteActivity("sleeping");
    cat.setFavouriteFood("sterilised indoor cat food");
    System.out.println("Our newest rescued animal is " + cat.getName() + ", a " + cat.getAge() + " years old cat. " +
            "She spends most of her time "+ cat.getFavouriteActivity() + ".");

    Rescuer nobleRescuer = new Rescuer();
    nobleRescuer.setName("Tim");
    nobleRescuer.setIncome(7999.99);
    System.out.println("The first to apply for an adoption was " + nobleRescuer.getName()+ ", a young professional cyclist "
            + "who also donated his entire income of " + nobleRescuer.getIncome() + " to the shelter.");

    AnimalFood yumYum = new AnimalFood ();
       yumYum.setName("Purina Sensitive");
       yumYum.setPrice(7.99);
       yumYum.setUnits(100);
       yumYum.setAvailableInStock(true);
    System.out.println(cat.getName()+ "'s favourite food is " + yumYum.getName() + " and the manager just got a great offer " +
            "to buy a batch of " +yumYum.getUnits()+ " bags for only " + yumYum.getPrice()+ "!" );

    RecreationalActivities funTime = new RecreationalActivities ();
       funTime.setName( "laser tag");
       funTime.setDuration(0.4);

    System.out.println("Since " + nobleRescuer.getName() + " took " + cat.getName() + " home they play " + funTime.getName() +
            " several times a day, for at least " + funTime.getDuration()+ " hours." );

    Vet doctor1 = new Vet();
    doctor1.setName("Martin NEWMAN");
    doctor1.setexperience(15);
    doctor1.setSpecialty("feline and canine nutrition");
    System.out.println("From the 1st of October the shelter has a new veterinarian doctor named " + doctor1.getName() +
            " who is a very pleasant colleague that brings " + doctor1.getExperience()+ " years of experience in " +
            doctor1.getSpecialty() + "to the team");

    }

}