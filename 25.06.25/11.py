from pytube import YouTube

link = input("Enter YouTube URL: ")
yt = YouTube(link)
stream = yt.streams.get_highest_resolution()
stream.download()
print("Downloaded!")
