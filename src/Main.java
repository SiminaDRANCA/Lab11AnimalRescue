public class Main {
    public static void main(String[] args){

    Animal cat = new Animal("Liza", 10, (short) 6, (short) 8, (short) 4,"Special " +
            "sterilised indoor cat food", "sleeping");
    System.out.println("Our newest rescued animal is " + cat.name + ", a " + cat.age + " years old cat. " +
            "She spends most of her time "+ cat.favouriteActivity + ".");

    Rescuer nobleRescuer = new Rescuer ("Tim", 7999.99);
    System.out.println("The first to apply for an adoption was " + nobleRescuer.name + ", a young professional cyclist "
            + "who also donated his entire income of " + nobleRescuer.income + " to the shelter.");

    AnimalFood yumYum = new AnimalFood ("Purina Sensitive", 7.99, 100, true);
    System.out.println(cat.name + "'s favourite food is " + yumYum.name + " and the manager just got a great offer " +
            "to buy a batch of " + yumYum.units + " bags for only " + yumYum.price + "!" );

    RecreationalActivities funTime = new RecreationalActivities ("laser tag", 0.4);
    System.out.println("Since " + nobleRescuer.name + " took " + cat.name + " home they play " + funTime.name +
            " several times a day, for at least " + funTime.duration + " hours." );

    Vet doctor1 = new Vet("Martin NEWMAN", 15, "feline and canine nutrition");
    System.out.println("From the 1st of October the shelter has a new veterinarian doctor named " + doctor1.name +
            " who is a very pleasant colleague that brings " + doctor1.experience + " years of experience in " +
            doctor1.specialty + "to the team");

    }

}