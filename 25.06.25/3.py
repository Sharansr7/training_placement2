questions = {
    "What is the capital of India?": "Delhi",
    "2 + 2 = ?": "4",
    "Python is a ____ language.": "programming"
}

def quiz():
    score = 0
    for q, ans in questions.items():
        user_ans = input(q + " ")
        if user_ans.lower() == ans.lower():
            score += 1
    print(f"Your score: {score}/{len(questions)}")

quiz()
