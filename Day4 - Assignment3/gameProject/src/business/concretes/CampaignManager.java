package business.concretes;

import business.abstracts.CampaignService;
import dataAccess.abstracts.BaseRepository;
import entities.concretes.Campaign;

import java.util.List;
import java.util.Optional;

public class CampaignManager implements CampaignService {

    private final BaseRepository<Campaign> baseRepository;

    public CampaignManager(BaseRepository<Campaign> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    public void add(Campaign campaign) {
        baseRepository.add(campaign);
    }

    @Override
    public void update(Campaign campaign) {
        baseRepository.update(campaign);
    }

    @Override
    public void delete(Campaign campaign) {
        getByCampaignId(campaign.getId()).ifPresent(campaign1 -> baseRepository.delete(campaign));
    }

    @Override
    public Optional<Campaign> getByCampaignId(int id) {
        return baseRepository.getById(id);
    }

    @Override
    public List<Campaign> getAll() {
        return baseRepository.getAll();
    }
}
