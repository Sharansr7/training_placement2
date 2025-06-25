import instaloader

insta = instaloader.Instaloader()
username = input("Instagram username: ")
insta.download_profile(username, profile_pic_only=True)
