

**Transaction Risk & Priority Engine**



1) Problem 

In real-world fintech systems, a large number of financial transactions occur every minute.
Not all transactions carry the same level of risk or urgency.

* Evaluates multiple transaction attributes
* Assigns a priority score based on risk indicators
* Sorts transactions so that high-risk transactions are reviewed first
-------------------------------------------------------------
2)  Objective

* uses human-defined rules
* Is transparent and easy to explain
* Handles real-world fintech risk signals
--------------------------------------------------

3)  Design Approach 

* Should high-value transactions be reviewed first? → Yes
* Are high-risk customers more likely to cause issues? → Yes
* Do transactions during non-business hours need attention? → Yes
* Should new merchants be treated cautiously? → Yes
* Do repeated failures indicate risk? → Yes
-------------------------------------------------------------
4)  System Design Overview

1. Each transaction is evaluated using predefined rules
2. A priority score is calculated
3. Transactions are **sorted in descending order of score**
5)  Risk Factors & Scoring Logic

 i) Transaction Amount

Higher transaction amounts pose greater financial risk.

| Amount Range     | Score |
| ---------------- | ----- |
| > 100,000        | +40   |
| 50,000 – 100,000 | +30   |
| 10,000 – 50,000  | +20   |
| < 10,000         | +5    |



ii)  Customer Risk Profile

Based on historical behavior and internal assessment.

| Risk Level | Score |
| ---------- | ----- |
| High       | +25   |
| Medium     | +15   |
| Low        | +5    |



iii)  Time of Transaction

Fraud and abnormal behavior often occur outside business hours.

| Time               | Score |
| ------------------ | ----- |
| Non-Business Hours | +10   |
| Business Hours     | +0    |



iv)  New Merchant Indicator

New merchants lack historical trust and require additional scrutiny.

| New Merchant | Score |
| ------------ | ----- |
| Yes          | +15   |
| No           | +0    |



v) Priority Score Calculation

The final priority score is the =sum of all applicable rule scores.

High amount            → +30
High-risk customer     → +25
Non-business hours     → +10
New merchant           → +15
2 previous failures    → +10
--------------------------------
Total Priority Score   → 90

Higher score → Higher review priority.
----------------------------------
5) Improvement
*REST API (Spring Boot)
*Database integration
*Alert thresholds

-------------------------------
 
6) Technology use

*Java
*AI only assisted in documentation and  explanation
   
-----------------------------

7) Project Structure

TransactionPriorityEngine
│
├── Transaction.java          // Transaction data model
├── PriorityCalculator.java  //   logic
└── Main.java                // Program  output

* Create a Java project
* Add the three files
* Run  Main.java

--------------------------------

8) Sample Output 

Transaction ID: TXN1007
Amount: ₹150000
Customer Risk: High
Time: Business Hours
New Merchant: Yes
Failure Count: 1
Priority Score: 95
Reasons:
- Very high amount (>100000)
- High risk customer
- New merchant
- 1 previous failures

------------------------------
9)Trade-offs :

Rule-based vs ML

Manual tuning vs adaptability

 -------------------------------------
 
10) Edge Case Handling

* High amount transactions are prioritized even if customer risk is low
* Multiple small risk factors combined can still raise priority
* Unknown risk levels default to **Low risk**
* Failure count directly increases priority
