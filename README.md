# MediscreenNoteApi

An API with 1 entity, the note, to save patient medical records. 
You will be able to get all notes, to get all patient notes by patientId, to create a new note, to update or delete a note, or to delete all notes for a patient.

All is saved on noSql solution MongoDB and packed in Docker.

API exposed port : 8082


##### Prerequisites
- Java 11
- SpringBoot 2.5.5
- MongoDB 
- Docker


##### Running App
Please download : 
https://github.com/RichardPennarun/mediscreenNoteAPI/archive/refs/heads/main.zip

Open a terminal window, go to the root folder and run this 2 lines in this order :
- docker build -t mediscreennoteapi .
- docker-compose up -d


##### Testing
The app has a Jacoco test coverage of 93 %
