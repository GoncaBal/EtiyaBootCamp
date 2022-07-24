package business.abstracts;

import entities.concretes.Campaign;

import java.util.List;
import java.util.Optional;

public interface CampaignService {
    void add(Campaign campaign);
    void update(Campaign campaign);
    void delete(Campaign campaign);
    Optional<Campaign> getByCampaignId(int id);
    List<Campaign> getAll();
}
