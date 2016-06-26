package head_first.composite.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ilyarudyak on 6/26/16.
 */
public class Menu extends MenuComponent {

    List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // methods implemented only for Menu
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    // getters for name and description
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        menuComponents.forEach(MenuComponent::print);

    }
}
