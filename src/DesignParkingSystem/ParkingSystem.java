package DesignParkingSystem;

public class ParkingSystem {
    private int[] slots;

    public ParkingSystem(int big, int medium, int small) {
        slots = new int[]{big, medium, small};

    }

    public boolean addCar(int carType) {
        int index = carType - 1;
        boolean hasFreeSlot = slots[index] > 0;
        if (hasFreeSlot) {
            --slots[index];
        }
        return hasFreeSlot;
    }
}
