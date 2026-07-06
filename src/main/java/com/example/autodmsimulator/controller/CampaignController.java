package com.example.autodmsimulator.controller;

import com.example.autodmsimulator.model.Campaign;
import com.example.autodmsimulator.repository.CampaignRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/campaigns")
@CrossOrigin(origins = "*")
public class CampaignController {

    private final CampaignRepository repository;

    public CampaignController(CampaignRepository repository) {
        this.repository = repository;
        
        if (repository.count() == 0) {
            repository.save(new Campaign("GROW", "Thanks! Here is your 30-day creator roadmap link: bit.ly/grow-fast", true));
            repository.save(new Campaign("REELS", "Hey! Get my custom aesthetic layout templates here: bit.ly/aesthetic-templates", true));
            repository.save(new Campaign("STARTUP", "Let's connect! Join the beta testing waitlist here: bit.ly/startup-beta", false));
        }
    }

    @GetMapping
    public List<Campaign> getAllCampaigns() {
        return repository.findAll();
    }

    @PostMapping
    public Campaign createCampaign(@RequestBody Campaign campaign) {
        return repository.save(campaign);
    }

    @PostMapping("/{id}/trigger")
    public Campaign simulateTrigger(@PathVariable Long id) {
        Campaign campaign = repository.findById(id).orElseThrow();
        campaign.setTriggerCount(campaign.getTriggerCount() + 1);
        return repository.save(campaign);
    }

    @PutMapping("/{id}/toggle")
    public Campaign toggleStatus(@PathVariable Long id) {
        Campaign campaign = repository.findById(id).orElseThrow();
        campaign.setActive(!campaign.isActive());
        return repository.save(campaign);
    }
}