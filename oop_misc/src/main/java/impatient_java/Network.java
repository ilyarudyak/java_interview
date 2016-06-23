package impatient_java;

import java.util.ArrayList;

/**
 * Created by ilyarudyak on 6/22/16.
 */
public class Network {

    private ArrayList<Member> members = new ArrayList<>();
    private String networkName;

    public Network(String networkName) {
        this.networkName = networkName;
    }

    public Member enroll(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }

    @Override
    public String toString() {
        return members.toString();
    }

    // inner class
    public class Member { // Member is an inner class of Network
        private String name;
        private ArrayList<Member> friends = new ArrayList<>();

        public Member(String name) {
            this.name = name;
        }

        // here we use access to members of outer class
        public void leave() {
            System.out.println(name + " is leaving " + Network.this.networkName + " ...");
            Network.this.members.remove(this);
        }

        public void addFriend(Member newFriend) {
            friends.add(newFriend);
        }

        public boolean belongsTo(Network network) {
            return network.members.contains(this);
        }

        public String toString() {
            StringBuilder result = new StringBuilder(name);
            result.append(" with friends ");
            for (Member friend : friends) {
                result.append(friend.name);
                result.append(", ");
            }
            return result.subSequence(0, result.length() - 2).toString();
        }
    }


    public static void main(String[] args) {
        Network myFace = new Network("myFace");
        Network tooter = new Network("tooter");
        Network.Member fred = myFace.enroll("Fred");
        Network.Member wilma = myFace.new Member("Wilma");
        // An object, but not enrolled
        // Make the constructor private to avoid this
        fred.addFriend(wilma);

        Network.Member barney = tooter.enroll("Barney");
        fred.addFriend(barney);
        System.out.println(myFace);
        // If it shouldn't be possible to add a friend
        // from another network, call belongsTo
        System.out.println(wilma.belongsTo(myFace));
        System.out.println(barney.belongsTo(myFace));

        Network.Member john = myFace.enroll("John");
        System.out.println();
        System.out.println("john is in " + myFace.networkName + ": " + john.belongsTo(myFace));
        john.leave();
        System.out.println("john is in " + myFace.networkName + ": " + john.belongsTo(myFace));
    }
}














