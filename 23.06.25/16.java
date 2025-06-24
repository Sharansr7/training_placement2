import java.util.*;

class Candidate {
    String name;
    int votes = 0;

    Candidate(String name) {
        this.name = name;
    }
}

public class VotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Candidate> candidates = List.of(
            new Candidate("Alice"), new Candidate("Bob"), new Candidate("Charlie")
        );

        System.out.println("Welcome to Voting System.");
        System.out.println("Vote by choosing candidate number:");

        for (int i = 0; i < candidates.size(); i++)
            System.out.println((i + 1) + ". " + candidates.get(i).name);

        System.out.print("Enter your vote: ");
        int choice = sc.nextInt();
        if (choice >= 1 && choice <= candidates.size()) {
            candidates.get(choice - 1).votes++;
            System.out.println("Vote casted successfully.");
        }

        System.out.println("\n--- Results ---");
        for (Candidate c : candidates)
            System.out.println(c.name + ": " + c.votes + " votes");
    }
}
