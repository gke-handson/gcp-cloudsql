# gcp-cloudsql
Repo to integrate with GCP CloudSQL

We will do the following in this repo

1.	Create a Java app & deploy into GKE
2.	We create a DB in Cloud SQL(MySQL DB) & connect the java app with it.
3.	We insert 200000 records from Java app in this DB. And write basic CRUD operations.
2.	Then we create read replicas of the DB in GCP
3.	We then port our GETS to pull from the read replicas & the SAVES to the main DB
4.	Next we implement a search api which takes 3 or 3+ characters, searches the DB & returns the result
5.	We calculate average time of these searches to understand how much time it is taking on average for these searches.