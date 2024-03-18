import java.util.Random;

public class MusicComposer {
    
    // Define the musical notes
    private static final String[] NOTES = {"C", "D", "E", "F", "G", "A", "B"};

    // Method to generate a random musical note
    public static String generateNote() {
        Random random = new Random();
        int index = random.nextInt(NOTES.length);
        return NOTES[index];
    }

    // Method to generate a musical sequence
    public static String generateMusic(int length) {
        StringBuilder music = new StringBuilder();
        for (int i = 0; i < length; i++) {
            music.append(generateNote()).append(" ");
        }
        return music.toString().trim();
    }

    public static void main(String[] args) {
        // Generate a musical sequence of length 10
        String music = generateMusic(10);
        System.out.println("Generated Music: " + music);
    }
}
