/*
 * Copyright 2015 Len Payne <len.payne@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package servlet;

import java.io.IOException;
import static java.lang.Boolean.TRUE;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;

/**
 * Provides an Account Balance and Basic Withdrawal/Deposit Operations
 */
@WebServlet("/account")
public class AccountServlet extends HttpServlet {

    Account account = new Account();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        account.getBalance();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) {
        String with = req.getParameter("withdraw");
        String dep = req.getParameter("deposit");
        String clos = req.getParameter("close");
        if (with != null) {
            double withdraw = Double.parseDouble(req.getParameter("withdraw"));
            account.withdraw(withdraw);
        } else if (dep != null) {
            double deposit = Double.parseDouble(req.getParameter("deposit"));
            account.deposit(deposit);
        } else if ("true".equals(clos)){
            double close = Double.parseDouble(clos);
            account.close();
    }
}
    
}
