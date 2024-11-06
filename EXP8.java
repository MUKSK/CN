import java.util.Scanner;
class EXP8 {
public static void main(String[] a) {
Scanner s = new Scanner(System.in);
// User inputs
System.out.print("Enter bucket size: ");
int B = s.nextInt(); // Bucket size
System.out.print("Enter number of queries: ");
int Q = s.nextInt(); // Number of queries
System.out.print("Enter input packet size: ");
int I = s.nextInt(); // Input packet size
System.out.print("Enter output packet size: ");
int O = s.nextInt(); // Output packet size
int S = 0; // Initial storage in the bucket
for (int i = 0; i < Q; i++) {
int L = B - S; // Space left
if (I <= L) {
S += I; // Store packets if space is available
} else {
System.out.println("Packet loss = " + (I - L)); // Calculate packet loss
}
// Show current buffer status
System.out.println("Buffer size = " + S + " out of bucket size = " + B);
S -= O; // Remove packets from the bucket
if (S < 0) S = 0; // Avoid negative storage
}
// Simple output explanation
System.out.println("Final buffer size = " + S + " out of bucket size = " + B);
s.close();
}
}
