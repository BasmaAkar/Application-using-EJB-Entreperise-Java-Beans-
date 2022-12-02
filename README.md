# Application-using-EJB-Entreperise-Java-Beans-
EJB-Architecture Client/Serveur 
# Application-JEE-using-WildFly
Mise en place d’une application distribuée JEE  Objectif : L’objectif principal de cet atelier et de pratiquer la mise en place d’une application distribuée en utilisant une variété des technologies centrées sur EJB3.


### **_Outils :_** Eclipse, Maven, Tomcate, MySQL, JPA, EJB, WilddFly

### Architecture du projet EtudiantEJB :
![image](https://user-images.githubusercontent.com/101791324/204805208-1224f4b2-0306-4a31-93a0-c03863b15ec8.png)

### **Etape1 :**
 Installez le plugin Jboss AS en tapant sur le marketplace d’eclipse le mot clé «JBoss Tools
(Oxygen) » Tools, puis installez WildFly via le Wizard.

### **_Etape2 :
Créez une base de données sous le nom Getudiants avec une table étudiant sous le SGBD
MYSQL, la table doit contenir les champs suivant (id_etudiant, nom , prénom , cne , adresse , niveau).
### 
![image](https://user-images.githubusercontent.com/101791324/204791764-387bcf0d-7430-4ea3-9800-ebc0179a0c78.png)
### 
### **Etape3 :
 Créez un projet EJB avec un EJB module supérieur à 3 puis créez le fichier persistence.xml dans le répertoire META-INF.
![image](https://user-images.githubusercontent.com/101791324/204792762-013608ef-3444-456a-b9a5-62f6059b4dd8.png)
![image](https://user-images.githubusercontent.com/101791324/205164328-62c05bca-6645-4fee-a6d5-0792f7a8bb3e.png)
![image](https://user-images.githubusercontent.com/101791324/205164944-c83ac4ae-2cf1-4ad4-82fe-083e15e1d54a.png)

![image](https://user-images.githubusercontent.com/101791324/205165118-3e014d79-c6a8-439a-ae9c-0ace76841e51.png)
![image](https://user-images.githubusercontent.com/101791324/205165389-b4635191-b3ff-4681-8e56-1196c3cd8cc0.png)
![image](https://user-images.githubusercontent.com/101791324/205178772-a9ebd934-27e3-46c4-a101-7ecf6f81198f.png)

### Architecture du projet EtudiantCote_Client :
![image](https://user-images.githubusercontent.com/101791324/205179482-5dd4b06a-128a-4295-9aad-9e0485f305cb.png)
### Utiliser l'annotation @EJB pour fare la laison avec le projet EtudiantEJB :
![image](https://user-images.githubusercontent.com/101791324/205179738-14157780-3f42-476d-9544-31131a1278df.png)






