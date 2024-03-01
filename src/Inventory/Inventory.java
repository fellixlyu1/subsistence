package Inventory;

import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Integer> slots;

    public Inventory() {
        this(50);
    }

    public Inventory(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Inventory error: size must be greater than zero");
        }
        slots = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            slots.add(null);
        }
    }

    public void addItem(int slotIndex, int item) {
        if (isValidSlot(slotIndex)) {
            slots.set(slotIndex, item);
            System.out.println("Added item to your inventory");
        } else {
            System.out.println("Invalid selection");
        }
    }

    public void removeItem(int slotIndex) {
        if (isValidSlot(slotIndex)) {
            slots.set(slotIndex, null);
            System.out.println("Removed item from your inventory");
        } else {
            System.out.println("Invalid selection");
        }
    }

    public boolean isValidSlot(int slotIndex) {
        return slotIndex >= 0 && slotIndex < slots.size();
    }

    public void displayInventory() {
        System.out.println("Inventory: ");
        for(int i = 0; i < slots.size(); i++) {
            System.out.println("Slot " + i + ": " + slots.get(i));
        }
    }
}
