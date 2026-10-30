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


GitHub Actions:

    on push :   // on push to main branch

        on:
            push:
                branches: [main]

    on pull_request :   // on pr to main branch 

        on:
            pull_request:
                branches: [main]

    on workflow_dispatch:   // on dispatch, we will run the workflow

        on:
            workflow_dispatch:

    on schedule:   // it runs every scheduled corn

        schedule:
            - cron: '0 9 * * *'

    on workflow_run:  // it runs after the other workflow is completed and trigger the workflow

        on:
            workflow_run:
                workflows: ["CI"]
                types: [completed]

    on workflow_call:  // it works when a other workflow call this workflow "./.github/workflows/reusable-build.yml@master"

        on:
            workflow_call: