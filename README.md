### AI-Powered Music Composer

This Java program demonstrates a simple implementation of an AI-powered music composer. It generates a sequence of musical notes using a basic algorithm.

### How it Works

The `MusicComposer` class contains methods to generate random musical notes and sequences. Here's a breakdown:

- **`generateNote()`**: This method randomly selects a musical note from a predefined array of notes (C, D, E, F, G, A, B).
- **`generateMusic(int length)`**: This method generates a musical sequence of the specified length by calling `generateNote()` for each note in the sequence.

The `main` method demonstrates how to use the `MusicComposer` class to generate a musical sequence of a specified length.

### Running the Program

To run the program:

1. Compile the Java file: `javac MusicComposer.java`
2. Execute the compiled class file: `java MusicComposer`

### Example Output

```
Generated Music: D G A B E C C F G

```
