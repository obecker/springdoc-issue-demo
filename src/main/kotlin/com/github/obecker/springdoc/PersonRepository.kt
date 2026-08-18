package com.github.obecker.springdoc

import org.springframework.data.repository.ListPagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface PersonRepository : ListPagingAndSortingRepository<Person, Long>
