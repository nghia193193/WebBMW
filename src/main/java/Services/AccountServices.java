package Services;

import java.util.List;

import entity.Account;

public interface AccountServices {
	List<Account> getAllAccount();

	int checkAccountAdmin(int userID);

	int checkAccountShipper(int userID);

	int checkAccountSeller(int userID);

	Account login(String user, String pass);

	Account checkAccountExist(String user);

	Account checkAccountExistByUsernameAndEmail(String username, String email);

	Account checkCode(String code);

	void singup(String user, String pass, String email, String code);

	void deleteAccount(String id);

	void insertAccount(String user, String pass, String isSell, String isAdmin, String isShipper, String email);

	public void editProfile(Account account);

	void updateSeller(int id);
}
