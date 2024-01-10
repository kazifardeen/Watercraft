/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kazif
 */
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoConnection {

    public static void main(String[] args) {
        // Set up MongoDB client
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

        // Access the database
        MongoDatabase database = mongoClient.getDatabase("your_database_name");

        // Now, you can work with the database using the 'database' object

        // Don't forget to close the client when you're done
        mongoClient.close();
    }
}