package behavioral.observable;

public class LibraryListener implements NewsListener {

    @Override
    public void update(String message) {
        System.out.println("The librarian closed the library.");
    }
    
}
