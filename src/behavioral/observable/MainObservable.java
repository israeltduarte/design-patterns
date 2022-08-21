package behavioral.observable;

public class MainObservable {

    public static void main(String[] args) {

        Announcer announcer = new Announcer();

        LibraryListener librarian = new LibraryListener();
        TavernListener tavernMan = new TavernListener();
        HospitalListener doctor = new HospitalListener();

        announcer.getNewsManager().subscribe(librarian);
        announcer.getNewsManager().subscribe(tavernMan);
        
        announcer.publishNews("A robber robbed the tavern and was hiding in the library.");

        announcer.getNewsManager().subscribe(doctor);
        announcer.getNewsManager().unsubscribe(tavernMan);

        announcer.publishNews("A reader was hurt and is being treated at the hospital.");
    }
}