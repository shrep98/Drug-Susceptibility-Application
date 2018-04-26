package connectionToDB;
import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.*;
import java.io.*;


public class connectionToMongoDB {

	public static void main(String[] args) {
        MongoClient mongo = new MongoClient("localhost",27017);
        System.out.println("Connected to the database!");
        MongoDatabase mdb = mongo.getDatabase("DrugSusceptibility");
        MongoCollection<Document> collection = mdb.getCollection("Drugs");
        System.out.println("Collection retrieved");

		List<Document> documents = (List<Document>) collection.find().into(
				new ArrayList<Document>());

               for(Document document : documents){
                   System.out.println(document);
               }
        //demo.queryUsers();
    }
	private void queryUsers() {
		
		    }

	 /*private static MongoClient mClient;

	    // Singleton for MongoClient
	    // Creates a single connection pool internally
	    private MongoClient getMongoClient() {
	    	
	        if (mClient == null) {
	            mClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
	        }
	        return mClient;
	    }

	    // Utility method to get database instance
	    private MongoDatabase getDB() {
	        return getMongoClient().getDatabase("DrugSusceptibility");
	    }

	    // Utility method to get user collection
	    private MongoCollection<Document> getUserCollection() {
	        return getDB().getCollection("Drugs");
	    }

	    
	    // Read all documents from user collection
	    private void queryUsers() {
	        getUserCollection().find().forEach(new Block<Document>() {
	            @Override
	            public void apply(Document t) {
	                System.out.println(t);
	            }
	        });
	    }

	   s// Insert a document in user collection
	    private void insertUser() {
	        Document document = new Document("username","qpt")
	                            .append("email", "testemail@example.com");
	        getUserCollection().insertOne(document);
	    }*/

}
