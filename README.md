# EventPracticeApp – Activity 04

**Name:** Gerald Mamasalanang  
**Section:** DIT 3-1  
**Activity Title:** Event Handling Practice  
**Repository Name:** DIT3-1-GeraldMamasalanang-Act04  

---

## Project Description
This project is an Android app that demonstrates **basic event handling and user interaction** in Android.  
The layout includes:
- Two input fields (EditText) for **Name** and **Age**  
- A **Submit** button  
- A **TextView** for displaying the result  

When the user clicks the Submit button, the app reads the input and shows the name and age. It also checks for empty fields and invalid inputs.

---

## Reflection

**1. How did you implement event handling for user actions?**  
I used the `setOnClickListener()` method for the Submit button. Inside it, I read the input from the EditText fields and displayed the output in a TextView. I also used a `Toast` message to alert the user if they left any fields empty.

**2. What techniques ensured smooth and stable interaction?**  
I used input validation to make sure both fields are filled in before showing the result. I also added a `try-catch` block to handle invalid age inputs (like letters instead of numbers) so the app won’t crash. Using `Toast` messages helped provide quick feedback to users.

**3. What improvements would you add in future versions?**  
In the future, I would add more validation like checking if the age is within a valid range. I’d also like to improve the UI with better design and add animations or transitions to make the interaction smoother.

---

## How to Run
1. Clone this repository:
   ```bash
   git clone git@github.com:mamasalanang-gerald/DIT3-1-GeraldMamasalanang-Act04.git
