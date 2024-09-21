# GREETINGS! WELCOME TO THE GUIDE :)
You'll find step-by-step instructions for common tasks. Tips for collaborating with others are included as well. Whether you're a beginner or looking to improve, this guide is for you!



## Forking A Repo
 Makes a copy of **someone else’s repository** on GitHub under your account.This is your version of the project.
 > For a simple analogy: if a friend has a toy, forking is like getting your own copy of that toy to play with at home. Cloning is like borrowing it and bringing it to your house to play with.
 - On the top right corner of the repository page, you’ll see a button that says "Fork." Click it.
 - GitHub will now create a copy of that repository in your own GitHub account.
 - You can add a description and click **Creating fork**

 1. **Log in to GitHub**: Ensure you are logged into your GitHub account.

 2. **Find the Repository**: Navigate to the repository you want to fork.

 3. **Fork the Repository**:
   - Click the **Fork** button in the top right corner of the repository page.
   - This creates a copy of the repository under your GitHub account.

 4. **Navigate to Your Fork**: After forking, you will be directed to your new repository.

 ## Cloning the Forked Repository Locally

 1. **Copy the Repository URL**:
   - Click the **Code** button on your forked repository page.
   - Copy the URL (choose HTTPS or SSH).

 2. **Open Terminal (or Git Bash)**: Open your command line interface on your local machine.

 3. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   ```

## Changing the README.md file
- Go to the readme.md file and make necessary changes as per the instruction


## Some Basic Commands

## git status
When you run git status, it gives you information like:
- Tracked Files: Files that Git is already tracking.
- Untracked Files: Files that are in your project directory but haven’t been tracked by Git yet
- Current Branch: The branch you are currently working on, whether it's main, some branch taht you've created.
```bash
 git status
 ```

## git add
This command stages the changes in your working directory, meaning it prepares all the modified or new files to be included in the next commit.

To add an individual file
```bash
 git add <filename>.
 ```

Instead of adding files one by one (e.g., git add file1.txt, git add file2.txt), **git add .** stages all the files at once.

If you've made a lot of changes, it's faster than typing the file names individually.
```bash
 git add .
 ```

## git commit

The commit message helps you and others understand what changes were made and why. This is particularly useful when you look back at your project history later

```bash
  git commit -m 'initial message'
 ```

.

## git push
The command **git push** is used to upload your local commits to a remote repository.Running git push sends those commits to a remote repository (like GitHub), making them available to others.

Once you perform **git add** and **git commit** , **git push** would be the 3rd step.
```bash
git push origin branch_name
```

## branching:
Branches in Git are like parallel versions of your project. They allow you to work on different tasks , features or experiments without affecting the main project.

 Some basic branch commands:

- **To check all available branches:**
```bash
 git branch
```
- **To check remote branches**
```bash
 git branch -r
```


- **To create new branch**
```bash
 git branch new_branch_name
```

- **To move to another branch**
```bash
 git checkout branch_name
```


# JUST THE COMMANDS:
 **Clone the Repository**:
   ```bash
   git clone <repository-url>
   ```

   **Check Status**:
   ```bash
   git status
   ```

   **Add one file**:
   ```bash
    git add <filename>
   ```

   **Add All Files**:
   ```bash
    git add .
   ```

   **Commit Changes**:
   ```bash
    git commit -m 'commit message'
   ```

   **Push Changes To Branch**:
   ```bash
    git push origin <branchname>
   ```

   **To Check All Available Branches**:
   ```bash
    git branch
   ```

   **To Check Remote Branches**:
   ```bash
     git branch -r
   ```

   **To Create New Branch**:
   ```bash
    git branch <new-branchname>
   ```

   **To Move To Another Branch**:
   ```bash
    git checkout <branchname>
   ```

   <!-- 
   **.**:
   ```bash

   ``` -->

  









