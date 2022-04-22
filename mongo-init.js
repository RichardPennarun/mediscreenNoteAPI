db = db.getSiblingDB('mediscreen');

db.createCollection('notes');

db.notes.insertMany([
	
	

{
    "creation_date" : ISODate("2022-04-15T09:17:30.567Z"),
    "patient_id" : 1,
    "recommendation" : "Le patient déclare qu'il « se sent très bien » Poids égal ou inférieur au poids recommandé"
},

{
    "creation_date" : ISODate("2022-04-15T09:17:20.567Z"),
    "patient_id" : 1,
    "recommendation" : "Le patient déclare qu'il se sent fatigué pendant la journée Il se plaint également de douleurs musculaires Tests de laboratoire indiquant une microalbumine élevée",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:21:08.567Z"),
    "patient_id" : 1,
    "recommendation" : "Le patient déclare qu'il ne se sent pas si fatigué que ça Fumeur, il a arrêté dans les 12 mois précédents Tests de laboratoire indiquant que les anticorps sont élevés",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:22:07.567Z"),
    "patient_id" : 2,
    "recommendation" : "Le patient déclare qu'il ressent beaucoup de stress au travail Il se plaint également que son audition est anormale dernièrement",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:23:07.567Z"),
    "patient_id" : 2,
    "recommendation" : "Le patient déclare avoir fait une réaction aux médicaments au cours des 3 derniers mois Il remarque également que son audition continue d'être anormale",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:24:07.567Z"),
    "patient_id" : 2,
    "recommendation" : "Tests de laboratoire indiquant une microalbumine élevée",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:25:07.567Z"),
    "patient_id" : 2,
    "recommendation" : "Le patient déclare que tout semble aller bien Le laboratoire rapporte que l'hémoglobine A1C dépasse le niveau recommendé Le patient déclare qu’il fume depuis longtemps",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:26:07.567Z"),
    "patient_id" : 3,
    "recommendation" : "Le patient déclare qu'il fume depuis peu",
    "_class" : "com.mediscreen.note.model.Note"

},

{
    "creation_date" : ISODate("2022-04-15T09:27:07.567Z"),
    "patient_id" : 3,
    "recommendation" : "Tests de laboratoire indiquant une microalbumine élevée",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:00:07.567Z"),
    "patient_id" : 3,
    "recommendation" : "Le patient déclare qu'il est fumeur et qu'il a cessé de fumer l'année dernière Il se plaint également de crises d’apnée respiratoire anormales Tests de laboratoire indiquant un taux de cholestérol LDL élevé",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:01:07.567Z"),
    "patient_id" : 3,
    "recommendation" : "Tests de laboratoire indiquant un taux de cholestérol LDL élevé",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:02:07.567Z"),
    "patient_id" : 4,
    "recommendation" : "Le patient déclare qu'il lui est devenu difficile de monter les escaliers Il se plaint également d’être essoufflé Tests de laboratoire indiquant que les anticorps sont élevés Réaction aux médicaments",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:03:07.567Z"),
    "patient_id" : 4,
    "recommendation" : "Le patient déclare qu'il a mal au dos lorsqu'il reste assis pendant longtemps",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:04:07.567Z"),
    "patient_id" : 4,
    "recommendation" : "Le patient déclare avoir commencé à fumer depuis peu Hémoglobine A1C supérieure au niveau recommendé",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:05:07.567Z"),
    "patient_id" : 5,
    "recommendation" : "Le patient déclare avoir des douleurs au cou occasionnellement Le patient remarque également que certains aliments ont un goût différent Réaction apparente aux médicaments Poids corporel supérieur au poids recommendé",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:06:07.567Z"),
    "patient_id" : 5,
    "recommendation" : "Le patient déclare avoir eu plusieurs épisodes de vertige depuis la dernière visite. Taille incluse dans la fourchette concernée",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:08:07.567Z"),
    "patient_id" : 5,
    "recommendation" : "Le patient déclare qu'il souffre encore de douleurs cervicales occasionnelles Tests de laboratoire indiquant une microalbumine élevée Fumeur, il a arrêté dans les 12 mois précédents",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:09:07.567Z"),
    "patient_id" : 5,
    "recommendation" : "Le patient déclare avoir eu plusieurs épisodes de vertige depuis la dernière visite. Tests de laboratoire indiquant que les anticorps sont élevés",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:07:07.567Z"),
    "patient_id" : 6,
    "recommendation" : "Le patient déclare qu'il se sent bien Poids corporel supérieur au poids recommendé",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:11:07.567Z"),
    "patient_id" : 6,
    "recommendation" : "Le patient déclare qu'il se sent bien",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:10:07.567Z"),
    "patient_id" : 7,
    "recommendation" : "Le patient déclare qu'il se réveille souvent avec une raideur articulaire Il se plaint également de difficultés pour s’endormir Poids corporel supérieur au poids recommendé Tests de laboratoire indiquant un taux de cholestérol LDL élevé",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:12:07.567Z"),
    "patient_id" : 8,
    "recommendation" : "Les tests de laboratoire indiquent que les anticorps sont élevés Hémoglobine A1C supérieure au niveau recommendé",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:13:07.567Z"),
    "patient_id" : 9,
    "recommendation" : "Le patient déclare avoir de la difficulté à se concentrer sur ses devoirs scolaires Hémoglobine A1C supérieure au niveau recommendé",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:14:07.567Z"),
    "patient_id" : 9,
    "recommendation" : "Le patient déclare qu'il s’impatiente facilement en cas d’attente prolongée Il signale également que les produits du distributeur automatique ne sont pas bons Tests de laboratoire signalant des taux anormaux de cellules sanguines",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:15:07.567Z"),
    "patient_id" : 9,
    "recommendation" : "Le patient signale qu'il est facilement irrité par des broutilles Il déclare également que l'aspirateur des voisins fait trop de bruit Tests de laboratoire indiquant que les anticorps sont élevés",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:16:07.567Z"),
    "patient_id" : 10,
    "recommendation" : "Le patient déclare qu'il n'a aucun problème",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:17:07.567Z"),
    "patient_id" : 10,
    "recommendation" : "Le patient déclare qu'il n'a aucun problème Taille incluse dans la fourchette concernée Hémoglobine A1C supérieure au niveau recommendé",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:18:07.567Z"),
    "patient_id" : 10,
    "recommendation" : "Le patient déclare qu'il n'a aucun problème Poids corporel supérieur au poids recommendé Le patient a signalé plusieurs épisodes de vertige depuis sa dernière visite",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-04-15T09:19:07.567Z"),
    "patient_id" : 10,
    "recommendation" : "Le patient déclare qu'il n'a aucun problème Tests de laboratoire indiquant une microalbumine élevée",
    "_class" : "com.mediscreen.note.model.Note"
},

{
    "creation_date" : ISODate("2022-05-15T09:19:07.567Z"),
    "patient_id" : 11,
    "recommendation" : "Cholestérol, fumeur, taille, poids, anticorps, vertige, rechute",
    "_class" : "com.mediscreen.note.model.Note"
}

	
])