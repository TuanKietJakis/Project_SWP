/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.List;

/**
 *
 * @author User
 */
public class Cart {

    private List<Item> items;

    public Cart() {
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

       

    private Item getItemByID(int ID) {
        for (Item item : items) {
            if (item.getProduct().getID()== ID) {
                return item;
            }
        }
        return null;
    }

    public int getQuantityByID(int ID) {
        return getItemByID(ID).getQuantity();
    }

    public void addItem(Item t) {
        if (getItemByID(t.getProduct().getID()) != null) {
            Item m = getItemByID(t.getProduct().getID());
            m.setQuantity(m.getQuantity() + t.getQuantity());
        } else {
            items.add(t);
        }
    }

    public void removeItem(int id) {
        if (getItemByID(id) != null) {
            items.remove(getItemByID(id));
        }
    }
    
    public int getTotalMoney(){
        int t = 0;
        for (Item item : items) {
            t += (item.getQuantity()*item.getProduct().getPrice());
        }
        return t;
    }

   
   
}
