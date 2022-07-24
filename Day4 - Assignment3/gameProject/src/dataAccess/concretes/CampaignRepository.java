package dataAccess.concretes;

import dataAccess.abstracts.BaseRepository;
import entities.concretes.Campaign;
import entities.concretes.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CampaignRepository implements BaseRepository<Campaign> {

    List<Campaign> campaigns = new ArrayList<>();

    @Override
    public void add(Campaign entity) {
        campaigns.add(entity);
        System.out.println("Kampanya eklendi: " + entity.getName());
    }

    @Override
    public void update(Campaign entity) {
        System.out.println("Kampanya güncellendi: " + entity.getName());
    }

    @Override
    public void delete(Campaign entity) {
        getById(entity.getId()).ifPresent(campaign -> campaigns.remove(entity));
        System.out.println("Kampanya silindi: " + entity.getName());
    }

    @Override
    public Optional<Campaign> getById(int id) {
        return campaigns.stream().filter(campaign -> campaign.getId()==id).findAny();
    }

    @Override
    public List<Campaign> getAll() {
        return campaigns;
    }
}
