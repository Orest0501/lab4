package ua.lviv.iot.models;

public class FootballStadium extends SportFacilities {

    private final String stadiumColour;

    public FootballStadium(int capacity, String name, String typeOfGround, String typeOfSport, String stadiumСolour) {

        super(capacity, name, typeOfGround, typeOfSport);

        this.capacity = capacity;

        this.name = name;

        this.typeOfGround = typeOfGround;

        this.typeOfSport = typeOfSport;

        this.stadiumColour = "red-black";

    }

    public int getCapacity(){
        return capacity;
    }

    public String getTypeOfSport() {
        return typeOfSport;
    }

    public String getStadiumColour() {
        return stadiumColour;
    }

    @Override
    public String toString() {
        return "Football_stadium{" +
                "stadium_colour='" + stadiumColour + '\'' +
                ", capacity=" + capacity +
                ", name='" + name + '\'' +
                ", type_of_ground='" + typeOfGround + '\'' +
                ", type_of_sport='" + typeOfSport + '\'' +
                '}';
    }
}