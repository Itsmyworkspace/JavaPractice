GitHub CLI commands:
    Before doing this task you need to install GitHub CLI in our machine
    Steps to push the local code to git and create git repository by using GitHub CLI commands:

        1. Go to your project folder and copy the path
        2. Open GitHub CLI command prompt and set to path the command line (cd <folder path location>
        3. To initialize the local repository, we need to use command (git init)
        4. To create the remote github repository, you need to use below command.
            gh repo create <reponame> --public --source=. --remote=upstream
        5. Check Status use git status command
        6. To add/ stage the files use git add . command
        7. To commit the files use git commit -m "give commit message"
        8. After just check status either all files are add use git status
        9. Check branch use git branch
        10. If you want to checkout to the other branch git checkout branch name
        11. To push the code to git repository use below command
            git push --set-upstream upstream master