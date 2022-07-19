package org.tyss.sms.testng_practice;

import java.net.URLEncoder;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MangoDBEncoding {
    public static void main(String [] args){

        try{
            String username = URLEncoder.encode("yogeshw2605", "UTF-8");
            String password = URLEncoder.encode("yogesh2605", "UTF-8");
            String cluster = "cluster0";
            String authSource = "<authSource>";
            String authMechanism = "<authMechanism>";
            
            String uri = "mongodb+srv://" + username + ":" + password + "@" + cluster + 
                         "/?authSource=" + authSource + "&authMechanism=" + authMechanism;

            MongoClient mongoClient = MongoClients.create(uri);
    
            MongoDatabase database = mongoClient.getDatabase("<dbName>");
            MongoCollection<Document> collection = database.getCollection("<collName>");
            
           // collection.find().forEach(null);

        } catch(Exception e){
            System.err.println(e.getCause());

        }
    }

}
