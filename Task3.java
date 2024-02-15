import java.util.*;

class Destination 
{
    private String name;
    private String description;
    private List<ArrayList<String>> activities;
    private Map<String, String> weatherForecast;

    public Destination(String name, String description, List<ArrayList<String>> list, Map<String, String> weatherForecast) 
    {
        this.name = name;
        this.description = description;
        this.activities = list;
        this.weatherForecast = weatherForecast;
    }

    // Getters and setters
    public String getName() 
    {
        return name;
    }

    public String getDescription() 
    {
        return description;
    }

    public List<ArrayList<String>> getActivities() 
    {
        return activities;
    }

    public Map<String, String> getWeatherForecast() 
    {
        return weatherForecast;
    }
}

class TravelItineraryPlanner 
{
    private List<Destination> destinations;

    public TravelItineraryPlanner() 
    {
        destinations = new ArrayList<>();
    }

    public void addDestination(Destination destination) 
    {
        destinations.add(destination);
    }

    public void generateItinerary() 
    {
        System.out.println("----- TRAVEL ITINERARY -----");
        for (int i = 0; i < destinations.size(); i++) 
        {
            Destination destination = destinations.get(i);
            System.out.println("Destination " + (i + 1) + ": " + destination.getName());
            System.out.println("Description: " + destination.getDescription());
            System.out.println("Activities:");
            for (ArrayList<String> activity : destination.getActivities()) 
            {
                System.out.println("- " + activity);
            }
            System.out.println("Weather Forecast:");
            for (Map.Entry<String, String> entry : destination.getWeatherForecast().entrySet()) 
            {
                System.out.println("- " + entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("-----------------------------");
        }
    }
}

public class Task3 
{
    public static void main(String[] args) 
    {
    	Scanner in = new Scanner(System.in);
    	TravelItineraryPlanner itineraryPlanner = new TravelItineraryPlanner();
    	while(true)
    	{// Hardcoded destinations, activities, and weather forecasts for demonstration purposes
    	System.out.println("Enter choice for selecting destinations for 3 places :");
    	System.out.println("1. Paris");
    	System.out.println("2. Tokyo");
    	System.out.println("3. Singapore");
    	System.out.println("4. Exit");
    	int ch = in.nextInt();
    	switch(ch)
    	{
    	case 1 : Map<String, String> dest1WeatherForecast = new LinkedHashMap<>();
        dest1WeatherForecast.put("2024-02-10", "Sunny");
        dest1WeatherForecast.put("2024-02-11", "Partly cloudy");
        dest1WeatherForecast.put("2024-02-12", "Rainy");
        System.out.println("Enter no. of activities you want to do in Paris :");
        int x = in.nextInt();
        ArrayList<String> d = new ArrayList<>();
        for (int i=0;i<x;i++)
        {
        	System.out.print("\nEnter " + (i + 1) +" activity "+": ");
            String act = in.nextLine();
            d.add(act);
        }
        Destination destination1 = new Destination("Paris", "City of Love", Arrays.asList(d), dest1WeatherForecast);
        itineraryPlanner.addDestination(destination1);
        itineraryPlanner.generateItinerary();
        break;
        
    	case 2: Map<String, String> dest2WeatherForecast = new LinkedHashMap<>();
        dest2WeatherForecast.put("2024-02-15", "Sunny");
        dest2WeatherForecast.put("2024-02-16", "Sunny");
        dest2WeatherForecast.put("2024-02-17", "Snowy");
        System.out.println("Enter no. of activities you want to do in Tokyo :");
        int x1 = in.nextInt();
        ArrayList<String> d1 = new ArrayList<>();
        for (int i=0;i<x1;i++)
        {
        	System.out.print("\nEnter " + (i + 1) +" activity "+": ");
            String act = in.nextLine();
            d1.add(act);
        }
        Destination destination2 = new Destination("Tokyo", "Capital of Japan", Arrays.asList(d1), dest2WeatherForecast);
        itineraryPlanner.addDestination(destination2);
        itineraryPlanner.generateItinerary();
        break;
        
    	case 3: Map<String, String> dest3WeatherForecast = new LinkedHashMap<>();
        dest3WeatherForecast.put("2024-02-12", "Mostly Sunny");
        dest3WeatherForecast.put("2024-02-13", "Partly Cloudy");
        dest3WeatherForecast.put("2024-02-14", "Rain Showers");
        System.out.println("Enter no. of activities you want to do in Singapore :");
        int x2 = in.nextInt();
        ArrayList<String> d2 = new ArrayList<>();
        for (int i=0;i<x2;i++)
        {
        	System.out.print("\nEnter " + (i + 1) +" activity "+": ");
            String act = in.nextLine();
            d2.add(act);
        }
        Destination destination3 = new Destination("Singapore", "The Garden City", Arrays.asList(d2), dest3WeatherForecast);
        itineraryPlanner.addDestination(destination3);
        itineraryPlanner.generateItinerary();
        break;
        
    	case 4 : System.out.println("\nEnjoy your future trip !!");
    	System.exit(0);
    	break;
    	
    	default : System.out.println();
    	break;
    	}
    	}
    }
}
