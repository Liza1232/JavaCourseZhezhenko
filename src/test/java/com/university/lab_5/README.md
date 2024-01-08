## Опис тестів:

  **TestNegativeAmountException:**
  
  1. `negativeDepositAmountTest()`: Перевіряє, що виняток NegativeAmountException генерується при спробі внести від'ємну суму.
  2. `negativeAmountWithdrawTest()`: Тестує, чи генерується NegativeAmountException при спробі зняти від'ємну суму.
  3. `negativeAmountDepositTest()`: Забезпечує, що NegativeAmountException генерується при спробі внести від'ємну суму.
  4. `negativeAmountTransferTest()`: Перевіряє, що NegativeAmountException генерується під час переказу, якщо сума є від'ємною.
  
  **TestAccountNotFoundException:**
 
  1. `searchNotExistingAccount()`: Перевіряє, що AccountNotFoundException генерується при спробі знайти неіснуючий рахунок.
  2. `sendMoneyToNotExistingAccount()`: Забезпечує, що AccountNotFoundException генерується при спробі переказати кошти на неіснуючий рахунок.
  3. `sendMoneyFromNotExistingAccount()`: Перевіряє, що AccountNotFoundException генерується при спробі переказати кошти з неіснуючого рахунку.
  
  **TestInsufficientFundsException:**
  
  1. `insufficientFundsTransfer()`: Тестує, чи генерується InsufficientFundsException при спробі переказати більше коштів, ніж доступно на рахунку.
  2. `insufficientFundsWithdraw()`: Забезпечує, що InsufficientFundsException генерується при спробі зняти більше коштів, ніж доступно на рахунку.
 
