#include <iostream>
#include <string>
using namespace std;

class Account {
public:
    string name;
    int age;
    double balance;

    Account(string n, int a, double b) {
        name = n;
        age = a;
        balance = b;
    }

    void displayAccount() {
        cout << "\n===== ACCOUNT INFORMATION =====\n";
        cout << "\nName: " << name << "\n";
        cout << "Age: " << age << "\n";
        cout << "Balance: " << balance << "\n\n";
    }

    void createAccount(string nameInput, int ageInput, double balanceInput) {
        name = nameInput;
        age = ageInput;
        balance = balanceInput;
    }

    void deposit(double amount) {
        balance += amount;
        cout << "Deposit successful. New balance: " << balance << endl;
    }

    void withdraw(double amount) {
        if (amount > balance) {
            cout << "Insufficient funds. Withdrawal failed." << endl;
        } else {
            balance -= amount;
            cout << "Withdrawal successful. New balance: " << balance << endl;
        }
    }
    
    void deleteAccount() {
        name = " ";
        age = 0;
        balance = 0;
    }
};


int main(){
    Account acc1("", 0, 0);
    int choice;
    double amount;
	string username, pass1, pass2, checkUsername, checkPass;
	int i, attempt = 0;
	
	registerAcc:
		cout<< "================================================\n";
		cout << "\t\tREGISTER AN ACCOUNT FOR THE APP\n";
		cout<< "================================================\n";
		cout << "Create a username: ";
		cin >> username;
		cout << "Create a PIN: ";
		cin >> pass1;
		cout << "Reenter the PIN: ";
		cin >> pass2;
	
	if (pass1 == pass2) {
		cout << "\n\nYOU HAVE SUCCESSFULLY CREATED AN ACCOUNT FOR  <APP>\n\n";
		goto login;
	}else {
		cout << "\nERROR: Password not the same!\n\n";
		goto registerAcc;
	}
	
	login:
		cout << "===================== APP =================\n";
		cout << "Enter your username: ";
		cin >> checkUsername;
		cout << "Enter your password: ";
		cin >> checkPass;
		attempt += 1;
		cout << " \n\n";
		
		if (checkUsername == username && checkPass == pass1) {
			do {
                cout << "\n===== BANKING SYSTEM ===== \n\n";
                cout << "Select an Option: \n";
                cout << "1. Create an Account \n";
                cout << "2. Display Account Details \n";
                cout << "3. Deposit Money \n";
                cout << "4. Withdraw Money \n";
                cout << "5. Delete Account \n";
                cout << "6. Exit \n\n";
                cout << "Enter your choice (1-6): ";
                cin >> choice;
        
                switch (choice) {
                    case 1: {
                        string nameInput;
                        int ageInput;
                        double balanceInput;
                        
                        cout << "\n\n ===== ACCOUNT CREATION =====\n";
        
                        cout << "Enter your name: ";
                        cin >> nameInput;
        
                        cout << "Enter your age: ";
                        cin >> ageInput;
        
                        cout << "Set your account balance: ";
                        cin >> balanceInput;
        
                        acc1.createAccount(nameInput, ageInput, balanceInput);
                        break;
                    }
        
                    case 2:
                        acc1.displayAccount();
                        break;
        
                    case 3:
                        cout << "Enter the amount to deposit: ";
                        cin >> amount;
                        acc1.deposit(amount);
                        break;
        
                    case 4:
                        cout << "Enter the amount to withdraw: ";
                        cin >> amount;
                        acc1.withdraw(amount);
                        break;
                        
                    case 5:
                        acc1.deleteAccount();
                        cout << "Your account has been deleted.";
                        break;
        
                    case 6:
                        cout << "Exiting program. Thank you!\n";
                        break;
        
                    default:
                        cout << "Invalid choice. Please try again.\n";
                }
            } while (choice != 6);

		}
		else {
			for (i = attempt; i < 3; i++){
			    goto login;
			}
			cout << "Your account will temporarily be locked!";
		}	
	return 0;
}
