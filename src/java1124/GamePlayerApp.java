package java1124;

// Interface representing common functionalities for a Game Player
interface GamePlayer { // 一個GamePlayer的介面
    void chooseRole();
    void customizePlayer();
    void play();
    void celebrateVictory();
}

// Concrete class representing a Warrior player
class WarriorPlayer implements GamePlayer {
    // Implementing methods from the interface
    public void chooseRole() {
        System.out.println("Player chooses the Warrior role.");
    }

    public void customizePlayer() {
        System.out.println("Customizing Warrior's equipment.");
    }

    public void play() {
        System.out.println("Warrior is engaged in battle.");
    }

    public void celebrateVictory() {
        System.out.println("Warrior celebrates the victory!");
    }
}

// Concrete class representing a Mage player
class MagePlayer implements GamePlayer {
    // Implementing methods from the interface
    // 實作魔法師
    public void chooseRole() {
        System.out.println("Player chooses the Mage role.");
    }

    public void customizePlayer() {
        System.out.println("Customizing Mage's spells and abilities.");
    }

    public void play() {
        System.out.println("Mage is casting powerful spells.");
    }

    public void celebrateVictory() {
        System.out.println("Mage celebrates the victory with magic!");
    }
}

// New concrete class representing an Archer player
class ArcherPlayer implements GamePlayer {
    // Implementing methods from the interface
    public void chooseRole() {
        System.out.println("Player chooses the Archer role.");
    }

    public void customizePlayer() {
        System.out.println("Customizing Archer's bow and arrows.");
    }

    public void play() {
        System.out.println("Archer is shooting arrows from a distance.");
    }

    public void celebrateVictory() {
        System.out.println("Archer celebrates the victory with precision!");
    }
}

// New concrete class representing a Rogue player
class RoguePlayer implements GamePlayer {
    // Implementing methods from the interface
    public void chooseRole() {
        System.out.println("Player chooses the Rogue role.");
    }

    public void customizePlayer() {
        System.out.println("Customizing Rogue's stealth and daggers.");
    }

    public void play() {
        System.out.println("Rogue is silently eliminating enemies.");
    }

    public void celebrateVictory() {
        System.out.println("Rogue celebrates the victory with cunning!");
    }
}

// Client code demonstrating polymorphism with arrays
public class GamePlayerApp {
    public static void main(String[] args) {
        // Creating an array of GamePlayers
        GamePlayer[] players = new GamePlayer[4];
        players[0] = new WarriorPlayer(); // new 的是一般的類別，不可以去new介面
        players[1] = new MagePlayer(); // 向上轉型，MagePlayer可以assign給GamePlayer
        players[2] = new ArcherPlayer();
        players[3] = new RoguePlayer();

        // Invoking common methods through polymorphism
        for (GamePlayer player : players) {
            System.out.println("---- Player ----");
            player.chooseRole();
            player.customizePlayer();
            player.play();
            player.celebrateVictory();
            System.out.println("----------------\n");
        }
    }
}