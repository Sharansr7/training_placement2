import os
import shutil

folder = "your_folder_path"

for file in os.listdir(folder):
    ext = file.split(".")[-1]
    new_dir = os.path.join(folder, ext)
    if not os.path.exists(new_dir):
        os.makedirs(new_dir)
    shutil.move(os.path.join(folder, file), os.path.join(new_dir, file))
