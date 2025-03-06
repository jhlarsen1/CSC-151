
import java.io.*;
import java.security.acl.Owner;
import java.util.Scanner;

// By implementing Serializable interface
// we make sure that state of instances of class DogStepTracker
// can be saved in a file.
class DogStepTracker implements Serializable {
    private static final long serialVersionUID = 1L;
    
    int steps;
    String dogName;
    String Owner, dogBreed;

    // DogStepTracker class constructor
    public DogStepTracker(int steps, String dogName, String Owner, String dogBreed) 
    {
        this.steps = steps;
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.Owner = Owner;
    }
}

public class Test 
{
    public static void main(String[] args) throws IOException, ClassNotFoundException 
    {
        //This next line is from the 1st version of the code where the variables were set without user input
        //DogStepTracker tracker = new DogStepTracker(5000, "Buddy", "Justin", "Pitbull");

        //changes made to allow user to input the variables
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input and capture the values
        System.out.print("Enter the dog's name: ");
        String dogName = scanner.nextLine(); // Read dog name

        System.out.print("Enter the owner's name: ");
        String owner = scanner.nextLine(); // Read owner's name

        System.out.print("Enter the dog's breed: ");
        String dogBreed = scanner.nextLine(); // Read dog's breed

        System.out.print("Enter the number of steps: ");
        int steps = scanner.nextInt(); // Read the number of steps (integer input)

        //put the dog info in the object
        DogStepTracker tracker = new DogStepTracker(steps, dogName, owner, dogBreed);


        // Serializing 'tracker'
        FileOutputStream fos = new FileOutputStream("dog_tracker.data");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(tracker);

        // De-serializing 'tracker'
        FileInputStream fis = new FileInputStream("dog_tracker.data");
        ObjectInputStream ois = new ObjectInputStream(fis);
        DogStepTracker deserializedTracker = (DogStepTracker) ois.readObject(); // down-casting object

        System.out.println("Dog Name: " + deserializedTracker.dogName + ", Steps: " + deserializedTracker.steps + ", Owner: " + deserializedTracker.Owner + ", Breed: " + deserializedTracker.dogBreed);

        // closing streams
        oos.close();
        ois.close();
    }
}


