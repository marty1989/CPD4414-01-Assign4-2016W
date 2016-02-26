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
    protected void doGet(HttpServletRequest req, HttpServletResponse res) {
        res.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate");
        res.setHeader("Pragma", "no-cache");
        res.setDateHeader("Expires", 0);
        account.getBalance();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) {
        if (!"".equals(req.getParameter("withdraw"))) {
            Double withdraw = Double.valueOf(req.getParameter("withdraw"));
            account.withdraw(withdraw);
        } else if (!"".equals( req.getParameter("deposit"))) {
            Double deposit = Double.valueOf(req.getParameter("deposit"));
            account.deposit(deposit);
        } else if ("true".equals(req.getParameter("close"))){
            account.close();
    }
}
    
}
