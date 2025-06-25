import smtplib

sender = "you@gmail.com"
receiver = input("To: ")
password = input("Password: ")
message = "Subject: Hello from Python\n\nThis is a test email."

with smtplib.SMTP("smtp.gmail.com", 587) as server:
    server.starttls()
    server.login(sender, password)
    server.sendmail(sender, receiver, message)

print("Email sent.")
