Git concept 

Create a new repository on github
Right click on the project and choose 'Show in Local terminal' > Git bash
Initialize the local directory as a git repository
$ git init
Add the files in your new local repository. This stages them for the first commit.
$ git add .
{add the files in the local repository and stages them for commit}
Commit the files that you have staged in your local repository.
$ git commit -m "First Commit"
{Commits the tracked changes and prepares them to be pushed to a remote repository.}
Go and copy your remote repository url
In the command prompt, add the remote repository url
$ git remote add origin <remote-repository>
$ git remote -v
Push the changes in your local repository to github
$ git push origin master
{pushes the changes in your local repository up to the remote repository}
