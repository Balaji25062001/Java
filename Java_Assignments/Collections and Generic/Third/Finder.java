package ClassEleven;
import java.util.ArrayList;
import java.util.List;
public class Finder {
	  public static void main(String[] args) {
	        List<FriendshipCriteria<String, String>> friends = new ArrayList<FriendshipCriteria<String, String>>();
	        String targetLocation = "Hogwarts"; // Example: Find friends in this location
	 
	        friends.add(new FriendshipCriteria<>("Potter", "Hogwarts"));
	        friends.add(new FriendshipCriteria<>("Micheal", "California"));
	        friends.add(new FriendshipCriteria<>("John", "San Fransico"));
	        
	        for (FriendshipCriteria<String, String> friend : friends) {
	            if (friend.getAttribute().equalsIgnoreCase(targetLocation)) {
	                System.out.println(friend.getName() + " is a friend.");
	            }

          }
	        List<FriendshipCriteria<String, Integer>> friendsWithAge = new ArrayList<>();
	        friendsWithAge.add(new FriendshipCriteria<>("Bean", 29));
	        friendsWithAge.add(new FriendshipCriteria<>("Emma Watson", 20));
	        friendsWithAge.add(new FriendshipCriteria<>("Reaper", 145));
	        
	        int age = 30;
	        
			System.out.println("Showing list of friends less than : " + age);
	        for (FriendshipCriteria<String, Integer> friend : friendsWithAge) {
	        	if (friend.getAttribute() <= 20) {
	        		System.out.println(friend.getName() + " is a friend.");
	        	}
	        	
	        }
	        
	        
	        
	        
	        
	        }
	  }
