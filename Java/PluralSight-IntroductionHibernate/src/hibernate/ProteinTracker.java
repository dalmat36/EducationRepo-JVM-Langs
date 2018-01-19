package hibernate;

import java.util.Date;

import org.hibernate.Session;

public class ProteinTracker {

	public static void main(String[] args) {
		Session session = hibernateUtils.getSessionFactory().openSession();

		//Insert User
		session.beginTransaction();
		User user = new User();
		user.setName("Joe");
		user.addHistory(new UserHistory(new Date(), "Set name to Joe"));
		user.getProteinData().setGoal(250);
		user.addHistory(new UserHistory(new Date(), "Set the Goal to 250"));
		user.getGoalAlerts().add(new GoalAlert("Congratulations"));
		user.getGoalAlerts().add(new GoalAlert("You did it"));
		session.save(user);
		session.getTransaction().commit();
		
		//Return User
		session.beginTransaction();
		User loadedUser = (User)session.get(User.class, 1);
		System.out.println(loadedUser.getName());
		System.out.println(loadedUser.getProteinData().getGoal());
		for (UserHistory history : loadedUser.getHistory()){
			System.out.println(history.getEntry() + " " + history.getEntryTime());
		}
		
		//update user
		loadedUser.getProteinData().setTotal(loadedUser.getProteinData().getTotal() + 50);
		loadedUser.addHistory(new UserHistory(new Date(), "Added 50 protein"));
		user.setProteinData(new ProteinData());
		session.getTransaction().commit();
		
		session.close();
		hibernateUtils.getSessionFactory().close();

	}

}
