package com.maciej.packages.repositories;

import com.maciej.packages.entities.Package;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "packages", path = "packages")
public interface PackageRepository extends CrudRepository<Package, Long> {

}
