package misc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by ilyarudyak on 6/23/16.
 */
public class Colony implements Iterable<Colony.Penguin> {

    static class Penguin {
        String name;
        Penguin(String name) {
            this.name = name;
        }
        public String toString() {
            return "Penguin{" + name + "}";
        }
    }

    Set<Penguin> colonySet = new HashSet<>();

    public void addPenguin(Penguin p) {
        colonySet.add(p);
    }

    public Iterator<Penguin> getColonySetIterator() {
        return colonySet.iterator();
    }
    public Iterator<Penguin> iterator() {
        return getColonySetIterator();
    }

    public static void main(String args[]) {

        Colony colony = new Colony();

        colony.addPenguin(new Penguin("Opus"));
        colony.addPenguin(new Penguin("Chilly Willy"));
        colony.addPenguin(new Penguin("Mumble"));
        colony.addPenguin(new Penguin("Emperor"));

        for (Penguin p : colony) {
            System.out.println(p);

            // we can not delet from colony in for each loop
//            if (p.name.equals("Opus")) { colony.colonySet.remove(p); }

            // but it seems we can modify its members
            if (p.name.equals("Mumble")) {
                p.name = "Mumble Bumble";
            }

        }

        System.out.println();
//        Iterator<Colony.Penguin> iterator = colony.getColonySetIterator();
        Iterator<Colony.Penguin> iterator = colony.iterator();
        while (iterator.hasNext()) {
            Penguin p = iterator.next();
            System.out.println(p);

            // we can remove or modify colony using iterator
            if (p.name.equals("Opus")) {
                iterator.remove();
            }

            if (p.name.equals("Mumble Bumble")) {
                p.name = "Mumble Bumble Gumble";
            }

        }

        System.out.println();
        for (Penguin p : colony) {
            System.out.println(p);
        }
    }
}















