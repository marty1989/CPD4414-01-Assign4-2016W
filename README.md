## CPD-4414-01 Assignment #4
### Contributors
- Brian
- Nimki
- Brad Ryan

> # Problem Description
> Work with your project group. You must build an account servlet. It must perform four basic operations:
 retrieve the balance, withdraw a certain amount, deposit a certain amount, and withdraw everything (close the account.)These operations must be performed using the following four HTTP resource patterns:
- Retrieve Balance:     GET http://localhost:8080/CPD-4414-01-Assign4-2016W/account
- Withdraw $XXX:        POST http://localhost:8080/CPD-4414-01-Assign4-2016W/account?withdraw=XXX
- Deposit $XXX:         POST http://localhost:8080/CPD-4414-01-Assign4-2016W/account?deposit=XXX
- Withdraw Everything:  POST http://localhost:8080/CPD-4414-01-Assign4-2016W/account?close=true

> Starting files are available at https://github.com/LenPayne/CPD4414-01-Assign4-2016W that include a sample webpage, an unfinished Accountclass, a partially-finished AccountTestclass, and an almost-empty AccountServlet class. Actions to Take in AccountTest.javaComplete the testGetBalanceIs100AfterDeposit500ThenWithdraw400method, which tests that the account balance is 100 after depositing 500 and then withdrawing 400. Complete the testGetBalanceIsZeroAfterDeposit500ThenClose, which tests that the account balance is zero after depositing 500 and then closing the account. Actions to Take in Account.javaImplement the Account.getBalance() method, which should return the current balance of the account. Implement the Account.deposit(XXX) method, which should increase the current balance of the account by XXXdollars. Implement the Account.withdraw(XXX) method, which should decrease the current balance of the account by XXXdollars. Implement the Account.close() method, which should set the current balance of the account to zero.

> CPD-4414-01 Assignment #4 Actions to Take in AccountServlet.javaCreate an instance variable of type Accountin the AccountServletclass. Use this instance variable within the doGetand doPostmethods below.Implement the AccountServlet.doGet() method, such that it returns the actual value of the balance. (ie-If the account has a balance of 500, this method shouldbuild a response that only contains the characters “500”.) Include the following three lines to invalidate the cache:response.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate");response.setHeader("Pragma", "no-cache");response.setDateHeader("Expires", 0);Implement the AccountServlet.doPost() method, such that it checks for parameters (either withdraw=XXX, deposit=XXX, or close=true) and performs the expected behaviour on an instance of the Accountclass.How to SubmitPush your code to a GitHub repository. Use that repository URL to answer the one-question quiz on D2L.
This assignment is due by 11:30pm on Thursday, Feb 25th

### Assignments
- Nimki: Withdrawl POST and Deposit POST
- Brian: Retrieve Balance GET and Withdrawl Everything POST
- Brad: Tests, getters, and setters
