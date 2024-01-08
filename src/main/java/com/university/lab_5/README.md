# lab_5

# Мета:
 * Програма реалізує функціонал простої банківської системи, яка дозволяє користувачам створювати банківські рахунки.
 * Здійснювати операції з депозитами та виводами грошей, а також переказувати кошти між рахунками.
 * Основною метою програми є створення зручного та зрозумілого інтерфейсу для управління фінансами користувачів.

# Опис роботи:

## Клас BankAccount
## Методи:
 deposit(double amount): Здійснює внесення вказаної суми на рахунок. Викидає виняток NegativeAmountException, якщо вказана сума є від'ємною.
 withdraw(double amount): Здійснює зняття вказаної суми з рахунку. Викидає виняток InsufficientFundsException, якщо зняття перевищує доступний баланс.
 Викидає виняток NegativeAmountException, якщо сума є від'ємною.
 getBalance(): Отримує поточний баланс рахунку.
 getAccountSummary(): Генерує та повертає рядок-сумар, що містить інформацію про рахунок.

# Клас Bank представляє банк та забезпечує операції з управлінням банківськими рахунками.
## Методи:
 createAccount(String accountName, double initialDeposit): Створює новий банківський рахунок з вказаною назвою та початковим депозитом.
 Викидає виняток NegativeAmountException, якщо початковий депозит є від'ємним.
 findAccount(int accountNumber): Знаходить та повертає об'єкт BankAccount з вказаним номером рахунку.
 Викидає виняток AccountNotFoundException, якщо рахунок не знайдено.
 transferMoney(int fromAccountNumber, int toAccountNumber, double amount): Переказує вказану суму з одного рахунку на інший.
 Викидає виняток AccountNotFoundException, якщо або джерело, або призначення не знайдено.
 Викидає виняток InsufficientFundsException, якщо у джерела рахунку недостатньо коштів.
 
 ## Висновок: 
 Під час лабораторної роботи я отримала навички створення зручного інтерфейсу для управління фінансами.