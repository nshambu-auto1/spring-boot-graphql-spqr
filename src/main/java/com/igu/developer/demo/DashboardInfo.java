package com.igu.developer.demo;

import io.leangen.graphql.annotations.GraphQLQuery;

import java.util.List;
import java.util.UUID;

public class DashboardInfo {

    @GraphQLQuery(name = "accountId", description = "A accountId")
    private UUID accountId;

    /*@GraphQLQuery(name = "carleads", description = "A car's id")
    private List<Carlead> carleads;*/
}
