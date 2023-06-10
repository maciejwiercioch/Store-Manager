package com.maciej.packages;

import com.maciej.packages.entities.Package;
import com.maciej.packages.repositories.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final PackageRepository repository;

    @Autowired
    public DatabaseLoader(PackageRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Package("computer", 0.5, 1., "Electronical device"));
    }
}
