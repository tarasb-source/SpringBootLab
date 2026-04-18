package tarasb.learn.pets;


public class PetServiceFactory {

  public PetService getService(String petType) {
    switch (petType) {
      case "cat":
        return new CatPetService();
      case "dog":
      default:
        return new DogPetService();
    }
  }
}
