package entities.concretes;

import entities.abstracts.Entity;

public class Game implements Entity {
    Campaign campaign;
    private int id;
    private String name;
    private String description;
    private double price;

    public Game() {
    }

    public Game(Campaign campaign, int id, String name, String description, double price) {
        this.campaign = campaign;
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Game{" +
                "campaign=" + campaign +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
