import java.util.LinkedList;
import java.util.Scanner;

public class MusicPlaylist {
    private LinkedList<String> songs = new LinkedList<>();

    public void addSong(String song) {
        songs.add(song);
        System.out.println("Added: " + song);
    }

    public void removeSong(String song) {
        if (songs.remove(song)) {
            System.out.println("Removed: " + song);
        } else {
            System.out.println("Song not found.");
        }
    }

    public void moveSong(String song, int position) {
        if (songs.remove(song)) {
            if (position >= 0 && position <= songs.size()) {
                songs.add(position, song);
                System.out.println("Moved: " + song);
            } else {
                System.out.println("Invalid position.");
                songs.addLast(song);
            }
        } else {
            System.out.println("Song not found.");
        }
    }

    public void showSongs() {
        if (songs.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Playlist:");
            for (int i = 0; i < songs.size(); i++) {
                System.out.println((i + 1) + ". " + songs.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MusicPlaylist playlist = new MusicPlaylist();

        while (true) {
            System.out.println("\n1. Add Song\n2. Remove Song\n3. Move Song\n4. Show Playlist\n5. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter song name: ");
                    String songToAdd = scanner.nextLine();
                    playlist.addSong(songToAdd);
                    break;
                case 2:
                    System.out.print("Enter song name to remove: ");
                    String songToRemove = scanner.nextLine();
                    playlist.removeSong(songToRemove);
                    break;
                case 3:
                    System.out.print("Enter song name to move: ");
                    String songToMove = scanner.nextLine();
                    System.out.print("Enter new position: ");
                    int position = scanner.nextInt();
                    playlist.moveSong(songToMove, position);
                    break;
                case 4:
                    playlist.showSongs();
                    break;
                case 5:
                    System.out.println("Exiting.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
            scanner.close();
        }
    }
}
