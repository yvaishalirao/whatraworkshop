# GREETINGS! WELCOME TO THE GUIDE :)

## CLONE A REPO
- Go to GitHub.
- Click on the green "New" button to create a new repository.
- Give your repository a name (e.g., "MyFirstRepo").
- Check the box "Add a README file" (optional but recommended).
- Click the "Create repository" button at the bottom.
- Once your repository is created, you need to copy it to your computer. This is called cloning. Here’s how to do it:

Open your terminal or command prompt or git bash.
Type the following command 
it will look something like this:
> git clone git clone https://github.com/<your_github_username>/<repo_name>.git


## FORKING A REPO
 Makes a copy of **someone else’s repository** on GitHub under your account.This is your version of the project.
 > For a simple analogy: if a friend has a toy, forking is like getting your own copy of that toy to play with at home. Cloning is like borrowing it and bringing it to your house to play with.
 - On the top right corner of the repository page, you’ll see a button that says "Fork." Click it.
 - GitHub will now create a copy of that repository in your own GitHub account.
 - You can add a description and click **Creating fork**

## CHANGING THE README.md FILE 
- Go to the readme.md file and make necessary cnazges as per the instruction




## SOME BASIC COMMANDS

## git status
When you run git status, it gives you information like:
- Tracked Files: Files that Git is already tracking.
- Untracked Files: Files that are in your project directory but haven’t been tracked by Git yet
- Current Branch: The branch you are currently working on, whether it's main, some branch taht you've created.
> git status

## git add
This command stages the changes in your working directory, meaning it prepares all the modified or new files to be included in the next commit.

To add an individual file
> git add **filename**

Instead of adding files one by one (e.g., git add file1.txt, git add file2.txt), **git add .** stages all the files at once.

If you've made a lot of changes, it's faster than typing the file names individually.
> git add .

## git commit
> git commit -m 'initial message'

The commit message helps you and others understand what changes were made and why. This is particularly useful when you look back at your project history later.

## git push
The command **git push** is used to upload your local commits to a remote repository.Running git push sends those commits to a remote repository (like GitHub), making them available to others.

Once you perform **git add** and **git commit** , **git push** would be the 3rd step.
> git push origin branch_name

## BRANCHES:
Branches in Git are like parallel versions of your project. They allow you to work on different tasks , features or experiments without affecting the main project.

 Some basic branch commands:
```
- To check all available branches:
> git branch

- To check remote branches
> git branch -r

- To create new branch
> git branch new_branch_name

- To move to another branch
> git checkout branch_name
```





